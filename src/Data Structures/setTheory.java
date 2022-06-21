import java.util.*;

public class setTheory {
    public static void main(String[] args) {

        List <Integer> arrA = new ArrayList<>
                (Arrays.asList(49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34));
        List <Integer> arrB = new ArrayList<>
                (Arrays.asList(39, 33, 38, 14, 4, 32, 40, 25, 17, 46, 35, 6, 2, 12, 49));
        List <Integer> arrC = new ArrayList<>
                (Arrays.asList(41, 12, 5, 35, 42, 28, 47, 20, 26, 24, 50, 40, 14, 17, 10));

        System.out.println("UnionList:\nAuBuC: "+ union(union(arrA,arrB),arrC));
        System.out.println("IntersectionList: \nAnB: " + intersection(arrA,arrB) +"\nBnC: " + intersection(arrB,arrC) +
                           "\nAnC: " + intersection(arrA,arrC));
        System.out.println("DifferenceList:\nA\\B: " + difference(arrA,arrB) + "\nA\\C: " + difference(arrA,arrC) +
                           "\nB\\A: "+ difference(arrB,arrA) + "\nB\\C: " + difference(arrB,arrC) +
                           "\nC\\A: "+ difference(arrC,arrA) + "\nC\\B: " + difference(arrC,arrB));
        System.out.println("Union with IntersectionList:\nAu(BnC): " + union(arrA,intersection(arrB,arrC)) +
                           "\nBu(AnC): "+ union(arrB,intersection(arrA,arrC)) +
                           "\nCu(AnB): " + union(arrC,intersection(arrA,arrB)));
    }
    public static List<Integer> union(List<Integer> list, List<Integer> listAdd) {
        Set<Integer> unionList = new HashSet<>(list);

        unionList.addAll(listAdd);

        return new ArrayList<>(unionList);
    }
    public static List<Integer> intersection(List<Integer> list, List<Integer> listCompare) {
        Set<Integer> intersectionList = new HashSet<>();

        for(Integer i: list) {
            if(listCompare.contains(i)) {
                intersectionList.add(i);
            }
        }
    return new ArrayList<>(intersectionList);
    }
    public static List<Integer> difference(List<Integer> list, List<Integer> listCompare) {
        Set<Integer> differenceList = new HashSet<>();

        for(Integer i: list) {
            if (listCompare.contains(i)){
            } else {
                differenceList.add(i);
            }
        }
        return new ArrayList<>(differenceList);
    }
}
