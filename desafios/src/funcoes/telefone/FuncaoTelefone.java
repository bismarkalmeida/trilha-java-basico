package funcoes.telefone;

public class FuncaoTelefone implements AparelhoTelefonico{

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz");
    }
    
}
