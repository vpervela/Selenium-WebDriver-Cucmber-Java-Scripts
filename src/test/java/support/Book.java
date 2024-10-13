package support;

import groovy.util.ConfigObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public abstract class Book {
    public String title;
    public String author;
    public int pageCount;
    private String content;
    private boolean isBorrowed = false;
    private int lastPageRead = 0;

    public void readBook(String filePath) throws IOException {
        byte[] fileBytes = Files.readAllBytes(Paths.get(filePath));
        content = new String(fileBytes);
    }
    //abstract method can't have body
    public abstract void displayBook();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void rateBook(){
        System.out.println("You left no rating");
    }

    public void rateBook(int rating){
        System.out.println("You left a rating: " + rating);
    }

    public void rateBook(int rating,String review){
        System.out.println("You left a rating: " + rating);
        System.out.println("Your review : " + review);
    }

    //method to check if it is borrowed
    public void borrowBook(){
        if(!isBorrowed){
            isBorrowed = true;
            System.out.println("You have borrowed a book: " + title);
        }else{
            System.out.println("This book is already borrowed");
        }
    }

    //method to return book
    public void returnBook() {
        if (!isBorrowed) {
            System.out.println("The book " + title + "is already there");
        } else {
            System.out.println("Thank you for returning the book " + title);
        }
    }
    //method to bookmark the page
    public void bookmarkPage(int pageNumber){
        if(pageNumber>0 && pageNumber <= pageCount){
            lastPageRead = pageNumber;
            System.out.println("Your page " + pageNumber + " is bookmarked");
        }
        else{
            System.out.println("You didn't bookmarked your page");
        }
    }

    //method to resume reading from bookmark page
    public void resumeReading(){
        if(lastPageRead>0){
            System.out.println("Resume reading from " + lastPageRead + "...");
        }else{
            System.out.println("You have not bookmarked. Please start from beginning");
        }
    }

    //create methods for highlights and notes in page of book
    //initialize variable to hold page number along with highlights,notes
    private Map<Integer,String> textHighlighted = new HashMap<>();
    private Map<Integer,String> notes = new HashMap<>();

    //method for highlighttext
    public void highlightText(int pageNumber,String text){
        textHighlighted.put(pageNumber,text);
        System.out.println("Highlighted Text on page :" + pageNumber + "  : " + text);
    }

    //method for notes
    public void writeNotesToPage(int pageNumber,String text){
        notes.put(pageNumber,text);
        System.out.println("Page: " + pageNumber + "Notes -- " + text);
    }

    //method to display highlights and notes on page
    public void displayHighlightsAndNotes(){
        System.out.println("Highlighted Page and Notes : ");
        for(int page: textHighlighted.keySet()){
            System.out.println("Page: " + page + " Highlighted -- : " + textHighlighted.get(page));
            if(notes.containsKey(page)){
                System.out.println("Page : " + page + " Notes --: " + notes.get(page));
            }
        }
    }




    }

