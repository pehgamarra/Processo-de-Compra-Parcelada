package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas{

	private Date numeroParcelas;
	private Double valor;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


	public Parcelas(Date numeroParcelas, Double valor) {
		this.numeroParcelas = numeroParcelas;
		this.valor = valor;
	}

	public Date getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(Date numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

	public Double getAmount() {
		return valor;
	}
	@Override
	public String toString() {
		return sdf.format(numeroParcelas) + " - " + String.format("%.2f", valor);
 	}

}

