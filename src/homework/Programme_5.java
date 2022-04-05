package homework;

import java.util.ArrayList;

/*
Write a Java program to iterate through all elements in an array list using
Iterator.
 */
public class Programme_5 {
    public static void main(String[] args) {

        // declaration of ArrayList
        ArrayList<Integer> empID = new ArrayList<>();

        //Adding employye ID in arrayList
        empID.add(101);
        empID.add(102);
        empID.add(103);
        empID.add(104);
        empID.add(105);
        empID.add(106);

        //Iterate all element using iterator
        for(Integer id :empID){
            System.out.println(id);
        }
    }
}
