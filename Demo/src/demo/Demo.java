package demo;

public class Demo {

    public static void main(String[] args) {
        MainController MainObject = new MainController();
        MainObject.setVisible(true);
        MainObject.setLocationRelativeTo(null);

        Helicopter helicopter = new Helicopter();
        helicopter.setVisible(true);
        helicopter.setLocationRelativeTo(null);
        
        Tank tank = new Tank();
        tank.setVisible(true);
        tank.setLocationRelativeTo(null);
        
        Submarine submarine = new Submarine();
        submarine.setVisible(true);
        submarine.setLocationRelativeTo(null);
    }
    
}
