
package footballdraft;
import java.util.ArrayList;
import java.util.Comparator;

public class Leaderboard {
     private ArrayList<DraftResult> results;
 public Leaderboard() {
        results = new ArrayList<>();
    }
  public void addResult(DraftResult result) {
        results.add(result);
    }

    public void showLeaderboard() {

        results.sort(
                Comparator.comparingDouble(
                        DraftResult::getTeamOverall
                ).reversed()
        );

        System.out.println();
        System.out.println("========================================");
        System.out.println("             LEADERBOARD");
        System.out.println("========================================");

        for (int i = 0; i < results.size(); i++) {

            DraftResult result = results.get(i);

            System.out.printf(
                    "%d. %-15s | %-10s | %s | %.2f%n",
                    i + 1,
                    result.getPlayerName(),
                    result.getFavoriteTeam(),
                    result.getFormation(),
                    result.getTeamOverall()
            );
        }

        System.out.println("========================================");
    }
}
