package computerbuild;

public class model {
    private String name;
    private release_date loc;
    
    public model(String thename,release_date theloc){
    name=thename;
    loc=theloc;      
            
    }
    public String toString(){
    return String.format("the name is %s,my address is %s",name,loc);
    }
}
