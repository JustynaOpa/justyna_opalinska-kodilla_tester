package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.Product;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMS")
public class Item {
    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;

    public Item(){
    }

    public Item(BigDecimal price, int quantity, BigDecimal value, Product product){
        this.price = price;
        this.quantity = quantity;
        this.value = value;
        this.product = product;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ITEM_ID")
    public int getId(){
        return id;
    }

    @Column(name = "PRICE")
    public BigDecimal getPrice(){
        return price;
    }

    @Column(name = "QUANTITY")
    public int getQuantity(){
        return quantity;
    }

    @Column(name = "VALUE")
    public BigDecimal getValue(){
        return value;
    }

    @ManyToOne
    @JoinColumn(name = "PRODUCT")
    public Product getProduct(){
        return product;
    }

    public void setProduct(Product product){
        this.product = product;
    }

    private void setId(int id){
        this.id = id;
    }

    private void setPrice(BigDecimal price){
        this.price = price;
    }

    private void setQuantity(int quantity){
        this.quantity = quantity;
    }

    private void setValue(BigDecimal value){
        this.value = value;
    }


}
