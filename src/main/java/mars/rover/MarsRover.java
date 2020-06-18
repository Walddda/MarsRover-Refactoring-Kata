package mars.rover;

import java.util.Arrays;

public class MarsRover {

    static String position = "";
    static Character[] heaven = {'N', 'E', 'S', 'W'};

    public static String move(int x, int y, char direction, String instructions) {
        if (!instructions.isEmpty()) {

            if (position.isEmpty()){
                position = x+" "+y+" "+direction;
            }
            int[] go = {1,1,-1,-1};

            char instruction = instructions.charAt(0);
            if(instruction == 'L'){
                return move(x,y, heaven[(Arrays.asList(heaven).indexOf(direction)+4 -1 )%4], instructions.substring(1));
            }else if(instruction == 'R'){
                return move(x,y, heaven[(Arrays.asList(heaven).indexOf(direction) + 1 )%4], instructions.substring(1));
            }else if(instruction == 'M'){
                int i = Arrays.asList(heaven).indexOf(direction);
                if (i % 2 == 0){
                    y+= go[i];
                }else {
                    x+= go[i];
                }
                if(x < 0 || y < 0){
                    String[] pos = position.split(" ");
                    position="";
                    return move(Integer.parseInt(pos[0]), Integer.parseInt(pos[1]),pos[2].charAt(0),"");
                }
                return move(x,y, direction, instructions.substring(1));
            }
        }
        position="";
        return x + " " + y + " " + direction;
    }
}
