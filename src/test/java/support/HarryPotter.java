package support;

import java.io.IOException;

public class HarryPotter extends Book{

    public HarryPotter(String title,String author) throws IOException {
        super.title = title;
        super.author = author;
        this.pageCount = 100;
        readBook("src/test/resources/data/HarryPotterAndTheSorcerersStone.txt");

    }
    @Override
    public void displayBook(){
        System.out.println(getContent());
    }

//    public void rateBook(){
//        System.out.println("You left no rating");
//    }
//
//    public void rateBook(int rating){
//        System.out.println("You left a rating: " + rating);
//    }
//
//    public void rateBook(int rating,String review){
//        System.out.println("You left a rating: " + rating);
//        System.out.println("Your review : " + review);
//    }

}
