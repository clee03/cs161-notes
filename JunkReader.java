import java.util.Scanner;
import java.io.File;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;
import java.util.Iterator;


public class JunkReader implements Iterator<String>{
  private Scanner sc;
  private String nextLine = null;

  public JunkReader (String filename) throws FileNotFoundException {
    try {
      sc = new Scanner (new File (filename));
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
  }

  public boolean hasNext () {
    //end of file
    if(!sc.hasNextLine()) {
      return false;
    }
    //item potent, doesnt change it by calling it again, item should change if
    //called multiple times
    if(nextLine != null) {
      return true;
    }

    //make sure it's not a "junk line"
    nextLine = sc.nextLine();

    //you can refractor to pass in a regex and use this function for something else
    if(nextLine.matches("-----.*-----")){
      //flagged some how, here is null
      nextLine = null;
      //recursion, matches then callback to same method
      return hasNext();
    } else {
      return true;
    }
  }

  public String next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    String t = nextLine;
    nextLine = null;
    return t;
  }

  public void remove () {
    throw new UnsupportedOperationException();
  }
}
