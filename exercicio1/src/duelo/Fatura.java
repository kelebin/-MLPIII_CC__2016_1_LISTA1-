package duelo;

public class Fatura {
	private String numero;
	private String descricao;
	private int qnt;
	private Double preco;

	public double getValorFatura (int qnt, double preco){
		  double quantFatura;  
		     quantFatura = this.qnt * this.preco;  
		     return quantFatura;  
		 }
	
	public void configura (String num,int qnt){ 
		  if ( qnt < 0){
		  this.qnt = 0;
		 }
		  if ( preco < 0){
		     this.preco = 0.0;
		 }
		}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
   
}
