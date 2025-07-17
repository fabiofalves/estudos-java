package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public void processContract (Contract contract, Integer month){

        LocalDate dueDate;
        Double amount = contract.getTotalValue() / month;
        Integer[] numberInstallment = new Integer[month];

        for(int i = 0; i < numberInstallment.length; i++){
            numberInstallment[i] = i+1;

            Double taxMonth = onlinePaymentService.interest(amount, numberInstallment[i]);
            amount += taxMonth;
            Double paymentFee = amount + onlinePaymentService.paymentFee(amount);

            dueDate = contract.getDate().plusMonths(numberInstallment[i]);

            contract.addInstallment(new Installment(dueDate, paymentFee));
        }

    }

    public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }

    public OnlinePaymentService getOnlinePaymentService() {
        return onlinePaymentService;
    }

}
