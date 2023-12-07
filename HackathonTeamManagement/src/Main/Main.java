package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Connection teams = new Connection();
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			clearScreen();
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
        } 			else if (choice == 2) {
            			System.out.println("add team name:");
           			String teamName = scanner.nextLine();

            			Team team = teamRepository.insert(new String[]{teamName}, null);
            			System.out.println("Team created!");
        }
    }
					
					break;
				case 3:
					System.out.println("Which table to show? 1.team, 2.user");
					int showtable = input.nextInt();
					if(showtable == 1) {
						teams.read("/home/hansen/Documents/OOP/GSLCHTM/Database/teams.csv");
					}else if(showtable == 2) {
						teams.read("/home/hansen/Documents/OOP/GSLCHTM/Database/user.csv");
					}else {
						System.out.print("invalid input");
					}
//					System.out.println("Want to filter by condition");
					Thread.sleep(5000);
					break;
				case 4:
					System.exit(0);
					break;
				default:
					break;
			}
			
			
		}
		
	}
	public static void clearScreen() {  
	    for(int i=0; i<100; i++)
	    	System.out.println(" ");
	    System.out.flush();  
	}  
}
