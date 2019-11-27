package computerbuild;

public class release_date {
  private int month;
  private int day ;
  private int year;
    
  public release_date(int m, int d, int y){
      month=m;
      day=d;      
      year=y;       
      System.out.printf("the coutrtuctor for this is %s\n",this);
  
  }
    public String toString(){
    return String.format("%d/%d/%d",month,day,year);
    
    }
}
