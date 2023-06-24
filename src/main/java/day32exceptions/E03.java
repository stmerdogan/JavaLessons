package day32exceptions;

public class E03 {

    /*
    throw keyword bir methodun body'si icinde istedigimiz yerde istedigimiz kosullar icin istedigimiz kadar
    exception atmamizi saglar.
    throw keyword yazildiktan sonra bir exception class objesi olusturulur
    Exception class constructor parantezinin icine istediginiz Exception mesajini yazabilirsiniz
    */
    public static void main(String[] args) {

        try {
            printAge(-63);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void printAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else {
            System.out.println(age);
        }
    }
}


