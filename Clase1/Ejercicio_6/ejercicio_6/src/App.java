import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        System.out.println("Ingresa la temperatura en grados centígrados: ");
        var numero = sc.nextInt();
        System.out.println(" Los digitos dobel es:" + temperatura(numero));
        sc.close();
    }
    
    public static int temperatura(int numero){
        return 32 + (9 * numero / 5);
    }
}