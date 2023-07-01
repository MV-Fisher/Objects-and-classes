public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Lev", "Tolstoy") ;
        Book warAndPeace = new Book("War and Peace" , tolstoy, 1857) ;
        System.out.println("Книга : " + warAndPeace.getTileBook() + " опупликована " + "в " +
                warAndPeace.getPublicationYear() + " году. Автор : " +
                warAndPeace.getAuthor().getFirstName() +  " " +
                warAndPeace.getAuthor().getLastName());
        Author hayley = new Author("Arthur", "Hayley") ;
        Book airport = new Book("Airport", hayley, 1992) ;
        Author flash = new Author("Bill", "Flash") ;
        Book theBatman = new Book("The Batman", flash, 1993) ;
        Author boom = new Author("Jeffrey", "Boom") ;
        Book deadlyWeapons = new Book("Deadly weapons", boom, 1993) ;
        Author black = new Author("Shane", "Black") ;
        Book robocop = new Book("Robocop", black, 1995) ;
        Author gorbylev = new Author("Alexey" , "Gorbylev");
        Book way = new Book("The Path of the Invisible", gorbylev, 2002);
        Author coelho = new Author("Paulo", "Coelho");
        Book fifth = new Book("The fifth Mountain" , coelho , 2002);
        Author gogol = new Author("Nikolay" , "Gogol");
        Book theDead = new Book("Dead souls" , gogol , 1967);
        Author dostoevsky = new Author("Fedor" , "Dostoevsky");
        Book crime = new Book("Crime and punishment" , dostoevsky , 1993);
        Author kaverin = new Author("Benjamin" , "Kaverin");
        Book captain = new Book("Two captains" , kaverin , 1973);
        System.out.println(warAndPeace);
        warAndPeace.setPublicationYear(1860);
        System.out.println("Книга преиздана в " + warAndPeace.getPublicationYear() + " году.");
        System.out.println(airport);
        System.out.println(theBatman);
        System.out.println(deadlyWeapons);
        System.out.println(robocop);
        System.out.println(way);
        System.out.println(fifth);
        System.out.println(theDead);
        System.out.println(crime);
        System.out.println(captain);
        System.out.println("Тестирование метода equals.");
        Author author = new Author("Benjamin" , "Kaverin");
        Book book = new Book("Two captains" , author , 1973);
        System.out.println(book.equals(captain));
        System.out.println(captain.hashCode());
    }
}
// Домашнее задание Методы объектов с првкой метода equals.