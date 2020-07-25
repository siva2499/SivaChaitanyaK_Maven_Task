import java.util.*;
interface PaniPuri{  
void print();  
}  
interface Biryani{  
void print1();  
} 
interface Shawarma{  
void print2();  
}
interface Dosa{  
void print3();  
}
class Test implements PaniPuri,Biryani,Shawarma,Dosa{
public void print(){System.out.println("PaniPuri");}  
 public void print1(){System.out.println("Biryani");}  
 public void print2(){System.out.println("Shawarma");}  
public void print3(){System.out.println("Dosa");}  
 public static void main(String args[]){
Scanner v=new Scanner(System.in) ;
int c=0;
System.out.println("CHOOSE:\n1.PaniPuri\n2.Biryani\n3.Shawarma\n4.Dosa");
while(true)
{
Test obj = new Test();  
int b=v.nextInt();
if (b==5)
break;
switch(b)
{
case 1:
obj.print();
c++;
break;
case 2:
obj.print1();
c++;
break;
case 3:
obj.print2();
c++;
break;
case 4:
obj.print3();
c++;
break;
}
}  
System.out.println("\nTotal Gifts Count :"+c);
 }  
}  
