
import java.awt.image.RescaleOp;

interface Shapes{
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Resizable implements Shapes{
    private int width;
    private int height;
    public Resizable(int width,int height){
        this.width = width;
        this.height = height;
    }
    public void resizeWidth(int width){
        this.width = width;
    }
    public void resizeHeight(int height){
        this.height = height;

    }
    public void printSize(){
        System.out.println("Width: "+width+ "Height: "+height);
    }
}
public class Rectangle {
    public static void main(String[] args) {
     Resizable obj = new Resizable(100 ,  150);
     obj.printSize();
     obj.resizeWidth(190 );
        obj.resizeHeight(200);
    obj.printSize();
    }
}
