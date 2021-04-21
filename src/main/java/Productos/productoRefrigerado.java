package Productos;

public class productoRefrigerado {
    //Atributes
    private int fechaCaducidad;
    private int numeroDeLote;
    private int codigoOSA;
    private int fechaEnvasado;
    private int temperaturaManto;
    private String paisOrigen;
    
    //Constructor

    public productoRefrigerado(int fechaCaducidad, int numeroDeLote, int codigoOSA, int fechaEnvasado, int temperaturaManto, String paisOrigen) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroDeLote = numeroDeLote;
        this.codigoOSA = codigoOSA;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaManto = temperaturaManto;
        this.paisOrigen = paisOrigen;
    }

    public productoRefrigerado(int fechaEnvasado, String paisOrigen){
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
    
    public productoRefrigerado (int fechaEnvasado,int temperaturaManto,String paisOrigen)
    {
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaManto = temperaturaManto;
        this.paisOrigen = paisOrigen;
    }    

    //Getters & Setters
    public int getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(int fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroDeLote() {
        return numeroDeLote;
    }

    public void setNumeroDeLote(int numeroDeLote) {
        this.numeroDeLote = numeroDeLote;
    }

    public int getCodigoOSA() {
        return codigoOSA;
    }

    public void setCodigoOSA(int codigoOSA) {
        this.codigoOSA = codigoOSA;
    }

    public int getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(int fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public int getTemperaturaManto() {
        return temperaturaManto;
    }

    public void setTemperaturaManto(int temperaturaManto) {
        this.temperaturaManto = temperaturaManto;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    //Methods
    
    public void fresco(){
        
    }
}
