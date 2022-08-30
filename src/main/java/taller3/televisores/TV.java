package taller3.televisores;

public class TV {
    Marca marca;
    int canal;
    int precio;
    boolean estado;
    int volumen;
    Control control;
    static int numTV;
    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        numTV +=1;
    }
    public void turnOn(){
        this.estado = true;
    }
    public void turnOff(){
        this.estado = false;
    }
    public void canalUp(){
        if (estado == true && canal+1 != 121){
            this.canal += 1;
        }
    }
    public void canalDown(){
        if (estado == true && canal-1 != 0){
            this.canal -= 1;
        }
    }
    public void volumenUp(){
        if (estado == true && volumen+1 != 8){
            this.volumen += 1;
        }
    }
    public void volumenDown(){
        if (estado == true && volumen-1 != -1){
            this.volumen -= 1;
        }
    }
    public Marca getMarca(){
        return marca;
    }
    public Control getControl(){
        return control;
    }
    public int getPrecio(){
        return precio;
    }
    public int getVolumen(){
        return volumen;
    }
    public int getCanal(){
        return canal;
    }
    public static int getNumTV(){
        return numTV;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setMarca(Marca marca){
        this.marca = marca;
    }
    public void setControl(Control control){
        this.control = control;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    public void setCanal(int canal){
        if (estado == true && canal >= 1 && canal <= 120){
            this.canal = canal;
        }
    }
    public static void setNumTV(int newnum){
        numTV = newnum;
    }
}

