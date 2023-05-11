import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int height, length, option_tri, option=0 ;
        BuildingData b = new BuildingData();
        System.out.println("Hi.here in Twitter we are collecting buildings and real estate data.");
        String error_msg="Wrong input! Input only integer numbers ";
        String option_msg = "Enter 1 if you want to enter details about a rectangle building\n" +
                "Enter 2 if you want to enter details about a triangle building\n" +
                "Enter 3 if you do not want to enter details about buildings.";
        while (!b.isFlag_done()) {

            System.out.println(option_msg);

            try {
                option = scan.nextInt();
            } catch (Exception e) {
                System.err.println(error_msg);
                break;
            }
            System.out.println("please enter height");
            try {
                height = scan.nextInt();
            } catch (Exception e) {
                System.err.println(error_msg);
                break;
            }

            System.out.println("please enter length");
            try {
                length = scan.nextInt();
            } catch (Exception e) {
                System.err.println(error_msg);
                break;
            }

            b.add_building(option, height, length);

            if (b.getCurrent_building_no() == 2)//is triangle
            {
                option_tri = scan.nextInt();
                b.triangle_options(option_tri);
            }

        }
    }
}
