import java.util.*;
class Full
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the size of array");
int n=obj.nextInt();
System.out.println("enter num of array");
int ar[][]=new int [n][n];
int i,j,k,l;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
ar[i][j]=obj.nextInt();
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
for(k=0;k<n;k++)
{
for(l=0;l<n;l++)
{
if(ar[i][j]<ar[k][l])
{
int temp=ar[i][j];
ar[i][j]=ar[k][l];
ar[k][l]=temp;
}
}
}
}
}
System.out.println("sorted array");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(ar[i][j]+" ");
}
System.out.println();
}
}
}

