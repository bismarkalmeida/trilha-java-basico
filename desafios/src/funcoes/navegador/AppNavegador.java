package funcoes.navegador;

public class AppNavegador implements NavegadorInternet{

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo o navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adcionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página");
    }
    
}
