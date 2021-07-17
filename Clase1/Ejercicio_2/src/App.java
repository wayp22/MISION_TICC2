import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor increse su valor");
        String nombre = sc.nextLine();
        System.out.println("el valor es: " + nombre );
        sc.close();
    }
}
