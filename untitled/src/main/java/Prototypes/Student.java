package Prototypes;

import java.util.Date;

public class Student implements PrototypeDesign{
    String name;
    String birthDate;
    float psp;
    int streaks;

    public Student(String name, String birthDate, float psp, int streaks) {
        this.name = name;
        this.birthDate = birthDate;
        this.psp = psp;
        this.streaks = streaks;
    }

    public Student() {

    }

    @Override
    public Student copy() {
        Student s1 = new Student();
        s1.name = this.name;
        s1.birthDate = this.birthDate;
        s1.psp = this.psp;
        s1.streaks = this.streaks;
        return s1;
    }

    @Override
    public String toString() {
        return "name = "+ name+" birthDate = "+ birthDate +" psp = "+ psp +" streaks "+ streaks;
    }
}
