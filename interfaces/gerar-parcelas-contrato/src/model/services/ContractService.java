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

        Double amount = contract.getTotalValue() / month;

        for(int i = 1; i <= month; i++){

            LocalDate dueDate = contract.getDate().plusMonths(i);
            Double taxMonth = onlinePaymentService.interest(amount, i);
            Double paymentFee = onlinePaymentService.paymentFee(amount + taxMonth);
            Double quota = amount + taxMonth + paymentFee;

            contract.getInstallmentList().add(new Installment(dueDate, quota));
        }
    }
}
