public class Main {
    public static void main(String[] args) {
        Smartphone meuSmartphone = new Smartphone();
        
        // Testando funcionalidades do ReprodutorMusical
        meuSmartphone.selecionarMusica("Bohemian Rhapsody - Queen");
        meuSmartphone.tocar();
        meuSmartphone.pausar();

        // Testando funcionalidades do AparelhoTelefonico
        meuSmartphone.ligar("123456789");
        meuSmartphone.atender();
        meuSmartphone.iniciarCorreioVoz();

        // Testando funcionalidades do NavegarNaInternet
        meuSmartphone.exibirPagina("https://www.exemplo.com");
        meuSmartphone.adicionarNovaAba();
        meuSmartphone.atualizarPagina();
    }
}
