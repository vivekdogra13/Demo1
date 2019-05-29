
package demo;

class Armstrong
{
  private static int leng;
private static int rem;
private static int number;

public static void main(String args[])
{
 
  int number=123;
  int t1=number;
  int Leng=number;
     
 while(t1!=0)
{
  leng=leng+1;
  t1=t1/10;
}

  int t2=number;
  int arm=0;
  
  while(t2!=0)
{
   int mul=1;
   rem=t2%10;
  

  for(int i=1;i<=leng;i++)
{
  mul=mul*rem;
}

 arm=arm+mul;
 t2=t2/10;
}

if(arm==number)
{ 

 System.out.println(number+"is armstrong");
}
else
{
  System.out.println(number+" is not armstrong");
}

}

}
