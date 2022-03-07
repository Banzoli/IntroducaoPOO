package introducaoPOO;

public class Atividade01 {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.sexo = "Masculino";
		cliente1.altura = 170;
		cliente1.idade = 20;
		cliente1.filhos = "s";
		cliente1.dever();
		cliente1.estado();
		
		System.out.println(" ");
		
		Cliente cliente2 = new Cliente();
		cliente2.sexo = "Feminino";
		cliente2.altura = 164;
		cliente2.idade = 17;
		cliente2.filhos = "n";
		cliente2.pagar();
		cliente2.estado();
		
	}

}
