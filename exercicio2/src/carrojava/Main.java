package carrojava;

public class Main {

	
	public static void main(String[] args) {
		
		
		Carro fiat = new Carro("azul","uno 2010", 120);
		
		
		System.out.println("Programa que simula a aceleração de um carro");
		fiat.ligar();
		fiat.acelerar(120);
		
		
		System.out.println("Meu Fiat " + fiat.getCor() + ", modelo " + fiat.getModelo() + ",esta a " + fiat.getVelocidadeAtual() + " km/h");
	

	}

}