public class StringUtils {
    public static int eChecker(String s1, String s2){
        if(s1.contains("e") && !s2.contains("e"))
            return -1;
        if(!s1.contains("e") && s2.contains("e"))
            return 1;
        return 0;
    }

    public static <lambda> String betterString(String s1, String s2, TwoStringPredicate comp){
        return comp.isBetter(s1, s2) ? s1 : s2;
    }

    interface TwoStringPredicate{
        boolean isBetter(String a, String b);
    }
}
