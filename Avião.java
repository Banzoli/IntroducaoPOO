package introducaoPOO;

public class Avião {
	
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
				System.out.println("A altura é: "+ this.altura);
				System.out.println("A envergadura é: "+ this.envergadura);
				System.out.println("A comprimento é: "+ this.comprimento);
				System.out.println("O tank esta "+ this.gasolina+"% cheio");
	
	}
}
