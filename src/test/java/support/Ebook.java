package support;

public class Ebook extends Book {
    private int fontSize = 10; //setting default font size

    public Ebook(String title,String author,int pageCount){
        super.title = title;
        super.author = author;
        super.pageCount = pageCount;
    }

    @Override
    public void displayBook() {
        System.out.println("E-Book: " + title + " by " +author);
        System.out.println("Total Pages: " + pageCount);
        System.out.println("Current Font size in the E-book: " + fontSize);
    }

    //create method for fontsize adjustment
    public void adjustFontSize(int newFont){
        if(newFont > 8 && newFont <= 30){
            fontSize = newFont;
            System.out.println("Font size is adjusted to : " + fontSize);
        }else{
            System.out.println("Please select the font between 8 and 30");
        }
    }

    //create a method for hyperlink in E-book
    public void followHyperlink(String url){
        System.out.println("Follow the link to learn more basics of Java: " + url);

    }
}
