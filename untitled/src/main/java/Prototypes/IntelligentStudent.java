package Prototypes;

public class IntelligentStudent extends Student implements PrototypeDesign{
    float iq;

    public IntelligentStudent(String name, String birthDate, float psp, int streaks, float iq) {
        super(name, birthDate, psp, streaks);
        this.iq = iq;
    }

    public IntelligentStudent() {
    }

    @Override
    public IntelligentStudent copy(){
        IntelligentStudent is = new IntelligentStudent();
        is.iq = this.iq;
        is.name = this.name;
        is.streaks = this.streaks;
        is.birthDate = this.birthDate;
        is.psp = this.psp;
        return is;
    }

    @Override
    public String toString() {
        return "name = "+ name+" birthDate = "+ birthDate +" psp = "+ psp +" streaks "+ streaks + " iq = "+iq;
    }
}
