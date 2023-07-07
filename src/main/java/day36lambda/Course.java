package day36lambda;

public class Course {

    /*
    Icinde
    1)private variable'lar
    2)parametreli ve parametresiz constructurlar
    3)getter'lar
    4)setter'lar
    5)toString'ler
    barindiran class'lara "POJO" class denir====>Plain Old Java Object
     */
    private String season;
    private String coursName;
    private int avarageScore;
    private int numberOfStudent;

    public Course() {
    }

    public Course(String season, String coursName, int avarageScore, int numberOfStudent) {
        this.season = season;
        this.coursName = coursName;
        this.avarageScore = avarageScore;
        this.numberOfStudent = numberOfStudent;
    }

    public String getSeason() {
        return season;
    }

    public String getCoursName() {
        return coursName;
    }

    public int getAvarageScore() {
        return avarageScore;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setCoursName(String coursName) {
        this.coursName = coursName;
    }

    public void setAvarageScore(int avarageScore) {
        this.avarageScore = avarageScore;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", coursName='" + coursName + '\'' +
                ", avarageScore=" + avarageScore +
                ", numberOfStudent=" + numberOfStudent +
                '}';
    }
}
