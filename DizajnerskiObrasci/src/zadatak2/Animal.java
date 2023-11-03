package zadatak2;
//12.05 i 15.05
public abstract class Animal {
	private String name = new String();
	private String breed = new String();

	void feed( ) {
		
	};
	void namePet (String name) {
		
	};
 void respond() {
	 
 };


	public Animal (String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

 
 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
}
