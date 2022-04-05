package homework;

import java.util.ArrayList;

public class Programme_6 {
    public static void main(String[] args) {

        //Declaration of ArrayList

        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Java");
        nameList.add("Postman");
        nameList.add("Jira");
        nameList.add("Cucumber");
        nameList.add("Selenium");

// Printing name at index position 2
        System.out.println(nameList.get(2));


    }
}
