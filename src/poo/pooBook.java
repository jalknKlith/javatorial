package poo;
import classOnes.Book;

public class pooBook {
    public static void main(String[] args) {
        // Book 1, Adding values
        Book poorDadRichDad;
        poorDadRichDad = new Book();
        poorDadRichDad.setId(34923);
        poorDadRichDad.setTitle("Poor Dad Rich Dad");
        poorDadRichDad.setWriter("Robert Kiyosaki");
        poorDadRichDad.setPages(208);
        // Book 2, Adding values
        Book theKybalion;
        theKybalion = new Book();
        theKybalion.setId(561101);
        theKybalion.setTitle("The Kybalion");
        theKybalion.setWriter("Hermes Trismegistus");
        theKybalion.setPages(36);
        // Printing the values.
        System.out.println("-----------------------------------");
        poorDadRichDad.showBook();
        System.out.println("-----------------------------------");
        theKybalion.showBook();
        System.out.println("-----------------------------------");
        System.out.println(poorDadRichDad.compareBooks(poorDadRichDad,theKybalion));
        System.out.println("-----------------------------------");
    }
}
