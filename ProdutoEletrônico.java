package introducaoPOO;

public class ProdutoEletr�nico {
	
	
	double peso;
	double altura;
	int bateria;
	double largura;
	double tela;
	
	void ligar()
	{
		System.out.println("Produto ligado.");
	}
	
	void desligar()
	{
		System.out.println("Produto desligado.");
	}
	
	public void estado()
	{
		System.out.println("peso: "+ this.peso+" g");
		System.out.println("A altura �: "+ this.altura+"mm");
		System.out.println("A largura �: "+ this.largura+"mm");
		System.out.println("As polegadas da tela �: "+ this.tela+"pol.");
		System.out.println("a bateria esta "+ this.bateria+"% carregada");

	}
}