//this class represents a building
public abstract class Building {
    private int _height, _length;

    public Building(int height,int length)
    {
        this._height=height;
        this._length=length;
    }

    public abstract int get_perimeter() ;

    public int get_height() {
        return _height;
    }

    public int get_length() {
        return _length;
    }

    public void set_height(int _height) {
        this._height = _height;
    }

    public void set_length(int _length) {
        this._length = _length;
    }
}

