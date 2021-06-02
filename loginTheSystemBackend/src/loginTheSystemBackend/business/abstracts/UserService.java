package loginTheSystemBackend.business.abstracts;

import loginTheSystemBackend.entities.concretes.User;

public interface UserService {
	// login and register 
	void login(String mail, String password);
	void register(User user);
}
