package inheritance;

public class UserManager {
	public void log() {
		System.out.println("Ortak Operasyon");
	}
	public void login(User user) {
		System.out.println(user.firstName + user.lastName + " giris yaptý");
		
	}
	
}
