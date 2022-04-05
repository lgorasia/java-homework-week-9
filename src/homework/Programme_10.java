package homework;

import java.util.HashMap;
import java.util.Scanner;

public class Programme_10{
    public static void main(String[] args) {
        main();
    }

    public static void main(){
        char result;
        System.out.println("London Underground Zone1 Stations:");


        HashMap<String,String> zone = new HashMap<>();
        zone.put("Jubilee Line", "Baker Street ,Bond Street ,Green Park,London Bridge,Southwark,Waterloo,Westminster");
        zone.put("Baker Street", " ,Bond Street ,Green Park,London Bridge,Southwark,Waterloo,Westminster");
        zone.put("Bond Street", "Bond Street ,Green Park,London Bridge,Southwark,Waterloo,Westminster");

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any station name:");
            String stationName = scanner.nextLine();


            for (String str : zone.keySet()) {
                if (stationName.equals(str)) {

                    System.out.println("Tube Lines:" + zone.get(str));
                }
            }

            System.out.println(" ");
            System.out.println("Do you want to try again 'Y' or 'N':");
            result = scanner.next().charAt(0);
        } while (result == 'Y' || result == 'y');



    }


}
