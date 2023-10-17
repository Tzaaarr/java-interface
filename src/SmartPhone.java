import internet.Browser;
import internet.Opera;
import internet.Safari;
import ligacao.Phone;
import ligacao.Telefone;
import reprodutor.AmazonMusic;
import reprodutor.Music;
import reprodutor.Spotify;

public class SmartPhone {

	public static void main(String[] args) {
		
		Browser navegadorOpera = new Opera();
		Browser navegadorSafari = new Safari();
		
		navegadorSafari.exibirPagina();
		navegadorOpera.exibirPagina();
		navegadorOpera.atualizarPagina();
		navegadorSafari.adicionarNovaAba();
		
		Phone telefonePadrao = new Telefone();
		
		telefonePadrao.ligar();
		telefonePadrao.atender();
		telefonePadrao.iniciarCorreioVoz();
		
		Music reprodutorSpotify = new Spotify();
		Music reprodutorAmazon = new AmazonMusic();
		
		reprodutorAmazon.tocar();
		reprodutorSpotify.tocar();
		reprodutorAmazon.pausar();
		reprodutorSpotify.selecionarMusica();
	}
}
