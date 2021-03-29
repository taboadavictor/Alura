package Java_Lang_Revisao;

public class testeConta {
	
	String titular;
	double saldo;

	public void transfere (double valor) {
		
		if (valor < saldo) {
			System.out.println("Saldo insuficiente " + saldo);
		} else {
			this.saldo = saldo - valor;
		}
	}
	
	public void deposita (double valor) {
		saldo = this.saldo + valor;
	}
}
