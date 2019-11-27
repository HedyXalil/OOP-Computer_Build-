
package computerbuild;

public class gtx implements order{
String name;
int ram;
public gtx (String n , int r)
{
     name=n;    
      ram=r;                     
}

  

    
  
    public void name(String a) {
       name=a;
        
    }

  
    public void ramup(int a) {
        ram+=a;
        
    }

   
    public void ramdown(int a) {
        ram-=a;
           
    }    
    
    public void print ()
    {
        System.out.println("name is: "+name+"   ram is: "+ram);
    }






}