package interfaz;
import java.io.*;
import java.util.ArrayList;

import dominio.*;

public class Interfaz {
    public Interfaz(){
        ObjectInputStream obj;
        File file = new File("vehiculos.dat");
        try{
            obj = new ObjectInputStream(new FileInputStream(file));
            try{Concesionario.vehiculos = (ArrayList<Vehiculo>)obj.readObject();}catch(Exception e){System.out.println(e);}
            obj.close();
            System.out.println("Vehículos encontrados.");
        }catch(Exception e){
            System.out.println("Sin vehículos.");
            Concesionario.vehiculos = new ArrayList<Vehiculo>();
        }
    }

    public void run(String input){
        String[] split = input.split(" ");
        if(split[0].equalsIgnoreCase("precio")){
           System.out.println(Concesionario.getVehiculosTotal());
        }
        else if(split[0].equalsIgnoreCase("agregar")){
            if(split[1].equalsIgnoreCase("coche")){
                String marca = split[2];
                String modelo = split[3];
                int precioBase = Integer.parseInt(split[4]);
                int asientos = Integer.parseInt(split[5]);
                VehiculoTurismo c = Concesionario.newVehiculoTurismo(marca, modelo, precioBase, asientos);
                Concesionario.vehiculos.add(c);
                System.out.println("Coche agregado");
            }
            if(split[1].equalsIgnoreCase("furgoneta")){
                String marca = split[2];
                String modelo = split[3];
                int precioBase = Integer.parseInt(split[4]);
                int capacidad = Integer.parseInt(split[5]);
                int asientos = Integer.parseInt(split[6]);
                Furgoneta v = Concesionario.newFurgoneta(marca, modelo, precioBase, capacidad, asientos);
                Concesionario.vehiculos.add(v);
            }
        }
        else if(split[0].equalsIgnoreCase("mostrar")){
            System.out.println(Concesionario.getVehiculos());
        }
    }


public void Save(){
    ObjectOutputStream obj;
            File file = new File("vehiculos.dat");
            try{
                obj = new ObjectOutputStream(new FileOutputStream(file));
                obj.writeObject(Concesionario.vehiculos);
                obj.close();
                System.out.println("Guardado");
            }catch(Exception e){
                System.out.println("Error al guardar");
                System.out.println(e);
            }
    }
}
