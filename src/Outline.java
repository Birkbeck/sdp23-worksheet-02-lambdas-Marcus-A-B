import java.util.Arrays;

public class Outline {
  public static void main(String... args) { // varargs alternative to String[]
    Integer[] intArray = {1,7,3,4,8,2};
    System.out.println(Arrays.asList(intArray));
    // Arrays.sort(intArray,.......)

    String[] strArray = {"one", "two", "three", "four", "five", "once", "I", "caught", "a", "fish", "alive"};
    System.out.println("String array sorted shortest word first to longest");
    Arrays.sort(strArray, (a, b) -> Integer.compare(a.length(), b.length()));
    System.out.println(Arrays.asList(strArray));

    System.out.println("String array sorted longest word first to shortest");
    Arrays.sort(strArray, (a, b) -> Integer.compare(b.length(), a.length()));
    System.out.println(Arrays.asList(strArray));

    System.out.println("String array sorted alphabetically by first character");
    Arrays.sort(strArray, (a, b) -> Integer.compare(a.toLowerCase().charAt(0), b.toLowerCase().charAt(0)));
    System.out.println(Arrays.asList(strArray));

    System.out.println("String array sorted by words containing the letter e first using a lambda expression");
    Arrays.sort(strArray, (a, b) -> Boolean.compare(b.contains("e"), a.contains("e")));
    System.out.println(Arrays.asList(strArray));

    System.out.println("String array sorted by words containing the letter e first using a static method");
    Arrays.sort(strArray, (a, b) -> StringUtils.eChecker(a, b));
    System.out.println(Arrays.asList(strArray));

    String test1 = "This is a long string";
    String test2 = "Short string";

    System.out.println(StringUtils.betterString(test1, test2, (s1, s2) -> s1.length() > s2.length()));
    System.out.println(StringUtils.betterString(test1, test2, (s1, s2) -> true));

  }


}
