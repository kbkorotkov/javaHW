public class Encryption {

    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String message, int shiftKey) {
        message = message.toLowerCase();
        StringBuilder cipherText = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            if (Character.isLetter(currentChar)) {
                int charPosition = alpha.indexOf(currentChar);
                int keyVal = (shiftKey + charPosition) % 26;
                char replaceVal = alpha.charAt(keyVal);
                cipherText.append(replaceVal);
            } else {
                cipherText.append(currentChar);
            }
        }
        return cipherText.toString();
    }
}
