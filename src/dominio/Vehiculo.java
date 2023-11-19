package dominio;

public class Vehiculo{
    private String marca;
    private String modelo;
    private double precioBase;
    private double precio;
    private int asientos;

    public Vehiculo(String marca,String modelo, int precioBase, int asientos){
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.asientos = asientos;
        this.precio = setPrecioFinal(this.asientos);
    }

    public double setPrecioFinal(int asientos) {
        if (asientos <= 5) {
        this.precio = this.precioBase;
        } 
        else if (asientos > 5) {
            int excess = asientos - 5;
            for (int i = 0; i < excess; i++) {
                this.precio += this.precioBase * 1.1;
            }
        }
        return precio;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setPrecioBase(int precioBase){
        this.precioBase = precioBase;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public double getPrecioBase(){
        return this.precioBase;
    }
    public double getPrecio(){
        return this.precio;
    }

    public int getAsientos(){
        return this.asientos;
    }
}