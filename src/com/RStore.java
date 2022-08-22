package com;

import java.util.ArrayList;
import java.util.Scanner;

public class RStore {

	String  promoCode1="FC001";
	String  promoCode2="FC002";
	String  promoCode3="FC003";

	Scanner scan=new Scanner(System.in);

	String productsName[]= {"BluePen","BlackPen","GreenPen","RedPen"};

	int cost[]= {20,10,40,30};
	ArrayList<Integer> al=new ArrayList<Integer>();
	ArrayList<Integer> list=new ArrayList<Integer>();
	ArrayList<Integer> list1=new ArrayList<Integer>();

	public void display(){
		dummy();


		int n=0;
		int max=0;
		for (int i = 0; i < productsName.length; i++) {
			n++;

			System.out.println("Product No->"+n+"). Name : "+productsName[i]+" -> cost : "+cost[max]);
			max++;

		}

		System.out.println();
		System.out.println("Enetr the Number of products you want.");
		int noP=scan.nextInt();


		System.out.println("Enter the Products Number To Buy.");
		int n1=1;
		for (int i = 1; i <=noP; i++) {
			System.out.println(n1+") Enter Product Number");
			n1++;
			int in=scan.nextInt();
			if (in>=1 && in<=4) {
				al.add(in);
			}	else {
				System.out.println("Enter The Product Currect Number!");
				System.exit(0);
			}
		}

		for (int i = 0; i < al.size(); i++) {

			if (al.get(i)%2==0) {
				list.add(al.get(i));
			}else {
				list1.add(al.get(i));
			}

		}
		int index=0;
		int cost1=0;
		int cost2=0;
		String prod1="";
		String prod2="";
		String prod3="";
		String prod4="";

		if (list.size()>0 ) {


			System.out.println("You have 50% offer on this Proudcts :");
			for (int i = 0; i <list.size(); i++) {
				System.out.print("50% Discount "+list.get(i)+"\n");
				if (list.get(i)==2) {
					index=list.get(i)-1;
					cost1+=cost[index]/2;
					prod1=productsName[index];

				}
				else if (list.get(i)==4) {
					index=list.get(i)-1;
					cost1+=cost[index]/2;
					prod2=productsName[index];
				}
			}
			System.out.println();

			System.out.println("Enter PromoCode To purchise ");
			String promo=scan.next();
			if (promo.equals(promoCode1) || promo.equals(promoCode2) || promo.equals(promoCode3) ) {

				System.out.println("Bill Of Your Products :");
				System.out.println("Products Cost With 50% Discount Is : "+cost1+"Rs");

			}else {
				System.out.println("You Have Entered Wrong PromoCode!");
			}



		}
		if (list1.size()>0) {


			for (int i = 0; i <list1.size(); i++) {
				//			System.out.print(list1.get(i)+" ");
				if (list1.get(i)==1) {
					index=list1.get(i)-1;
					cost2+=cost[index];
					prod3=productsName[index];

				}
				else if (list1.get(i)==3) {
					index=list1.get(i)-1;
					cost2+=cost[index];
					prod4=productsName[index];
				}
			}	

		}
		System.out.println("Products Name's are : "+prod1+" "+prod2+" "+prod3+" "+prod4);
		int finalCost=cost1+cost2;
		System.out.println("Total Cost Is : "+finalCost+"Rs");

		System.out.println("Press 1 To Buy The Products :");
		int op=scan.nextInt();
		if (op==1) {
			System.out.println("Purchised Successfully.");
		}else {
			System.out.println("You Have Entered Wrong No!");
		}

	}
	private void dummy() {
		System.out.println("Welcome To Pens Shop");
		System.out.println("We Are Offering 50% offer for Some Products Only");
		System.out.println("My Shop Collections are\n");
	}

}