import platform.DisneyPlus;
import platform.IPlatform;
import transmission.RecordLive;

public class Main {
    public static void main(String[] args) {
        startLive(new DisneyPlus());
    }

    public static void startLive(IPlatform platform) {
        System.out.println("Aguarde....");

        RecordLive recordLive = new RecordLive(platform);
        recordLive.broadcasting();
        recordLive.result();
        recordLive.record();
    }
}