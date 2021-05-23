package Concrete;

import Adapters.PersonCheckService;
import Entities.Player;

public class FakePersonCheckManager implements PersonCheckService {

	@Override
	public boolean Validation(Player player) {
		
		if(player.getNationalityId().length()==11) {
			System.out.println("Player named " + player.firstName + " " + player.lastName + " has been verified");
			return true;
		}
		
		else {
			System.out.println("Player named " + player.firstName + " " + player.lastName + " could not be verified");
			return false;
		}
	}
	
}
