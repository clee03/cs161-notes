
public class Music {
    private String title, artist, album;
    private int year;
    public Music (String title, String artist, String album, int year){
      this.title = title;
      this.artist = artist;
      this.album = album;
      this.year = year;



    }
    // by default assign the title to "Barbie Girl", artist to "Aqua", album to Aquarium, year to 1997
    public Music(){
      this("Barbie Girl", "Aqua", "Aquarium", 1997);



    }
    // format: Title: Oops! I did it again, Artist: Britney Spears, Album: Oops! I did it again, Year: 2000
    public String toString() {
      return String.format("Title: %s, Artist: %s, Album: %s, Year: %d",
        this.title,
        this.artist,
        this.album,
        this.year
      );


    }
    public boolean equals (Object other){
      if (other instanceof Music) {
        Music m = (Music) other;
        return this.title.equals(m.title) &&
          this.artist.equals(m.artist) &&
          this.album.equals(m.album) &&
          this.year == m.year;
      }
      return false;




    }
    public int compareTo(Music m){
      int i = this.title.compareTo(m.title);
      if (i != 0) {
        return i;
      } else {
        i = this.artist.compareTo(m.artist);
        if (i != 0) {
          return i;
        } else {
          i = this.album.compareTo(m.album);
          if (i != 0) {
            return i;
          } else {
            i = Integer.compare(this.year, m.year);
            if (i != 0) {
              return i;
            } else {
              return 0;
            }
          }
        }
      }
    }

    public static void main (String [] args){
      System.out.println(">>start:");

      System.out.println(">>create p1 empty constructor");
      Music p1 = new Music("SOC", "NWA", "SOC", 1988);
      System.out.println(">>create p2 non-empty constructor");
      Music p2 = new Music();
      System.out.println(">>create p2 = p3");
      Music p3 = p2;

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
