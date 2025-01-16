import java.util.*;
public class clockwise
{
    void generate(int N)
    {
            int ar[][]=new int [N][N];
             int k=1;
           int rb=0; int cn=ar.length-1;
           int cb=0; int rn=ar.length-1;
           while (k<=N*N)
           {
            for (int j=rb;j<=rn;j++)
           {
               ar[rb][j]=k;
               k++;
           }   
           for (int j=cb+1;j<=cn;j++)
           {
               ar[j][rn]=k;
               k++;
           }
           for (int j=rn-1;j>=rb;j--)
           {
               ar[rn][j]=k;
               k++;
           }
           for (int j=cn-1;j>cb;j--)
           {
               ar[j][cb]=k;
               k++;
           }
           cb++;
           rb++;
           cn--;
           rn--;
           
           
         
           }
          for (int i=0;i<N;i++)
          {
              for (int j=0;j<N;j++)
              {
                  System.out.print(ar[i][j]+"\t");
              }
               System.out.println();
          }
                  
               }
              
           
           
           void main()
           {
               Scanner sc=new Scanner (System.in);
               int N;
               System.out.println("enter the size of the matrix");
               N=sc.nextInt();
               generate(N);
           }
}