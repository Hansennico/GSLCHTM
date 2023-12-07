package Main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		Connection teams = new Connection();
		teams.read("/home/hansen/Documents/OOP/GSLCHTM/Database/teams.csv");
		teams.read("/home/hansen/Documents/OOP/GSLCHTM/Database/user.csv");
		
	}
}
