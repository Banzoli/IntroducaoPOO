package introducaoPOO;

public class Funcion�rio {
	
			String sexo;
			double altura;
			int idade;
			String filhos;
			String fundamental;
			
			void fundamental()
			{
				System.out.println("Voc� � qualificado.");
			}
			
			void analfabeto()
			{
				System.out.println("Voc� n�o � qualificado.");
			}
			
			public void estado()
			{
				System.out.println("sexo: "+ this.sexo);
				System.out.println("A altura �: "+ this.altura);
				System.out.println("Tem "+ this.idade + " anos.");
				System.out.println("tem filhos: "+ this.filhos);
	
	
	}
}
