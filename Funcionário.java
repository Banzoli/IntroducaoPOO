package introducaoPOO;

public class Funcionário {
	
			String sexo;
			double altura;
			int idade;
			String filhos;
			String fundamental;
			
			void fundamental()
			{
				System.out.println("Você é qualificado.");
			}
			
			void analfabeto()
			{
				System.out.println("Você não é qualificado.");
			}
			
			public void estado()
			{
				System.out.println("sexo: "+ this.sexo);
				System.out.println("A altura é: "+ this.altura);
				System.out.println("Tem "+ this.idade + " anos.");
				System.out.println("tem filhos: "+ this.filhos);
	
	
	}
}
