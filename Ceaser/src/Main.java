import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст для шифрования расшифровки: ");
        String text = scanner.nextLine();
        System.out.println("Введите сдвиг: ");
        int shiftKey = scanner.nextInt();

        String encryptedText = Encryption.encrypt(text, shiftKey);
        System.out.println(encryptedText);

        String decryptedText = Decryption.decrypt(encryptedText, shiftKey);
        System.out.println(decryptedText);

    }
}
