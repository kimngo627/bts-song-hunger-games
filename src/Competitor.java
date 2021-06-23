/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kimngo
 */
public class Competitor {
    private String name;
    private boolean mortality;
   
    public Competitor (String n, boolean m)
    {
        name = n;
        mortality = m;
    }
    
    public void changeMortality (boolean change)
    {
        mortality = change;
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean getMortality()
    {
        return mortality;
    }
}
