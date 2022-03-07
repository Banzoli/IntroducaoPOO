package introducaoPOO;

public class Atividade04 {

	public static void main(String[] args) {
		
		Paciente Paciente1 = new Paciente();
		Paciente1.sexo = "Feminino";
		Paciente1.altura = 1.66;
		Paciente1.idade = 30;
		Paciente1.peso = 70;
		Paciente1.Alergico();
		Paciente1.estado();
		
		System.out.println(" ");
		
		Paciente Paciente2 = new Paciente();
		Paciente2.sexo = "Masculino";
		Paciente2.altura = 1.76;
		Paciente2.idade = 40;
		Paciente2.peso = 80;
		Paciente2.NAlergico();
		Paciente2.estado();
		
	}

}
