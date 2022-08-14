package com.ALI;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Project> list=new ArrayList<Project>();
        ArrayList<TeamMember> list1=new ArrayList<TeamMember>();
        ArrayList<ArrayList<TeamMember>> ListofTeams=new ArrayList<ArrayList<TeamMember>>() ;
        system l=new system();
        list1=l.createTeam(ListofTeams);
        l.createProject(list, ListofTeams);
    }
}
