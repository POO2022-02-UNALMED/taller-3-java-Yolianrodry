package taller3.televisores;

public class TV {

	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
		
	public static int getNumTV() {
		return numTV;
	}

	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV ++;
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}

	public Marca getMarca() {
		return marca;
	}

	public int getCanal() {
		return canal;
	}

	public int getPrecio() {
		return precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public Control getControl() {
		return control;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}
