package singleton;

/* 
 * Singleton 1: Database
 * - Uso da classe Database em um sistema para gravar, consultar, atualizar e excluir dados do BD;
 * - Para interagir com o banco de dados, basta criar uma única instância acessível a partir de qualquer parte do sistema.
 */

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