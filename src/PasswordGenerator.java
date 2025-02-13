import java.util.Scanner;

public class PasswordGenerator {
    private PasswordService passwordService;
    private Scanner scanner;

    public PasswordGenerator() {
        this.passwordService = new PasswordService();
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("Welcome to Password Generator!");

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        System.out.print("Include uppercase letters? (true/false): ");
        boolean useUppercase = scanner.nextBoolean();

        System.out.print("Include numbers? (true/false): ");
        boolean useNumbers = scanner.nextBoolean();

        System.out.print("Include special characters? (true/false): ");
        boolean useSpecial = scanner.nextBoolean();

        String password = passwordService.generatePassword(length, useUppercase, useNumbers, useSpecial);
        System.out.println("Generated Password: " + password);
    }
}
