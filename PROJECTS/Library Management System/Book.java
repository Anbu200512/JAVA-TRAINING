class Book extends Iteam{
    private String genre;

    Book(String title,String author,String genre ){
        super(title,author);
        this.genre = genre;
    }

    String getGenre(){
        return genre;
    }

    void Statement1(){
        System.out.println("Library Management System");
    }

     void BookDisplay(){
        IteamDisplay();
        System.out.println("Genre : "+ getGenre());
    }

    void Statement2(){
        System.out.println("return the Book within the due date");
    }

}