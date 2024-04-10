package platform;

public class DisneyPlus implements IPlatform {

    public DisneyPlus() {
        configureRMTP();
        System.out.println("DisneyPlus: Transmissão iniciada!");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("DisneyPlus: Conta Autorizada!");
    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: Autorizando aplicação!");
    }
}
