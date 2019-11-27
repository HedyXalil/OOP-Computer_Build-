package computerbuild;

public class Computerbuild {
   
    String best_CPU;
 
   
   public String getbest_CPU(){
return best_CPU;
}  

   
   public void setbest_CPU(String best_data){
   this.best_CPU=best_data;
   }
   
    public static void main(String[] args) {
            Date_Cpu dd=new Date_Cpu();
       dd.setdate_CPU("2020.?.?");
       
            New_cpu da =new New_cpu();


   da.setnew_CPU("i7_10710U");
   
            Computerbuild ob =new Computerbuild();
     ob.setbest_CPU("i9_9900k");
    //Overridden method
     brands obj=new brands();
    obj.newbrand();
    //void code in main
     brand_cpu co[]=new brand_cpu[2];
     co[0]=new New_cpu();
     co[1]=new Date_Cpu();
     //********interface
  order obb=new gtx("gtx 1070",8);
        obb.name("gtx 1080");
        obb.ramup(4);
        obb.ramdown(2);
        System.out.println("note //this is interface   ");
        obb.print();
        System.out.println("note // interface end  ");
     
        for (int i = 0; i < 2; i++) {
            co[i].code();
        }
     
        System.out.println("the best cpu is:"+ob.getbest_CPU()+
                      "  the new cpu will be:"+da.getnew_CPU()+

                      "   it will be in/"+dd.getdate_CPU()
        );
        
        ///////////////
        release_date addressobj = new release_date(10,17,2018);
        model buyobj =new model ("rtx 2070",addressobj);
        System.out.println(buyobj);
        //////////////
    }
    
}

