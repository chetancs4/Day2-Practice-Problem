package com.Day2PracticeProblem;

import java.util.Scanner;

public class Opr_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x,y;
         double dis;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter x point");
             x=sc.nextInt();
             System.out.println("enter y point");
             y=sc.nextInt();
       
         dis=Math.sqrt(x*x+y*y);
         System.out.println("distance"+"("+x+","+y+")= " +dis);
	}

}
