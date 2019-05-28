public class Rectangle {
    double width;
    double length;

    public Rectangle(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else if (length < 0) {
            this.length = 0;
        } else if (width > 0 && length > 0) {
            this.width = width;
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        double result = width * length;
        return result;
    }
}

class Cuboid extends Rectangle {
      double height;
    public Cuboid(double width, double length,double height) {
        super(width, length);
        if(height<0)
        {
            this.height=0;
        }
        else{
            this.height=height;
        }
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        double res=(width*length)*height;
        return res;
    }
    public static void main(String[] args){
        Rectangle rectangle=new Rectangle(5,10);
        System.out.println("rectangle.width= "+ rectangle.getWidth());
        System.out.println("rectangle.length= "+ rectangle.getLength());
        System.out.println("rectangle.area= "+ rectangle.getArea());
        Cuboid cuboid=new Cuboid(5,10,5);
        System.out.println("cuboid.width= "+ cuboid.getWidth());
        System.out.println("cuboid.length= "+ cuboid.getLength());
        System.out.println("cuboid.area= "+ cuboid.getArea());
        System.out.println("cuboid.height= "+ cuboid.getHeight());
        System.out.println("cuboid.volume= "+ cuboid.getVolume());
    }
}

