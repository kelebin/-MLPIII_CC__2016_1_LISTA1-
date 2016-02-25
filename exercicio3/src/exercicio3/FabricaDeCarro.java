package exercicio3;

public class FabricaDeCarro {
	
	private static FabricaDeCarro instance;
	
	private FabricaDeCarro(){		
	}
	
	public static synchronized FabricaDeCarro getInstance(){
		if (instance == null)
			instance = new FabricaDeCarro();
		return instance;
	}
	
	public String toString(){
		if (instance != null){
			return ("Sou a unica classe instanciada");
		}
		return null;			
	}
}