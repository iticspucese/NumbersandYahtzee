
package Numbers;

import java.util.Random;

public class Generate {
   //Ejercicio 37
	private double[] arr, ordenated;
    private Random random;
    private int index;
    public Generate(int d) {
        random = new Random();
        index = 0;
        arr= new double[d];
        ordenated= new double[d];
    }

    public void addNumber(){
        double num = random.nextDouble();
        int dec = 10; //Cantidad de decimales
        double dec2 = 10d;//Cantidad de decimales
        num = Math.round(num * dec) / dec2;
        arr[index] = num;
        ordenated[index] = num;
        index++;
    }
    
    public double[] array(double valor, double valor2){
        int cont = 0;
        for(int i = 0; i < ordenated.length; i++){
            if(ordenated[i] >= valor && ordenated[i]< valor2){
                cont++;
            }
        }
        double[] arr = new double[cont];
        int x = 0;
        for(int i = 0; i < ordenated.length; i++){
            if(ordenated[i] > valor && ordenated[i]< valor2){
                arr[x] = ordenated[i];
                x++;
            }
        }
        return arr;
    }
    
    public void getMax(){
        System.out.println("Mayor : "+ ordenated[ordenated.length- 1]);
    }
    public void getMin(){
        System.out.println("Menor : " + ordenated[0]);
        
    }
    public void getMed(){
        System.out.println("Medio : " + ordenated[ordenated.length / 2]);
    }
    public void mayorFrec(){
        int cont= 0;
        int max=0;
        int index = 0;
        int band = 0;
        for(int i = 0; i < ordenated.length; i++){
            try{
                if(ordenated[i] == ordenated[i+1]){
                    cont++;
                }else if(band == 0){
                    max = cont;
                    index = i;
                    cont = 0;
                    band = 1;
                }else if(cont > max){
                    max = cont;
                    index = i;
                    cont = 0;
                }else{
                    cont = 0;
                }
            }catch(Exception e){
                break;
            }
        }
        System.out.println("El numero que mas se repite es el : " + ordenated[index] + ", " + (max + 1) + " veces");
    }
    public void imprimir(){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public void imprimirOrdenado(){
        for(int i = 0; i < ordenated.length; i++){
            System.out.println(ordenated[i]);
        }
    }
    
    
    public void sumarCuadrados(){
        double suma = 0;
        for(int i =0; i < ordenated.length; i++){
            suma+= Math.sqrt(ordenated[i]);
        }
        System.out.println("La suma de los cuadrados es : " + suma);
    }
    
    public void promedio(){
        double suma = 0;
        for(int i =0; i < ordenated.length; i++){
            suma+= (ordenated[i]);
        }
        System.out.println("El promedio es : " + (suma/ordenated.length));
    }
    public void cercanoCero(){
        
        for(int i = 0; i < ordenated.length; i++){
            if(ordenated[i] >0){
                System.out.println("El elemento mas cercano al 0 es : " + ordenated[i]);
                break;
            }
        }
    }
    public void mayorProm(){
        double suma = 0;
        for(int i =0; i < ordenated.length; i++){
            suma+= (ordenated[i]);
        }
        double promedio = suma / ordenated.length;
        for(int i = 0; i < ordenated.length; i++){
            if(ordenated[i]> promedio){
                System.out.println(ordenated[i]);
            }
        }
    }
    
    public void ordenar(){
        double temp;
        for(int i = 0; i <ordenated.length; i++){
            for(int j = 1; j < (ordenated.length - i); j++){
                if(ordenated[j -1] > ordenated[j]){
                   temp = ordenated[j-1];
                   ordenated[j-1]= ordenated[j];
                   ordenated[j] = temp;
                }
            }
        }
    }
    public double[] getArr() {
        return arr;
    }

    public void setArr(double[] arr) {
        this.arr = arr;
    }

    
    
    
}
