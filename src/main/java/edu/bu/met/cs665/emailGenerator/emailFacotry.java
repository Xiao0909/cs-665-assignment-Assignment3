/**
 * Name: Xiao Xiao
 * Course: CS-665 Software Designs & Patterns
 * Date: 3-15-2023
 * File Name: emailFactory.java
 * Description: This class represents a a emailFactory that generates personlized email message
 */
package edu.bu.met.cs665.emailGenerator;

import edu.bu.met.cs665.emailGenerator.customer.customer;

public class emailFacotry {
    public static String generateEmail(customer customer){
        String segment = customer.getSegment();
        String name = customer.getName();
        String email = customer.getEmail();

        String greeting = "";
        String body = "";
        String signature = "";

        /**
         * create 3 strings greeting, body and signature
         * under each customer type, generate customized context
         */

        switch(segment){
            // Business case: generate business customer email
            case "Business":
                greeting = "Dear" + name + ",";
                body = "Thank you for being our greate customerand let you know that we value your business.";
                signature = "Best Regards" + 
                             "\nBoston University CS665";
                break;
            
            //  VIP: generate VIP customer email
            case "VIP":
            greeting = "Dear VIP Customer" + name + ",";
            body = "Thank you for being a great VIP customer. We truly value our loyal customers. Thanks for making us who we are!" ;
            signature = "Best Regards" + 
                        "\nBoston University CS665";
            break;

            // Returning: generate Returning customer email
            case "Returning":
            greeting = "Dear Returning Customer" + name + ",";
            body = "Thank you for being our greate customer again. If there’s anything we can do in the future, please let us know." ;
            signature = "Best Regards" + 
                        "\nBoston University CS665";
            break;

            // New case: generate New Customer email
            case "New":
            greeting = "Welcome New Customer" + name + ",";
            body = "Thank you for choosing us. Looking forward to see you again in the future" ;
            signature = "Best Regards" + 
                        "\nBoston University CS665";
            break;

            //Frequent Case: generate frequent customer email
            case "Frequent":
            greeting = "Dear Customer" + name + ",";
            body = "I noticed that you’ve been our customer for over three years now! Thank you so much for continually trusting us." ;
            signature = "Best Regards" +
                        "\nBoston University CS665";
            break;

            //null or default
            default:
                throw new IllegalArgumentException("Invalid customer segment.");

        }
        return greeting + "\n\n" + body + "\n\n" + signature;
    }
}
