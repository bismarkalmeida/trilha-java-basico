import funcoes.iphone.Iphone;
import funcoes.musica.AppMusical;
import funcoes.musica.ReprodutorMusical;
import funcoes.navegador.NavegadorInternet;
import funcoes.telefone.AparelhoTelefonico;

public class Utilizar {
    public static void main(String[] args) throws Exception {
        Iphone aparelho = new Iphone();
        AparelhoTelefonico funcaoTelefone = aparelho;
        ReprodutorMusical funcaoMusica = aparelho;
        NavegadorInternet fucaoInternet = aparelho;

        funcaoTelefone.ligar("619999999");;
        funcaoMusica.selecionarMusica("Linkin Park feat Jay-z - in the end");
        fucaoInternet.exibirPagina("www.dio.com");
    }
}
