public class Therapist extends Doctor {
    public Therapist(String name, String surname) {

        setName(name);
        setSurname(surname);
    }
    @Override
    void treat() {
        System.out.println("heals everything");
    }
}

