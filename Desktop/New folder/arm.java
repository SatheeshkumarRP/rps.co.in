class Main
{
public static void main(String [] args)
{
int n=153,sum=0,a,temp;
temp=n;
while(n>0)
{
a=n%10;
n=n/10;
sum=sum+(a*a*a);
}
if(temp==sum)
System.out.println("armstrong"+sum);
else
System.out.println(" not armstrong"+sum);
}
}