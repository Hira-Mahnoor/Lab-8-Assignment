
package Lab_Assignment_Question1;


public class Publication {
    private String Title;
    private int price;

    public Publication() {
    }

    public Publication(String Title, int price) {
        this.Title = Title;
        this.price = price;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
   
    
}
