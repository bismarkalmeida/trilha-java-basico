package funcoes.musica;

public class AppMusical implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando a música");
    }

    @Override
    public void pausar() {
        System.out.println("Música foi pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("A música " + musica + " foi selecionada!");
    }
    
}
