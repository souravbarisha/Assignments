package com.assignments;

public class Student {
	int exemption=0;
	//problm statement 1
double calculateFeesStructure (long sid,char sgrade,double mfees,boolean isscheligible,double fees) {
	if(sid!=0&&sgrade=='A'&&isscheligible==true) {
		fees=mfees -mfees *10/100 ;
		exemption=10;
	}
	else if(sid!=0&&sgrade=='B'&&isscheligible==true) {
		fees=mfees -mfees *8/100 ;
		exemption=8;
	}
	else if(sid!=0&&sgrade=='C'&&isscheligible==true) {
		fees=mfees -mfees *6/100 ;
		exemption=6;
	}
	else if(sid!=0&&sgrade=='D'&&isscheligible==true) {
		fees=mfees -mfees *4/100 ;
		exemption=4;
	}
	else
		System.out.println("Not Elligible for Exemption");
	return fees;
}
//Problem statement 2
void compareMarks(Double eng,Long math) {
	Integer e=(int)eng.doubleValue();//primtive to wrapper double type
	Integer m=(int)math.longValue();
	if(e>m)
		System.out.println("English mark is higher than Maths");
	else if(m>e)
		System.out.println("Maths mark is higher than English");
	else  {
		System.out.println("Both are equal");
	}
	
}
//problem statement 3
void validateFees(double fees) {
	byte a=(byte) fees;
	System.out.println("Byte value of fees="+a);
}
public static void main(String[] args) {
	Student obj=new Student();
//	double fees=obj.calculateFeesStructure(234,'C',600, true, 0);
	System.out.println(obj.exemption+"% of fees is exempted, the calculated fees is "+obj.calculateFeesStructure(234,'C',600, true, 0));
	System.out.println(obj.exemption+"% of fees is exempted, the calculated fees is "+obj.calculateFeesStructure(115,'B',909.50, true, 0));
	System.out.println(obj.exemption+"% of fees is exempted, the calculated fees is "+obj.calculateFeesStructure(980,'G',1810, false, 0));
	obj.compareMarks(85d,65l);//autoboxing
	obj.compareMarks(56d,98l);//autoboxing
	obj.validateFees(1023d);
}
}

