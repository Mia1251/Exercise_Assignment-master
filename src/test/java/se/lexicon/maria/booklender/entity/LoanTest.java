package se.lexicon.maria.booklender.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootTest
public class LoanTest {

    Loan loan;
    Book book;
    LibraryUser libraryUser;

    @BeforeEach
    public void setup() {
        loan = new Loan();
        loan.setLoanTaker(libraryUser);
        loan.setBook(book);
        loan.setLoanDate(LocalDate.of(2021, 3,25));
        loan.setTerminated(true);

        book = new Book();
        book.setTitle("Harry Potter and the Chamber of Secrets");
        book.setAvailable(true);
        book.setReserved(false);
        book.setMaxLoanDays(25);
        book.setFinePerDay(BigDecimal.ZERO);
        book.setDescription("Fantasy");

        libraryUser = new LibraryUser();
        libraryUser.setRegDate(LocalDate.of(2021, 4, 12));
        libraryUser.setName("Maria");
        libraryUser.setEmail("svanteomax@gmail.com");

    }

    @DisplayName("Test 1: create Loan")
    @Test
    public void test_create_loan() {
        Assertions.assertEquals("Maria", libraryUser.getName());
        Assertions.assertEquals("Harry Potter and the Chamber of Secrets", book.getTitle());
        Assertions.assertEquals(true, loan.isTerminated());
        System.out.println("Creating Loan was successful");

    }

    @DisplayName("Test 2: testing Equal")
    @Test
    public void test_equal() {
        Loan loan = new Loan();
        loan.setLoanTaker(libraryUser);
        loan.setBook(book);
        loan.setLoanDate(LocalDate.of(2021, 6, 10));
        Assertions.assertTrue(loan.equals(loan));
        System.out.println("Testing Equal was successful");

    }

    @DisplayName("Test 3: testing HashCode")
    @Test
    public void test_hashCode() {
        Loan loan = new Loan();
        loan.setLoanTaker(libraryUser);
        loan.setBook(book);
        loan.setLoanDate(LocalDate.of(2021, 6, 10));
        Assertions.assertEquals(loan.hashCode(), loan.hashCode());
        System.out.println("Testing HashCode was successful");

    }
}
