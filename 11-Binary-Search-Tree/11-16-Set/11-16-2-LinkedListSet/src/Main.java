import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pride and Prejudice");
        ArrayList<String> words1 = new ArrayList<>();
        LinkedListSet<String> set1 = new LinkedListSet<>();
        if (FileOperation.readFile("11-Binary-Search-Tree/11-16-Set/11-16-1-BSTSet/src/text/pride-and-prejudice.txt", words1)) {
            System.out.println("Total words: " + words1.size());
            for (String word : words1)
                set1.add(word);
            System.out.println("Total different words: " + set1.getSize());
        }
        System.out.println();
        System.out.println("A Tale of Two Cities");
        ArrayList<String> words2 = new ArrayList<>();
        LinkedListSet<String> set2 = new LinkedListSet<>();
        if (FileOperation.readFile("11-Binary-Search-Tree/11-16-Set/11-16-1-BSTSet/src/text/a-tale-of-two-cities.txt", words2)) {
            System.out.println("Total words: " + words2.size());
            for (String word : words2)
                set2.add(word);
            System.out.println("Total different words: " + set2.getSize());
        }
    }
}
