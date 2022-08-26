package com.reverseNumber;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reversed: ");
		int num=sc.nextInt();
		int remainder;
		int revNum=0;
		
		while(num>0)
		{
			remainder = num % 10;
			revNum = revNum*10 + remainder;
			num = num/10;
		}
		System.out.println("The reversed number is "+ revNum);
        sc.close();
	}

}
