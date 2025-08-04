package com.feedback;
import java.util.*;
public class StudentFeedback {
    static boolean isExit=true;
	static String stuName;
	static String couName;
	static int rating;
	static String feedBack;
	static int ratingg;
	public static void giveFeedback() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Student Name:");
	    String stuName=sc.next();
		System.out.println("Enter Course Name:");
		 String couName=sc.next();
		System.out.println("Rate the course(1 to 5):");
		int rating=sc.nextInt();
		System.out.println("Enter Feedback:");
		String feedBack=sc.next();
		String ratingg="";
		switch(rating) {
		case 1:
			ratingg="poor";
			break;
	    case 2:
	    	ratingg="fair";
	    	break;
	    case 3:
	    	ratingg="good";
	    	break;
	    case 4:
	    	ratingg="very good";
	    	break;
	    case 5:
	    	ratingg="execellent";
	    	break;		
		}	
	}
	public static void viewSummary() {
		Scanner sc =new Scanner(System.in);
		System.out.println("-----Feedback Received-----");
		System.out.println("Student:"+stuName);
		System.out.println("Course:"+couName);
		System.out.println("Rating:"+rating);
		System.out.println("Feedback:"+feedBack);
		System.out.println(ratingg);
		String moreFeedback;
		System.out.println("enter yes/no");
		moreFeedback=sc.next();
		if(moreFeedback.equals("y") || moreFeedback.equals("Y")) {
			StudentFeedback.giveFeedback();
		} 
		else {
			System.out.println("returning back home");
		}
	}
	public static void exit() {
		 isExit=false;
		 System.out.println("exited");
	}
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("===Menu===");
		System.out.println("1.Give Feedback");
		System.out.println("2.View Summary");
		System.out.println("3.Exit");
		System.out.println("Enter your Choice:");
		int choice= sc.nextInt();
		switch(choice) {
		case 1:
			StudentFeedback.giveFeedback();
		    break;	
		case 2:
			StudentFeedback.viewSummary();
		case 3:
			StudentFeedback.exit();
		}
	}
}
