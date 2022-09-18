package ProdConMonitor;

public class Main {

	public static void main(String[] args) {
	    Produto bufferCompartilhado = new Produto();
	    Vendedor produtor1 = new Vendedor(1, bufferCompartilhado, 5);
	    Cliente consumidor1 = new Cliente(1, bufferCompartilhado, 2);
	    Vendedor produtor2 = new Vendedor(2, bufferCompartilhado, 5);
	    Cliente consumidor2 = new Cliente(2, bufferCompartilhado, 8);
	    Vendedor produtor3 = new Vendedor(2, bufferCompartilhado, 4);
	    Cliente consumidor3 = new Cliente(2, bufferCompartilhado, 6);
	 
	    produtor1.start();
	    consumidor1.start();
	    produtor2.start();
	    consumidor2.start();
	    produtor3.start();
	    consumidor3.start();
	}

}
