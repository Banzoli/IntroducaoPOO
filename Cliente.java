package introducaoPOO;

public class Cliente {
	
			String sexo;
			int altura;
			int idade;
			String filhos;
			String dinheiro;
			
			void pagar()
			{
				System.out.println("Sua divida foi paga");
			}
			
			void dever()
			{
				System.out.println("voce tem divida.");
			}
			
			public void estado()
			{
				System.out.println("sexo: "+ this.sexo);
				System.out.println("A altura é: "+ this.altura);
				System.out.println("Tem "+ this.idade + " anos.");
				System.out.println("tem filhos: "+ this.filhos);
	
	
	}
}
