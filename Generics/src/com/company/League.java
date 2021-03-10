package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;

    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already on this league");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " is added to the league " + this.name);
            return true;
        }
    }

    public void printInOrder() {
        ArrayList<T> sortedTeams = teams;
        Collections.sort(sortedTeams);
        for (T t : sortedTeams) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }

}
