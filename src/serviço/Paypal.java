package serviço;

public class Paypal implements ServiçoDePagamentoOnline {

		private static final double juro = 0.02;
		private static final double taxa = 0.01;


		@Override
		public double taxaDePagamento(double valor) {
			return valor * juro;
		}

		@Override
		public double juros(double valor, int meses) {
			return valor * taxa * meses;
		}
	
}