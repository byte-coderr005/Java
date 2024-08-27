import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.Cipher;
public class Encryption {
    public static void main(String[] args) throws Exception {
        KeyGenerator keygen = KeyGenerator.getInstance("AES");
        keygen.init(192, new SecureRandom()); //Starting keygen with 192-bit key. You can choose between 128,192,256.
        SecretKey key = keygen.generateKey();

        Cipher cipher = Cipher.getInstance("AES");
        //Cipher class used for cryption & decryption.
        cipher.init(Cipher.ENCRYPT_MODE, key); //ENCRYPT_MODE, indicates cryption mode.
        //secretKey used for using key.
        String wordCryption = "Burak";
        byte[] encrypted = cipher.doFinal(wordCryption.getBytes());
        //Indicated word changed to byte array & doing cryption process.
        String encodedEncryptedText = Base64.getEncoder().encodeToString(encrypted);
        //Crypted byte array, Coded with Base64 for Readable.
        System.out.println(encodedEncryptedText);

    }
}
