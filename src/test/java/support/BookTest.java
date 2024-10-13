package support;

import java.io.IOException;

public class BookTest {
    public static void main(String[] args) throws IOException {
        Book harry = new HarryPotter("Harry Potter and doing your Taxes","J.K.Rowling");
        //System.out.println(harry.getContent());
        harry.displayBook();
        harry.rateBook();
        harry.rateBook(5);
        harry.rateBook(4, "It was nice");

        PrideNPrejudice pride = new PrideNPrejudice("Pride and Prejudice","Jane Austen",345);

        pride.readBook("src/test/resources/data/PrideAndPejudice.txt");
        pride.displayBook();
        pride.rateBook(4,"I recommend");

        //instance of DiaryOfWimpyKid
        DiaryOfAWimpyKid wimpkid = new DiaryOfAWimpyKid("Diary of a Wimpy Kid","Jeff Kinny",224);
        wimpkid.readBook("src/test/resources/data/DiaryOfAWimpyKid.txt");
        wimpkid.displayBook();
        wimpkid.rateBook(5,"Fun to read");

        //instance of JavaTheCompleteReference
        JavaTheCompleteReference javaRef = new JavaTheCompleteReference("Java: The Complete Reference","Herbert Schildt",1056);
        javaRef.readBook("src/test/resources/data/JavaTheCompleteReference.txt");
        javaRef.displayBook();
        javaRef.rateBook(4,"Good to learn");

        //calling borrowBook and returnBook methods
        harry.borrowBook();
        harry.returnBook();

        //bookmarkPage method calling
        harry.bookmarkPage(10);
        wimpkid.bookmarkPage(30);

        //resume reading
        harry.resumeReading();
        javaRef.resumeReading();

        //highlights page and notes methods call
        harry.highlightText(15,"This is nicely written");
        javaRef.writeNotesToPage(20,"Important topic in OOPs concept");

        //create instance of Ebook
        Ebook myBook = new Ebook("Java For Dummies","Barry Burd",512);

        //call displayBook method on ebook to show information about ebook
        myBook.displayBook();

        //call adjustFontsize method to adujust the font size of ebook
        myBook.adjustFontSize(18);

        //call followHyperlink method
        myBook.followHyperlink("https://www.learnjavaonline.org/");

        //display updated information of ebook
        myBook.displayBook();

    }
}
