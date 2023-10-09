/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test1;

/**
 *
 * @author suhai
 */
public class CameraPriceComparison {

    public static void main(String[] args) {
       //Displays text
        System .out.println("""
                          ----------------------------------------------
                           CAMERA TECHNOLGY REPORT
                          ----------------------------------------------""");
      
       String[] brands ={"CANON", "SONY", "NIKON"};
       String[] types = {"MIRRORLESS", "DSLR"};
       
       //Camera prices being stored in a 2d array
       double[][] prices = {
           {10500.00, 8500.00},
           {9500.00, 7200.00},
           {12000.00, 8000.00}
       };
       int maxWidth =0;
       for (int i = 0; i< brands.length; i++){
           int dWidth = String.format("R %.2f",prices[i][1]).length();
           if (dWidth >maxWidth){
               maxWidth = dWidth;
           }
       }
       
       System.out.printf("%-15s%-15s%-15s%n","","MIRRORLESS", "DSLR");
       //prints the rows of the table
       for (int i = 0; i<brands.length;i++){
           System.out.printf("%-15s", brands[i]);
             System.out.printf("R %-"+(maxWidth + 1)+".2f",prices[i][0]);
               System.out.printf("R%.2f%n", prices[i][1]);
           
       }
        //Displays text
           System .out.println("""
                          ----------------------------------------------
                           CAMERA TECHNOLGY RESULTS
                          ----------------------------------------------""");
          
        // Camera data
        String[] manufacturers = {"CANON", "SONY", "NIKON"};
        int[][] cameraPrices = {
            {10500, 8500}, // CANON
            {9500, 7200},  // SONY
            {12000, 8000}  // NIKON
        };

        // Display the report header
        System.out.printf("%-10s%-15s%-15s%-15s%-15s%n", "Manufacturer", "Mirrorless(R)", "DSLR(R)", "Price Difference", "Stars");

        // Variables for tracking the manufacturer with the greatest difference
        String maxDifferenceManufacturer = "";
        int maxDifference = 0;

        // Iterate through manufacturers and calculate differences
        for (int i = 0; i < manufacturers.length; i++) {
            int mirrorlessPrice = cameraPrices[i][0];
            int dslrPrice = cameraPrices[i][1];

            // Calculate the price difference
            int difference = mirrorlessPrice - dslrPrice;

            // Display the manufacturer and prices
            System.out.printf("%-10s%-15d%-15d%-15d", manufacturers[i], mirrorlessPrice, dslrPrice, difference);

            // Check if the difference is greater than or equal to R2,500
            if (difference >= 2500) {
                System.out.println("***");
            } else {
                System.out.println();
            }

            // Update max difference information
            if (difference > maxDifference) {
                maxDifference = difference;
                maxDifferenceManufacturer = manufacturers[i];
            }
        }

        // Display the manufacturer with the greatest difference
        System.out.println("\nManufacturer with the greatest difference: " + maxDifferenceManufacturer);
            System .out.println("""
                          ----------------------------------------------""");
    }
}
