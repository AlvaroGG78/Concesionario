package dominio;

public class VehiculoTurismo extends Vehiculo{
    public VehiculoTurismo(String marca,String modelo, int precioBase, int asientos){
        super(marca, modelo, precioBase, asientos);
    }
    public String toString(){
        String s = "Marca: "+this.getMarca()+". Modelo: "+this.getModelo()+". Precio base: "+this.getPrecioBase()+". Precio final: "+this.getPrecio()+". Plazas: "+this.getAsientos();
        return s;
    }
}