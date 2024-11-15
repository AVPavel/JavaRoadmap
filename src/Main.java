import java.security.SecureRandom;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        byte[] key = new byte[64]; //512 bits
        new SecureRandom().nextBytes(key);
        String encodedKey = Base64.getEncoder().encodeToString(key);
        System.out.println("Generated key: " + encodedKey);
    }
}