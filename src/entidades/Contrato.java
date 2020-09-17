package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private Integer numeroContrato;
	private Date data;
	private Double valorContrato;
	
	private List<Parcelas> parcelas = new ArrayList<>();

	public Contrato(Integer número, Date data, Double valorContrato) {
		this.numeroContrato = número;
		this.data = data;
		this.valorContrato = valorContrato;
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer número) {
		this.numeroContrato = número;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorContrato() {
		return valorContrato;
	}
	public void setValorContrato(Double totalValue) {
		this.valorContrato = totalValue;
	}
	
	public List<Parcelas> getParcelas() {
		return parcelas;
	}

	public void addParcelas(Parcelas parcela) {
		parcelas.add(parcela);
	}

	public void removeParcelas(Parcelas parcela) {
		parcelas.remove(parcela);
	}
}


