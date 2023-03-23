import java.util.ArrayList;

// Player class
class Player {

    String name;
    int id;
    String team;

    Player(String name, int id, String team) {
        this.name = name;
        this.id = id;
        this.team = team;
    }

}

/* Team class contains a list of Player
Objects.*/
class Team {

    String name;
    private ArrayList<Player> players;

    Team(String name, ArrayList<Player> players) {
        this.name = name;
        this.players = players;
    }

    public ArrayList<Player> getPlayers() { // This function returns the "players"
        return players;
    }

}

/* School class contains a list of Team
Objects.*/
class School{

    String schoolName;
    private ArrayList<Team> teams;

    School(String schoolName, ArrayList<Team> teams) {
        this.schoolName = schoolName;
        this.teams = teams;
    }

    /* Count total players of all teams
      in a given school */
    public void getTotalPlayersInSchool() {
        int noOfPlayers = 1;

        ArrayList<Player> players;
        System.out.println("Players in the School "+schoolName+" are listed below");
        for(Team team : teams) {
            players = team.getPlayers();
            System.out.println("Players in the team " +team.name);
            for(Player p : players) {
                System.out.println("Player "+noOfPlayers +" is "+ p.name+" with ID is "+p.id);
                noOfPlayers++;
            }
        }
        //return noOfPlayers;
    }

}

// Main class
class EmAllAggregate {

    public static void main (String[] args) {
        /* Declaring all the players */
        Player p1 = new Player("Harris", 1, "Red");
        Player p2 = new Player("Carol", 2, "Red");
        Player p3 = new Player("Johnny", 1, "Blue");
        Player p4 = new Player("Sarah", 2, "Blue");

    /* Making a List of
        "Red" team Players. */
        ArrayList <Player> red_players = new ArrayList<Player>();
        red_players.add(p1);
        red_players.add(p2);

    /* Making a List of
        "Blue" team Players. */
        ArrayList<Player> blue_players = new ArrayList<Player>();
        blue_players.add(p3);
        blue_players.add(p4);

        /* Declaring Team objects */
        Team red = new Team("Red", red_players);
        Team blue = new Team("Blue", blue_players);

        // Creating a list of teams and adding "red" and "blue" teams to it.
        ArrayList <Team> teams = new ArrayList<Team>();
        teams.add(red);
        teams.add(blue);

        // Creating an instance of School.
        School mySchool = new School("ABC", teams);
        // Getting total prayers in the school.
         mySchool.getTotalPlayersInSchool();
    }

}