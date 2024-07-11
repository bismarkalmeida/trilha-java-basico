package funcoes.iphone;

import funcoes.musica.ReprodutorMusical;
import funcoes.navegador.NavegadorInternet;
import funcoes.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    //Fazendo a inserção dos metodos da função reproduzir música
    @Override
    public void tocar() {
        System.out.println("Tocando musica pela classe Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando pela classe Iphone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Slecionando a música " + musica + " pela a classe Iphone");
    }

    //Fazendo a inserção dos metodos da função telefone
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero + " pela classe Iphone" );
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação pela classe Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pela classe Iphone");
    }

    //Fazendo a inserção dos metodos da função navegador de internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando o navegador pela classe Iphone site: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova Aba pela classe Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página pela classe Iphone");
    }
    
}
