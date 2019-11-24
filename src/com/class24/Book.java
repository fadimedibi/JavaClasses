package com.class24;

public class Book {
	/*
	 * Write program as a Book class that will have 2 Constructors. While creating
	 * an object make sure: Instance variables are being initialized Both
	 * Constructors are being executed
	 */
	String title, author, bound, genre;
	int pageNumber;
	long isbnNum;

	Book(String title, int pageNumber) {
		this.title = title;
		this.pageNumber = pageNumber;
	}

	Book(String title, String author, String genre, String bound, int pageNumber, long isbnNum) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.bound = bound;
		this.pageNumber = pageNumber;
		this.isbnNum = isbnNum;
	}

	public void bookDetail() {
		System.out.println("Amazon.com's #1 Best Selling books of the month: \nTitle: " + title + " \nAuthor:" + author
				+ " \nGenre :" + genre + " \nBound: " + bound + " \nNumber of the page: " + pageNumber
				+ " \nISBN number: " + isbnNum);
	}

	public static void main(String[] args) {
		Book book1 = new Book("Diary of a Wimpy Kid: Wrecking Ball (Book 14)", "Jeff Kinney,", "Fiction", "Hardcover",
				224, 024141203);
		Book book2=new Book("Where the Crawdads Sing ",384);
				
		book1.bookDetail();
		book2.bookDetail();
	}
}
