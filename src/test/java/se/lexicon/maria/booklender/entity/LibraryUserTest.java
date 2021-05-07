package se.lexicon.maria.booklender.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class LibraryUserTest {

    LibraryUser testObject;

    @BeforeEach
    public void setup() {
        testObject = new LibraryUser();
        testObject.setName("Maria");
        testObject.setEmail("svanteomax@gmail.com");
        testObject.setRegDate(LocalDate.now());

    }

    @Test
    @DisplayName("Test 1: Create LibraryUser")
    public void test_createLibraryUser() {
        Assertions.assertEquals("Maria", testObject.getName());
        Assertions.assertEquals("svanteomax@gmail.com", testObject.getEmail());
        Assertions.assertEquals(LocalDate.now(), testObject.getRegDate());
        System.out.println("New LibraryUser created");
    }

    @Test
    @DisplayName("Test 2: Testing Equal")
    public void test_equal() {
        LibraryUser libraryUser = new LibraryUser();
        libraryUser.setName("Maria");
        libraryUser.setEmail("svanteomax@gmail.com");
        libraryUser.setRegDate(LocalDate.now());
        Assertions.assertEquals(libraryUser, libraryUser);
        System.out.println("Testing equal was successful");

    }

    @Test
    @DisplayName("Test 3: Testing HashCode")
    public void test_hashCode() {
        LibraryUser libraryUser = new LibraryUser();
        libraryUser.setName("Maria");
        libraryUser.setEmail("svanteomax@gmail.com");
        libraryUser.setRegDate(LocalDate.now());
        Assertions.assertEquals(libraryUser.hashCode(), libraryUser.hashCode());
        System.out.println("Testing hashCode was successful");
    }
}
