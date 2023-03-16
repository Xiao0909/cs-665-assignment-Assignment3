/**
 * Name: Xiao Xiao
 * Course: CS-665 Software Designs & Patterns
 * Date: 3-15-2023
 * File Name: frequentCustomer.java
 * Description: This class represents a frequent customer and implements the customer interface.
 */
package edu.bu.met.cs665.emailGenerator.customer;

public class frequentCustomer implements customer {
    private String name;
    private String email;

    public frequentCustomer(String name, String email){
        this.email = email;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getSegment(){
        return "Frequent";
    }
}
