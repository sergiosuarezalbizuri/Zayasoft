

	

/**
 * REALIZAR UNA FUNCION, A LA QUE SE LE PASE COMO PARAMETRO
 * UN NUMERO "N", Y MUESTRE POR PANTALLA "N" VECES
 * "MUDULO EJECUTANDOSE"
 */
import java.util.Scanner;
public class Modulo1 {

    public static Scanner TECLADO;
    public static void main(String[] ARGUMENTOS)
    {
        TECLADO = new Scanner(System.in);
        int N;
 
        N = LEER_NUMERO();
        N_VECES(N);       
    }
 
    public static int LEER_NUMERO()
    {
        int NUMERO;
 
        System.out.print("INDIQUE EL VALOR DEL NUMERO : ");
        NUMERO = TECLADO.nextInt();
 
        return NUMERO;
    }
    public static void N_VECES(int N)
    {
        int I;
 
        for(I=1;I<=N;I++)
        {
            System.out.println(I + " VECES : MODULO EJECUTANDOSsE");
        }
    }


}
			
			
		
		
		



