public class Book {
    private String title;
    private Author author;
    private int year;

    Book(String title, Author author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }


    public String getTitle(){
        return this.title;
    }

    public Author getAuthor(){
        return this.author;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public boolean equals(Book books) {
        return this.title.equals(books.getTitle()) && this.year == books.getYear();
    }

    public String toString(){
        return "Название книги: " + title + " автор: " + author + " год выписки: " + year;
    }

    public int hashCode(){
        return super.hashCode();
    }
}
