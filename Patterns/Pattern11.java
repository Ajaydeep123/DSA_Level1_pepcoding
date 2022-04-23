import java.util.*;

public class Main {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int val = 1; //initializing value variable
    for (int i = 1; i <= n; i++)
    {
      for (int j = 1; j <= i; j++)
      {
        System.out.print( val + "	"); 
        val++;// printing val + space  val++; // incrementing val by 1  }
        
      }
      System.out.println();
    }
  }
}