package day03methodobjectcreationscanner;

public class Runner {
    public static void main(String[] args) {
        //How can we create Objects?

        //New keyword is used for creating new objects.
        //Constructor is  a special method that creates Objects.

        //class name + object name + assignment operator + "new" keyword + constructor

        Car myCar = new Car();


        System.out.println("myCar.fee = " + myCar.fee);
        System.out.println("myCar.model = " + myCar.model);
        myCar.action();
        myCar.stop();

        Student myStudent = new Student();

        System.out.println("myStudent.name = " + myStudent.name);
        System.out.println("myStudent.grade = " + myStudent.grade);
        System.out.println("myStudent.adress = " + myStudent.adress);
        myStudent.study();
        myStudent.feed();

        Teacher ourTeacher = new Teacher();
        System.out.println("ourTeacher.age = " + ourTeacher.age);
        System.out.println("ourTeacher.name = " + ourTeacher.name);
        ourTeacher.teach();


    }


}
