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

    @Test
    @DisplayName("Test method-printAllNames()")
    public void printAllNamesTest_prints_all_names_in_alphabetical_order() {
        phoneBook.add("a", "1324234553523");
        phoneBook.add("c", "1342345235225");
        phoneBook.add("d", "122354235232");
        phoneBook.add("b", "1223523523451");

        assertEquals("[a, b, c, d]", phoneBook.printAllNames(),"method should return names in alphabetical order");
    }

    @Test
    @DisplayName("findByNumber()")
    public void findByNumberTest_finds_name_by_number() {
        String expected = "Victor";
        phoneBook.add("Anton", "1231");
        phoneBook.add("Victor", "4321");
        phoneBook.add("Max", "21");

        assertEquals(expected,phoneBook.findByNumber("4321"),"method should finds name by number");
    }

}