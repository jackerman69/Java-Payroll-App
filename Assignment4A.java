/*
 *Josh Ackerman
 * CS121-100
 * Assignment 4A
 * 03/04/2019
 */
package assignment4a;
import java.util.Scanner;

public class Assignment4A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// new scanner variable sc
        
        int answer, salary, hoursWorked, itemsSold;//declare int variables
        double hourlyRate, weeklyPay, profitBonus, costPerItem;//declare double variables
        final int BASEPAY = 200;// declare constant variable
        
        do{
            System.out.println("Please enter your type of pay. 1 for salary, 2 for hourly, 3 for commision, 4 to quit.");//prompt user to enter what type of pay
            answer = sc.nextInt();//input user answer into variable answer
            
            switch(answer){
                case 1://case if user entered 1
                System.out.println("Please enter employee first name: ");
                String firstName = sc.next();// stores employee first name
                
                System.out.println("Please enter employee last name: ");
                String lastName = sc.next();// stores employee last name
                
                System.out.println("Please enter yearly salary: ");
                salary = sc.nextInt();// stores salary
                
                
                
                System.out.println("Please enter any profit bonus as a decimal: ");
                profitBonus = sc.nextDouble();//stores profit bonus
                
                weeklyPay = ((salary / 2080) * 40) + (salary * profitBonus) / 52;//equation for weekly pay
                
                System.out.printf("Employee name is: %s %s%n", firstName, lastName);//prints first and last name
                System.out.printf("Weekly pay with profit bonus is: %.2f%n", weeklyPay);//prints weekly pay
                break;
            
               case 2://case if 2 is entered
                System.out.println("Enter employee first name: ");
                String firstName1 = sc.next();//stores first name
                
                System.out.println("Enter employee last name: ");
                String lastName1 = sc.next();//stores last name
                
                System.out.println("Enter employee pay rate per hour: ");
                hourlyRate = sc.nextDouble();//stores rate per hour
                
                System.out.println("Enter hours worked for the week: ");
                hoursWorked = sc.nextInt();//stores hours worked for the week
                
                if(hoursWorked > 40){
                hourlyRate = hourlyRate * 1.5;}//calculates overtime
                
                System.out.printf("Employee name is: %s %s%n", firstName1, lastName1);//prints employee name
                System.out.printf("Weekly pay is: %.2f%n", hourlyRate * hoursWorked);//prints weekly pay
               
                break;
                
               case 3://case if user enters 3
                   System.out.println("Enter employee first name: ");
                   String firstName2 = sc.next();//stores first name
                   
                   System.out.println("Enter employee last name: ");
                   String lastName2 = sc.next();//stores last name
                   
                   System.out.println("Enter number of items sold this week: ");
                   itemsSold = sc.nextInt();//stores number of items sold
                   
                   System.out.println("Enter the price per item: ");
                   costPerItem = sc.nextDouble();//stores price per item
                   
                   double commission = itemsSold * costPerItem * .10;//calculates commission
                   
                   System.out.printf("Employee name is: %s %s%n", firstName2, lastName2);//prints employee name
                   System.out.printf("Weekly pay with commission is: %.2f%n", (double)BASEPAY + commission);//prints weekly pay with commission
                   
                   break;
                }
        }while(answer > 0 && answer <= 3);//exits if answer is not 1-3
        
    }
    
}
