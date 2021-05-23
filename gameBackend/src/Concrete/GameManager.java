package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void Add(Game game) {
		System.out.println("Game name " + game.getName() + " has been added");
	}

	@Override
	public void Update(Game game) {
		System.out.println("Game name " + game.getName() + " has been updated");
	}

	@Override
	public void Delete(Game game) {
		System.out.println("Game name " + game.getName() + " has been deleted");
	}

}
