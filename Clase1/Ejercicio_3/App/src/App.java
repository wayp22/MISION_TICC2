import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        var nombre = sc.nextLine();
        System.out.println(saludo(nombre));
        sc.close();
    }

    public static String saludo(String nombre){
        return "Hola "+ nombre + "!";
    }
}
