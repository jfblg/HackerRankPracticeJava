import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player{
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public  int compare(Player p1, Player p2) {
        if(p1.score > p2.score) {
            return -1;
        } else if(p1.score < p2.score) {
            return 1;
        } else {
            if(p1.name.compareTo(p2.name) < 0) {
                return -1;
            } else if(p1.name.compareTo(p2.name) > 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}

public class JavaComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Player[] players = new Player[n];
        Checker checker = new Checker();

        for(int i=0; i<n; i++) {
            players[i] = new Player(sc.next(), sc.nextInt());
        }
        sc.close();

        Arrays.sort(players, checker);
        for(int i=0; i < players.length; i++) {
            System.out.printf("%s %s\n", players[i].getName(), players[i].getScore());
        }

    }

}
