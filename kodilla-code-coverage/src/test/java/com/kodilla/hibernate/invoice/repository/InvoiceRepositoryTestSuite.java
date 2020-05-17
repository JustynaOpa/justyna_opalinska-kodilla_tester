package com.kodilla.hibernate.invoice.repository;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceRepositoryTestSuite {
    @Autowired
    private InvoiceRepository invoiceRepository;

    @Test
    public void testInvoiceRepositorySave(){
        //given
        Product tv = new Product("Samsung QLED");
        Product bike = new Product("Kross");
        Product movie = new Product("Wonder Woman");

        BigDecimal price1 = new BigDecimal("3689.99");
        BigDecimal value1 = new BigDecimal("3500.00");
        BigDecimal price2 = new BigDecimal("2650.25");
        BigDecimal value2 = new BigDecimal("2550.00");
        BigDecimal price3 = new BigDecimal("45.99");
        BigDecimal value3 = new BigDecimal("38.00");

        Item item = new Item(price1, 1, value1,tv);
        Item item2 = new Item(price2, 1, value2, bike);
        Item item3 = new Item(price3, 1, value3, movie);

        Invoice invoice = new Invoice("FV10254");

        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //when
        invoiceRepository.save(invoice);
        int id = invoice.getId();

        //then
        Assert.assertNotEquals(0, id);

        //cleanUp
        try{
            invoiceRepository.deleteById(id);
        } catch (Exception e){
            //
        }
    }
}
