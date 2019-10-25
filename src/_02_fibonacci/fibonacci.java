package _02_fibonacci;

public class fibonacci {
	public  static void main(String[] args) {

	int fib1 = 0;
    int fib2 = 1;
    int fib3 = 0;
    for( int i=0; i < 12; i++){
    fib3 = fib1 + fib2;
    fib1 = fib2;
    fib2 = fib3;
    System.out.println(fib1);
    }
	}
}
