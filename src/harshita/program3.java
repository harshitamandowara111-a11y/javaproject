package harshita;
import java.util.*;
public class program3 {
     public static void main(String arg[]) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter the 1st number");
    	 int n1=sc.nextInt();
    	 System.out.println("enter the 2nd number");
    	 int n2=sc.nextInt();
    	 System.out.println("enter the 3rd number");
    	 int n3=sc.nextInt();
    	 
    	 if(n1<n2) {
    		 
    	   if(n3>n2){
    		 System.out.println(n3+ " is greater");
    	 }
    	 else if(n2>n3) {
    		 System.out.println(n2+ " is greater");
    	 }
    	 else {
    		 System.out.println(n1+ " is greater");
    	 }
    	 
    	 
     }
}
}

