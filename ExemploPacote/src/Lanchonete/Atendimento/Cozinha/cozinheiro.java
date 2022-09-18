package Lanchonete.Atendimento.Cozinha;

public class cozinheiro {
	// pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("Adicionar lanche natural");
	}
	// pode ser default
	public void adicionarSucoNoBalcao() {
		System.out.println("Adicionar suco");
	}
	//pode ser default
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	public void preparLanche() {
		System.out.println("Preparando lanche");
	}
}
