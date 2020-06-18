package mars.rover;

import java.util.Arrays;

public class MarsRover {

    static String position = "";
    static Character[] heaven = {'N', 'E', 'S', 'W'};

    public static String move(int x, int y, char direction, String instructions) {
        if (!instructions.isEmpty()) {

            position = x+" "+y+" "+direction;

            char instruction = instructions.charAt(0);
            if(instruction == 'L'){
                return move(x,y, heaven[(Arrays.asList(heaven).indexOf(direction)+4 -1 )%4], instructions.substring(1, instructions.length()));
            }else if(instruction == 'R'){
                return move(x,y, heaven[(Arrays.asList(heaven).indexOf(direction) + 1 )%4], instructions.substring(1, instructions.length()));
            }else if(instruction == 'M'){

            }

            if (instruction == 'M') {
                if (direction == 'N') {
                    return move(x, y + 1, 'N', instructions.substring(1, instructions.length()));
                } else if (direction == 'S') {
                    return move(x, y - 1, 'S', instructions.substring(1, instructions.length()));
                } else if (direction == 'W') {
                    return move(x - 1, y, 'W', instructions.substring(1, instructions.length()));
                } else if (direction == 'E') {
                    return move(x + 1, y, 'E', instructions.substring(1, instructions.length()));
                }
            }
        }
        return x + " " + y + " " + direction;
    }
}
