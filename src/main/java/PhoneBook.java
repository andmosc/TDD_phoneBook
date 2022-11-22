import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {

    private final TreeMap<String,String> phoneBook = new TreeMap<>();

    public int add(String name, String number) {
        phoneBook.put(name,number);
        return phoneBook.size();
    }
    public String printAllNames() {
        return phoneBook.keySet().toString();
    }

    public String findByNumber(String number) {
        Set<String> nameKey = phoneBook.keySet();
        for (String name : nameKey) {
            if (phoneBook.get(name).equals(number)){
                return name;
            }
        }
        return null;
    }
}
