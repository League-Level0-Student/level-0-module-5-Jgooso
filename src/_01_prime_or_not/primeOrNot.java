package _01_prime_or_not;

import javax.swing.JOptionPane;

public class primeOrNot {
	public static void main(String[] arg) {
		 int check = Integer.parseInt(JOptionPane.showInputDialog(null,"Pick a number"));
	    boolean IsPrime = true;
	    for(int i = 2; i< check; i++) {
	    if(check % i ==0) {
	    	IsPrime = false;
	    	
	    }else {
	    	if(IsPrime == true) {
	    	IsPrime = true;
	    	}
	    }
	    
	}
	    System.out.print(IsPrime);
	}
}
