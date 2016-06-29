import java.util.Iterator;
import java.util.Map;
//allocates big array, take obj hashable (ask for hashcode)
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


public class WordFrequencyCounter {
  //use interface and genercize
  private Map <String, Integer> counter = new HashMap<String, Integer>();

  //no constructor == calls super and uses dummy automatically
  // public WordFrequencyCounter {
  //
  // }

  public void count(String s) {
    Integer i = counter.get(s);
    if (i == null) {
      counter.put(s, 1);
    } else {
      counter.put(s, i+1);
    }
  }

  public void countAll(Iterator<String> iter) {
    //like scanner pattern, exhaust the scanner
    while(iter.hasNext()) {
      count(iter.next());
    }
  }

  public static void main (String [] args) {
    System.out.println("hello, world");

    WordFrequencyCounter wc = new WordFrequencyCounter();

    //how add words? scanner? don't know, make it an iterator
    //write the method

    // wc.addAll("hello", 2);
    // System.out.println(wc.counter);

    //how do you test? load up arraylist
    //import
    wc.count("hello");
    wc.count("hello");

    List<String> l = new ArrayList<String>();
    l.add("cat");
    l.add("cat");
    l.add("dog");
    l.add("mouse");

    wc.countAll(l.iterator());
    System.out.println(wc.counter);

    System.out.println("junk reader");
    Iterator<String> iter = new Iterator<String>("wordsjunk.txt");


  }
}
