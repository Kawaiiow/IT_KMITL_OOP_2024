package book;

public class Book {
	public String	author;
	public boolean	isAvailable;
	public double	price;
	public String	publisher;
	public String	title;
	public int		yearPublished;

	public void printDetails()
	{
		String	status;

		status = "No";
		if (isAvailable)
			status = "Yes";
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Publisher: " + this.publisher);
		System.out.println("Year Published: " + this.yearPublished);
		System.out.println("Price: $" + this.price);
		System.out.println("Available: " + status);
	}

	public void updatePrice(double newPrice)
	{
		this.price = newPrice;
	}

	public void markAsUnavailable()
	{
		this.isAvailable = false;
	}
	
	public void markAsAvailable()
	{
		this.isAvailable = true;
	}

	public boolean isPublishedAfter(int year)
	{
		if (year < this.yearPublished)
			return true;
		return false;
		// return (year < this.yearPublished ? true : false);
	}
}
