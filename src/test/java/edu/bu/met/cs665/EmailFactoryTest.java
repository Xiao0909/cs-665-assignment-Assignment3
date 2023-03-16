/**
 * Name: Xiao Xiao
 * Course: CS-665 Software Designs & Patterns
 * Date: 3-15-2023
 * File Name: EmailFactoryTest.java
 * Description: This class is responsible for testing the email generator's result is what we created in emailFactory.java.
 */
package edu.bu.met.cs665;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

import org.junit.Test;

import edu.bu.met.cs665.emailGenerator.emailFacotry;
import edu.bu.met.cs665.emailGenerator.customer.VIP;
import edu.bu.met.cs665.emailGenerator.customer.businessCustomer;
import edu.bu.met.cs665.emailGenerator.customer.customer;
import edu.bu.met.cs665.emailGenerator.customer.frequentCustomer;
import edu.bu.met.cs665.emailGenerator.customer.returnCustomer;
import static org.junit.Assert.assertEquals;
/**
*This class represents the Email Factory that generates personalized email messages
*for different customer segments based on a base template.
* The getEmail(Customer customer) method takes in a Customer object and returns the personalized email message
*for the corresponding customer segment by calling the getEmail() method of the Customer object.
*/

public class EmailFactoryTest {
    @Test
    public void testEmailGenerator(){
        // Create instances of each customer type for testing purpose
        customer business = new businessCustomer("Abby", "abgl@gmail.com");
        customer returning = new returnCustomer("Bob", "bbsmith@factory.org");
        customer frequent = new frequentCustomer("Charles", "chals@freqent.com");
        customer newCustomer = new edu.bu.met.cs665.emailGenerator.customer.newCustomer("Dave", "david@summer.com");
        customer VIP = new VIP("Ellen", "ElMoirs@morris.org");
        


        // Test email generator for each customer type
        assertEquals("Dear Abby, Thank you for being our greate customerand let you know that we value your business.", emailFacotry.generateEmail(business));
        assertEquals("Dear Returning Bob, Thank you for being our greate customer again. If there’s anything we can do in the future, please let us know.", emailFacotry.generateEmail(returning));
        assertEquals("Dear customer Charles, I noticed that you’ve been our customer for over three years now! Thank you so much for continually trusting us.", emailFacotry.generateEmail(frequent));
        assertEquals("Welcome new customer Dave, Thank you for choosing us. Looking forward to see you again in the future", emailFacotry.generateEmail(newCustomer));
        assertEquals("Dear VIP Ellen, Thank you for being a great VIP customer. We truly value our loyal customers. Thanks for making us who we are!", emailFacotry.generateEmail(VIP));

    }
}
