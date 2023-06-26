package day33exceptionsenumsiterator;

public class InvalidStudentGradeException extends Exception {
    public InvalidStudentGradeException(String message) {
        super(message);
    }
    /*
    1) Custom Exception class olusturmk icin exception class'a extends etmeliyiz
    Exception class'a extends ederek olusturdugumuz custom exception complile time exception olur
    Eger Runtime exception uretmek istersek RuntimeException class'a extends etmeliyiz.

    2)Custom Exception class olustururuken constructor olusturmaliyiz ve bu constructor parent'taki constructor'i
    cagirmalidir.Bu constructor mesaj verecek veya vermeyecek sekilde olusturulabilir.

    3)Custom Exception class olusturdugunuzda ismin sonunda "Exception" kelimesini kullanmalisiniz
    */
}
