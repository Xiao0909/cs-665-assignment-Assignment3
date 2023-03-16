package edu.bu.met.cs665.emailGenerator.customer;

public class businessCustomer implements customer {
    private String name;
    private String email;

    public businessCustomer(String name, String email){
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
        return "Business";
    }

   
}
