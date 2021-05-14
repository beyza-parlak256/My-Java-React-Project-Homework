package javaInheritance;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println(user.firstName + " " +user.lastName +" kullanıcısı kaydedildi");
	}
	
	public void deleteUser(User user) {
		System.out.println(user.firstName + " " +user.lastName +" kullanıcısı silindi");
	}
	
	public void updateUser(User user) {
		System.out.println(user.firstName + " " +user.lastName +" kullanıcısı güncellendi");
	}
	
}
