public class Surgeon extends Doctor {
    public Surgeon(String name, String surname) {

        setName(name);
        setSurname(surname);
    }
    @Override
    void treat() {
        System.out.println("operates");
    }
}
