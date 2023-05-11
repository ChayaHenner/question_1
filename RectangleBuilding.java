public class RectangleBuilding extends Building{
    public RectangleBuilding(int height,int length)
    {
        _height=height;
        _length=length;
    }

    @Override
    public int get_perimeter() {
        return _height*2+_length*2;//!!
    }

    public int get_area() {
        return _height*_length;//!!
    }
}
