import lib.StdDraw;

public class Ship{
  public static void setCanvasSize(int canvasWidth,int canvasHeight){
    return;
  }
  public static void main (String [] args) {
    setCanvasSize(10, 10);
    StdDraw.setPenRadius(0.01);
    // Draw the lower part of the boat
    double [] x = {0,2,6,8};
    double [] y = {2,0,0,2};
    StdDraw.filledPolygon(x,y);
  
    // Draw the stick
    StdDraw.setPenRadius(0.1);
    StdDraw.line(4, 2, 4, 8);
    
    // Draw the flag
    double [] a = {2,4,4};
    double [] b = {4,4,7};
    StdDraw.filledPolygon(a,b);
     
  }
}