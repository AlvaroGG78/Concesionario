package dominio;

public class Furgoneta extends Vehiculo{

    private int capacidad; 
    double precioFinal;

    public Furgoneta(String marca,String modelo,int precioBase, int capacidad,int asientos){
        super(marca, modelo, precioBase, asientos);
        this.capacidad = capacidad;
        this.precioFinal = this.setPrecioFinal();
    }

    public double setPrecioFinal(){
        double cube = Math.cbrt(this.capacidad);
        double precioBase = this.getPrecioBase();
        this.precioFinal = precioBase*(cube/2);
        return this.precioFinal;    
    }

    public String toString(){
        String s ="Marca: "+this.getMarca()+". Modelo: "+this.getModelo()+". Precio base: "+this.getPrecioBase()+". Precio final: "+this.getPrecio()+". Capacidad: "+this.capacidad+". Plazas: "+this.getAsientos(); 
        return s;
    }

}