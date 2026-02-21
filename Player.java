public class Player {
    
    private String name;
    private String country;
    private int numGoals;
    private int numAssists;
    private int numMatches;
    
    public Player(String name, String country, int goals, int assists, int matches) {
        this.name = name;
        this.country = country;
        this.numGoals = goals;
        this.numAssists = assists;
        this.numMatches = matches;
    }
    
    public String getName() {
        return name;
    }
    
    public String getCountry() {
        return country;
    }
    
    public int getNumGoals() {
        return numGoals;
    }
    
    public int getNumAssists() {
        return numAssists;
    }
    
    public int getNumMatches() {
        return numMatches;
    }
    
    public String toString() {
        return name+"("+country+")"
                   +" goals="+numGoals
                   +" assists="+numAssists
                   +" matches="+numMatches;
                    
    }
}