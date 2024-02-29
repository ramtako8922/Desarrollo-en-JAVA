
import java.util.Arrays;
import java.util.Scanner;

class Reto1{


    private final Scanner scanner = new Scanner(System.in);


    public String read(){
        return this.scanner.nextLine();
    }


    public void run(){

        System.out.println("");

        String texto = read();



        String[] palabras = texto.split("\\s+");



        int totalPalabras = palabras.length;

        int totalPalabrasUnicas = (int) Arrays.stream(palabras).distinct().count();
        double longitudPromedio = Arrays.stream(palabras).mapToInt(String::length).average().orElse(0);



        System.out.println( totalPalabras);
        System.out.println( totalPalabrasUnicas);
        System.out.printf(" %.2f%n", longitudPromedio);
    }
}