package demo;

import java.util.ArrayList;

public class Observerble {
    private static Observerble Instance;
    private final ArrayList<Observer> obList = new ArrayList<>();
    private int levelPosition;
    private int FuelLevel;
    private boolean position;
    private String massage;
    private int soilder;
    private int ammo;
    private MainController mainController;
    
    Observerble() {
    }
    public void addObserver(Observer ob) {
        obList.add((Observer) ob);
    }

    /**
     *
     * @param mainController
     */
    public void setControllroom(MainController mainController) {
       this.mainController = mainController;
    }
    public static Observerble getInstance() {
        if (Instance==null) {
             Instance = new Observerble();        
        }
        return Instance;
    }
    public ArrayList<Observer> getObserverList() {
        return obList;
    }
    
    public boolean hasObserver(Observer ob){
       return obList.contains(ob);
    } 
     
    public void sendSMS(String text,char name){
        for(Observer observer:obList){
            observer.sendMassage(text,name);
        }
    } 
    public void notifyObserverses (boolean clear){
        for(Observer obs:obList){
            obs.AreaClear(clear);
        }
    }
    
    // Send Massage from Defence to Main Control room
    public void ReceiveMassage(String massage){
        this.massage=massage;
        if(mainController != null){
            mainController.ReceiveMassage(massage);
        }
    }
    //=======================================================
    public void setPositionLevel(int levelPosition){
        if(this.levelPosition!=levelPosition){
            this.levelPosition=levelPosition;
            for(Observer ob : obList){
                ob.Position(levelPosition);
            }
        }
    }
    public void setPosition(boolean position){
          this.position=position;
        if(this.mainController!=null){
            mainController.setPosition(position);
        }
    }
    public void fuelLevel(int FuelLevel){
        if(this.FuelLevel!=FuelLevel){
            this.FuelLevel=FuelLevel;
            for(Observer ob : obList){
                ob.FuelCount(FuelLevel);
            }
        }
    }
    
}
