public class Author {
    private final String firstName ;
    private final String lastName ;
    public Author (String firstName, String lastName) {
        this.firstName = firstName ;
        this.lastName =  lastName ;
    }
    public String getFirstName() {
        return firstName ;
    }
    public String getLastName() {
        return lastName ;
    }
    public String toString(){
        return "Автор: " +  this.firstName + " " + this.lastName ;
    }
    public boolean equals(Author author){
        return this.firstName.equals(author.firstName) && this.lastName.equals(author.lastName);
    }
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }
}
