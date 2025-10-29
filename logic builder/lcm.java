  class lcm
{
public static void main(String[]args)
{
int a=2,b=3;
int max;
int lcm;
if(a>b)
max=a;
else
max=b;
while(true)
{
if(max%a==0 && max%b==0)
{
lcm=max;
break;
}
max=max+1;
}	
System.out.print(lcm);
}}} 