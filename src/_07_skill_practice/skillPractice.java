package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class skillPractice {
		public static void main(String[] args) {

		skillPractice skills = new skillPractice();
		           skills.skill1();
		           skills.skill2();
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
		}
		
		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
			String dimes = JOptionPane.showInputDialog(null, "How many dimes do you have?");



		// Tell them how many cents they have (hint multiply by 10)
			JOptionPane.showConfirmDialog(null, "You have " + (Integer.parseInt(dimes) * 10) + " cents");



		// Ask the user how tall they are (inches)
			String height = JOptionPane.showInputDialog(null, "How tall are you in inches");
				if(Integer.parseInt(height) < 36) {
					JOptionPane.showConfirmDialog(null, "Eat your Wheaties");
				}
		

			
				




		// If they are shorter than 36 inches, tell them to eat their Wheaties




		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console
			for(int i = 1; i < 31; i++) {
				if(i % 3 == 0) {
					System.out.println(i);
				}
			}






		}

		void skill3() { // Get a random number that is less than 20 and print it to the console
			Random ran = new Random();
			int firstRan = ran.nextInt(20);
			System.out.println(firstRan);


		// Get another random number that is less than 10 and print it to the console
			int secondRan = ran.nextInt(10);
			System.out.println(secondRan);


		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
			JOptionPane.showConfirmDialog(null, firstRan - secondRan);


		}

		void skill4() { // In a pop-up, ask the user for the city they live in
			String city = JOptionPane.showInputDialog(null, "Where do you live");


		// If they answered "San Diego", tell them they live in America's Finest City
				if(city.equalsIgnoreCase("San Diego")) {
					JOptionPane.showConfirmDialog(null, "You live in America's finest city.");
				}else {
					JOptionPane.showConfirmDialog(null, "You should move to San Diego.");
				}


		// Otherwise, tell them to move to San Diego



		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
				int cars = 3;


		// If there is 1 car, use a pop-up to display the make/model of the car
				JOptionPane.showConfirmDialog(null, "12");


		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.



		}

		void skill5() { // In a pop-up, ask the user for the name of their school
			String school = JOptionPane.showInputDialog(null, "Where do you go to school");


		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.
			JOptionPane.showConfirmDialog(null, school + " is a fantastic school.");


		}
		}

