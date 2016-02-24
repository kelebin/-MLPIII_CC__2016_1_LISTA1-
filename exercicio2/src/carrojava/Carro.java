package carrojava;

public class Carro {
	protected String cor;
	protected String modelo;
	protected int velocidadeAtual;
	protected int velocidadeMaxima;
	
	public Carro(String cor, String modelo, int velocidadeMaxima) {
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void ligar(){//metodo void que simula o carro ligando (poderia ser feito com boolean)
		if (velocidadeAtual == 0){
			System.out.println("Ligando carro...");
		} else {
			System.out.println("Carro já está ligado!");
		}
	}
	
	public void acelerar(int velocidadeAcrescentada){
		
		if (velocidadeMaxima <= (velocidadeAtual + velocidadeAcrescentada)){
			velocidadeAtual = velocidadeAtual + velocidadeAcrescentada;
		} else {
			System.out.println("Velocidade excedida!");
		}
	}

}

