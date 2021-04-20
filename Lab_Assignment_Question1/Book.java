
package Lab_Assignment_Question1;

public class Book extends Publication {
    private int pageCount;

    public Book() {
    }

    public Book(int pageCount, String Title, int price) {
        super(Title, price);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    
    public void Display(){
        System.out.println("-----Book----\nTitle: "+ getTitle()+"\n Price: "+ getPrice()+
                "\n PageCount: "+ pageCount);
    }
    
}
