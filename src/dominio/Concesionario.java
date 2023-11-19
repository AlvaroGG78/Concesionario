package dominio;
import java.util.ArrayList;


public class Concesionario{
    public static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public static String getVehiculosTotal(){
        double total = 0;
        for(Vehiculo v: vehiculos){
            total += v.getPrecio();
        }
        String x = "El precio total de todos los vehiculos es "+total+ " €.";
        return x;
    }
    public static String getVehiculos(){
        String s = "Vehiculos:\n";
        for(Vehiculo v : vehiculos){
            if(vehiculos.indexOf(v) == (vehiculos.size()-2)){
                s += v.toString();
                s += "\n";
            }
            else if(vehiculos.indexOf(v) == (vehiculos.size()-1)){
                s+= v.toString();
            }   

            else{
                s += v.toString();
                s += ", ";
            }

        }
        return s;
    }

    public static VehiculoTurismo newVehiculoTurismo(String marca, String modelo, int precioBase, int asientos){
        VehiculoTurismo c = new VehiculoTurismo(marca, modelo, precioBase, asientos);
        return c;
    }
    public static Furgoneta newFurgoneta(String marca,String modelo,int precioBase, int capacidad,int asientos){
        Furgoneta v = new Furgoneta(marca, modelo, precioBase, capacidad, asientos);
        return v;
    }

}