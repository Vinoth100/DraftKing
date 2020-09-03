package draftkings;

import java.util.Arrays;
import java.util.List;
 
public class CFBGame extends Game{
	
	public CFBGame() {
		 gameName = "CFB";
		 isTier = false;
		 sportType = SportType.CFB;
		 maxSalary = 10000;
		 posList = Arrays.asList("Front","Back","Middle");
		 tierList = Arrays.asList(Tier.values());
	}

	@Override
	public int getMaxSalary() {
		// TODO Auto-generated method stub
		return maxSalary;
	}
	@Override
	public Boolean isTier() {
		return isTier;
	}
	public List<Tier> getAllTiers(){
		return tierList;
	}
	
 
}
