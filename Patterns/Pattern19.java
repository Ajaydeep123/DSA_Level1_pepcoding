import java.util.*;
 
public class Main {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for (int i = 1 ; i <= n; i++)
    {
      for (int j = 1 ; j <= n; j++)
      {
        if ( i == 1) //first component  
        {
          if ( j == n || j <= n / 2 + 1)  {
            System.out.print("*\t");
          }
          else
          {
            System.out.print("\t");
          }
      }
      else if (i <= n / 2) //second component  
      {
        if ( j == n || j == n / 2 + 1)  {
          System.out.print("*\t");
        }
        else
        {
          System.out.print("\t");
        }
    }
    else if ( i == n / 2 + 1) //third component  
    {
      System.out.print("*\t");
  }
  else if (i < n) // fourth component  
  {
    if (j == 1 || j == n / 2 + 1)  {
      System.out.print("*\t");
    }
    else
    {
      System.out.print("\t");
    }
}
else //fifth component
{
  if (j == 1 || j >= n / 2 + 1)
  {
    System.out.print("*\t");
  }
  else
  {
    System.out.print("\t");
  }
}
}
System.out.println(); // changing row  
}
}
}