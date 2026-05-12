package entidades;

public class Boleto {
	double taxaTotal;
	double valorTotal;
	
	public Boleto(double taxaTotal, double valorTotal) {
		this.taxaTotal=taxaTotal;
		this.valorTotal=valorTotal;
	}

	public double getTaxaTotal() {
		return taxaTotal;
	}

	public void setTaxaTotal(double taxaTotal) {
		this.taxaTotal = taxaTotal;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	

}
