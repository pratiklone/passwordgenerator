import java.security.SecureRandom;

public class PasswordService {
    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBER_CHARS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()_+-=[]{}|;:,.<>?";

    private final SecureRandom random;

    public PasswordService() {
        this.random = new SecureRandom();
    }

    public String generatePassword(int length, boolean useUppercase, boolean useNumbers, boolean useSpecial) {
        StringBuilder characters = new StringBuilder(LOWERCASE_CHARS);

        if (useUppercase) {
            characters.append(UPPERCASE_CHARS);
        }
        if (useNumbers) {
            characters.append(NUMBER_CHARS);
        }
        if (useSpecial) {
            characters.append(SPECIAL_CHARS);
        }

        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }

        return password.toString();
    }
}
