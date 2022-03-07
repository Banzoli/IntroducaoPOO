package introducaoPOO;

public class Atividade06 {

	public static void main(String[] args) {
		
		ContaBancaria ContaBancaria1 = new ContaBancaria();
		ContaBancaria1.CPF = "222.222.222.22";
		ContaBancaria1.dataDeNacimento = "11/04/1986";
		ContaBancaria1.nome = "José Roberto Silva";
		ContaBancaria1.agencia= "8371";
		ContaBancaria1.cc = "85278-0";
		ContaBancaria1.positivo();
		ContaBancaria1.estado();
		
		System.out.println(" ");
		
		ContaBancaria ContaBancaria2 = new ContaBancaria();
		ContaBancaria2.CPF = "333.333.333.33";
		ContaBancaria2.dataDeNacimento = "01/30/1994";
		ContaBancaria2.nome = "Agatha Oliveira Gomes";
		ContaBancaria2.agencia= "4720";
		ContaBancaria2.cc = "6830-5";
		ContaBancaria1.positivo();
		ContaBancaria2.estado();
	}

}
