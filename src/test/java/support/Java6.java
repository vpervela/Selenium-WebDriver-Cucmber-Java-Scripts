package support;

import io.cucumber.cucumberexpressions.PatternCompiler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java6 {
    public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList<>();
        array1.add("John");
        array1.add("Peter");

//        String base = "User";
//       ArrayList<String> users = new ArrayList<>();
        for (String s : array1) {
            System.out.println(s);
        }
      //hashmaps
        HashMap<String,String> cars = new HashMap<>();
        cars.put("Civic","Honda");
        cars.put("Rav4","Toyota");
        cars.put("Y","Tesla");
        cars.put("Odessy","Honda");

        System.out.println(cars);
        //System.out.println(cars.get("Honda"));

        System.out.println(cars.get("Odessy"));

        String regex = "^a-z";
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

        String rightEmail = "test@test.com";
        String wrongEmail = "test.com";

        //Pattern pat =  Pattern.compile(regex);
        Pattern pattern = Pattern.compile(emailPattern);

        //compare this pattern match with given string
        Matcher matcher1 = pattern.matcher(rightEmail);
        Matcher matcher2 = pattern.matcher(wrongEmail);

        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());






    }
}
