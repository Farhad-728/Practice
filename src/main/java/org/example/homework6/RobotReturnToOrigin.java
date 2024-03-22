package org.example.homework6;

public class RobotReturnToOrigin {

    public static boolean judgeCircle(String moves) {
        int ver = 0;
        int hor = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U':
                    ver++;
                    break;
                case 'D':
                    ver--;
                    break;
                case 'R':
                    hor++;
                    break;
                case 'L':
                    hor--;
                    break;
                default:
                    break;
            }
        }
        if (ver == 0 && hor == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String moves = "UD";
        judgeCircle(moves);
    }
}
