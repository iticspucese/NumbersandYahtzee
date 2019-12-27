package JuegoDados;

import java.util.Scanner;

public class Yatzee {
	//Ejercicio38
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
        boolean primeraLanzada = true;
        int CantidadDados = 2;
        int numeroLanzamiento = 2;

        if (CantidadDados >= 1 && CantidadDados <= 10) {
            FuncionesDado lanzar = new FuncionesDado();
            int[] caras = null;

            int presionar = 0;
            do {
                System.out.println("----------------------------");
                if (primeraLanzada) {
                    caras = lanzar.Lanzar(CantidadDados);
                    lanzar.dibujar(CantidadDados, caras);
                    primeraLanzada = false;
                }

                System.out.print("Presione 1 para lanzar los dados dado y 0 para salir: ");
                presionar = reader.nextInt();

                switch (presionar) {

                    case 1:
                        System.out.println("----------------------------");
                        System.out.println("Lanzando Dados");
                        for (int i = 0; i < numeroLanzamiento; i++) {
                            caras = lanzar.Lanzar(CantidadDados);
                            if (i == (numeroLanzamiento - 1)) {
                                System.out.println("Resultado: ");
                            }
                            lanzar.dibujar(CantidadDados, caras);
                            System.out.println("----------------------------");
                        }
                        if (lanzar.verificarSiLadosIguales(caras)) {
                            System.out.println("Yahtzee");
                        } else {
                            System.out.println("----  Intente nuevamente  ----");
                        }
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }

            } while (presionar != 0);
        }

    }

}


	