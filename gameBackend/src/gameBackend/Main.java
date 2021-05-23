package gameBackend;

import Concrete.CampaignManager;
import Concrete.FakePersonCheckManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		Player player = new Player(1, "Beyza", "Parlak", "2000", "111111111111");
		PlayerManager playerManager = new PlayerManager(new FakePersonCheckManager());
		playerManager.Add(player);
		playerManager.Delete(player);
		playerManager.Update(player);
		
		Game game = new Game(1, "FPS", "ShotGun", 199.99);
		GameManager gameManager = new GameManager();
		gameManager.Add(game);
		gameManager.Delete(game);
		gameManager.Update(game);
		
		Campaign campaign = new Campaign(1, "Two Year", 5);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.Add(campaign);
		campaignManager.Delete(campaign);
		campaignManager.Update(campaign);
		
		SaleManager saleManager = new SaleManager();
		saleManager.SaleGame(player, campaign, game);
		
	}

}
