package reprodutor;

public class AmazonMusic implements Music {

	@Override
	public void tocar() {
		System.out.println("MUSIC|AMAZONMUSIC: Player iniciado");
	}

	@Override
	public void pausar() {
		System.out.println("MUSIC|AMAZONMUSIC: Player pausado..");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("MUSIC|AMAZONMUSIC: Selecionando musica");
	}

}
