package introducaoPOO;

public class Atividade02 {

	public static void main(String[] args) {
		
		Avi�o Avi�o1 = new Avi�o();
		Avi�o1.peso = 276800;
		Avi�o1.altura = 2400;
		Avi�o1.comprimento = 7200;
		Avi�o1.envergadura = 7900;
		Avi�o1.gasolina= 70;
		Avi�o1.estado();
		Avi�o1.ligar();
		
		System.out.println(" ");
		
		Avi�o Avi�o2 = new Avi�o();
		Avi�o2.peso = 216500;
		Avi�o2.altura = 1900;
		Avi�o2.comprimento = 6700;
		Avi�o2.envergadura = 7500;
		Avi�o2.gasolina= 10;
		Avi�o2.estado();
		Avi�o2.desligar();
		
	}

}
