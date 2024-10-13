package support;

public class JavaTheCompleteReference extends Book {
    @Override
    public void displayBook() {
        System.out.println(getContent());

    }
    public JavaTheCompleteReference(String title,String author,int pageCount){
        super.title = title;
        super.author = author;
        super.pageCount = pageCount;
    }
}
