package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SaleManager implements SaleService {

	@Override
	public void SaleGame(Player player, Campaign campaign, Game game) {
		double previousPrice=game.getPrice();
		
		if(game.getCampaign==null) {
			System.out.println("Player named "+player.getFirstName()+" "+player.getLastName()+" bought the game "+game.getName()+" for "+game.getPrice()+" $");
		}
		else {
			double discountPrice=game.getPrice()-(game.getPrice()*game.getCampaign().getDiscount()/100);
			game.setPrice(discountPrice);
			System.out.println("Player named "+player.getFirstName()+" "+player.getLastName()+" bought the game "+game.getName()+" which was "+previousPrice+" with a %"
			+game.getCampaign().getDiscount()+" discount for "+game.getPrice()+".");
			}
		}
	

}
