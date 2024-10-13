package support;

public class PrideNPrejudice extends Book{


    public  PrideNPrejudice(String title,String author,int pageCount){
        super.title = title;
        super.author = author;
        super.pageCount = pageCount;

        //directly setting content
        setContent("It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.");
    }
    @Override
    public  void displayBook(){
        System.out.println(getContent());
    }


}
