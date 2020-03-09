package com.epam.Collections;
import java.util.*;

public class List {
	static boolean fetch(ArrayList<Integer> ar, int e){
		for(int i=0;i<ar.size();i++){
			if(ar.get(i) == e){
				return true;
			}
		}
		return false;
	}
	static void remove(ArrayList<Integer> ar,int e){
		for(int i=0;i<ar.size();i++){
			if(ar.get(i) == e){
				ar.remove(i);
				System.out.println("Number removed Successfully!!");
				return;
			}
		}
		System.out.println("There is no number "+e+"in the list");
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> ar = new ArrayList<Integer>(10);
		for(int i=0;i<10;i++){
			ar.add(i);
		}
		System.out.println("List is created and initialised with 10 elements");
		boolean flag =  true;
		while(flag){
			System.out.println("Operations that we can perform on the list are : ");
			System.out.println("1. Fetching an element \n2. Adding an element\n3. Removing an element \n4. Printing the List");
			System.out.println("Enter your option to perform operations onthe list : ");
			int op =  s.nextInt();
			if(op==1){
				System.out.println("Enter a number to fetch from the list : ");
				int e = s.nextInt();
				if(fetch(ar,e)){
					System.out.println("Number "+e+" is present in the list");
				}
				else{
					System.out.println("Number "+e+" is not present in the list");
				}
			}
			else if(op==2){
				System.out.println("Enter an element to add to the list : ");
				int e = s.nextInt();
				ar.add(e);
				System.out.println("Number "+e+" is added to the list");
			}
			else if(op==3){
				System.out.println("Enter a number to remove from the list : ");
				int e = s.nextInt();
				remove(ar,e);
			}
			else if(op==4){
				System.out.println(ar);
			}
			else{
				System.out.println("Invalid option");
			}
			System.out.println("Do you want to perform operations? true/false");
			flag = s.nextBoolean();
		}
	}
}
