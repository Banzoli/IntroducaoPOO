package introducaoPOO;

public class ContaBancaria {
	
	String CPF;
	String dataDeNacimento;
	String nome;
	String agencia;
	String cc;
	
	void positivo()
	{
		System.out.println("Seu saldo esta positivo.");
	}
	
	void negativo()
	{
		System.out.println("Seu saldo esta negativo.");
	}
	
	public void estado()
	{
		System.out.println("Nome: "+ this.nome);
		System.out.println("CPF: "+ this.CPF);
		System.out.println("dataDeNacimento: "+ this.dataDeNacimento);
		System.out.println("Agencia: "+ this.agencia);
		System.out.println("Conta corrente: "+ this.cc);

	}
}
