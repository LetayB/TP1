public class App {

	private static Zoo zoo;
	
	public static void main(String[] args) {
		zoo = new Zoo();
	}
	
	public static Zoo getZoo() {
		return zoo;
	}
}
