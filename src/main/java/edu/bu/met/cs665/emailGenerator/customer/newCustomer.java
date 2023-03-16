package edu.bu.met.cs665.emailGenerator.customer;

public class newCustomer implements customer{
    private String name;
    private String email;

    public newCustomer(String name, String email){
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
        return "New";
    }
}
