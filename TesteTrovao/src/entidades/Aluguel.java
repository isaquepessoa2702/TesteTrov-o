	package entidades;

import java.time.LocalDate;

public class Aluguel {
	LocalDate entrada;
	LocalDate saida;
	
	public Aluguel(LocalDate entrada, LocalDate saida) {
		this.entrada=entrada;
		this.saida=saida;
	
	}

	public LocalDate getEntrada() {
		return entrada;
	}

	public void setEntrada(LocalDate entrada) {
		this.entrada = entrada;
	}

	public LocalDate getSaida() {
		return saida;
	}

	public void setSaida(LocalDate saida) {
		this.saida = saida;
	}

	public void setBoleto(Boleto boleto) {
	
		
	}
	
	
}