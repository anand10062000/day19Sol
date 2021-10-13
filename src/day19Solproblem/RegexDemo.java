package day19Solproblem;

public class RegexDemo {
    public static final String FirstName="^[A-Z]{1}[A-Za-z]{3,}$";
    public static final String LastName="^[A-Z]{1}[A-Za-z]{3,}$";
    public static final String Phone="^[+0-9]{2,5}([ ]{1}[0-9]{10})$";
    public static final String Email="^[a-z.]+@[a-z]\\.{1}[a-z]{2,}[.a-z]?$";
    public static final String Password="^([0-9]+[A-Z]+[!@#$%&*]{1}){8,}$";

}
