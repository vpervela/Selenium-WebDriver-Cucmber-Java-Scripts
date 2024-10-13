package support;

public class DiaryOfAWimpyKid  extends Book{
    @Override
    public void displayBook() {
        System.out.println(getContent());
    }

    public DiaryOfAWimpyKid(String title,String author,int pageCount){
        super.title = title;
        super.author = author;
        super.pageCount = pageCount;
    }
}
