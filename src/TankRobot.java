import java.util.Arrays;

public class TankRobot extends Robot{
    Character prevInput = ' ';

    TankRobot(){

    }

    /*To set new starting position*/
    TankRobot(int x, int y) {
        position[0] = x;
        position[1] = y;
    }

    public void move(Character currentInput) {
        int[] newPosition = position.clone();
        Character direction = 'E';

        switch(currentInput) {
            case 'F':
                newPosition[x] += 1;
                direction = 'E';
                break;
            case 'B':
                newPosition[x] -= 1;
                direction = 'W';
                break;
            case 'R':
                //Checking to make diagonal moves
                if (prevInput == 'F' || (prevInput == 'R' && newPosition[x] == 0)) {
                    newPosition[x] += 1;
                } else if (prevInput == 'B' || (prevInput == 'R' && newPosition[x] == 4)) {
                    newPosition[x] -= 1;
                }
                newPosition[y] += 1;
                direction = 'S';
                break;
            case 'L':
                //Checking to make diagonal moves
                if (prevInput == 'F' || (prevInput == 'L' && newPosition[x] == 0)) {
                    newPosition[x] += 1;
                } else if (prevInput == 'B' || (prevInput == 'L' && newPosition[x] == 4)) {
                    newPosition[x] -= 1;
                }
                newPosition[y] -= 1;
                direction = 'N';
                break;
            default:
                break;
        }
        if(newPosition[x] >= 0 && newPosition[x] <= 4 && newPosition[y] >= 0 && newPosition[y] <= 4) {
            position = newPosition.clone();
            prevInput = currentInput;
            System.out.println(String.format("%s %s", Arrays.toString(position), direction));
        } else {
            System.out.println(String.format("Cannot move: %s; Position out of bounds %s", currentInput, Arrays.toString(position)));
        }
    }
}
