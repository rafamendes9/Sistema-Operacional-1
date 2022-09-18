package ProdConMonitor;

public class Vendedor extends Thread {
	private ProdConMonitor.Produto pilha;
	private int producaoTotal;
	private int idenVendedor;

	public void run() {
		for (int i = 0; i < producaoTotal; i++) {
			pilha.set(idenVendedor, i);
		}
	}

	public Vendedor(int id, ProdConMonitor.Produto bufferCompartilhado, int producaoTotal) {
		idenVendedor = id;
		pilha = bufferCompartilhado;
		this.producaoTotal = producaoTotal;
	}

}