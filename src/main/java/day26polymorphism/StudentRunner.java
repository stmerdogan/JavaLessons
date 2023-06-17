package day26polymorphism;

public class StudentRunner {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getStdId());//AC20230614
        System.out.println(s1.getNotOrt());//3.13
        System.out.println(s1.isSuccessful());//false

        System.out.println("====================================");

        s1.setStdId("MU1234567");
        s1.setNotOrt(4.99);
        s1.setSuccessful(false);

        System.out.println(s1.getStdId());//MU1234567
        System.out.println(s1.getNotOrt());//4.99
        System.out.println(s1.isSuccessful());//false

        System.out.println("====================================");

        s1.setStdId("VH1234567");
        s1.setNotOrt(1.25);
        s1.setSuccessful(false);

        System.out.println(s1.getStdId());//VH1234567
        System.out.println(s1.getNotOrt());//1.25
        System.out.println(s1.isSuccessful());//false
    }
}
