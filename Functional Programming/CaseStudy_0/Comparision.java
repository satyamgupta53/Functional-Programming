package CaseStudy_0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Comparision {

    /* 
     * create a function which inputs a list of Strings & omit a particular String
     * returns the list with String except omit 
    */

    /* this is using accumulator anti-pattern */ 
    static List<String> imperativeZap(List<String> lines, String omit) {
        List<String> result = new ArrayList<>();
        for (String line: lines) 
            if (!line.contains(omit))
                result.add(line);
        return result;
    }

    static List<String> functionalZap(List<String> lines, String omit) {
        return lines.stream() // convert list to streams
            .filter(line -> !line.contains(omit)) // filter out the lines which contains omit .filter(not(omit::equals))
            .collect(Collectors.toList()); // collect the stream to list
    }
}