import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneBookTest {

    private PhoneBook phoneBook;

    @BeforeEach
    void setUp() {
        phoneBook = new PhoneBook();
    }


    @Test
    @DisplayName("Test method-add()")
    public void addTest_should_Return_Count_Contact_NotRepeating() {
        int expected = 3;
        phoneBook.add("Anton", "1265465463");
        phoneBook.add("Victor", "126546544");
        phoneBook.add("Victor", "1245455");

        assertEquals(expected, phoneBook.add("Max", "1245454566"),"method should return the number of contacts after adding(Not Repeating)");
    }
}