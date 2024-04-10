package transmission;

import platform.IPlatform;

public class AdvanceLive extends Live {

    public AdvanceLive(IPlatform platform) {
        super.platform = platform;
    }

    public void subtitles() {
        System.out.println("Legendas ativadas na Transmissão!");
    }

    public void comments() {
        System.out.println("Comentários liberados!");
    }
}
