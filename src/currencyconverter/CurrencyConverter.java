/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter;

/**
 *
 * @author charuni
 */import java.util.Scanner;
public class CurrencyConverter {

        public static void main(String[] args) {
            double PoundCurrency;
            double UsCurrency;
            double SriLankanCurrency;
         Scanner input=new Scanner(System.in);
            System.out.println("If you want to covert US dollar to Sri Lankan RS enter the 0");
            System.out.println("If you want to covert Sri Lankan RS to US dollars enter the 1");
            System.out.println("If you want to covert Paund to Sri Lankan RS enter the 2");
            System.out.println("If you want to covert Sri Lankan RS to Paund enter the 3");
            System.out.println("If you want to covert US dollar to Paund RS enter the 4");
            System.out.println("If you want to covert Paund to US dollar RS enter the 5");
             int n=input.nextInt();
             System.out.println("Enter the currency value");
             double i=input.nextDouble();
             if(n==0){
                SriLankanCurrency= i*170.62;
                 System.out.println("SriLankan value is RS"+SriLankanCurrency);
                
             }
             else if(n==1){
                UsCurrency=i/170.62;
                 System.out.println("Us value is US dollar"+ UsCurrency);
             }
             else if(n==2){
                 SriLankanCurrency=i*222.76;
                 System.out.println("SriLankan value is RS"+SriLankanCurrency);
                 
             }
             else if(n==3){
                 PoundCurrency=i/222.76;
                 System.out.println("Pound value is pound"+PoundCurrency);
             }
             else if(n==4){
                 PoundCurrency=i*1.31;
                 System.out.println("pound value is pound"+PoundCurrency);
                 
             }
             else if(n==5){
                UsCurrency=i/1.31;
                 System.out.println("Us value is dollar"+UsCurrency);
             }
        
    }
    
}
