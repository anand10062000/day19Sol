package day19Solproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean checkValidation(String reg,String input) {
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

}