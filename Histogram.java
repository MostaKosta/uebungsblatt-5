import java.util.Scanner;
public class Histogram {
   public static void main (String [] args){
     double min = Integer.parseInt(args[0]);
     double max = Integer.parseInt(args[1]);
     int n = Integer.parseInt(args[2]);
     double a= (max-min)/n;
     Scanner scan= new Scanner(System.in);

     //ERROR Fällen testen
     if (args.length != 3){
        System.out.println("ERROR : bitte genau 3 Elemente übergeben ");
     }
     if ((max-min)%n != 0){
        System.out.println("ERROR : max-min ist nicht rechtlos durch n teilbar ");
     }
     if (n<1){
        System.out.println("ERROR : bitte n grösser als 1 übergeben ");
     }
     if (min>=max){
        System.out.println("ERROR : bitte min kleiner als max übergeben  ");
     }

     System.out.println("enter the numbers");
     int [] tabelle = {};
     int i=0;

     // test if the given numbers are valid and if yes then stock them in an array
     while(scan.hasNext()){
        int x = scan.nextInt(); 
        if (x>max || x<min){
            System.out.println("ERROR : bitte eine Zahl zwischen min und max eingeben ");
         }
         else {
            tabelle [i]=x;
            ++i;
         }     
     }
     scanner.close();                        
     // declare the 1<=r<=n : the bit reference
     // b nb is the number of elements in a bit
     int b=0;
     for (int r=1;r<=n;++r){
        for (int j =0;j<=tabelle.length;++j){
          // test if the given number is in the intervalle of the bit , and increment b if yes 
          if (a*r<=tabelle[j] && tabelle[j]< a*r){
           b++;
           System.out.print(" "+b);
          }
        }
        System.out.println();
      }


     
   } 
}
 