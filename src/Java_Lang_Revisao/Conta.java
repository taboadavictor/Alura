package Java_Lang_Revisao;

public class Conta {
	
	String titular;
	double saldo;
	
	
	public void transfere (double valor) {
		if (valor > saldo) {
			System.out.println("O saldo n�o � suficiente" + this.saldo);
		} else {
			this.saldo = saldo - valor;
			System.out.println("O seu saldo agora e de: " + this.saldo);
		}
	}
	
	@Override
	public String toString() {
		return "retorna o saldo " + this.saldo;
	}
	
	
}