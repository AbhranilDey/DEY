
class array_store
{
    int ar[][]; int m; int n;
    array_store()
    {
        m=20;
        n=20;
        ar=new int [m][n];
    }

    void store()
    {
        int sum=0;
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum=i*i+j*j;
                ar[i][j]=sum;
            }
        }

    }

    void prime()
    {
        int s=0; int c=0;
        for (int i=0;i<ar.length;i++)
        {
            for (int j=0;j<ar.length;j++)
            {

                if(i!=0&&i!=ar.length-1&&j==0&&j!=ar.length-1)
                {
                    for (int k=2;k<ar[i][j];k++)
                    {
                        if (ar[i][j]%k==0)
                        {
                            c++;
                        }
                    }
                    if (c==0)
                    {
                        s+=ar[i][j];
                    }
                    c=0;     

                }
            }
        }
        System.out.println("the sum of the elements are:"+s);
    }
    void show()
    {
        System.out.println("the elements of the array in the matrix");
        for (int i=0;i<ar.length;i++)
        {
            for (int j=0;j<ar.length;j++)
            {
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void main()
    {
        store();
        show();
        prime();
    }
}