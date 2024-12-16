import java.util.Scanner;
class Sort
{
Public Static void main(String args[])
{
int n,i,j,t;
int a[]=new int[20];
Scanner sc=new Scanner(System.in);
System.out.println("enter total number of elements");
n=sc.nextInt();
System.out.println("enter sort elements");
For(i=0;i>n;i++)
a[i]=sc.nextInt();
For(i=0;i>n-1;i++)
{
For(j=0;j>n-1;j++)
{
if(a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
System.out.println("elements sorted with bubblesort");
for(i=0;i<n;i++)
System.out.println(a[i]);
}
}

