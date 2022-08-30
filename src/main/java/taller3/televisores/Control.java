package taller3.televisores;

public class Control {

	TV tv;

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public void turnOn() {
		if (tv.estado==false){
			tv.estado = true;
		}
	}
	
	public void turnOff() {
		if (tv.estado==true){
			tv.estado = false;
		}
	}
	
	public void canalUp() {
		if (tv.estado==true){
			if(tv.canal>=1 && tv.canal <120) {
				tv.canal++;	
			}
		}
	}
	
	public void canalDown() {
		if (tv.estado==true){
			if(tv.canal>1 && tv.canal <=120) {
				tv.canal--;	
			}
		}
	}
	
	public void volumenUp() {
		if (tv.estado==true){
			if(tv.volumen>=0 && tv.volumen <7) {
				tv.volumen++;	
			}
		}
	}
	
	public void volumenDown() {
		if (tv.estado==true){
			if(tv.volumen>0 && tv.volumen <=7) {
				tv.volumen--;
			}
		}
	}
	
	public void setCanal(int canal) {
		if (canal>=1 && canal <=120 && tv.estado==true) {
			this.tv.canal = canal;
		}
	}
	
	public void enlazar(TV tv) {
		this.tv = tv;
		this.tv.setControl(this);
	}

}
