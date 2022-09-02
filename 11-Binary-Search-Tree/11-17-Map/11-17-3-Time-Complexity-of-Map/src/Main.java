import java.util.ArrayList;

public class Main {
    private static double testSet(Map<String, Integer> map, String filename) {
        long startTime = System.nanoTime();
        System.out.println(filename);
        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile(filename, words)) {
            System.out.println("Total words: " + words.size());
            for (String word : words) {
                if (map.contains(word))
                    map.set(word, map.get(word) + 1);
                else
                    map.add(word, 1);
            }
            System.out.println("Total different words: " + map.getSize());
            System.out.println("Frequency of PRIDE: " + map.get("pride"));
            System.out.println("Frequency of PREJUDICE: " + map.get("prejudice"));
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
        String filename = "11-Binary-Search-Tree/11-17-Map/11-17-3-Time-Complexity-of-Map/src/text/pride-and-prejudice.txt";
        BSTMap<String, Integer> bstMap = new BSTMap<>();
        double time1 = testSet(bstMap, filename);
        System.out.println("BST Map: " + time1 + " s");
        System.out.println();
        LinkedListMap<String, Integer> linkedListMap = new LinkedListMap();
        double time2 = testSet(linkedListMap, filename);
        System.out.println("Linked List Map: " + time2 + " s");
    }
}
