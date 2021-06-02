package loginTheSystemBackend.core;

import loginTheSystemBackend.GoogleMessage.GoogleMessage;

public class GoogleRegisterManagement implements GoogleService{

	@Override
	public void registerToSystem(String message) {
		GoogleMessage googleMessage = new GoogleMessage();
		googleMessage.send(message);
		
	}

}
