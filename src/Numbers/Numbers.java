
package Numbers;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Numbers {

    public static void main(String[] args) {
        //Ejercicio #37
    	
    	//ingresar datos por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros");
        int cantidad = sc.nextInt();
        Generate n = new Generate(cantidad);
        for (int i = 0; i < cantidad; i++) {
            n.addNumber();
        }
        n.ordenar();
        int op = 0;
        do {
            menu();
            op = sc.nextInt();
            switch (op) {
                case 1:
                    n.getMax();
                    break;
                case 2:
                    //n.getMax();
                    n.getMin();
                    break;
                case 3:
                    n.getMed();
                    break;
                case 4:
                    n.mayorFrec();
                    break;
                case 5:
                    n.sumarCuadrados();
                    break;
                case 6:
                    n.promedio();
                    break;
                case 7:
                    n.cercanoCero();
                    break;
                case 8:
                    n.mayorProm();
                    break;
                case 9:
                    n.imprimirOrdenado();
                    break;
                case 10:
                    n.imprimir();
                    break;
                case 11:
                    double arreglo[];
                    String salida = "Elemento\tValor\tHistograma";
                    double cont = 0.0, cont2 = 0.0;
                    for (int contador = 0; contador < 10; contador++) {

                        int dec = 10;
                        double dec2 = 10d;
                        cont = Math.round(cont * dec) / dec2;
                        cont2 = cont + 0.1;
                        cont2 = Math.round(cont2 * dec) / dec2;
                        arreglo = n.array(cont, cont2);
                        salida += "\n" + (cont) + " - " + (cont2) + "\t" + arreglo.length + "\t";
                        cont += 0.1;
                        for (int estrellas = 0; estrellas < arreglo.length; estrellas++) {
                            salida += "*";
                        }
                    } 
                    System.out.println(salida);
                    break;
                case 12:
                    break;
                default:
                    System.out.println("Opcion incorrecta, ingrese de nuevo");
                    break;
            }
        } while (op != 12);

    }
    public static void menu() {
        System.out.println("------------- Menu -------------");
        System.out.println("1. Imprimir el maximo elemento ");
        System.out.println("2. Imprimir el maximo y minimo elemento ");
        System.out.println("3. Imprimir el elemento mediano");
        System.out.println("4. Imprimir el elemento que ocurre con mayor frecuencia");
        System.out.println("5. Imprimir la suma de los cuadrados de los elementos");
        System.out.println("6. Imprimir el promedio ");
        System.out.println("7. Imprimir el elemento mas cercano a 0");
        System.out.println("8. Imprimir todos los elementos mayor al promedio");
        System.out.println("9. Imprimir los elementos ordenado de menor a mayor ");
        System.out.println("10. Imprimir los elementos ordenados aleatoriamente");
        System.out.println("11. Histograma");
        System.out.println("12. Salir");
    }

}
