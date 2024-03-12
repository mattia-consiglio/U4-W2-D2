import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, String> phonebook = new HashMap<>();

    public void add(String name, String number) {
        phonebook.put(name, number);
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "phonebook=" + phonebook +
                '}';
    }

    public String getByName(String name) {
        return phonebook.get(name);
    }

    public String getByNumber(String number) {
        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
