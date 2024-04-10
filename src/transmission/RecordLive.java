package transmission;

import platform.IPlatform;

public class RecordLive extends Live {

    public RecordLive(IPlatform platform) {
        super.platform = platform;
    }

    public void record() {
        System.out.println("Iniciando gravação da Live!");
    }
}
