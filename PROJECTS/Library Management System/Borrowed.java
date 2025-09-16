class Borrowed extends Book{
    private String borrower_Name ;
    private String dueDate ;

    public Borrowed(String title,String author,String genre,String borrower_Name,String dueDate) {
        super(title,author,genre);
        this.borrower_Name = borrower_Name;
        this.dueDate =  dueDate;
    }

    String getborrower_Name(){
        return borrower_Name;
    }

    String getdueDate(){
        return dueDate;
    }

    void BorrowedDisplay(){
        BookDisplay();
        System.out.println("Borrower Name : "+getborrower_Name());
        System.out.println("Due Date : "+getdueDate());
    } 
    


}