package ProdConMonitor;

public class Produto {
	private boolean livre;
	private int conteudo;

	public synchronized int get(int idenCliente) {
		while (livre == false) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Cliente " + idenCliente + " consumiu: " + conteudo);
		livre = false;
		notifyAll();
		return conteudo;
	}

	public synchronized void set(int idenVendedor, int valor) {
		while (livre == true) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		conteudo = valor;
		System.out.println("Vendedor " + idenVendedor + " produziu: " + conteudo);
		livre = true;
		notifyAll();
	}
}