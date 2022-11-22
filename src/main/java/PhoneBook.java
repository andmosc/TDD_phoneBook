import java.util.TreeMap;

public class PhoneBook {

    private static final TreeMap<String,String> phoneBook = new TreeMap<>();

    public int add(String name, String number) {
        phoneBook.put(name,number);
        return phoneBook.size();
    }

}
