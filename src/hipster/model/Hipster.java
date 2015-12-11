package hipster.model;

public class Hipster
{
	private String name;
	private String [] hipsterPhrases;
	private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book [3];
		
		setupArray();
		setupBooks();
		
	}

	private void setupArray()
	{
		hipsterPhrases[0] = "That is so mainstream!";
		hipsterPhrases[1] = "I don't mean to sound like a hipster, but,";
		hipsterPhrases[2] = "Insert sarcastic prhase here";
		hipsterPhrases[3] = "I was into Fallout before it was cool";
	}
	private void setupBooks()
	{
		Book firstBook, secondBook, thirdBook;
		
		firstBook = new Book();
		firstBook.setAuthor("Daniel H. Wilson");
		firstBook.setTitle("Robopocalypse");
		firstBook.setSubject("Science Fiction");
		firstBook.setPageCount(368);
		firstBook.setPrice(13.00);
		
		secondBook = new Book();
		secondBook.setAuthor("Brandon Mull");
		secondBook.setTitle("Fablehaven");
		secondBook.setSubject("Fantasy");
		secondBook.setPageCount(300);
		secondBook.setPrice(10.00);
		
		thirdBook = new Book();
		thirdBook.setAuthor("Brandon Mull");
		thirdBook.setTitle("Beyonders");
		thirdBook.setSubject("Fantasy");
		thirdBook.setPageCount(400);
		thirdBook.setPrice(15.00);
		
		
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}
	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}

	public Book[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	public void setHipsterBooks(Book[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}


	
}

