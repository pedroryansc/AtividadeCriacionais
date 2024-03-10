package singleton;

public class Database {

	private static Database db;
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		if(db == null)
			db = new Database();
		return db;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Database []");
		return builder.toString();
	}

}