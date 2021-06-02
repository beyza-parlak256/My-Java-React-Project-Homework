package loginTheSystemBackend;

import loginTheSystemBackend.business.concretes.UserManager;
import loginTheSystemBackend.core.GoogleRegisterManagement;
import loginTheSystemBackend.dataAccess.concretes.HibernateUserDao;
import loginTheSystemBackend.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new HibernateUserDao(), new GoogleRegisterManagement());

        User user1 = new User(1, "Selin", "Dayýoðlu", "slndayioglu@gmail.com", "123456");

        userManager.register(user1);
        userManager.login("slndayioglu@gmail.com", "123456");
        
	}

}
