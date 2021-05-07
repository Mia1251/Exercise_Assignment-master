package se.lexicon.maria.booklender.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class BookTest {

    Book book;

    @BeforeEach
    public void setup() {
        book = new Book();
        book.setTitle("Harry Potter and the Philosopher's Stone");
        book.setAvailable(true);
        book.setReserved(false);
        book.setMaxLoanDays(25);
        book.setFinePerDay(BigDecimal.ZERO);
        book.setDescription("Fantasy");
    }

    @Test
    @DisplayName("Test 1: creating Book")
    public void create_book() {
        Assertions.assertEquals("Harry Potter and the Philosopher's Stone", book.getTitle());
        System.out.println("Creating Book was successful");

    }

    @Test
    @DisplayName("Test 2: testing Egual")
    public void test_equal() {
        Book book = new Book();
        book.setTitle("Harry Potter and the Philosopher's Stone");
        book.setAvailable(true);
        book.setReserved(false);
        book.setMaxLoanDays(25);
        book.setFinePerDay(BigDecimal.ZERO);
        book.setDescription("Fantasy");
        Assertions.assertTrue(book.equals(book));
        System.out.println("Testing Equal was successful");

    }

    @Test
    @DisplayName("Test 3: testing HashCode")
    public void test_hashCode() {
        Book book = new Book();
        book.setTitle("Harry Potter and the Philosopher's Stone");
        book.setAvailable(true);
        book.setReserved(false);
        book.setMaxLoanDays(25);
        book.setFinePerDay(BigDecimal.ZERO);
        book.setDescription("Fantasy");
        Assertions.assertEquals(book.hashCode(), book.hashCode());
        System.out.println("Testing HashCode was successful");
    }
}
