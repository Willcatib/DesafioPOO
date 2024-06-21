package Apple.Perifericos;

import Apple.Navegadores.NavegadorInternet;
import Apple.ReprodutoresMusica.ReprodutorMusical;
import Apple.Telefone.AparelhoTelefonico;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    
    //acoes do reprodutor de musica 
    public void tocarMusica(){
        System.out.println("Reproduzindo musica");
    }
    public void pausarMusica(){
        System.out.println("Pausando musica");
    }
    public void selecionarMusica(String musica){
        System.out.println("selecionando musica: " + musica);
    }

    //acoes do telefone 
    public void ligar(String numero){
        System.out.println("ligando para o numero: " + numero);
    }
    public void atender(){
        System.out.println("Atendendo");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

    //acoes do Navegador
    public void exibirPagina(String url){
        System.out.println("Exibindo Paginas" + url); 
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando pagina...");
    }

    //metodo para testar implementação
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        meuIPhone.tocarMusica();
        meuIPhone.selecionarMusica("TIMELESS BORGEZ");
        meuIPhone.ligar("11953623493");
        meuIPhone.exibirPagina("www.apple.com");
        meuIPhone.pausarMusica();
        meuIPhone.iniciarCorreioVoz();
    }
}
