package com.assignments;
/*Develop a program which prints the prime numbers between 1 and 150
The output should be printed in this format
1,3,5……goes on till it prints the last prime number.
Prime number definition: A prime number (or a prime) is a natural number greater than 1 that has no
positive divisors other than 1 and itself. For example 5 is prime, as only 1 and 5 divide it. */
public class PrimeNumbers {
public static void main(String [] args) {
	int temp =0;
	for(int i=1; i<=150; i++) {
		for(int j=2; j<=i-1;j++) {
			if(i%j==0) {
				temp = temp+1;
			}
		}
			if(temp==0) {
				System.out.print(i+",");
			}
			else {
				temp=0;
			}
		
	}
	
}
}
