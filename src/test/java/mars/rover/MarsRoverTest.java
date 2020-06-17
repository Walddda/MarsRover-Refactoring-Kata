package mars.rover;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    public  void
    acceptance_test_1() {
        String newPosition = MarsRover.move(1, 2, 'N', "LMLMLMLMM");
        assertEquals("1 3 N", newPosition);
    }

    @Test
    public void
    acceptance_test_2() {
        String newPosition = MarsRover.move(3, 3, 'E', "MMRMMRMRRM");
        assertEquals("5 1 E", newPosition);
    }

    @Test
    public void
    acceptance_test_3(){
        String newPosition = MarsRover.move(3, 3, 'N', "M");
        assertEquals("3 4 N", newPosition);
    }

    @Test
    public void
    acceptance_test_4(){
        String newPosition = MarsRover.move(3, 3, 'E', "M");
        assertEquals("4 3 E", newPosition);
    }

    @Test
    public void
    acceptance_test_5(){
        String newPosition = MarsRover.move(3, 3, 'S', "M");
        assertEquals("3 2 S", newPosition);
    }

    @Test
    public void
    acceptance_test_6(){
        String newPosition = MarsRover.move(3, 3, 'W', "M");
        assertEquals("2 3 W", newPosition);
    }

    @Test
    public void
    rotation_test_1R(){
        String newPosition = MarsRover.move(3,3,'N',"RRM");
        assertEquals("3 2 S", newPosition);
    }
    @Test
    public void
    rotation_test_2R(){
        String newPosition = MarsRover.move(3,3,'E',"RRM");
        assertEquals("2 3 W", newPosition);
    }

    @Test
    public void
    rotation_test_3R(){
        String newPosition = MarsRover.move(3,3,'S',"RRM");
        assertEquals("3 4 N", newPosition);
    }

    @Test
    public void
    rotation_test_4R(){
        String newPosition = MarsRover.move(3,3,'W',"RRM");
        assertEquals("4 3 E", newPosition);
    }

    @Test
    public void
    rotation_test_1L(){
        String newPosition = MarsRover.move(3,3,'N',"LLM");
        assertEquals("3 2 S", newPosition);
    }
    @Test
    public void
    rotation_test_2L(){
        String newPosition = MarsRover.move(3,3,'E',"LLM");
        assertEquals("2 3 W", newPosition);
    }

    @Test
    public void
    rotation_test_3L(){
        String newPosition = MarsRover.move(3,3,'S',"LLM");
        assertEquals("3 4 N", newPosition);
    }

    @Test
    public void
    rotation_test_4L(){
        String newPosition = MarsRover.move(3,3,'W',"LLM");
        assertEquals("4 3 E", newPosition);
    }

    @Test
    public void
    platform_end_test_1(){
        String newPosition = MarsRover.move(1,1,'S',"MMM");
        assertEquals("1 1 S", newPosition);
    }

    @Test
    public void
    platform_end_test_2(){
        String newPosition = MarsRover.move(1,1,'W',"MMM");
        assertEquals("1 1 W", newPosition);
    }
}