public class Person {
    private String first, last;

    public Person (String f, String l){
      this.first = f;
      this.last = l;

    }
    // default first is Michael, last is Jackson
    public Person (){
      this("Michael", "Jackson");

    }
    //format: Last, First
    public String toString() {
      return String.format("%s, %s", this.first, this.last);

    }
    public boolean equals(Object other){
      if(other instanceof Person) {
        Person p = (Person) other;
        return this.first.equals(p.first) &&
          this.last.equals(p.last);
      }
      return false;



    }
    public int compareTo(Person p){
      //compare first then last name
      int i = this.first.compareTo(p.first);
      return (i != 0) ?
        i : this.last.compareTo(p.last); // not a tie, else - tie and chain compare
      // return 0;


    }
    public static void main (String [] args){
      System.out.println(">>start:");

      System.out.println(">>create p1 empty constructor");
      Person p1 = new Person();
      System.out.println(">>create p2 non-empty constructor");
      Person p2 = new Person("Rick", "Ross");
      System.out.println(">>create p2 = p3");
      Person p3 = p2;

      System.out.println(">>check toString p1");
      System.out.println(p1.toString());
      System.out.println(p2.toString());
      System.out.println(p3.toString());


      System.out.println(">>check equals p1 and p2: false");
      System.out.println(p1.equals(p2));

      System.out.println(">>check equals p2 and p3: true");
      System.out.println(p2.equals(p3));

      System.out.println(">>check compareTo p1 and p2: -1");
      System.out.println(p1.compareTo(p2));

      System.out.println(">>check compareTo p2 and p3: 0");
      System.out.println(p2.compareTo(p3));
    }
}
