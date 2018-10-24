public class Animal{
	
	private int id;
	private String name;
	private String type;
	private boolean food;

	public void feed(){
		food = true;
	}

	public void print(){
		System.out.println("The Animal name is " + name + ", is a: " + type + ", it ate " + food);
	}

	public void unfeed(){
		food = false;
	}

	public Animal(){
		id = 1;
		name = "Snappy";
		type = "Dog";
		food = true;
	}
}