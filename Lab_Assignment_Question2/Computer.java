
package Lab_Assignment_Question2;

public class Computer {
    protected double wordSize;
    protected double memorySize;
    protected double Storagesize;
    protected double speed;

    public Computer() {
    }

    public Computer(double wordSize, double memorySize, double Storagesize, double speed) {
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.Storagesize = Storagesize;
        this.speed = speed;
    }

    public String toString() {
        return "\n wordSize(in bits)= " + wordSize + "\n Memory Size= " + memorySize+" MB" + "\n Storage Size="
                + Storagesize +" MB" + "\n speed=" + speed+" MHz";
    }
    
    
}
