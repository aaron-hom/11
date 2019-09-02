// Point.java
class Point{

    // Fields
    private int xcoord;
    private int ycoord;
 
    // Constructor
    Point(int x, int y){xcoord = x; ycoord = y;}
    
    // Methods
    public String toString(){return "(" + xcoord + ", " + ycoord + ")"; }
    void reflect(){int temp = xcoord; xcoord = ycoord; ycoord = temp;}
    boolean isLeftOf(Point P){return (this.xcoord < P.xcoord);}
    boolean isBelow(Point P){return (this.ycoord < P.ycoord);}
}
