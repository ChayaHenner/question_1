public class RectangleBuilding extends Building{
    public RectangleBuilding(int height,int length)
    {
        super(height,length);
    }

    @Override
    public int get_perimeter() {
        return get_height()*2+get_length()*2;
    }

    public int get_area() {
        return get_height()*get_length();
    }
}
