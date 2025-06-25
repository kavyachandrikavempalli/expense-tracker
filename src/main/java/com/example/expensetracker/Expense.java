package com.example.expensetracker;
import jakarta.persistence.*;
import java.util.Date;
@Entity
public class Expense {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;
    private String description;
    private double amount;

    @Temporal(TemporalType.DATE)
    private Date date;

    public Long getId() {return id;}
    public void setId(Long id) {this.id=id;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description=description;}

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
}
