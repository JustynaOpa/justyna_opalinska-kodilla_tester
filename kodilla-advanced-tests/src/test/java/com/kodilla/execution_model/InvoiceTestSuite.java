package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item water = new Item("water", 1.80);
    Item bread = new Item("bread", 3.55);
    Item butter = new Item("butter",4.89);

    @Test
    public void shouldAddNewItems() {
        //When
        int size = invoice.getSize();
        //Then
        assertEquals(3, size);
    }
    @Test
    public void shouldGetItem(){
        //When
        Item result = invoice.getItem(1);
        //Then
        assertEquals("bread", result.getName());
        assertEquals(3.55, result.getPrice());
    }
    @Test
    public void shouldReturnNullWhenValueIsNegative(){
        //When
        Item result = invoice.getItem(-3);
        //Then
        assertEquals(null, result);

    }
    @Test
    public void shouldReturnNullIfIndexIsOutOfTheRange(){
        //When
        Item result = invoice.getItem(12);
        //Then
        assertEquals(null, result);
    }

    @Test
    public void shouldReturnNullIfListIsClear(){
        //When
        invoice.clear();
        //Then
        assertEquals(0,invoice.getSize());
    }
    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(water);
        invoice.addItem(bread);
        invoice.addItem(butter);
    }
    @AfterEach
    public void resetValues(){
        System.out.println("Resetting values....");
    }
    @BeforeAll
    public static void displayIntoMessage(){
        System.out.println("Starting testing...");
    }
    @AfterAll
    public static void displayGoodbyeMessage(){
        System.out.println("Finishing testing...");
    }

}
