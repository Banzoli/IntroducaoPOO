package introducaoPOO;

public class Paciente {
	
			String sexo;
			double altura;
			int idade;
			double peso;
			
			void Alergico()
			{
				System.out.println("Alergico a medicamentos.");
			}
			
			void NAlergico()
			{
				System.out.println("N�o alergico a medicamentos.");
			}
			
			public void estado()
			{
				System.out.println("sexo: "+ this.sexo);
				System.out.println("A altura �: "+ this.altura);
				System.out.println("Tem "+ this.idade + " anos.");
				System.out.println("Seu peso � : "+ this.peso+"KG");
	
	
	}
}
