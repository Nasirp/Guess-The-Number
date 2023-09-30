package smallproject;

import java.util.Scanner;

public class Array {
	
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		Array obj=new Array();
		obj.print();
		
	}
	public void accending(){
	int n;
	System.out.println("\t\t\t\t\t\t\t\t\t\tenter the size ->");
	n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("\t\t\t\t\t\t\t\t\t\tenter the value ->");
	for(int i=0;i<n;i++) 
	{
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<n;i++) 
	{
		int flag=0;
		for(int j=0;j<n-1-i;j++)
		{
			if(arr[j]>arr[j+1]) 
			{
		
				int temp;
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag= 1;
			}
		}
			 if(flag==0)
			 {
				 break;
	         }   
     }
		
	for(int i=0;i<n;i++) 
	{
	  System.out.println("\t\t\t\t\t\t\t\t\t\taccending order:"+arr[i]);
	}
	}
	public void deccending() {
		
		int n;
		System.out.println("\t\t\t\t\t\t\t\t\t\tenter the size ->");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("\t\t\t\t\t\t\t\t\t\tenter the value ->");
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) 
		{
			int flag=0;
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]<arr[j+1]) 
				{
			
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag= 1;
				}
			}
				 if(flag==0)
				 {
					 break;
		         }   
	     }
			
		for(int i=0;i<n;i++) 
		{
		  System.out.print(arr[i]);
		}
		}
	public void arr() {
		int n;
		
		System.out.print("\t\t\t\t\t\t\t\t\tenter size of the array");
		 n=sc.nextInt();
		System.out.print("\t\t\t\t\t\t\t\t\tenter the value ");
	
		int []arr=new int[n];
	
		for(int i=0;i<n;i++) {
			System.out.print("\t\t\t\t\t\t\t\t");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println("\t\t\t\t\t\t\t\tthe array element is :"+arr[i]);
		}
	}
	
	
	
	public void sum() {
		int a,b,c;
		System.out.print("\t\t\t\t\t\t\t\tenter first number");
		a=sc.nextInt();
		System.out.print("\t\t\t\t\t\t\t\tenter second number ");
		b=sc.nextInt();
		c= a+b;
		System.out.print("\t\t\t\t\t\t\t\t\t\tsum is ="+c);
	}
	public void print() {
		System.out.println("********************************************************WELCOME TO NASIR JAVA DEVLOPER************************************************************************** ");

		while(true) {
		
		int ch;
		System.out.println("\n\t\t\t\t\t\t\t\t1. print array");
		System.out.println("\t\t\t\t\t\t\t\t2. print sum");
		System.out.println("\t\t\t\t\t\t\t\t3. accending order");
		System.out.println("\t\t\t\t\t\t\t\t4. deccending order");
		System.out.println("\n\t\t\t\t\t\t\t\tchoice  any one (1 ,2 , 3, 4)");
		System.out.println("=================================================================================================================================================================================================");
		System.out.print("\t\t\t\t\t\t\t\t enter your choice");
		ch=sc.nextInt();
		
		
		switch(ch) {
		case 1:
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("\t\t\t\t\t\t\t\tyes i know you want two print array ");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			arr();
			break;
		case 2:
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\tyes i know you want to addition");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			sum();
			break;
		case 3:
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\tyes i know you want to print accending order");

			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			accending();
			break;
		case 4:
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\tyes i know you want to printd decending order");

			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			deccending();
			break;
		default:
			System.out.println("\t\t\t\t\t\t\t\t\t\tinvailid chice");
		    break;
		}
	}}

}



