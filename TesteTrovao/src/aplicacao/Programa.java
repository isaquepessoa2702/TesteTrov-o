package aplicacao;

import java.time.LocalDate;
import java.util.Scanner;

import entidades.Aluguel;
import entidades.Imovel;

public class Programa {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	DateTimeFromatter fat = DateTimeFDormatter.ofPatterm("dd/MM/yyyy");
	
	System.out.println("*** Informe os dados da locação ***");
	System.out.println("Código do imóvel: ");
	int codigo = sc.nextInt();
	System.out.println("Descrição:");
	sc.nextLine();
	String descircao = sc.nextLine();
	System.out.print("Valor da Diária: ");
	double valorDiaria = sc.nextDouble();
	System.out.print("Data Entrada (dd//MM/yyyy): ");
	LocalDate saida = LocalDate.parse(sc.next(),fat);
	
	Imovel imovel = new Imovel(codigo,descricao);
	Aluguel aluguel = new Aluguel(entrada, saida, Imovel);
	
	System.out.println("Qual o condomínio: 1-Mar Azul  2-Paraiso:");
	int condominio = sc.nextInt();
	
	
	}

}
