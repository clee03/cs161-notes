import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListPractice {
    public static void main (String [] args){
        ArrayList<String> funnyWords = new ArrayList<>();
        funnyWords.add("Blunderbuss");
        funnyWords.add("Collywobbles");
        funnyWords.add("Gobbledygook");
        funnyWords.add("Hobbledehoy");
        funnyWords.add("Hemidemisemiquaver");
        funnyWords.add("Smellfungus");

        System.out.println(">>Start:");
        // print funnyWords
        System.out.println(">>All:");
        for (String word : funnyWords) {
          System.out.println(word);
        }


        // get the 4th word in funnyWords
        System.out.println(">>4th: " + funnyWords.get(3));



        // add "Wabbit" to the end of funnyWords
        System.out.println(
          (funnyWords.add("Wabbit")) ?
            ">>Added Wabbit" : ">>Did Not Add Wabbit");



        // add "Nincompoop" to the beginning of funnyWords
        funnyWords.add(0, "Nincompoop");
        System.out.println(">>Word at idx 0: " + funnyWords.get(0));


        // remove any elements that have double b's (bb)
        for(int i = funnyWords.size() - 1; i > 0; i--) {
          String w = funnyWords.get(i);
          if(w.matches(".*bb.*")) {
            funnyWords.remove(i);
          }
        }

        System.out.println(">>Remove:");
        for (String word : funnyWords) {
          System.out.println(word);
        }

        // print the size of funnyWords
        System.out.println(">>Size: " + Integer.toString(funnyWords.size()));


        // turn funnyWords into a hashset
        System.out.println(">>Hashset:");
        HashSet<String> hashes = new HashSet<String>(funnyWords);
        // hashes = HashSet(funnyWords);
        for (String h : hashes) {
          // String h = word.hashCode();
          System.out.println(h.hashCode());
        }

        String a = funnyWords.get(0);
        int b = a.hashCode();
        System.out.println(Integer.toString(b));
    }

}
