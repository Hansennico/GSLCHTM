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
					System.out.println("add name:");
            	String name = scanner.nextLine();
            	System.out.println("add nim:");
            	String nim = scanner.nextLine();
            	System.out.println("add team:");
            	String teamName = scanner.nextLine();

            	Team team = teamRepository.findOne("name", new String[]{"=", teamName}, false, null, null);
            	if (team == null) {
                
                team = teamRepository.insert(new String[]{teamName}, null);
            }

            if (team.getUsers().size() >= 3) {
                System.out.println("Error: Team full.");
                return;
            }

            User user = userRepository.insert(new String[]{name, nim, team.getName()}, null);
            System.out.println("User created!");
        } else if (choice == 2) {
            System.out.println("add team name:");
            String teamName = scanner.nextLine();

            Team team = teamRepository.insert(new String[]{teamName}, null);
            System.out.println("Team created!");
        }
    }
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
