package CaseStudy_oops;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* no need to import, since, it is on the same level */
        System.out.println("Entering the test case !");
        for (String setType : Arrays.asList("HashSet", "TreeSet", "ConcurrentHashSet")) {
            var set = makeSet(setType); // var is inferred to be SimpleAbstractSet<String>
            testAdd(set);
            testContains(set);
            testIterator(set);
        }
        System.out.println("Exiting the test case !");
    }

    /* Factory method that creates designated set type */
    private static SimpleAbstractSet<String> makeSet(String setType) throws UnsupportedOperationException {
        return switch (setType) {
            case "HashSet" -> new SimpleHashSet<>();
            case "TreeSet" -> new SimpleTreeSet<>();
            case "ConcurrentHashSet" -> new SimpleConcurrentHashSet<>();
            default -> throw new UnsupportedOperationException("Unknown set type: " + setType);
        };
    }

    /* testing the methods created */
    private static void testIterator(SimpleAbstractSet<String> set) {
        for (String s : set)
            System.out.println("Item = " + s);
    }

    private static void testAdd(SimpleAbstractSet<String> set) {
        assert (set.add("I")
        && set.add("am")
        && set.add("Ironman")); // should return true because they are not present

        assert (!set.add("Ironman")); // should return false because it is already present
    }

    private static void testContains(SimpleAbstractSet<String> set) {
        assert (set.contains("I")
        && set.contains("am")
        && set.contains("Ironman")); // should return true because they are present

        assert (!set.contains("Spiderman")); // should return false because it is not present
    }
}
