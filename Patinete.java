package introducaoPOO;

public class Patinete {
	
	double comprimento;
	double altura;
	String cor;
	double largura;
	double suportaKG;
	
	void duasRodas()
	{
		System.out.println("Seu patinete tem 2 rodas.");
	}
	
	void tresRodas()
	{
		System.out.println("Seu patinete tem 3 rodas.");
	}
	
	public void estado()
	{
		System.out.println("peso: "+ this.comprimento+" kg");
		System.out.println("A altura é: "+ this.altura+"cm");
		System.out.println("A largura é: "+ this.largura+"cm");
		System.out.println("A cor é: "+ this.cor);
		System.out.println("O patinete suporta "+ this.suportaKG+"KG");

	}
}