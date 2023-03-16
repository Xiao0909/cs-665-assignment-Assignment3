/**
 * Name: Xiao Xiao
 * Course: CS-665 Software Designs & Patterns
 * Date: 3-15-2023
 * File Name: Main.java
 * Description: This class is responsible for the methods and attributes of all the classes that were created for this email generator.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.emailGenerator.emailFacotry;
import edu.bu.met.cs665.emailGenerator.customer.VIP;
import edu.bu.met.cs665.emailGenerator.customer.businessCustomer;
import edu.bu.met.cs665.emailGenerator.customer.customer;
import edu.bu.met.cs665.emailGenerator.customer.frequentCustomer;
import edu.bu.met.cs665.emailGenerator.customer.newCustomer;
import edu.bu.met.cs665.emailGenerator.customer.returnCustomer;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {
    customer businessCustomer = new businessCustomer("Abby", "abgl@gmail.com");
    customer returningCustomer = new returnCustomer("Bob", "bbsmith@factory.org");
    customer freqCustomer = new frequentCustomer("Charles", "chals@freqent.com");
    customer newCustomer = new newCustomer("Dave", "david@summer.com");
    customer vipCustomer = new VIP("Ellen", "ElMoirs@morris.org");

    String businessEmail = emailFacotry.generateEmail(businessCustomer);
    String returnEmail = emailFacotry.generateEmail(returningCustomer);
    String frequentEmail = emailFacotry.generateEmail(freqCustomer);
    String newEmail = emailFacotry.generateEmail(newCustomer);
    String vipEmail = emailFacotry.generateEmail(vipCustomer);

    System.out.println(businessEmail);
    System.out.println(returnEmail);
    System.out.println(frequentEmail);
    System.out.println(newEmail);
    System.out.println(vipEmail);
  }

}
