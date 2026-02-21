import java.io.*;

public class MyProgram
{
    public static void main(String[] args) throws IOException
    {
        // (2b) test printAllPlayers
        SoccerPlayerAnalyzer soccer1 = new SoccerPlayerAnalyzer();
        soccer1.printAllPlayers();
        System.out.println("");
        
        // (3b) test findPlayerWithHighestAssist
        System.out.println("Player with the highest assists: ");
        System.out.println(soccer1.findPlayerWithHighestAssist());
    }
}