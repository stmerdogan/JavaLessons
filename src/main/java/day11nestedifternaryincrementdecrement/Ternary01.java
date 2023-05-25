package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

        //Sayi 10 dan kucuk ise konsola kucuk yazdirin degil ise kucuk degil yazdirin

        //.........if else cozumu............

        int num = 12;

        if (num < 10) {
            System.out.println("Kucuk");
        } else {
            System.out.println("Kucuk degil");
        }

        //Ternary cozumu

        // Condition   ?   Condition  true ise calisir : Condition false ise calisacak kisim;
        String sonuc = num < 10 ? "Kucuk" : "Kucuk degil";
        System.out.println(sonuc);

        //2.Sayi cift ise konsola cift yazdirin, tek ise tek yazdirin

        //if else cozumu

        int num2 = 21;

        if (num2 % 2 == 0) {
            System.out.println("Cift");
        } else {
            System.out.println("Tek");
        }

        //ternary cozumu

        String result = num2 % 2 == 0 ? "Cift" : "Tek";
        System.out.println(result);

        //3.Sayi sifirdan buyukse pozitif degilse ekrana pozitif degil yazdirin
        //ternary cozumu

        int num3 = -13;

        String cozum = num3 > 0 ? "Pozitif" : "Negatif";
        System.out.println(cozum);

        System.out.println(num3 > 0 ? "Pozitif" : "Negatif");//kisa yol

        //4.Kullanicidan iki sayin aliniz ve "buyuk olmayan" yani kucuk veya esit olan sayiyi yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Iki sayi giriniz");

        double first = input.nextDouble();
        double second = input.nextDouble();

        //1.yol if else cozumu

        if (first < second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }

        //2.yol ternary
        double result2 = first < second ? first : second;
        System.out.println(result2);


    }
}
