public class PatternV {
    public static void main(String[] args) {
        
       int n=5;
      for(int i=0; i<n; i++)
  {
      for(int j=0; j<n; j++)
  {
      if(j < i)
      System.out.print(n-j);
else
      System.out.print(n-i);
 }
       System.out.println();
 }

       for(int i=n; i>=1; i--) 
 {
       for(int j=1; j<=i; j++) 
 {
       System.out.print("*");
 }
       System.out.println();
        }
    }
}
