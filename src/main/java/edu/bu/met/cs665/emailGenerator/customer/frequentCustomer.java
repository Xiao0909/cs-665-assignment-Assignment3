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
