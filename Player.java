package draftkings;

import java.util.List;

public class Player {
	private String name;
	private int points;
	private int salary;
	private List<String> pos;
    private Tier tier;
	
	Player(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setTier(Tier tier) {
		this.tier = tier;
	}
	
	public String toString() {
		return "Name="+name+"salary="+salary+"Tier="+tier.name();
	}
//	public static void main(String[] args) {
//		
//		Player player = new Player("Vinoth",10000);
//		player.setTier(Tier.Tier2);
//		System.out.print(player);
//	}
	
	
}
