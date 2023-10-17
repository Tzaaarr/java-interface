package internet;

public class Opera implements Browser {

	@Override
	public void exibirPagina() {
		System.out.println("BROWSER|OPERA: Pagina inicial exibida");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("BROWSER|OPERA: Nova aba aberta");	
	}

	@Override
	public void atualizarPagina() {
		System.out.println("BROWSER|OPERA: Pagina atualizada");	
	}

	
}
