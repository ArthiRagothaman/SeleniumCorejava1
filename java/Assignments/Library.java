package Assignments;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println("Book added Successfully");
		return "Booktitle: " +bookTitle;
	}

	public  void issueBook() {
		System.out.println("Book issued Successfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Library lib = new Library();
        String book = lib.addBook("School Of Talents");
        System.out.println(book);
        
	}

}
