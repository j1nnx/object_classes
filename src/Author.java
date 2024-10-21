public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public boolean equals(Author author){
        return this.name.equals(author.getName()) && this.surname.equals(author.getSurname());
    }

    public String toString(){
        return "Имя автора: " + name + " , фамилия автора " + surname;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
