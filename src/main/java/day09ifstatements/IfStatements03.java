package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {

    public static void main(String[] args) {

        //1.Verilen character buyuk harf ise "Buyuk harf", kucuk harf ise "Kucuk harf" yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz.");
        char ch = input.next().charAt(0);

        //1.Yol
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk harf..");
        }

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Kucuk harf..");
        }

        //2.Yol
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk harf..");

        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Kucuk harf..");

        } else {
            System.out.println("Harf degil...");
            input.close();
        }
    }
}
