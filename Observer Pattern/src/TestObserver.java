

public class TestObserver {

	public static void main(String[] args) throws InterruptedException {

		 
		Person c1 = new Person();
		c1.setName("saddam@gmail.com");
		Person c2 = new Person();
		c2.setName("Siva@gmail.com");
		Person c3 = new Person();
		c3.setName("thomos@gmail.com");

		System.out.println("Post mail sent to selected persons \n");

		PostCard pc = new PostCard();
		 
		pc.attach(c1);
		pc.attach(c2);
		pc.attach(c3);
		
	 

		 //post mail will sent to selected persions
		pc.sendRegisterdPersons(true);
		
		//Now siva removed 
		System.out.println("\n Now removing siva email \n");
		
		pc.detach(c2); 
		
		pc.sendRegisterdPersons(true);
 
	}

}
