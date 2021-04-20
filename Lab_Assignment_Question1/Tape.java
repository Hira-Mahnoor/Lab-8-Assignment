
package Lab_Assignment_Question1;


public class Tape extends Publication {
    private int time;

    public Tape() {
    }

    public Tape(int time, String Title, int price) {
        super(Title, price);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    public void Display(){
        System.out.println("-----Tape----\nTitle: "+ getTitle()+"\n Price: "+ getPrice()+
                "\n Time in minutes: "+time );
    }
    
}
