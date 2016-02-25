package exercicio3;

;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Programa que demonstra o uso do padrão Singleton");
		System.out.println("Em todo o sistema só há uma instância da classe: "+
				"FabricaDeCarro >> "+ FabricaDeCarro.getInstance().toString());
	}

}