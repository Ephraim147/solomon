import java.util.Scanner;
class Bubblesort
{
Public Static void main(String args[])
{
int n,i,j,t;
int a[]=new int[20];
Scanner sc=new Scanner(System.out);
System.out.println("enter total number of elements");
n=sc.next int;
System.out.println("enter sort elements");
For(i=0;i<n;i++)
a[i]=sc.nextInt();
For(i=0;i<n-1;i++)
{
For(j=0;j<n-1;j++)
{
if(a[i]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
System.out.println("elements sorted with bubblesort");
for(i=0;i<n;i++)
system.out.print(a[i]);
}
}

