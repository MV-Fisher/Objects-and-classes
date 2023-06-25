public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Lev", "Tolstoy") ;
        Book warAndPeace = new Book("War and Peace" , tolstoy, 1857) ;
        System.out.println("Книга : " + warAndPeace.getTileBook() + " опупликована " + "в " +
                warAndPeace.getPublicationYear() + " году. Автор : " +
                warAndPeace.getAuthor().getFirstName() +  " " +
                warAndPeace.getAuthor().getLastName());
        warAndPeace.setPublicationYear(1860);
        System.out.println(warAndPeace.getPublicationYear());
        Author hayley = new Author("Arthur", "Hayley") ;
        Book airport = new Book("Airport", hayley, 1992) ;
        Author flash = new Author("Bill", "Flash") ;
        Book theBatman = new Book("The Batman", flash, 1993) ;
        Author boom = new Author("Jeffrey", "Boom") ;
        Book deadlyWeapons = new Book("Deadly weapons", boom, 1993) ;
        Author black = new Author("Shane", "Black") ;
        Book robocop = new Book("Robocop", black, 1995) ;
        System.out.println(airport);
        System.out.println(theBatman);
        System.out.println(deadlyWeapons);
        System.out.println(robocop);
    }
}