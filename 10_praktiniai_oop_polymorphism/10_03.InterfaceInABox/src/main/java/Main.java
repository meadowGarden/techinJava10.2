
public class Main {

    public static void main(String[] args) {

        Book book01 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book02 = new Book("Robert Martin", "Clean Code", 1);
        Book book03 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd01 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd02 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd03 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book01);
        System.out.println(book02);
        System.out.println(book03);
        System.out.println(cd01);
        System.out.println(cd02);
        System.out.println(cd03);

        

    }

}
