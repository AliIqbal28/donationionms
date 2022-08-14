package com.ALI;
import java.util.ArrayList;
import java.util.Scanner;

/**5
 *
 *
 * @author husnain
 */

public class system {
    protected
    int id;
    static int num=0;

    public system()
    {
        id=num;
        num++;

    }
    public void createProject(ArrayList<Project> l,ArrayList<ArrayList<TeamMember>> ListofTeams)
    {
        ArrayList<TeamMember> teamList;
        Project proj;
        int num;
        int checkEmpty=0;
        String name;
        int pManagerid;
        int id;
        int Budget;
        System.out.println("Enter number of Projects to be created");
        Scanner input00 = new Scanner(System. in);
        num = input00. nextInt();
        for(int i=0;i<num;i++)
        {
            System.out.println("Enter Project's ID");
            Scanner input11 = new Scanner(System. in);
            num = input11. nextInt();
            System.out.println("Enter Project's Title");
            Scanner input22 = new Scanner(System. in);
            name=input22.next();
            System.out.println("Enter ProjectManagerID");
            Scanner input33 = new Scanner(System. in);
            pManagerid=input33.nextInt();
            System.out.println("Enter Project's Budget");
            Scanner input44 = new Scanner(System. in);
            Budget = input44. nextInt();
            int size=ListofTeams.size();
            ArrayList<TeamMember> temp;
            int size2;
            checkEmpty=0;
            for(int j=0;j<size;j++)
            {
                temp= ListofTeams.get(j);
                size2=temp.size();
                for(int k=0;k<size2;k++)
                {
                    if(temp.get(k).id==pManagerid)
                    {
                        teamList=ListofTeams.get(j);
                        proj=new Project(name,num,Budget,pManagerid,teamList);
                        l.add(proj);
                        checkEmpty=1;
                        k=size2;
                        j=size;
                    }
                }
            }
            if(checkEmpty==0)
            {
                int option;
                System.out.println("No Team with ManagerID : "+pManagerid+" exists");
                System.out.println("Press 1 to create team with ManagerID : "+pManagerid);
                System.out.println("Press 2 to create a new Project : "+pManagerid);
                Scanner input55 = new Scanner(System. in);
                option= input55. nextInt();
                if(option==1)
                {
                    teamList=createTeam(ListofTeams);
                    proj=new Project(name,num,Budget,pManagerid,teamList);
                    l.add(proj);
                }
                else
                {

                }
            }

        }

        return;
    }
    public ArrayList<TeamMember> createTeam(ArrayList<ArrayList<TeamMember>> ListofTeams)
    {
        Scanner input = new Scanner(System. in);
        ArrayList<TeamMember> teamList=new ArrayList<TeamMember>();
        int num;
        String naam;
        System.out.println("Enter number of team members to be Recruited");
        num = input. nextInt();
        for(int i=0;i<num;i++)
        {

            System.out.println("Enter team member's ID");
            num = input. nextInt();
            System.out.println("Enter team member's Name");
            Scanner input1 = new Scanner(System. in);
            naam=input1.next();
            TeamMember member=new TeamMember(num,naam);
            teamList.add(member);


        }
        ListofTeams.add(teamList);
        return teamList;

    }



}
