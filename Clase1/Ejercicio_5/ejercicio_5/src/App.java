import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        System.out.println("Ingresa tu numero: ");
        var numero = sc.nextLine();
        System.out.println(" Los digitos dobel es:" + doble(Integer.parseInt(numero)));
        System.out.println(" Los digitos triple es:" + triple(Integer.parseInt(numero)));
        System.out.println(dos(Integer.parseInt(numero)));
        sc.close();
    }

    public static int doble(int numero){
        return numero * 2;
    }

    public static int triple(int numero){
        return numero * 3;
    }

    public static String dos(int numero){
        return "El doble es: " + numero * 2 + " El tiple es: " + numero * 3;
    }
}
