package day20statickeywordconstructors;

public class TeacherRunner {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Alican",40, "Istanbul");
        Teacher t2 = new Teacher("Velihan", 41);

        System.out.println(t1);
        System.out.println(t2);
    }
}
