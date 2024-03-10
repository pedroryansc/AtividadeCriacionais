package singleton;

/* 
 * Singleton 1: Database
 * - Uso da classe Database em um sistema para gravar, consultar, atualizar e excluir dados do BD;
 * - Para interagir com o banco de dados, basta criar uma única instância acessível a partir de qualquer parte do sistema.
 */

public class MainSingleton {
	public static void main(String[] args) {
		
		Database db = Database.getInstance();
		System.out.println(db);
		
	}
}