package tripledescryptor;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

public class TripleDesCryptor {
    private final Cipher c;


    public TripleDesCryptor() throws NoSuchPaddingException, NoSuchAlgorithmException {
        c = Cipher.getInstance("DESede");
    }

    public TripleDesCryptor(Provider provider) throws NoSuchPaddingException, NoSuchAlgorithmException {
        c = Cipher.getInstance("DESede", provider);
    }

    public SecretKey generateKey() throws NoSuchAlgorithmException {
        KeyGenerator keygen = KeyGenerator.getInstance("DESede",c.getProvider());
        return keygen.generateKey();
    }

}
