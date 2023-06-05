package day20statickeywordconstructors;

public class StaticBlocks01 {

    //Bir variable olusturdugunuzda, deger atamazsaniz o varaible i "initialize" etmediniz demektir.
    static double pi;
    static String shape;

    //Bazen main method calistirilmadan once variable larin hazir hale getirilmesi gerekir.
    //Bu yuzden static block lar kullanilir
    //static variable lar static blocklar icinde initialize edilirse o classin icinde
    // her seyden once hazir hale getirilmis olur
    //birden fazla static block olmasi durumunda yukarida olan once calisir

    static {
        pi = 3.14;
        System.out.println("static block 1");
    }

    static {
        shape = "Circle";
        System.out.println("static block 2");
    }

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main method");
    }
}
