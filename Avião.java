package introducaoPOO;

public class Avi�o {
	
			int peso;
			int altura;
			int gasolina;
			int envergadura;
			int comprimento;
			
			void ligar()
			{
				System.out.println("Motores ligados.");
			}
			
			void desligar()
			{
				System.out.println("Motores desligados.");
			}
			
			public void estado()
			{
				System.out.println("peso: "+ this.peso+" Kg");
				System.out.println("A altura �: "+ this.altura);
				System.out.println("A envergadura �: "+ this.envergadura);
				System.out.println("A comprimento �: "+ this.comprimento);
				System.out.println("O tank esta "+ this.gasolina+"% cheio");
	
	}
}
