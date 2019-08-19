package comm.example;

public class Dog implements LivingThings {
    private String name, breed;
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("walk outside");
	}
	
	//anonymous inner class
	public void createLivingThings() {
		LivingThings l1 =new LivingThings() {

			@Override
			public void walk() {
				// TODO Auto-generated method stub
				System.out.println("walk inside"+getName()+getBreed());

			}
			
		};
		l1.walk();
	}
	

}
