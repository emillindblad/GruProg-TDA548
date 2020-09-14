package exercises;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *  Utilities to input/output player data for a command line game
 *
 *  See:
 *  - UseAConstructor
 *  - ObjectArrMeth
 *
 */
public class Ex1ReadPlayers {
    public static void main(String[] args) {
        new Ex1ReadPlayers().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        Player[] players = inputPlayers();
        outPlayers(players);
    }

    // This class captures the concept of a Player
    class Player {
        String name;   // A Player has a name and...
        int points;    // ... and points

        Player(String name, int points) {
            this.name = name;
            this.points = points;
        }
    }

    // ---------- Methods -------------------

     Player[] inputPlayers() {
        out.print("How many players? > ");
        int nplayers = sc.nextInt();
        Player[] players = new Player[nplayers];

        for (int i = 0 ; i < nplayers; i++) {
            out.printf("Name for player %d ? > ",(i+1));
            String pname = sc.next();
            players[i] = new Player(pname, 0);
         }
        // TODO
        return players;   // For now
    }

    void outPlayers(Player[] players){
        out.println("Players are:");
        for (int i = 0; i < players.length; i++) {
            out.printf("Name %s points %d \n", players[i].name, players[i].points);
        }
    }


}
