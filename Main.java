import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Building current_building;
        boolean flag_done=false;
        //TriangleBuilding current_triangle;
        int   height, width, option_tri,option=0;
        String option_msg = "Enter 1 if you want to enter details about a rectangle building\n" +
                "Enter 2 if you want to enter details about a triangle building\n" +
                "Enter 3 if you do not want to enter details about buildings.";
        ArrayList<Building> buildings = new ArrayList<Building>();

        System.out.println("Hi.here in Twitter we are collecting buildings and real estate data.");

        while (!flag_done)

        {
            System.out.println(option_msg);
            option = scan.nextInt();

            switch (option) {

                case 1://rectangle building
                    System.out.println("please enter height");
                    height = scan.nextInt();
                    System.out.println("please enter width");
                    width = scan.nextInt();
                    current_building = new RectangleBuilding(height, width);
                    buildings.add(current_building);
                    if (abs(height - width) > 5)
                        System.out.println("the area of your building is" + ((RectangleBuilding) current_building).get_area());
                    else System.out.println("the perimeter of your building is" + current_building.get_perimeter());
                    break;
                case 2://triangle building
                    System.out.println("please enter height");
                    height = scan.nextInt();
                    System.out.println("please enter width");
                    width = scan.nextInt();
                    current_building = new TriangleBuilding(height, width);
                    buildings.add(current_building);
                    System.out.println("Enter 1 if you want to see your building's perimeter \n" +
                            "Enter 2 if you want to see your building printed");
                    option_tri = scan.nextInt();
                    if (option_tri == 1)
                        System.out.println("the perimeter of your building is" + current_building.get_perimeter());
                    else if (option_tri == 2)
                        if(current_building.get_length()%2 == 0 || current_building.get_length() > 2*current_building.get_height())
                            System.out.println("error:cannot print your  triangle building");
                        else
                             System.out.println("your building printed \n" + ((TriangleBuilding) current_building).get_printed());

                    break;
                case 3:
                    flag_done=true;;
                    break;

            }


        }
    }
}