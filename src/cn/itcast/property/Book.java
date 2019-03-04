package cn.itcast.property;

public class Book {
	private String bookeName;
	
	
	public void setBookName(String bookName) {
		this.bookeName = bookName;
	}
	public void demoBook() {
		System.out.println("bookName..........." + bookeName);
	}
}
