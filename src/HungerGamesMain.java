
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kimngo
 */
public class HungerGamesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList <Competitor> competitors=new ArrayList <Competitor>();
    competitors.add(new Competitor("Fake Love", true));
    competitors.add(new Competitor("Spring Day", true));
    competitors.add(new Competitor("Run", true));
    competitors.add(new Competitor("I Need U", true));
    competitors.add(new Competitor("DNA", true));
    competitors.add(new Competitor("N.O.", true));
    competitors.add(new Competitor("No More Dream", true));
    competitors.add(new Competitor("ON", true));
    competitors.add(new Competitor("Blood Sweat & Tears", true));
    competitors.add(new Competitor("Boy With Luv", true));
    competitors.add(new Competitor("IDOL", true));
    competitors.add(new Competitor("Boy In Luv", true));
    competitors.add(new Competitor("Fire", true));
    competitors.add(new Competitor("Dope", true));
    competitors.add(new Competitor("Not Today", true));
    competitors.add(new Competitor("Save Me", true));
    competitors.add(new Competitor("Danger", true));
    competitors.add(new Competitor("War Of Hormone", true));
    competitors.add(new Competitor("Just One Day", true));
    competitors.add(new Competitor("Black Swan", true));
    HungerGames tourney = new HungerGames(competitors);
    String[]computer = {"rock", "paper", "scissors"};
    int round = 1;
    int comp;
    
    System.out.println("Welcome to the Hunger Games! Today, our competitors are 20 BTS songs. Each matchup, will put two competitors against each other in a game of \"Rock, Paper, Scissors.\""
            + "\nYou will pick what the first competitor will do and the computer will pick what the other competitor does and then one competitor will be eliminated. "
            + "\nThis will continue until there is one winner left.");
    System.out.println();
    
    while(competitors.size()>1)
    {
        System.out.println("Round "+round);
        for(int n=0; n<(competitors.size()/2); n++)
        {
            int choice;
            System.out.println("The competitors are "+tourney.getCompetitor(n).getName()+" and "+tourney.getCompetitor(tourney.getNumCompetitors()-1-n).getName());
            System.out.println("Enter the number of your choice:\n1.Rock \n2.Paper \n3.Scissors ");
            choice=scan.nextInt();
            System.out.println();
            comp = (int)(Math.random()*3+1);
            Competitor winner = tourney.match(n, tourney.getNumCompetitors()-1-n, choice, comp);
            if (winner==null)
            {
                System.out.println("Tie. Try again");
                System.out.println();
                n--;
            }
            else
            {
                System.out.println(tourney.getCompetitor(tourney.getNumCompetitors()-1-n).getName()+" chose "+computer[comp-1]+". The winner is "+winner.getName())+".";
                System.out.println();
            }    
        }
        tourney.newRound();
        round++;
        System.out.println();
    }
    System.out.println("The winner of the Hunger Games is "+tourney.getCompetitor(0).getName());
    
    
    }
    
}
