
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String teamName = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

        ArrayList<Stats> records = readStatsFromFile(file);
        for (Stats team : records) {
            //System.out.println(team.getHome());
            //System.out.println(team.getAway());
            //System.out.println(team);

            if (team.getHome().equals(teamName) || team.getAway().equals(teamName)) {
                games++;
            }
            if (team.getHome().equals(teamName)
                    && team.getHomePoints() > team.getAwayPoints()) {
                wins++;
            } else if (team.getAway().equals(teamName)
                    && team.getAwayPoints() > team.getHomePoints()) {
                wins++;
            }

            losses = games - wins;

        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
        System.out.println(Arrays.deepToString(records.toArray()));

    }

    public static ArrayList<Stats> readStatsFromFile(String file) {
        ArrayList<Stats> teams = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                String[] parts = line.split(",");
                String home = parts[0];
                String away = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf(parts[3]);

                teams.add(new Stats(home, away, homePoints, awayPoints));
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return teams;

    }
}
