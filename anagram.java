import java.util.*;

public class anagram {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("wrong number of arguments");
            return;
        }
        String country = args[0];

        System.out.println(getCountry(country));
    }

    public static String getCountry(String str){
        HashMap<String, String> code_country = new HashMap<>();
        HashMap<String, String> country_code = new HashMap<>();

        // trial with few country

        code_country.put("BGD", "Bangladesh");
        country_code.put("Bangladesh", "BGD");
        code_country.put("USA", "United States of America");
        code_country.put("CHN", "China");
        country_code.put("China", "CHN");


        if(str.length() < 3) {
            // invalid code
            return "country name or code must be at least 3 characters";
        }
        else if (str.length() == 3) {
            // return country name
            if(code_country.containsKey(str))
                return code_country.get(str);
            return "country code not valid";
        }
        else {
            // return country code
            if (country_code.containsKey(str))
                return country_code.get(str);
            return "country name not valid";
        }
    }
}