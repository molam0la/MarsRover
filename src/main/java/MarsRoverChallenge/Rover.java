package MarsRoverChallenge;

public class Rover {

    int x;
    int y;

    char direction;
    int position;

    public void setPosition(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public String printPosition() {
        String position = x + " " + y + " " + direction;
        System.out.println(position);
        return position;
    }

    public char turnLeft() {
        if (direction == 'N') {
            setDirection('W');
        } else if (direction == 'S') {
            setDirection('E');
        } else if (direction == 'W') {
            setDirection('S');
        } else if (direction == 'E') {
            setDirection('N');
        }
        return direction;
    }

    public char turnRight() {
        if (direction == 'N') {
            setDirection('E');
        } else if (direction == 'S') {
            setDirection('W');
        } else if (direction == 'W') {
            setDirection('N');
        } else if (direction == 'E') {
            setDirection('S');
        }
        return direction;
    }

    public void move() {
        if (direction == 'N') {
            y = y + 1;
        } else if (direction == 'E') {
            x = x + 1;
        } else if (direction == 'S') {
            y = y - 1;
        } else if (direction == 'W') {
            x = x - 1;
        }
    }

    String implementCommands(char[] commands) {
        for (char c : commands) {
            if (c == 'L') {
                turnLeft();
            } else if (c == 'R') {
                turnRight();
            } else if (c == 'M') {
                move();
            }
        }
        return printPosition();
    }
}


