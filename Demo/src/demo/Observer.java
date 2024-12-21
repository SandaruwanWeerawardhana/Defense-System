package demo;

public interface Observer {
      public void sendMassage(String text,char name);
      
      public void AreaClear(boolean clear);
      
      public void Position(int level);
      
      public void FuelCount(int FuelLevel);
}
