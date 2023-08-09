import java.util.Scanner;

public class KonversiSuhu1 {

/**
 * @param args
 */
public static void main(String[] args) {

    Scanner S = new Scanner(system.in);
     System.out.println("==Program Konversi Suhu==");
     System.out.println("Masukan Celcius: ");
     Double Celcius = S.nextDouble();
     System.out.println("Pilih Opsi");
     System.out.println("1. Fahrenhit");
     System.out.println("2. Reamur");
     System.out.println("3. Kelvin");

     int Opsi = S.nextInt();

     if (Opsi == 1);
     Double F = (Celcius * 9/5)+32;
     System.out.println("Anda Memilih Opsi Celcius Ke Fahrenhit");
     System.out.println("Hasil Celcius Ke Fahrenheit Adalah : "+ F);



     else if (Opsi == 2){
        Double R = (Celcius * 4/5);
        System.out.println("Anda Memilih Opsi Celcius Ke Reamur");
        System.out.println("Hasil Konversi Celcius Ke Reamur Adalah : "+ R);
     }

     
     
        else if (Opsi == 3){
Double K = (Celcius+273);
System.out.println("Anda Memilih Opsi Celcius Ke Kelvin");
System.out.println("Hasil Konversi Celcius Ke Kelvin Adalah : "+ K);



    
}
