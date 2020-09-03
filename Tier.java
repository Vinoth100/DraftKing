package draftkings;

public enum Tier {
	
	Tier1,
	Tier2,
	Tier3,
	Tier4,
	Tier5;
	public static void main(String[] args) {
		for(Tier tier: Tier.values()) {
			System.out.println(tier.name());
		}
		
	}
	
	
}
