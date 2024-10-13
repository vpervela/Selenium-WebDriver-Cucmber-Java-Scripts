package support;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HashMapEmail {
    public static HashMap<String,Boolean> emailValidator(ArrayList<String> arrayList){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
        //we can do the above using hashmap
        HashMap<String,Boolean> res = new HashMap<>();
        //for each loop to go thorugh arraylist
        for(String arr : arrayList){
            Matcher matcher = pattern.matcher(arr);
            res.put(arr,matcher.matches());

        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<String> emails = new ArrayList<>();
        emails.add("test@test.com");
        emails.add("test.com");

        HashMap<String,Boolean> validEmailRes = emailValidator(emails);
        System.out.println(validEmailRes);

    }
}
