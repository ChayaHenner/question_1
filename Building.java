//this class represents a building
public abstract class Building {
    protected int _height, _length;
    public abstract int get_perimeter() ;

    public int get_height() {
        return _height;
    }

    public int get_length() {
        return _length;
    }
}
