package internet;

public class Safari implements Browser {

	@Override
	public void exibirPagina() {
		System.out.println("BROWSER|SAFARI: Pagina inicial exibida");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("BROWSER|SAFARI: Nova aba aberta");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("BROWSER|SAFARI: Pagina atualizada");
	}
	
}
