package _06_Console_Store;

import java.util.Scanner;

import _02_Generics_Store.Cart;
import _02_Generics_Store.Cereal;
import _02_Generics_Store.Food;

public class ConsoleStore {

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */

    public static void main(String[] args) {
    	Cart<Food> food = new Cart<Food>();
    	
    	String afford = "";
    	int money = 5;
    	boolean instore = false;
    	 Scanner obj = new Scanner(System.in);
    	 String ans = "";
    	 System.out.println("Welcome to the Scanner-Generics shopping simulation! Would you like to enter the store?");
    	 ans = obj.nextLine();
    	instore = ans.equalsIgnoreCase("yes");
    	 
    	do {
    		if( money >= 4) {
    			afford = " You can afford all 4 items on the shelf!! Water ($1), Orange ($2), Apple ($3), Bread ($4).";
    		} else if( money == 3) {
    			afford = " You can afford 3 items on the shelf!! Water ($1), Orange ($2), Apple ($3).";
    		} else if( money == 2) {
    			afford = " You can afford 2 items on the shelf!! Water ($1), Orange ($2).";
    		} else if( money == 1) {
    			afford = " You can afford 1 items on the shelf!! Water ($1).";
    		} 
    		System.out.println("you have $"+money+" to your disposal. and have "+food.length()+" objects in your cart."+afford);
    		System.out.println("would you like to add something to your cart ( A ), remove something from your cart ( R ), or leave the store ( L )?");
    		 ans = obj.nextLine();
    		 instore = !( ans.equalsIgnoreCase("L")) ;
    	}while( instore == true );
    	
    	obj.close();
    }

}
