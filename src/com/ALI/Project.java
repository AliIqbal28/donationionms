package com.ALI;

import java.util.*;

/**
 *
 * @author husnain
 */
public class Project {
    protected
    String name;
    int pid;
    int reqBudget;
    int pHeadID;
    ArrayList<TeamMember> teamList;
    ArrayList<Donor> donorList;


    public Project(String name, int pid, int reqBudget,int projectHeadID, ArrayList<TeamMember> teamList) {
        this.name = name;
        this.pid = pid;
        this.reqBudget = reqBudget;
        this.pHeadID = projectHeadID;
        this.teamList = teamList;
    }
    public void ChangeTeamLead(int newLead)
    {
        int check=0;
        int s=teamList.size();
        for(int i=0;i<s;i++)
        {
            if(teamList.get(i).id==newLead)
            {   check=1;
                pHeadID=newLead;
                break;
            }

        }
        if(check==0)
        {
            int option;
            System.out.println("No such Team member with ID : "+newLead+" exists");
            System.out.println("Press 1 to create member with ID: "+newLead+" and update TeamLeader");
            Scanner input = new Scanner(System. in);
            option=input.nextInt();
            if(option==1)
            {
                String name;
                int id;
                System.out.println("Enter Member Name");
                name=input.toString();
                System.out.println("Enter Member ID");
                id=input.nextInt();
                TeamMember New=new TeamMember(id,name);
                teamList.add(New);
                pHeadID=id;

            }


        }
    }

    public void addMember()
    {
        Scanner input = new Scanner(System. in);
        String name;
        int idd;
        System.out.println("Enter Member Name");
        name=input.toString();
        System.out.println("Enter Member ID");
        idd=input.nextInt();

        int s=teamList.size();
        for(int i=0;i<s;i++)
        {
            if(teamList.get(i).id==idd)
            {
                return;
            }
        }
        TeamMember member=new TeamMember(idd,name);
        teamList.add(member);
        return;


    }
    public void addDonor()
    {
        Scanner input = new Scanner(System. in);
        String name;
        int idd;
        int quantity;
        String type;
        System.out.println("Enter Donor Name");
        name=input.toString();
        System.out.println("Enter Donor ID");
        idd=input.nextInt();
        System.out.println("Enter item type name");
        type=input.toString();
        System.out.println("Enter item quantity");
        quantity=input.nextInt();


        int s=donorList.size();
        for(int i=0;i<s;i++)
        {
            if(donorList.get(i).id==idd)
            {
                return;
            }
        }
        Donor donor=new Donor(idd,name,type,quantity);
        donorList.add(donor);
        return;

    }

    //////////////
///////////////////////////


}

