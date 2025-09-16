abstract class Iteam{
    private String title ;
    private String author;

    Iteam(String title,String author){
        this.title = title;
        this.author = author;
    }

    String getTitle(){
        return title;
    }
    String getAuthor(){
        return author;
    }

    void IteamDisplay(){
        System.out.println("Title : "+getTitle());
        System.out.println("Author : "+getAuthor());
    }
    abstract void Statement1();
    abstract void Statement2();

}