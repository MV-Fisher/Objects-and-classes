public class Book {
  private final String tileBook ;
  private final Author author  ;
  private int publicationYear ;
  public Book (String tileBook, Author author, int publicationYear) {
      this.tileBook = tileBook ;
      this.author = author;
      this.publicationYear = publicationYear ;
  }
  public String getTileBook() {
      return tileBook ;
  }
  public Author getAuthor() {
      return author ;
  }
  public int getPublicationYear() {
      return publicationYear ;
  }
  public void setPublicationYear(int year) {
      this.publicationYear = year;
  }
  public String toString() {
      return "Книга " + this.tileBook + " опубликована в " + this.publicationYear +
                " году. " + this.author.toString();
  }
    public boolean equals(Object book) {
        if (book==null){
            return false;
        }
        if (this==book){
            return true;
        }
        if (this.getClass() != book.getClass()){
            return false;
        }
        Book book1 = (Book) book;
        return publicationYear == book1.publicationYear &&
                tileBook.equals(book1.tileBook) && author.equals(book1.author);
    }
    public int hashCode() {
        int result = tileBook.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + publicationYear;
        return result;
    }
}
