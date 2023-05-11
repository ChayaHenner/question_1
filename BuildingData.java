import java.util.ArrayList;

import static java.lang.Math.abs;

public class BuildingData {
    private Building current_building;
    public static int current_building_no;
    private ArrayList<Building> buildings = new ArrayList<>();
    private boolean flag_done=false;


    public int getCurrent_building_no() {
        return current_building_no;
    }

    public boolean isFlag_done() {
        return flag_done;
    }

    public void add_building(int _current_building_no, int height, int length){
        current_building_no=_current_building_no;
        if (current_building_no==1)//rectangle
        { current_building = new RectangleBuilding(height, length);
            buildings.add(current_building);

            if (abs(height - length) > 5)
                System.out.println("the area of your building is" + ((RectangleBuilding) current_building).get_area());
            else System.out.println("the perimeter of your building is" + current_building.get_perimeter());

        }
        else if (current_building_no==2) {
            current_building = new TriangleBuilding(height, length);
            buildings.add(current_building);
            System.out.println("Enter 1 if you want to see your building's perimeter \n" +
                    "Enter 2 if you want to see your building printed");
        }
        else if (current_building_no==3)
            flag_done=true;

    }

    public void triangle_options(int option_tri)
    {
        if (option_tri == 1)
            System.out.println("the perimeter of your building is" + current_building.get_perimeter());
        else if (option_tri == 2)
            if(current_building.get_length()%2 == 0 || current_building.get_length() > 2*current_building.get_height())
                System.out.println("error:cannot print your  triangle building");
            else
                System.out.println("your building printed \n" + ((TriangleBuilding) current_building).get_printed());

    }
}

