import java.util.ArrayList;

public class Main {

    public static void main(String args[]){
        //Set objects and variables
        ArcadeRobot arcadeRobot = new ArcadeRobot();
        TankRobot tankRobot = new TankRobot();

        String arcadeFilePath = "D:\\Repos\\ModernizingMedicineRobot\\robotInputs.txt";
        String tankFilePath = "D:\\Repos\\ModernizingMedicineRobot\\tankRobotInputs.txt";
        ArrayList<Character> arcadeInputs = Processes.getInputs(arcadeFilePath); //array of input characters
        ArrayList<Character> tankInputs = Processes.getInputs(tankFilePath); //array of input characters

        //Arcade robot moves
//        for(Character c : tankInputs) {
//            arcadeRobot.move(c);
//        }
        //Tank robot moves
        for(Character c : tankInputs) {
            tankRobot.move(c);
        }
    }
}
