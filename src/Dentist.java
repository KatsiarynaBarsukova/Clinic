public class Dentist extends Doctor {
       public Dentist(String name, String surname) {
           {
               setName(name);
               setSurname(surname);
           }
           @Override
           void treat() {
               System.out.println("treats teeth");
           }
}
