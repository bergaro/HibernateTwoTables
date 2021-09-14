package ru.netology.layerdao.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String date;

    @ManyToOne(optional = false)
    private Customer customer;

    @Column(name = "product_name", length = 25)
    private String productName;

    @Column
    private int amount;

    @Override
    public String toString() {
        return "Order{" +
                "date='" + date + '\'' +
                ", productName='" + productName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
