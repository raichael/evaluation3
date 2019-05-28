public class Floor
{
    public double width;
    public double length;

    public Floor(double width, double length)
    {
        if (width < 0) {
            this.width = 0;
        } else if (length < 0) {
            this.length = 0;
        } else if (width > 0 && length > 0)
        {
            this.width = width;
            this.length = length;
        }
    }


    public double getArea()
    {
        double result = width * length;
        return result;
    }

}



