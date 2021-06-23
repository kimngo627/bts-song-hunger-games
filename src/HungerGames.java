
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kimngo
 */
public class HungerGames {
    private ArrayList <Competitor> competitors;
    
    
    public HungerGames (ArrayList <Competitor> comps)
    {
        competitors=comps;
    }
    
    public int getNumCompetitors ()
    {
        return competitors.size();
    }
    
    public Competitor match (int x, int y, int a, int b)
    {
        Competitor winner = competitors.get(x);
        if (a==b)
        {
            return null;
        }
        if ((a==1 && b==3)||(a==2 && b==1)||(a==3 && b==2))
        {
            competitors.get(y).changeMortality(false);
            winner = competitors.get(x);
        }
        if ((a==1 && b==2)||(a==2 && b==3)||(a==3 && b==1))
        {
            competitors.get(x).changeMortality(false);
            winner = competitors.get(y);
        }
        return winner;
    }
    
    public void newRound()
    {
        int x=0;
        while (x<competitors.size())
        {
            if (competitors.get(x).getMortality()==true)
                x++;
            else
            {
                competitors.remove(x);
            }
        }
    }
    
    public Competitor getCompetitor(int x)
    {
        return competitors.get(x);
    }
    
    
}
