package test1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public interface EstateAgent{
    String getAgentName();
    double getPropertyPrice();
    double getAgentCommission();
}


abstract class AbstractEstateAgent implements EstateAgent {
    //declares variable
    private String agentName;
    private double propertyPrice;

    public AbstractEstateAgent(String agentName, double propertyPrice) {
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
    }

    @Override
    public String getAgentName() {
        return agentName;
    }

    @Override
    public double getPropertyPrice() {
        return propertyPrice;
    }

    @Override
    public double getAgentCommission() {
        return 0.20 * propertyPrice; // 20% commission
    }
}

class EstateAgentSales extends AbstractEstateAgent {

    public EstateAgentSales(String agentName, double propertySaleAmount) {
        super(agentName, propertySaleAmount);
    }

    public void printPropertyReport() {
        System.out.println("Estate Agent: " + getAgentName());
        System.out.println("Property Sale Price: R " + getPropertyPrice());
        System.out.println("Agent Commission: R " + getAgentCommission());
    }

    public static void main(String[] args) {
      
      String maxDifferenceManufacturer = null;
         System.out.println("\nEnter the current estate agent name: " + "Joe Blogg");
         //Displays the question in the quotation marks
          System.out.println("Enter property price:" + "1200000");
          //Displays the question in the quotation marks
            System .out.println("""
                          \nESTATE AGENT REPORT
                          *****************************""");
        // Test the application with sample values
        EstateAgentSales agentSales = new EstateAgentSales("John Doe", 1500000.0);
        agentSales.printPropertyReport();
    }
}