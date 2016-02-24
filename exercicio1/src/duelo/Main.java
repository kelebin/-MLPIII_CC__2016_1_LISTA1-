package duelo;

import java.util.Scanner;

public class Main {
     public static void main (String[] args){
  Scanner scan = new Scanner (System.in);
  Fatura kevin = new Fatura();
  System.out.println("Programa que simula uma compra e gera fatura");
  System.out.println("Informe o numero da sua fatura: ");
  String numero = scan.next();
  kevin.setNumero(numero);
  System.out.println("Informe o nome do produto: ");
  String descricao = scan.next();
  kevin.setDescricao(descricao);
  System.out.println("Informe o preço do produto: ");
  double preco = scan.nextDouble();
  kevin.setPreco(preco);
  System.out.println("Informe a quantidade que deseja comprar: ");
  int quantComprada = scan.nextInt();
  kevin.setQnt(quantComprada);
  System.out.println("Numero da fatura: "+kevin.getNumero());
  System.out.println("Nome do produto: "+kevin.getDescricao());
  System.out.println("Preço do Produto: "+kevin.getPreco());
  System.out.println("Quantidade Comprada: "+kevin.getQnt());
  System.out.println("Valor da Fatura: "+kevin.getValorFatura(quantComprada, preco));
  
  
  
    }
     
}