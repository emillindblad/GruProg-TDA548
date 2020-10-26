/*
        Solution to question 5 here.
 */
/*
import static java.lang.System.*;

public class Q5 {

    public static void main(String[] args) {
        new Q5().program();
    }

    private void program() {
        String walk1 = "e1w1s1n1";
        String walk2 = "e12w12s12n12";
        String walk3 = "e123w1";
        String walk4 = "e122w123e1";
        String walk5 = "n3e4s2e2";

        out.println(willHit(0, 0, 0, 0, walk1));
        out.println(willHit(1, 1, 1, 1, walk2));
        out.println(willHit(0, 0, 0, 0, walk3));
        out.println(willHit(0, 0, 0, 0, walk4));
        out.println(willHit(2, 2, 8, 3, walk5));

    }

    boolean willHit(int ix, int iy, int fx, int fy, String walk) {

        char currentDirection = 'o';
        StringBuilder num = new StringBuilder();

        for (int i = 0; i < walk.length(); i++) {
            if( ! Character.isDigit(walk.charAt(i)) ) {
                if(num.length() > 0) {
                    out.println(num);
                    int tmp = Integer.parseInt(num.toString());
                    if( currentDirection == 'n') {
                        iy += tmp;
                    } else if(currentDirection == 'e') {
                        ix += tmp;
                    } else if(currentDirection == 's') {
                        iy -= tmp;
                    } else if(currentDirection == 'w') {
                        ix -= tmp;
                    }
                    num.setLength(0);
                }

                currentDirection = walk.charAt(i);
            } else {
                num.append(walk.charAt(i));
                // steps = walk.charAt(i) - '0'; // - '0' => Göra om char siffra till värde
            }



        }
        int tmp = Integer.parseInt(num.toString());
        if( currentDirection == 'n') {
            iy += tmp;
        } else if(currentDirection == 'e') {
            ix += tmp;
        } else if(currentDirection == 's') {
            iy -= tmp;
        } else if(currentDirection == 'w') {
            ix -= tmp;
        }

        // out.println(ix  +" " + iy + " " + fx + " " + fy);
        return (ix == fx) && (iy == fy);





    }


}











    /*
    boolean willHit(int ix, int iy, int fx, int fy, String walk) {
        int dx = 0;
        int dy = 0;
        char dir = 'x';
        StringBuilder num = new StringBuilder();

        for(int i = 0; i < walk.length(); i++) {
            char c = walk.charAt(i);

            if( Character.isAlphabetic(c) ) {
                if(num.length() > 0 ) {
                    out.println("num: " + num);
                    int t = Integer.parseInt(num.toString());

                    if(dir == 'n') {
                        dy += t;
                    } else if(dir == 'e') {
                        dx += t;
                    } else if(dir == 's') {
                        dy -= t;
                    } else if(dir == 'w') {
                        dx -= t;
                    }

                    num.setLength(0);
                }

                dir = c;
            } else {
                num.append(c);
            }
        }
        out.println("num: " + num);
        int t = Integer.parseInt(num.toString());
        if(dir == 'n') {
            dy += t;
        } else if(dir == 'e') {
            dx += t;
        } else if(dir == 's') {
            dy -= t;
        } else if(dir == 'w') {
            dx -= t;
        }

        out.println(dx + " " + dy);
        return (ix + dx == fx) && (iy + dy == fy);
    }

     */