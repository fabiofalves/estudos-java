package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    private LocalDate dueDate;
    private Double amount;

    public Installment(){
    }

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public String getDueDate() {
        return dueDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return getDueDate() + " - " + String.format("%.2f", getAmount());
    }
}
