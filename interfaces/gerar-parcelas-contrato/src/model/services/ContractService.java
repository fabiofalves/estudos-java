package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract (Contract contract, Integer month){

        LocalDate dueDate;
        Integer[] numberInstallment = new Integer[month];

        for(int i = 0; i < numberInstallment.length; i++){
            numberInstallment[i] = i+1;
            Double amount = contract.getTotalValue() / month;
            Double taxMonth = onlinePaymentService.interest(amount, numberInstallment[i]);
            amount += taxMonth;
            Double paymentFee = amount + onlinePaymentService.paymentFee(amount);
            dueDate = contract.getDate().plusMonths(numberInstallment[i]);

            contract.addInstallment(new Installment(dueDate, paymentFee));
        }

    }
}
