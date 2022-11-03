package online;

import java.util.Scanner;

public class FirstCode {
public static void main(String[] args){
System.out.println("Hai there, do u know that........");
Scanner scan = new Scanner(System.in);
System.out.println("JAVA CAN HELP YOU IN YOUR BUSINESS");
System.out.println("Enter your buying price per share:");
double buyingPrice =scan.nextDouble();
 int day = 1;
double closingPrice;
while (true) {
	System.out.println("Enter the closing price per day" + day +"(any negative value to leave:");
	closingPrice = scan.nextDouble();
if(closingPrice < 0.0) break;
double earnings = closingPrice - buyingPrice;
if(earnings>0.0) {
	System.out.println("After day " + day + ", you earned "+ earnings + "per share");	
}
else if(earnings < 0.0) {
	System.out.println("After day " + day + ", you lost "+(-earnings) + "per share");
	}
else{
	System.out.println("After day" + day +", you have" + "no earnings per share.");
}
day +=1;
}
scan.close();
}
}