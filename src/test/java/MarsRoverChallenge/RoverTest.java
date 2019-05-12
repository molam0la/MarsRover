package MarsRoverChallenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoverTest {

    int x;
    int y;
    Rover rover = new Rover();

    @Before
    public void setUp() {
        x = 1;
        y = 0;
        rover.direction = 'N';
    }

    @Test
    public void turnLeft() {
        rover.turnLeft();
        assertEquals('W', rover.direction);
    }

    @Test
    public void turnRight() {
        rover.turnRight();
        assertEquals('E', rover.direction);
    }

    @Test
    public void move() {
        rover.x = 3;
        rover.y = 4;
        rover.direction = 'N';
        rover.move();
        assertEquals(5, rover.y);

    }

    @Test
    public void testInput1() {
        rover.setPosition(1, 2, 'N');
        char[] commands = {'L', 'M', 'L', 'M', 'L', 'M', 'L', 'M', 'M'};
        assertEquals("1 3 N", rover.implementCommands(commands));
    }

    @Test
    public void testInput2() {
        rover.setPosition(3, 3, 'E');
        char[] commands = {'M','M','R','M','M','R','M','R','R','M'};
        assertEquals("5 1 E", rover.implementCommands(commands));

    }
}