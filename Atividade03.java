package introducaoPOO;

public class Atividade03 {

	public static void main(String[] args) {
		
		ProdutoEletr�nico Celular = new ProdutoEletr�nico();
		Celular.peso = 170;
		Celular.altura = 148;
		Celular.tela = 5.2;
		Celular.largura = 73.4;
		Celular.bateria= 70;
		Celular.estado();
		Celular.ligar();
		
		System.out.println(" ");
		
		ProdutoEletr�nico Celular2 = new ProdutoEletr�nico();
		Celular2.peso = 140;
		Celular2.altura = 148.9;
		Celular2.tela = 5.8;
		Celular2.largura = 68.4;
		Celular2.bateria= 30;
		Celular2.estado();
		Celular2.desligar();
		
	}

}