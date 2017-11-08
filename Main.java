package pa.edu.uip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int ao;

        System.out.println ("Inserte un año");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ao = Integer.parseInt(br.readLine()) ;

        if ((ao % 4 == 0) && ((ao % 100 != 0) || (ao % 400 == 0)))
            System.out.println("El año es bisiesto");
        else
            System.out.println("El año no es bisiesto");


    }
}
