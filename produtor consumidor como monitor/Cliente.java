package ProdConMonitor;

public class Cliente extends Thread {
	private ProdConMonitor.Produto pilha;
	private int totalCliente;
	private int idenCliente;

	public void run() {
		for (int i = 0; i < totalCliente; i++) {
			pilha.get(idenCliente);
		}
	}

	public Cliente(int id, ProdConMonitor.Produto bufferCom, int totalCliente) {
		idenCliente = id;
		pilha = bufferCom;
		this.totalCliente = totalCliente;
	}

}
