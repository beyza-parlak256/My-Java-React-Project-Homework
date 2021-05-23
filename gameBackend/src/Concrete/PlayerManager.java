package Concrete;

import Abstract.PlayerService;
import Adapters.PersonCheckService;
import Entities.Player;

public class PlayerManager implements PlayerService{
	
	PersonCheckService eDevlet;
	
	public PlayerManager(PersonCheckService personCheckService) {
		this.eDevlet = personCheckService;
	}

	public void Add(Player player) {
		if(eDevlet.Validation(player)) {
			System.out.println("Player name " + player.firstName + " " + player.lastName  + "has been added");
		}
		
	}

	public void Update(Player player) {
		if(eDevlet.Validation(player)) {
			System.out.println("Player name " + player.firstName + " " + player.lastName  + "has been updated");
		}
		
	}

	@Override
	public void Delete(Player player) {
		if(eDevlet.Validation(player)) {
			System.out.println("Player name " + player.firstName + " " + player.lastName  + "has been deleted");
		}
		
	}
	
	
	
}
