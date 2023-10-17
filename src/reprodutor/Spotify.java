package reprodutor;

public class Spotify implements Music {

	@Override
	public void tocar() {
		System.out.println("MUSIC|SPOTIFY: Player iniciado");
	}

	@Override
	public void pausar() {
		System.out.println("MUSIC|SPOTIFY: Player pausado..");	
	}

	@Override
	public void selecionarMusica() {
		System.out.println("MUSIC|SPOTIFY: Selecionando musica");
	}

}
