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
}
