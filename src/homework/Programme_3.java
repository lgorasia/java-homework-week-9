package homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 Write a Java program to reverse an array of integer values.
 */
public class Programme_3 {
    public static void main(String[] args) {
        // Creating ArrayList
        ArrayList<Integer>voterID = new ArrayList<>();

        //Adding voterID in ArrayList

        voterID.add(1111);
        voterID.add(2222);
        voterID.add(3333);
        voterID.add(4444);
        voterID.add(5555);
        voterID.add(6666);
        voterID.add(7777);
        voterID.add(8888);
        voterID.add(9999);

        //reversing the Array
        Collections.reverse(voterID);
        System.out.println(voterID);
    }
}
