package zadatak1;
//12.05.
public class Book {
	
	private String name;
	private String author;
	private int numberOfPages;
	private double price;

	public static void calculateDiscount() {
		
	}
	public Book() {
	}
	   
	   public Book (String name, String author,int numberOfPages) {
		   this.name = name;
		   this.author = author;
		   this.numberOfPages = numberOfPages; 
		   
		   
		   
	   }
	   
	   public Book(String name, double price, String author,int numberOfPages) {
		  this(name, author, numberOfPages);
		  this.price = price;
		  
	   }
	   
	   private double calculateDiscount (int percent) {
		   return (this.price*percent) / 100 ;
	   }
	   
	   protected double calculateDiscountPrice(int percent) {
			return price - calculateDiscount(percent);
		}
	   
	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		if(numberOfPages > 0) {
			this.numberOfPages = numberOfPages;
		}
		else 
			System.out.println("Unesite pozitivan broj stranica!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price > 0) {
			this.price = price;
		}
		else 
			System.out.println("Neispravan iznos! Pokusajte ponovo!");
	}
}
