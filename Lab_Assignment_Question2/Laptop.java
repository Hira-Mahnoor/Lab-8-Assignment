
package Lab_Assignment_Question2;


public class Laptop extends Computer {
    //Data Member
    private int length;
    private int width;
    private int height;
    private int weight;

    //Default Constructor
    public Laptop() {
    }

   public Laptop(int length, int width, int height, int weight, double wordSize, double memorySize, double Storagesize, double speed) {
        super(wordSize, memorySize, Storagesize, speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    
    public void display(){
        System.out.println(" Length: " + length + "\n Width: " + width + "\n Height: "+
                height + "\n Weight: "+ weight+
                super.toString());               //calling Computer String Method
    }
   
   
    
}
