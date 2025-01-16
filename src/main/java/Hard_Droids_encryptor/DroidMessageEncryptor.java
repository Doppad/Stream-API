package Hard_Droids_encryptor;
@FunctionalInterface
public interface DroidMessageEncryptor {
    String encrypt(String message, int key);
}
