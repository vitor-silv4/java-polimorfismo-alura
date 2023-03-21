
public class ContaCorrente extends Conta implements Tributavel {
	//Construtor não é herdado da classe mãe
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); 
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorSacar = valor + 0.2;
		super.saca(valorSacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
}
