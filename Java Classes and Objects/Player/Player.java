package Player;

import java.util.*;

public class Player {
	String Name;
	String Team;
	int Score;
	
	Player(String Name, String Team, int Score){
		this.Name = Name;
		this.Team=Team;
		this.Score=Score;
	}
	
	void UpdateScore(int Points) {
		Score+=Points;
		System.out.println("-------------------------");
		System.out.println("Updated Score : " + Score);
	}

}

class Main{
	public static void main(String[] args) {
		Player player = new Player("M S Dhoni", "Chennai Super Kings", 150);
		System.out.println("Player Name : " + player.Name);
		System.out.println("Team Name : " + player.Team);
		System.out.println("Initial Score : " + player.Score);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number of Times You Want to Add Points : ");
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			System.out.print("Enter The Points " + (i+1) + " : ");
			int Points = sc.nextInt();
			
			player.UpdateScore(Points);
		}
		
		sc.close();
		
	}
}
