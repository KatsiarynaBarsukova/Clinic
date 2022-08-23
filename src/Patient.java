public class Patient {
    private String name;
    private int age;
    private Doctor doctor;
    private int planTreat;

    public Patient(String name, int age, int planTreat) {
        this.name = name;
        this.age = age;
        this.planTreat = planTreat;
    }
    public int getPlanTreat() {
        if (planTreat == 1) {
            doctor = new Surgeon("Dan", "Balan");
            doctor.treat();
        } else if (planTreat == 2) {
            doctor = new Dentist("Valera", "Kurakin");
            doctor.treat();
        } else {
            doctor = new Therapist("Slava", "Piragova");
            doctor.treat();
        }
    }
}
