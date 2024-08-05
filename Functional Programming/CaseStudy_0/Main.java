package CaseStudy_0;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("Mary", "had", "a", "little", "lamb", "also", "a", "little", "goat");
        
        /* imperative or object oriented programming */
        System.out.println(Comparision.imperativeZap(lines, "little"));
        System.out.println(Comparision.imperativeZap(lines, "little"));
    }
}
