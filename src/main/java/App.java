import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
 *           "Paint Calculator" output
 *You will need to purchase 2 gallons of paint to cover 360 square feet.
 */
public class App
{
    static Scanner in = new Scanner(System.in);
    static double areaToGallons = 1 / 350.0;

    public static void main(String[] args)
    {
        App myApp = new App();

        System.out.print("What is the length of the room in feet? ");
        int length = in.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int width = in.nextInt();

        double area = length * width;

        System.out.printf("You will need to purchase %.0f gallons of paint to cover %d square feet.\n", myApp.minimumGallons(area), length * width);
    }

    private static double minimumGallons(double area)
    {
        double leftover = (area * areaToGallons) % 1;
        if(leftover != 0)
            return (area * areaToGallons) - ((area * areaToGallons) % 1) + 1;
        else
            return area * areaToGallons;

    }
}