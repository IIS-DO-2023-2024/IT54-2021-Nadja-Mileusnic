package zadatak1;

public class BookTest extends Book{

	public static void main(String[] args) {
		

		Book bookOne = new Book();
		Book bookTwo = new Book("Digital Fortress", "Dan Brown", 445);

		bookOne.setName("Inferno");
		bookOne.setAuthor("Dan Brown");
		bookOne.setPrice(950.00);
		bookOne.setNumberOfPages(445);

		System.out.println(bookOne.calculateDiscountPrice(15));

		if (bookOne.calculateDiscountPrice(15) < bookTwo.calculateDiscountPrice(20)) {
			System.out.println(bookOne.getName());
		} else {
			System.out.println(bookTwo.getName());
		}
	}
		
	}


