/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J
 */
public class Stats {

    private String home;
    private String away;
    private int homePoints;
    private int awayPoints;

    public Stats(String home, String away, int homePoints, int awayPoints) {
        this.home = home;
        this.away = away;
        this.homePoints = homePoints;
        this.awayPoints = awayPoints;
    }

    public String getHome() {
        return home;
    }

    public String getAway() {
        return away;
    }

    public int getHomePoints() {
        return homePoints;
    }

    public int getAwayPoints() {
        return awayPoints;
    }

    public String toString() {
        return this.home + "," + this.away + ","
                + this.homePoints + "," + this.awayPoints;
    }
}
