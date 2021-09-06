

public class Person implements PostObserver{
	
	private String name;
	
	private Subject subject ;
	
 
	 

	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void update(String  pc) {
		System.out.println(" Post Email sent to "+name); 
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	

}
