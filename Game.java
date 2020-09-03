package draftkings;

import java.util.List;

public abstract class Game {

	protected String gameName;
	protected Boolean isTier;
	protected List<String> posList;
	protected List<Tier> tierList;
	protected SportType sportType;
	protected int maxSalary;
	public abstract int getMaxSalary();  
	public abstract Boolean isTier();
	public abstract List<Tier> getAllTiers();
	
}
