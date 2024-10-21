public class Main {
    public static void main(String[] args) {
        Author writerArkasha = new Author("arkadiy", "petrov");
        Author writerSasha = new Author("sasha", "vladimerov");
        Book firstBook = new Book("Робинзон крузо", writerArkasha, 1895);
        Book secondBook = new Book("В поисках приключений", writerSasha, 2015);

        System.out.println("Год публикации = " + firstBook.getYear());
        firstBook.setYear(1897);
        System.out.println("Изменившийся год публикации = " + firstBook.getYear());
        System.out.println("Год публикации 2 книги = " + secondBook.getYear());
        System.out.println(" ");
        System.out.println("Имя первого автора = " + writerArkasha.getName());
        System.out.println("Фамилия первого автора = " + writerArkasha.getSurname());
        System.out.println(" ");
        System.out.println("Имя второго автора = " + writerSasha.getName());
        System.out.println("Фамилия второго автора = " + writerSasha.getSurname());

        System.out.println(" ");
        System.out.println(firstBook.equals(secondBook));
        System.out.println(writerArkasha);
        System.out.println(writerSasha);
        System.out.println(writerSasha.equals(writerSasha));
        System.out.println(firstBook.hashCode());
        System.out.println(secondBook.hashCode());
        System.out.println(firstBook.hashCode());
        System.out.println(secondBook.hashCode());
    }
}