package loginTheSystemBackend.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import loginTheSystemBackend.business.abstracts.UserService;
import loginTheSystemBackend.core.GoogleService;
import loginTheSystemBackend.dataAccess.abstracts.UserDao;
import loginTheSystemBackend.entities.concretes.User;

public class UserManager implements UserService{
	
	private List<String> listMail = new ArrayList<String>();
	private List<String> listPassword = new ArrayList<String>();
	private UserDao userDao;
	private GoogleService googleService;
	
	public UserManager(UserDao userDao, GoogleService googleService) {
		super();
		this.userDao = userDao;
		this.googleService = googleService;
	}
	
	 public static boolean isEmailValid(String email) {
	        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(email);
	        
	        return matcher.matches();
	    }
	 
	 public static boolean isEmailValidOnClick(String email) {
	        return true;
	    }
	    
	 @Override
	 public void login(String mail, String password) {
		 if (mail.contains(mail) && listMail.contains(password)) {
	            System.out.println("Baþarýlý Giriþ");

	        } else {
	            System.out.println("Baþarýsýz Giriþ!\nTekrar Deneyiniz..");
	        }
		 
		}
		
	 @Override
		public void register(User user) {
		    // pasword control codes
		 	if(user.getPassword().length() < 8 || user.getPassword() == null) {
		 		System.out.println("Parolanýz en az 8 karakterden oluþmalýdýr. ");
		 		return;
		    }
		 	
		 	// current e-mail
		 	if (listMail.contains(user.getEmail())) {
	            System.out.println("Bu email daha önce kullanýldý. ");
	            return;
	        }
		 	
		    // First and last name must contain at least 2 characters
	        if (user.getFirsName().length() < 3 || user.getLastName().length() < 3) {
	            System.out.println("Adýnýz ve soyadýnýz en az 2 karakterden oluþmalýdýr. ");
	            return;

	        }
	        
	        else {
	            System.out.println("Dogrulama linki gönderildi e-mail adresinizi kontrol ediniz. " + user.getEmail());

	        }
		 	
	        if (isEmailValidOnClick(user.getEmail())) {
	            System.out.println("Baþarýyla kaydoldunuz. ");
	            listMail.add(user.getEmail());
	            listPassword.add(user.getPassword());
	            this.userDao.add(user);
	            this.googleService.registerToSystem(null);

	        } 
	        
	        else {
	            System.out.println("e-postanýzý kontrol ediniz ve hesabýnýzý doðrulayýnýz. ");
	        }
		}
	 
	 
}
