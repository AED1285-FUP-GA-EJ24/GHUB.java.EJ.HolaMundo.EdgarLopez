package miPrincipal;
import java.util.Scanner;
public class Distancia {

    public static void main(String args[]){
        Scanner entrada= new Scanner(System.in);

        float d;
        float v;
        float t;

        

        System.out.print("proporciona velocidad en m/s: " );
        v = entrada.nextFloat();

        System.out.print("proporciona tiempo en s: " );
        t = entrada.nextFloat();

        d = v*t;
        
        System.out.print( "la distancia es: " + d +  "m" );  

    }
}