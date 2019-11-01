package _06_for_loop_gauntlet;

public class forLoopGauntlet {
	public static void main(String[] args) {
		//Part 1
		for(int i = 0; i <100; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
		for(int i = 100; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
		for(int i = 0; i <100; i++) {
			if(i % 2 == 0) {
			System.out.print(i + " ");
			}
		}
		System.out.print("\n");
		for(int i = 0; i <100; i++) {
			if(i % 2 != 0) {
			System.out.print(i + " ");
			}
		}
		for(int i = 0; i <500; i++) {
			if(i % 2 != 0) {
			System.out.print(i + "odd ");
			}else if (i % 2 == 0) {
			System.out.print(i + "even ");
			if( i % 100== 0) {
				System.out.print("\n");
			}
			}
		}
		System.out.print("\n");
		for(int i = 0; i <777; i++) {
			if(i % 7 == 0) {
			System.out.print(i + " ");
			}
		}
		System.out.print("\n");
		for(int i = 0; i <17; i++) {
			
			System.out.println("In " + (2003 + i) + ", I was " +i + " years old");
			}
		// End part 1
		
		// Begin Part 2
			for( int j = 0; j < 3; j++) {
				for(int k = 0 ; k < 3; k++) {
					System.out.println(j + " " + k);
				}
			}	
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					
					System.out.print(j+(i*3)+1 + " ");
				}
				System.out.print("\n");
			}
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < 10; j++) {
					
					System.out.print(j+(i*10)+1 + " ");
				}
				System.out.print("\n");
			}
			for(int i = 0; i < 7; i++) {
				for(int j = 0; j < i; j++) {
					
					System.out.print("* ");
				}
				System.out.print("\n");
			}
			for(int i = 0; i <100; i++) {
				System.out.print(100 - i + " ");
			}
		
		
		}
		
	}

