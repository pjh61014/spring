package di.constructor03;

public class MessageBean implements InterMessage{

	String name;
	String greeting;
	Outputter outputter;
	
	
	public MessageBean(String name, String greeting, Outputter outputter) {
		super();
		this.name = name;
		this.greeting = greeting;
		this.outputter = outputter;
	}


	@Override
	public void sayHello() {
		String message = greeting+":"+name;
		outputter.output(message);
		
	}

}
