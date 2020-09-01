package exercises;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *  Using class objects to represent heroes
 *  https://en.wikipedia.org/wiki/Gladiators_(1992_UK_TV_series)
 *
 * See:
 * - ClassObjects
 * - MethodsArrObj
 */
public class Ex6ClassObjects {

    public static void main(String[] args) {
        new Ex6ClassObjects().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        Hero[] heroes = new Hero[2];
        for (int i = 0 ; i < 2; i++) {
            heroes[i] = new Hero();
            out.printf("What is the name of hero %d? > ", i+1);
            heroes[i].name = sc.next();
            out.printf("How strong is %s? > ", heroes[i].name);
            heroes[i].strength = sc.nextInt();
        }
        if (heroes[0].strength > heroes[1].strength) {
            out.printf("%s is stronger", heroes[0].name);
        }
        else {
            out.printf("%s is stronger", heroes[1].name);
        }
    }
    // ------ The class to use  -----------
    // A class for objects that describes a Hero
    class Hero {
        String name;
        int strength;
    }


}
