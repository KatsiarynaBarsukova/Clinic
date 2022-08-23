public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Valik", 70, 2);
        Patient patient1 = new Patient("German", 17, 1);
        Patient patient2 = new Patient("Vera", 40, 3);
        patient.getPlanTreat();
        patient1.getPlanTreat();
        patient2.getPlanTreat();
                }
}
