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

	public void volumenUp() {
		if (volumen < 7 && estado) {
			volumen++;
			}
		}
	public void volumenDown() {
		if (volumen > 0 && estado) {
			volumen--;
		}
	}
	
	public void setVolumen(int volumen) {
		if (volumen <= 7 && volumen >= 0 && estado) {
			this.volumen = volumen;
		}
	}
	
	public void turnOn() {
		estado = true;
	}

	public void turnOff() {
		estado = false;
	}
	
	public void canalUp() {
		if (canal < 120 && estado) {
			canal++;
		}
	}

	public void canalDown() {
		if (canal > 1 && estado) {
			canal--;
		}
	}
	
	public void setCanal(int canal) {
		if (canal <= 120 && canal >= 1 && estado) {
			this.canal = canal;
		}
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
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
	
	public void setControl(Control control) {
		this.control = control;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}
