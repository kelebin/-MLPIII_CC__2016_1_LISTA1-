package exercicio3;

;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Programa que demonstra o uso do padr�o Singleton");
		System.out.println("Em todo o sistema s� h� uma inst�ncia da classe: "+
				"FabricaDeCarro >> "+ FabricaDeCarro.getInstance().toString());
	}

}