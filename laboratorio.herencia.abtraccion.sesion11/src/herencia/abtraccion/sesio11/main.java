package herencia.abtraccion.sesio11;

import java.io.PrintStream;
import java.util.Scanner;

public class main {
    public static Scanner keyboard = new Scanner(System.in);
    public static PrintStream screen = System.out;
    public static void main(String[] args) {

        vehiculo vehiculo1 = new vehiculo("", "") {
            @Override
            public int kilometrosrecorridos() {
                return 0 ;
            }
        };
        vehiculo1.vehiculoscredos();
        vehiculo1.kilometrostotales();
        vehiculo1.kilometrosrecorridos();


        carro carro1 = new carro("bmw","2023");
        Bicicleta bicicleta1 = new Bicicleta("gt","1999");;
        bicicleta1.andar();
        bicicleta1.picar();
        carro1.andar();
        carro1.quemarllanta();
        bicicleta1.km();
        carro1.km();
        carro1.kmtotal();
        carro1.salir();




        int opcion = 0;

        while (opcion !=8){
            screen.println(" ecoga un numero del 1 al 7 o numero 8 para salir ");
        opcion = Integer.parseInt(keyboard.next());

        switch (opcion) {
            case 1:
                bicicleta1.andar();
                screen.println("la bicicleta empezo rodar");
                break;
            case 2:
                bicicleta1.picar();
                screen.println("la bicicleta se esta picando");
                break;
            case 3:
                carro1.andar();
                screen.println("el carro empezo rodar");
                break;
            case 4:
                carro1.quemarllanta();
                screen.println("el carro esta quemado llanta");
                break;
            case 5:
                bicicleta1.km();
                screen.println(" el kilometraje es " + 250  );
                break;
            case 6:
                carro1.km();
                screen.println(" el kilometraje es " + 120);
                break;
            case 7:
                carro1.kmtotal();
                break;
            case 8:
                carro1.salir();
                screen.println("hasta luego");
                break;
        }

        screen.println(" el usuario escogio el numero " + opcion);

        }
    }
}







