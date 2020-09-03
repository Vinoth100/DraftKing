package draftkings;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
 * 
 * 1) What sport (Sport type) - CFB,PGA,NHL, NFL
 * 2) Select start time
 * 3) Max Salary
 * 4) Player {Name,Salary, Points, etc..}
 * 
 * Each player listed has an assigned salary and a valid lineup must not exceed the salary cap. 
 * In Tiers contests, participants will create a lineup by selecting players listed in the Player Pool. 
 * Each player listed has an assigned Tier, and a valid lineup must include a player from each Tier.
 * 
 * Validation
 * 1) Salary
 * 2) Position already taken
 * 3) Lineup needs to contain players spanning multiple games
 * 4) 
 */
public class Lineup {
	
	 List<Player> players;
	 Game game;
	 Integer maxSalary;
	 Integer currentSalary;
	 HashMap<Tier,Player> tierPlayerMap;
	 HashMap<String,Player> positionPlayerMap;
	 
	 public Boolean validatePosition() {
		 return true;
	 }
	 
	public Lineup(Game game) {
		this.game=game;
		maxSalary = game.getMaxSalary();
		
	}
	
	public void addPlayer(Player player) {
		 // Validate the player
		// if valid add the player and update the currentSalary
		 if(isValid()) {
			  currentSalary += player.getSalary();
			  this.players.add(player);
		 }
	}
	
	public void removePlayer(Player player) {
		 // Validate the player
		//  update the currentSalary and reduce the current Salary
		  currentSalary -= player.getSalary();
		  this.players.remove(player);
	}
	
	
	public boolean validateTier() {
		// Atleast one player should exist each Tier.
		// Get all Tiers
		List<Tier> tierList = game.getAllTiers();
		// Check atleast one player exists
		for (Tier tier:tierList) {
			for(Player player: players) {
				
			}
		}
		
		return true;
		
	}
	
    public boolean validateSalary() {
		return !(currentSalary > maxSalary);
	}
	
	boolean isValid() {
		
		// Check the type of validation
		 return game.isTier() ? validateTier() : validateSalary();
		
	}
	
        
	public static void main(String [] args) {
		
		// Build players
		//List<Player> playerList =  Arrays.asList(new Player("A",10),new Player("B",20));
		NFLGame game = new NFLGame();
		Lineup lineup = new Lineup(game);
		lineup.addPlayer(new Player("A",10));
		lineup.addPlayer(new Player("B",20));
		if (lineup.isValid()) {
			System.out.println("Line up is valid");
		}
		
	}
	
}

 




 