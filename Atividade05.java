package introducaoPOO;

public class Atividade05 {

	public static void main(String[] args) {
		
		
		Patinete Patinete1 = new Patinete();
		Patinete1.comprimento = 70;
		Patinete1.altura = 50;
		Patinete1.cor = "preto";
		Patinete1.largura = 40;
		Patinete1.suportaKG= 77;
		Patinete1.estado();
		Patinete1.duasRodas();
		
		System.out.println(" ");
		
		Patinete Patinete2 = new Patinete();
		Patinete2.comprimento = 75;
		Patinete2.altura = 60;
		Patinete2.cor = "rosa";
		Patinete2.largura = 50;
		Patinete2.suportaKG= 100;
		Patinete2.estado();
		Patinete2.tresRodas();
		
	}

}