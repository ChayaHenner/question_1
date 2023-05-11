public class TriangleBuilding extends Building {
    public TriangleBuilding(int height, int length) {
        _height = height;
        _length = length;
    }

    @Override
    public int get_perimeter() {

        return _height * 2 + _length * 2;//!!
    }

    public String get_printed() {
        String triangle = "";
        //int stars_num=3;
        int remnant = (_height - 2) % ((_length / 2) - 1);

        if (_length < 2 * _height) {
            triangle += make_line(1);

            for (int j = 0; j < remnant; j++)
                triangle += make_line(3);

            for (int i = 3; i < _length - 1; i += 2)
                for (int j = 0; j < (_height - 2) / ((_length / 2) - 1); j++)
                    triangle += make_line(i);

            triangle += make_line(_length);
        }
            return triangle;

    }

//a private method that gets a number of stars a line should have and returns a
    private String make_line(int stars_num)
    {
        String s="";
        for (int i=0;i<(_length-stars_num)/2;i++)//will add correct empty spaces to line so that the stars are centered
            s+=" ";
        for (int i=0;i<stars_num;i++)//add the correct amount of stars to line
            s+="*";
        return s+"\n";
    }
}
