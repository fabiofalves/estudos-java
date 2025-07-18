package entities;

public final class OutsourcedEmployee extends Employee {

    private Double additionalCharge;
    
    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(Integer hours, String name, double valuePerHour, Double additionalCharge) {
        super(hours, name, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment (){
        return super.payment() + additionalCharge * 1.1;
    }

}
