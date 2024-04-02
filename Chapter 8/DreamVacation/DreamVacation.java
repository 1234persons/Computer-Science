package DreamVacation;

import java.text.NumberFormat;

public class DreamVacation {
    
    private String destination;
    private double cost;
    private static NumberFormat money = NumberFormat.getCurrencyInstance();

    public DreamVacation() {
        destination = "Norwich, Connecticut";
        cost = 1.0;
    }

    public DreamVacation(String destination, double cost) {
        this.destination = destination;
        this.cost = cost;
    }

    public String getDestination() {
        return (destination);
    }

    public void setDestination(String destination) {
        destination = this.destination;
    }

    public String getCost() {
        return (money.format(cost));
    }

    public void setCost(double cost) {
        cost = this.cost;
    }
    
    

}
