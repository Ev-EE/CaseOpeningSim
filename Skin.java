/**
* Abstract class Skin - Parent class for all the skins in the different cases.
* @EvEE
* @1.2
*/

public abstract class Skin
{
    private int classification;
    private double skinPrice;
    private float exactWear;
    private boolean statTrak;
    private String skinName , wear , skinURL;
    
    public void setSkinName(String s)
    {
        skinName = s;
    }
    
    public void setSkinPrice(double d)
    {
        skinPrice = d;
    }
    
    public void setSkinURL(String s)
    {
        skinURL = s;
    }
    
    public void setStatTrak()
    {
        statTrak = Math.random() <= .1;
    }
    
    public void setClassification()
    {
        double odds = Math.random() * 99 + 1;
        if (odds <= 79.92) classification = 0;
        if (odds <= 95.9 && odds > 79.92) classification = 1;
        if (odds <= 99.1 && odds > 95.9) classification = 2;
        if (odds <= 99.74 && odds > 99.1) classification = 3;
        if (odds <= 100 && odds > 99.74) classification = 4;
    }
    
    public void setWear(float exactWearMin, float exactWearMax)
    {
        boolean impossible = true;
        while (impossible)
        {
            double odds = Math.random() * 99 + 1;
            
            if (odds <= 3)
            {
                exactWear = (float) (Math.random() * .07);
                wear = "Factory New";
            }
            else if (odds <= 27 && odds > 3)
            {
                exactWear = (float) ((Math.random() * .08) + .07);
                wear = "Minimal Wear";
            }
            else if (odds <= 60 && odds > 27)
            {
                exactWear = (float) ((Math.random() * .23) + .15);
                wear = "Field-Tested";
            }
            else if (odds <= 84 && odds > 60)
            {
                exactWear = (float) ((Math.random() * .07) + .38);
                wear = "Minimal-Wear";
            }
            else if (odds <= 100 && odds > 84)
            {
                exactWear = (float) ((Math.random() * .55) + .45);
                wear = "Battle-Scarred";
            }
            
            if (exactWear >= exactWearMax && exactWear <= exactWearMin) impossible = true;
            else impossible = false;
        }
    }
    
    public String getStatTrak()
    {
        if (statTrak) return "StatTrak";
        else return "";
    }
    
    public String getSkinName()
    {
        return skinName;
    }
    
    public String getWear()
    {
        return wear;
    }
    
    public String getSkinURL()
    {
        return skinURL;
    }
    
    public float getFloat()
    {
        return exactWear;
    }
    
    public double getSkinPrice()
    {
        return skinPrice;
    }
    
    public int getClassification()
    {
        return classification;
    }
}
