package projeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Parcelas;
import servi�o.ContratoDeServi�o;
import servi�o.Paypal;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//entrada
		System.out.println("Dados do contrato : ");
		System.out.print("Numero: ");
		int numeroContrato = sc.nextInt();
		System.out.println("Data (dd/MM/yyyy): ");
		sc.nextLine();
		Date data = sdf.parse(sc.nextLine());
		System.out.println("Valor do contrato: ");
		double valorContrato = sc.nextDouble();

		Contrato contrato = new Contrato(numeroContrato, data, valorContrato);

		System.out.println("Entre o n�mero de parcelas");
		int meses = sc.nextInt();

		ContratoDeServi�o contratoDeServi�o = new ContratoDeServi�o(new Paypal());
		
		contratoDeServi�o.processoDoContrato(contrato, meses);

		//saida
		System.out.println("Parcelas:");
		for (Parcelas parcela : contrato.getParcelas()) {
			System.out.println(parcela);
		}
		
		sc.close();
	}

}
