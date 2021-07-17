import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        System.out.println("Ingresa tu numero: ");
        var numero = sc.nextLine();
        System.out.println(" Los digitos son:" + digitosNumero(Integer.parseInt(numero)));
        sc.close();
    }

    public static int digitosNumero(int numero){
        var cifras = 0;

        while(numero != 0){
            numero /= 10;
            cifras++;
        }
        return cifras;
    }
}
