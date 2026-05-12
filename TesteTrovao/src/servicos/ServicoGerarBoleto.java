package servicos;

import java.time.temporal.ChronoUnit;

import entidades.Aluguel;
import entidades.Boleto;

public class ServicoGerarBoleto {
	double valorDiaria;
	ServicoTaxa servicoTaxa;
	
	public ServicoGerarBoleto(double valorDiaria, ServicoTaxa servicoTaxa) {
		this.valorDiaria=valorDiaria;
		this.servicoTaxa=servicoTaxa;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public ServicoTaxa getServicoTaxa() {
		return servicoTaxa;
	}

	public void setServicoTaxa(ServicoTaxa servicoTaxa) {
		this.servicoTaxa = servicoTaxa;
	}
	
	public void processarBoleto(Aluguel aluguel) {
		long dias = ChronoUnit.DAYS.between(aluguel.getEntrada(), aluguel.getSaida());
		double taxaTotal = servicoTaxa.calculaTaxa(valorDiaria)*dias;
		double valorTotal =taxaTotal +(valorDiaria*dias);
		aluguel.setBoleto(new Boleto(taxaTotal, valorTotal));
	}
	

}
