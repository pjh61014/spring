package di.setter03;

public class ConsoleOutputter implements Outputter {
	
	String filePath;

	public ConsoleOutputter(){
		
	}
	public ConsoleOutputter(String filePath) {
		super();
		this.filePath = filePath;
		System.out.println(filePath);
	}


	@Override
	public void output(String message) {
		System.out.println(message);

	}

}
