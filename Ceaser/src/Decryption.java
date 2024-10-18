public class Decryption {

    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

    public static String decrypt(String cipherText, int shiftKey) {
        cipherText = cipherText.toLowerCase();
        StringBuilder message = new StringBuilder();

        for (int i = 0; i < cipherText.length(); i++) {
            char currentChar = cipherText.charAt(i);
            if (Character.isLetter(currentChar)) {
                int charPosition = alpha.indexOf(currentChar);
                int keyVal = (charPosition - shiftKey) % 26;
                if (keyVal < 0) {
                    keyVal += alpha.length();
                }
                char replaceVal = alpha.charAt(keyVal);
                message.append(replaceVal);
            } else {
                message.append(currentChar);
            }
        }
        return message.toString();
    }
}