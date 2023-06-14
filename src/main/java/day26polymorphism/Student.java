package day26polymorphism;

public class Student {

    //Encapsulation==>Kapsulleme

    /*
    Encapsulation nedir?Data hiding (veri saklama)
    Data nasil saklanir?
    Access modifier'larini private yaparak datayi diger class'lardan gorunmez hale getiririm.
    Boylece data'yi saklarim.
    Encapsulation yaptigimiz data'yi istersek diger class'lardan okuyabiliriz.
    Nasil okuruz?
    getmethod olusturarak encpsulate edilmis data'nin degerini okuyabiliriz
    1)get method'lar public olur.
    2)get methodun return type'i okudugu variable'in return type'i ile ayni olur
    3)get method bir boolean variable icin olusturulduysa ismi "is" ile baslar
    ornek ==> isSuccessful()
    */

    private String stdId = "AC20230614";
    public String stdName = "Ali Can";

    public int age = 13;
    private double notOrt = 3.13;
    private boolean successful = false;

    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccessful() {
        return successful;
    }
}



