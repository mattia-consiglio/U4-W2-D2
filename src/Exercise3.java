import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise3 {
    public static Logger logger = LoggerFactory.getLogger(Exercise1.class.getName());

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Mattia", "333-333-3333");
        phonebook.add("Paolo", "444-444-4444");
        phonebook.add("Luca", "555-555-5555");
        logger.info("Phonebook: " + phonebook);
        phonebook.remove("Paolo");
        logger.info("Phonebook: " + phonebook);

        String number = phonebook.getByName("Mattia");
        logger.info("Number: " + number);

        String name = phonebook.getByNumber("555-555-5555");
        logger.info("Name: " + name);
    }
}
