package aplicacion;
import interfaz.*;
import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    static Interfaz i = new Interfaz();
    public static void main(String[] args) {
        String input = getInput();
        if(input.split(" ")[0].equalsIgnoreCase("Exit")){
            i.Save();
        }
        else{
            i.run(input);
            main(args);
        }
    }
    public static String getInput(){
        String input = null;
        System.out.println("¿Qué desea hacer?");
        input = sc.nextLine();
        return input;
    }
}
