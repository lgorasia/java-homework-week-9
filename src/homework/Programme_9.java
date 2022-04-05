package homework;

import java.util.HashMap;
import java.util.Map;

/*
Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.

 */
public class Programme_9 {
    public static void main(String[] args) {

        // Creating the map
        Map<String,Integer> list = new HashMap<>();
        list.put("Lalit", 01);
        list.put("Ronaldo", 2);
        list.put("Purvi", 3);
        list.put("Shital", 4);
        list.put("Hardik", 5);
        list.put("Sanket", 6);

        for(Map.Entry<String,Integer>studentList:list.entrySet()){
            System.out.println(studentList);
        }
    }

}
