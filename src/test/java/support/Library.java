package support;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

public class Library {
    private HashMap<Integer,Book> collection;

    //constructor
    public Library(){
        this.collection = new HashMap<>();
    }

    //create methods to add,remove,read books and display library

    public void addBook(int id,Book b) throws IOException{
        collection.put(id,b);


    }

    public void removeBook(int id){
        collection.remove(id);

    }
    //overloaded to handle removing by value
    public void removeBook(Book b){
        collection.values().remove(b);

    }

    public String readBook(int id){
        return collection.get(id).getContent();

    }

    public Collection<Book> displayLibrary(){
        return collection.values();

    }



    public static void main(String[] args) throws IOException {
        Library myLib = new Library();
        myLib.addBook(231,new PrideNPrejudice("Pride and Prejudice","Jane Austen",345));
        System.out.println(myLib.readBook(231));
        System.out.println(myLib.displayLibrary());

    }
}
