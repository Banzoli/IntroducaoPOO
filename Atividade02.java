package introducaoPOO;

public class Atividade02 {

	public static void main(String[] args) {
		
		Avião Avião1 = new Avião();
		Avião1.peso = 276800;
		Avião1.altura = 2400;
		Avião1.comprimento = 7200;
		Avião1.envergadura = 7900;
		Avião1.gasolina= 70;
		Avião1.estado();
		Avião1.ligar();
		
		System.out.println(" ");
		
		Avião Avião2 = new Avião();
		Avião2.peso = 216500;
		Avião2.altura = 1900;
		Avião2.comprimento = 6700;
		Avião2.envergadura = 7500;
		Avião2.gasolina= 10;
		Avião2.estado();
		Avião2.desligar();
		
	}

}
