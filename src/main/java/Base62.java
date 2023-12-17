public class Base62 {

    private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final int BASE = ALPHABET.length();

    public static String encodeBase62(long number) {
        StringBuilder result = new StringBuilder();
        do {
            result.append(ALPHABET.charAt((int) (number % BASE)));
            number /= BASE;
        } while (number > 0);
        return result.reverse().toString();
    }

    public static long decodeBase62(String base62) {
        long result = 0;
        for (int i = 0; i < base62.length(); i++) {
            result = result * BASE + ALPHABET.indexOf(base62.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        long originalNumber = 315360000000L;
        System.out.println(new String(""+originalNumber).length());
        String encodedString = encodeBase62(originalNumber);
        System.out.println("Encoded Base62: " + encodedString);

        long decodedNumber = decodeBase62(encodedString);
        System.out.println("Decoded Base62: " + decodedNumber);
    }
}
