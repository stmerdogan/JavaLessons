package day32exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class E04 {

    /*
    1)Run butonuna bastiktan sonra konsolda alinan Exception'lara "Runtime Exception" denir
     ArithmeticException ,NullPointerException,NumberFormatException,ArrayIndexOutOfBoundsException,
     StringIndexOutOfBoundsException....RunTime Exception'lara ornektir.
     RunTime Exception'lara Unchecked Exception da denir.

    2)Code yazarken kirmizi altcizgi seklinde alinan Exception'lar da vardir bunlara da "Compile Time Exception" denir
      FileNotFoundException, IOException, "Compile Time Exception"'lara ornektir.
      Compile Time Exception'lara "Checked Exception "denir

     throw ile throws keyword'leri arasindaki fark nedir?
     1)throw method body'si icinde throws ise method parantezinden hemen sonra kullanilir
     2)throw method body'si icinde istenilen yerde istenildigi kadaar kullanilir.
        throws ise method parantezinden hemen sonra sadece bir kere kullanilir
     3) throw'dan sonra new keyword ve constructor kullanilarak obje olusturulur
        throw'dan sonra sadece Exception class ismi yazilir
     4)throw belli sartlar icin Exception firlatmada kullanilir.
        throws ise bir methodun belli bir Exception'i firlatabilecegini belirtmek icin kullanilir
     */

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/main/java/day32exceptions/file.txt");

        int k = 0;

        while ((k = fis.read()) != -1) {

            System.out.print((char) k);
        }
    }
}
