package serviço;

import java.util.Calendar;
import java.util.Date;

import entidades.Contrato;
import entidades.Parcelas;

public class ContratoDeServiço {

	private ServiçoDePagamentoOnline pagamento;

	public ContratoDeServiço(ServiçoDePagamentoOnline pagamento) {
		this.pagamento = pagamento;
	}

	public void processoDoContrato(Contrato contrato, int meses) {
		double valorContrato = contrato.getValorContrato() / meses;
		for (int i = 1; i <= meses; i++) {
			Date data = addMonths(contrato.getData(), i);
			double novoValor = valorContrato + pagamento.juros(valorContrato, i);
			double valorFinal = novoValor + pagamento.taxaDePagamento(novoValor);
			contrato.addParcelas(new Parcelas(data, valorFinal));
		}
		}

	private Date addMonths(Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}