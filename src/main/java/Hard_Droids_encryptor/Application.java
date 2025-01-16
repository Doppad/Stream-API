package Hard_Droids_encryptor;

public class Application {
    public static void main(String[] args) {
        Droid r2d2 = new Droid();
        Droid c3po = new Droid();
        Droid bb8 = new Droid();

        String message1 = "Join the Rebellion!";
        String message2 = "The Death Star is operational!";
        int encryptionKey1 = 3; // Ключ шифрования для первого сообщения
        int encryptionKey2 = 7; // Ключ шифрования для второго сообщения

        // R2D2 отправляет сообщение C3PO
        r2d2.encryptMessage(message1, encryptionKey1, null);

        // C3PO отвечает R2D2
        c3po.encryptMessage(message2, encryptionKey2, null);

        // BB-8 отправляет сообщение C3PO
        bb8.encryptMessage("The mission is complete.", encryptionKey1, null);
    }
}