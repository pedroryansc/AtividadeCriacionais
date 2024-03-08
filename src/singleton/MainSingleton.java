package singleton;

public class MainSingleton {
	public static void main(String[] args) {
		
		Database db = Database.getInstance();
		System.out.println(db);
	}
}