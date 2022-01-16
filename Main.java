package com.awad.stockers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num; 
		//int n;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of companies you want to store: ");  
		//reading the number of companies you want to store  
		int c = sc.nextInt();  
		//creates an array in the memory 
		double[] array = new double[(int) c];  
		System.out.println("Enter the Shares values: ");  
		for(int i=0; i<c; i++)  
		{  
		//reading the array shares values   
		array[i]=sc.nextDouble(); 
		}
		
		System.out.println("Enter The Share Status ");
		boolean[]shareValue = new boolean[c];
		for (int i=0; i< c; i++) {
		shareValue [i]= sc.nextBoolean();
		//System.out.println(shareValue[i]);
	}
		Scanner in =new Scanner(System.in);
		System.out.println("Enter The operations you want to perform ");
		int option=in.nextInt();
		int count = 0;
		double x;
		int flag = 0;
		int d=0;
		//int a = 0;
		switch(option) {
		case 1:
		Arrays.sort( array);
		System.out.println("Display the companies stock prices in ascending order: ");  
		//prints array using the for loop  
		for (int i = 0; i < array.length; i++)   
		{       
		System.out.println(array[i]);   
		}   
		break;
		case 2:
			//Sort the array in descending order    
	        for (int i = 0; i < array.length; i++) {     
	            for (int j = i+1; j < array.length; j++) {     
	               if(array [i] < array [j]) {    
	                   double temp = array [i];    
	                   array [i] = array [j];    
	                   array [j] = temp;    
	               }     
	            }     
	        }    
	            
	        //Displaying Display the companies stock prices in descending order    
	        System.out.println("Display the companies stock prices in descending order: ");    
	        for (int i = 0; i < array.length; i++) {     
	            System.out.println(array [i]);    
	         }    
	        break; 
	        
		case 3://System.out.println(" Display the total no of companies for which stock prices rose today ");
			

	        for (int i = 0; i < shareValue.length; i++) {
	            if (shareValue[i]) {
	                count++;
	            }
	        }System.out.println("Display the total no of companies for which stock prices rose today is:" +count);

		break;
	
		case 4://System.out.println(" Display the total no of companies for which stock prices declined today ");
			for (int i = 0; i < shareValue.length; i++) {
	            if (shareValue[i]) {
	                count++;
	              d = shareValue.length-count;
	            }
	        }System.out.println("Display the total no of companies for which stock prices declined today is:" +d);


		break;
		case 5:
		
			System.out.print("Enter the share you want to find:");
	       
			 x = sc.nextDouble();
	        for(int i = 0; i < c; i++)
	        {
	            if(array[i] == x)
	            {
	                flag = 1;
	                break;
	            }
	            else
	            {
	                flag = 0;
	            }
	        }
	        if(flag == 1)
	        {
	            System.out.println(x + " Share Found"  );
	        }
	    break;
	    
		case 6: //System.out.println("press 0 to exit ");
			System.exit(0);
		break;
		
		default :System.out.println(" Wrong Option ");
		}
	}
}
	








