public class TriangleBuilding extends Building {
    public TriangleBuilding(int height, int length) {
        super(height,length);
    }

    @Override
    public int get_perimeter() {

        return (int) (2*Math.sqrt(Math.pow(get_height(),2)+Math.pow(get_length()/2,2) ) + get_length());
    }

    public String get_printed() {
        String triangle = "";
        if(get_length()==3)
        {
            for (int j = 0; j < get_height()-1; j++)
                triangle += make_line(1);
            triangle += make_line(3);
        }
        else {
            int remnant = (get_height() - 2) % ((get_length() / 2) - 1);

            if (get_length() < 2 * get_height()) {
                triangle += make_line(1);

                for (int j = 0; j < remnant; j++)
                    triangle += make_line(3);

                for (int i = 3; i < get_length() - 1; i += 2)
                    for (int j = 0; j < (get_height() - 2) / ((get_length() / 2) - 1); j++)
                        triangle += make_line(i);

                triangle += make_line(get_length());
            }
        }
            return triangle;

    }

//a private method that gets a number of stars a line should have and returns a
    private String make_line(int stars_num)
    {
        String s="";
        for (int i=0;i<(get_length()-stars_num)/2;i++)//will add correct empty spaces to line so that the stars are centered
            s+=" ";
        for (int i=0;i<stars_num;i++)//add the correct amount of stars to line
            s+="*";
        return s+"\n";
    }
}
