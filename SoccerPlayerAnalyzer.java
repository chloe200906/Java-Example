import java.util.*;
import java.io.*;

public class SoccerPlayerAnalyzer {
    private Player[] playersArray = new Player[10];
    
    public SoccerPlayerAnalyzer() throws IOException {
        File myFile = new File("player_stats.csv");
        Scanner fileScanner = new Scanner(myFile);
        fileScanner.nextLine();
        int j = 0;
        while (fileScanner.hasNext()) {
            String x = fileScanner.nextLine();
            String[] data = x.split(",");
            for (int i = 0; i < data.length; i++) {
                data[i] = data[i].trim();
            }
            String name = data[0];
            String country = data[1];
            int goals = Integer.parseInt(data[3]);
            int assists = Integer.parseInt(data[4]);
            int matches = Integer.parseInt(data[5]);
            
            playersArray[j] = new Player(name, country, goals, assists, matches);
            j++;
            
        }
        
        
        // (1) load in the player_stats.csv file into playersArray
    }
    
    public void printAllPlayers()  {
        // (2a) print all players
        System.out.println("Player List:");
        for (Player x: playersArray) {
            System.out.println(x);
        }
    }

    public Player findPlayerWithHighestAssist() {
        int assist = 0;
        Player player = null;
        // (3a) find player with the highest assist points and return the player
        for (Player x: playersArray) {
            if (x.getNumAssists() > assist) {
                player = x;
                assist = x.getNumAssists();
                
            }
        }
        return player;
    }
    
    
}