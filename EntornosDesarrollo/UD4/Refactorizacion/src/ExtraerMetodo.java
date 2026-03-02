
public class ExtraerMetodo {
	public void procesarPedido() {
	    System.out.println("Conectando a BD...");
	    validarStock();
	    System.out.println("Pedido enviado.");
	}

	private void validarStock() {
		System.out.println("Verificando stock...");
	    // 20 líneas de lógica de validación aquí
	}
}

