import java.util.ArrayList;

public class Library {
    private ArrayList<Books> booksList;

    public Library(){
        this.booksList = new ArrayList<Books>();
    }

    public int bookCount() {
        return this.booksList.size();
    }

    public void addBook(Books book) {
        if (bookCount() <= 3) {
            this.booksList.add(book);
        }
    }

}