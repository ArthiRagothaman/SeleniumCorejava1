package Assignments;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library ma = new Library();
		ma.issueBook();
		String book = ma.addBook("School of Talents");
		System.out.println(book);

	}

}

