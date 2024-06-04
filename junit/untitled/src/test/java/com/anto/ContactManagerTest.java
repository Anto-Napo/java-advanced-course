package com.anto;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) //? Remove the necessity of putting static before 'All' annotations
class ContactManagerTest {
    ContactManager contactManager;

    @BeforeAll
    public void setupAll() {
        System.out.println("Tests setup");
    }

    @BeforeEach
    public void setup() {
        contactManager = new ContactManager();
    }

    @Test
    public void shouldCreateContact() {
        // ContactManager contactManager = new ContactManager();
        contactManager.addContact("John", "Doe", "0123456789");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty()); //? If the list is empty, so the contact wasn't added, the test will fail.
        Assertions.assertEquals(1, contactManager.getAllContacts().size()); //? If the list size isn't 1, so the contact wasn't added, the test will fail.
        Assertions.assertTrue(contactManager.getAllContacts().stream() //? Check if everything is in place
                .anyMatch(contact -> contact.getFirstName().equals("John") &&
                        contact.getLastName().equals("Doe") &&
                        contact.getPhoneNumber().equals("0123456789")));
    }

    @Test
    @DisplayName("Should Not Create Contact When First Name Is Null") //? Check if the program does return an error when one of the parameters is null
    @EnabledOnOs(value = OS.WINDOWS, disabledReason = "Enabled on windows")
    public void shouldThrowRuntimeExceptionWhenFirstNameIsNullOnWindows() {
        // ContactManager contactManager = new ContactManager();
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact(null, "Doe", "0123456789");
        });
    }

    @Test
    @DisplayName("Should Not Create Contact When First Name Is Null") //? Check if the program does return an error when one of the parameters is null
    @DisabledOnOs(value = OS.MAC, disabledReason = "Disabled on MAC")
    public void shouldThrowRuntimeExceptionWhenFirstNameIsNullOnMac() {
        // ContactManager contactManager = new ContactManager();
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact(null, "Doe", "0123456789");
        });
    }

    @Test
    @DisplayName("Should Not Create Contact When Last Name Is Null")
    public void shouldThrowRuntimeExceptionWhenLastNameIsNull() {
        // ContactManager contactManager = new ContactManager();
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact("John", null, "0123456789");
        });
    }

    @Test
    @DisplayName("Should Not Create Contact When Phone Number Is Null")
    public void shouldThrowRuntimeExceptionWhenPhoneNumberIsNull() {
        // ContactManager contactManager = new ContactManager();
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact("John", "Doe", null);
        });
    }

    @Test
    @DisplayName("Test Contact Creation on Dev Machine") //? Assumptions will not make the test fail
    public void shouldTestContactCreationOnDEV() { //? Make sure to create a test configuration with this "-ea -DENV=DEV"
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
        contactManager.addContact("John", "Doe", "0123456789");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, contactManager.getAllContacts().size());
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Test finished");
    }

    @AfterAll
    public void end() {
        System.out.println("Tests ended");
    }
}

@Nested
class PhoneNestedTest {
    ContactManager contactManager;

    @BeforeEach
    public void setup() {
        contactManager = new ContactManager();
    }

    @DisplayName("Repeat creation test 5 times")
    @RepeatedTest(value = 5, name = "Repeating Creation Test {currentRepetition} of {totalRepetitions}")
    public void shouldTestContactCreationRepeatedly() {
        contactManager.addContact("John", "Doe", "0123456789");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, contactManager.getAllContacts().size());
    }

    @DisplayName("Value source")
    @ParameterizedTest
    @ValueSource(strings = {"0123456789", "0787654567", "0749264543"})
    public void shouldTestContactCreationUsingValueSource(String phoneNumbers) {
        contactManager.addContact("John", "Doe", phoneNumbers);
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, contactManager.getAllContacts().size());
    }

    @DisplayName("Method Source Case")
    @ParameterizedTest
    @MethodSource("phoneNumberList")
    public void shouldTestContactCreationUsingMethodSource(String phoneNumbers) {
        contactManager.addContact("John", "Doe", phoneNumbers);
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, contactManager.getAllContacts().size());
    }

    @DisplayName("CSV Source Case")
    @ParameterizedTest
    @CsvSource({"0123456789", "0837515678", "0987654321"}) //? @CSVFileSource(resources = /data.csv) with a file
    public void shouldTestContactCreationUsingCSVSource(String phoneNumbers) {
        contactManager.addContact("John", "Doe", phoneNumbers);
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, contactManager.getAllContacts().size());
    }

    private static List<String> phoneNumberList() {
        return Arrays.asList("0123456789", "0837515678", "0987654321");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Test finished");
    }
}

//? Add @Disabled to disable a test