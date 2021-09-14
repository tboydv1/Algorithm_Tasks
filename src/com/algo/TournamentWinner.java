package com.algo;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class TournamentWinner {

    public static String tournamentWinner(
            List<List<String>> competitions, List<Integer> results) {
        // Write your code here.

        Hashtable<String, Integer> pointsTable = new Hashtable<>();
        String bestTeam = "";
        pointsTable.put(bestTeam, 0);

        for(int idx = 0; idx < competitions.size(); idx++){

            List<String> competition = competitions.get(idx);
            Integer currentResult = results.get(idx);


            String winningTeam = currentResult == 1 ? competition.get(0) : competition.get(1);

            updateTeamScore(bestTeam, 3, pointsTable);

            if(pointsTable.get(winningTeam) > pointsTable.get(bestTeam)){
                bestTeam = winningTeam;
            }

        }


        return bestTeam;

    }

    private static void updateTeamScore(String bestTeam, int i, Hashtable<String, Integer> pointsTable) {
//        if(!pointsTable.containsKey(bestTeam)){
//            pointsTable.put(bestTeam, 0);
//        }
        pointsTable.put(bestTeam, pointsTable.getOrDefault(bestTeam, 0) + 3);
    }

    public static void main(String[] args) {
        List<List<String>> competitions = new ArrayList<>();
        competitions.add(List.of("HTML", "C#"));
        competitions.add(List.of("C#", "Python"));
        competitions.add(List.of("Python", "HTML"));


        List<Integer> results = List.of(0, 0, 1);



    }
}
