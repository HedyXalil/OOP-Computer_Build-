package computerbuild;


public class brand_cpu {
    
//Overridden method
   public void newbrand()
   {
      System.out.println("amd");
   }   
  void code(){
     System.out.println("brand code is : 2321");
 }
    
}
class brands extends brand_cpu{
   //Overriding method
   public void newbrand(){
      System.out.println("intel");
   }
  
   //**************************************
   
    
}
