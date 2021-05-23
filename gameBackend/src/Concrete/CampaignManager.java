package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void Add(Campaign campaign) {
		System.out.println("Campaign name " + campaign.name + " has been added");
		
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println("Campaign name " + campaign.name + " has been updated");
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println("Campaign name " + campaign.name + " has been deleted");
		
	}

}
