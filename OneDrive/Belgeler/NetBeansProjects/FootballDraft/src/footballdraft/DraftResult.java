
package footballdraft;


public class DraftResult {
     private String playerName;
     private String favoriteTeam;
     private String formation;
     private double teamOverall;
      public DraftResult(String playerName,
                       String favoriteTeam,
                       String formation,
                       double teamOverall) {

        this.playerName = playerName;
        this.favoriteTeam = favoriteTeam;
        this.formation = formation;
        this.teamOverall = teamOverall;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getFavoriteTeam() {
        return favoriteTeam;
    }

    public String getFormation() {
        return formation;
    }

    public double getTeamOverall() {
        return teamOverall;
    }
     
}
