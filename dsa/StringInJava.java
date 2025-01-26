package dsa;

public class StringInJava {
    public static void main(String[] args) {
        String name="Shreyash Gurav";
        String name2="   Aditya Gurav";
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name.equals(name2));
        System.out.println(name.substring(2,4));
        System.out.println(name.charAt(5));
        System.out.println(name.trim());
        System.out.println(name.length());
        System.out.println(name.startsWith("Sh"));
        System.out.println(name.endsWith("sh"));
        System.out.println(name.contains("h"));

    }
}
