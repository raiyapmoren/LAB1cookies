/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raisa
 */import java.util.Scanner;
 
public class Cookies {
    public static void main( String [ ] args ){
    
        Scanner scanner = new Scanner(System.in);
        
        
        //variables
        
       double numberOfServings;
       double numberOfCookies;
       double numberOfCalories;
               
        //Amount of cookies
        System.out.println( "Enter the amount of cookies");
      numberOfCookies = scanner.nextDouble();
        
        
        numberOfServings = ( numberOfCookies / 40 ) * 10;
        numberOfCalories = ( numberOfServings / 1) * 300;
        
        System.out.println ( numberOfCookies + " cookies is equal to " + numberOfCalories +" calories (" + numberOfServings + " servings )" );
        
        
        
        
        
        
    }
    
}
