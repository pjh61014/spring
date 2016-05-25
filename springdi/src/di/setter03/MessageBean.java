package di.setter03;

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

	
	public MessageBean() {
		super();
	}


	@Override
	public void sayHello() {
		String message = greeting+":"+name;
		outputter.output(message);
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGreeting() {
		return greeting;
	}


	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}


	public Outputter getOutputter() {
		return outputter;
	}


	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
	}

}
