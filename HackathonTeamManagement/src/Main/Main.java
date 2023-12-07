package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		Connection teams = new Connection();
		teams.read("/home/hansen/Documents/OOP/GSLCHTM/Database/teams.csv");
		teams.read("/home/hansen/Documents/OOP/GSLCHTM/Database/user.csv");
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Menu Utama");
			System.out.println("2. Insert Data");
			System.out.println("3. Show");
			System.out.println("4. exit");
			System.out.print(">> ");
			int menu = input.nextInt();
			switch(menu) {
				case 1:
					break;
				case 2:
					
					break;
				case 3:
					break;
				case 4:
					System.exit(0);
					break;
				default:
					break;
			}
			
			
		}
		
	}
}
