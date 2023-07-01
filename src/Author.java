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
    public boolean equals(Object author){
        if (author==null){
            return false;
        }
        if (this==author){
            return true;
        }
        if (this.getClass() != author.getClass()){
            return false;
        }
        Author author1 = (Author) author;
        return firstName.equals(author1.getFirstName()) &&
             lastName.equals(author1.getLastName());
    }
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }
}
