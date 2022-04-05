package homework;

import java.util.ArrayList;

public class Programme_7 {
    public static void main(String[] args) {

        // Declaration of Arraylist
        ArrayList<String> tubeName = new ArrayList<>();

        //  Adding tube line in Arraylist
        tubeName.add("Circle Line");
        tubeName.add("Central Line");
        tubeName.add("Piccadaly Line");
        tubeName.add("Jubily Line");
        tubeName.add("Metrollitan Line");
        tubeName.add("Hammersmith and city Line");

        //Checking if ArrayList is empty or not

            System.out.println(tubeName.isEmpty());

        }
    }
