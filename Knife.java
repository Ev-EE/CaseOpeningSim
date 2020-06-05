
/**
 * Write a description of class Knife here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Knife extends Skin
{
    public Knife(String s)
    {
        
        if (s.equals("Bowie Knife | Marble Fade"))
        {
            setSkinName("Bowie Knife | Marble Fade");
            setSkinURL("Cases/Knifes/MarbleFade.png");
            setStatTrak();
            setWear((float)0.00,(float)0.08);
            if (getWear().equals("Factory New"))
            {
                 if (getStatTrak().equals("")) setSkinPrice(275.99);
                 else setSkinPrice(388.09);
            }
            if (getWear().equals("Minimal Wear"))
            {
                if (getStatTrak().equals("")) setSkinPrice(256.76);
                else setSkinPrice(557.99);
            }
        }
    }
    
    public double doppler(double y)
    {
        int odds = (int) Math.random() * 99 + 1;
        if (odds == 1)
        {
            setSkinName(getSkinName()+ " Black Pearl");
            return (y*7.5);
        }
        else if (odds > 1 && odds <= 10)
        {
            if (((int) Math.random() * 2 + 1) == 1) setSkinName(getSkinName()+ " Ruby");
            else setSkinName(getSkinName()+ " Sapphire");
            return (y*9);
        }
        
        int generalPhase = (int) Math.random() * 3 + 1;
        if (generalPhase == 1)
        {
            setSkinName(getSkinName()+ " Phase 1");
            return (y);
        }
        if (generalPhase == 2)
        {
            setSkinName(getSkinName()+ " Phase 2");
            return (y*1.2);
        }
        if (generalPhase == 3)
        {
            setSkinName(getSkinName()+ " Phase 3");
            return (y);
        }
        setSkinName(getSkinName()+ " Phase 4");
        return (y);
    }
}
