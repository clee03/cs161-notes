public class Box {
    private int length, area, perimeter;

    // use the area() method to assign the area instance variable
    // use the perimeter() method to assign the perimeter instance variable
    public Box (int length){




    }
    // default length is 0
    public Box(){




    }
    public static int area(int length) {


    }
    public static int perimeter(int length) {


    }
    // format: length: 10, area: 100, parameter: 40
    public String toString() {



    }
    public boolean equals (Object other){


    }
    public int compareTo (Box b){




    }
    public static void main (String [] args){
      System.out.println(">>start:");

      System.out.println(">>create p1 empty constructor");
      Box p1 = new Box();
      System.out.println(">>create p2 non-empty constructor");
      Box p2 = new Box("Rick", "Ross");
      System.out.println(">>create p2 = p3");
      Box p3 = p2;

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
