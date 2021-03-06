package loginTheSystemBackend.dataAccess.concretes;

import java.util.List;

import loginTheSystemBackend.dataAccess.abstracts.UserDao;
import loginTheSystemBackend.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Kullanıcı eklendi " + user.getFirsName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı güncellendi " + user.getFirsName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı silindi " + user.getFirsName());
		
	}

	@Override
	public User get(int id) {
		return null;
	}

	@Override
	public List<User> getAll() {
		return null;
	}

}
