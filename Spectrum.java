import java.util.Random;
public class Spectrum extends Skin
{
    public Spectrum()
    {
        setClassification();
        if (getClassification() == 0)
        {
            int blueSkin = (new Random()).nextInt(7);
            if (blueSkin == 0){ 
                setSkinName("PP-Bizon | Jungle Slipstream");
                setSkinURL("Cases/Spectrum/BizonJungleSlipstream.png");
                setStatTrak();
                setWear((float)0.00,(float)0.5);
                if (getWear().equals("Factory New"))
                {
                     if (getStatTrak().equals("")) setSkinPrice(0.18);
                     else setSkinPrice(0.67);
                }
                else if (getWear().equals("Minimal Wear"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.10);
                    else setSkinPrice(0.35);
                }
                else if (getWear().equals("Field-Tested"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.07);
                    else setSkinPrice(0.21);
                }
                else if (getWear().equals("Well-Worn"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.08);
                    else setSkinPrice(0.23);
                }
                else if (getWear().equals("Battle-Scarred"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.07);
                    else setSkinPrice(0.20);
                }
            }
            else if (blueSkin == 1){
                setSkinName("Sawed-Off | Zander");
                setSkinURL("Cases/Spectrum/SawedOffZander.png");
                setStatTrak();
                setWear((float)0.05,(float)1.0);
                if (getWear().equals("Factory New"))
                {
                     if (getStatTrak().equals("")) setSkinPrice(0.21);
                     else setSkinPrice(0.80);
                }
                else if (getWear().equals("Minimal Wear"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.09);
                    else setSkinPrice(0.35);
                }
                else if (getWear().equals("Field-Tested"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.07);
                    else setSkinPrice(0.19);
                }
                else if (getWear().equals("Well-Worn"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.07);
                    else setSkinPrice(0.19);
                }
                else if (getWear().equals("Battle-Scarred"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.07);
                    else setSkinPrice(0.19);
                }
            }
            else if (blueSkin == 2){
                setSkinName("MP7 | Akoben");
                setSkinURL("Cases/Spectrum/MP7Akoben.png");
                setStatTrak();
                setWear((float)0.00,(float)0.70);
                if (getWear().equals("Factory New"))
                {
                     if (getStatTrak().equals("")) setSkinPrice(0.19);
                     else setSkinPrice(0.66);
                }
                else if (getWear().equals("Minimal Wear"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.11);
                    else setSkinPrice(0.35);
                }
                else if (getWear().equals("Field-Tested"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.07);
                    else setSkinPrice(0.20);
                }
                else if (getWear().equals("Well-Worn"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.08);
                    else setSkinPrice(0.32);
                }
                else if (getWear().equals("Battle-Scarred"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.07);
                    else setSkinPrice(0.19);
                }
            }
            else if (blueSkin == 3){
                setSkinName("SCAR-20 | Blueprint");
                setSkinURL("Cases/Spectrum/ScarBlueprint.png");
                setStatTrak();
                setWear((float)0.00,(float)0.75);
                if (getWear().equals("Factory New"))
                {
                     if (getStatTrak().equals("")) setSkinPrice(0.21);
                     else setSkinPrice(0.82);
                }
                else if (getWear().equals("Minimal Wear"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.11);
                    else setSkinPrice(0.36);
                }
                else if (getWear().equals("Field-Tested"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.07);
                    else setSkinPrice(0.20);
                }
                else if (getWear().equals("Well-Worn"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.10);
                    else setSkinPrice(0.27);
                }
                else if (getWear().equals("Battle-Scarred"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.07);
                    else setSkinPrice(0.20);
                }
            }
            else if (blueSkin == 4){
                setSkinName("P250 | Ripple");
                setSkinURL("Cases/Spectrum/P250Ripple.png");
                setStatTrak();
                setWear((float)0.00,(float)0.5);
                if (getWear().equals("Factory New"))
                {
                     if (getStatTrak().equals("")) setSkinPrice(0.21);
                     else setSkinPrice(0.73);
                }
                else if (getWear().equals("Minimal Wear"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.11);
                    else setSkinPrice(0.47);
                }
                else if (getWear().equals("Field-Tested"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.08);
                    else setSkinPrice(0.31);
                }
                else if (getWear().equals("Well-Worn"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.09);
                    else setSkinPrice(0.38);
                }
                else if (getWear().equals("Battle-Scarred"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.09);
                    else setSkinPrice(0.40);
                }
            }
            else if (blueSkin == 5){
                setSkinName("Five-SeveN | Capillary");
                setSkinURL("Cases/Spectrum/FiveSevenCapillary.png");
                setStatTrak();
                setWear((float)0.00,(float)0.7);
                if (getWear().equals("Factory New"))
                {
                     if (getStatTrak().equals("")) setSkinPrice(0.23);
                     else setSkinPrice(1.11);
                }
                else if (getWear().equals("Minimal Wear"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.11);
                    else setSkinPrice(0.48);
                }
                else if (getWear().equals("Field-Tested"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.08);
                    else setSkinPrice(0.26);
                }
                else if (getWear().equals("Well-Worn"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.11);
                    else setSkinPrice(0.57);
                }
                else if (getWear().equals("Battle-Scarred"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(0.08);
                    else setSkinPrice(0.24);
                }
            }
            else if (blueSkin == 6){
                setSkinName("Desert Eagle | Oxide Blaze");
                setSkinURL("Cases/Spectrum/DEagleOxideBlaze.png");
                setStatTrak();
                setWear((float)0.00,(float)0.5);
                if (getWear().equals("Factory New"))
                {
                     if (getStatTrak().equals("")) setSkinPrice(0.51);
                     else setSkinPrice(2.43);
                }
                else if (getWear().equals("Minimal Wear"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(1.93);
                    else setSkinPrice(0.40);
                }
                else if (getWear().equals("Field-Tested"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(1.36);
                    else setSkinPrice(0.30);
                }
                else if (getWear().equals("Well-Worn"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(1.63);
                    else setSkinPrice(0.34);
                }
                else if (getWear().equals("Battle-Scarred"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(1.53);
                    else setSkinPrice(0.27);
                }
            }
        }
        else if (getClassification() == 1)
        {
            int purpleSkin = (new Random()).nextInt(5);
            if (purpleSkin == 0)
            {
                setSkinName("MAC-10 | Last Dive");
            }
            else if (purpleSkin == 1)
            {
                setSkinName("Galil AR | Crimson Tsunami");
            }
            else if (purpleSkin == 2)
            {
                setSkinName("XM1014 | Seasons");
            }
            else if (purpleSkin == 3)
            {
                setSkinName("M249 | Emerald Poison Dart");
            }
            else if (purpleSkin == 4)
            {
                setSkinName("UMP-45 | Scaffold");
            }
        }
        else if (getClassification() == 2)
        {
            int pinkSkin = (new Random()).nextInt(3);
            if (pinkSkin == 0)
            {
                setSkinName("CZ75-Auto | Xiangliu");
            }
            else if (pinkSkin == 1)
            {
                setSkinName("AWP | Fever Dream");
            }
            else if (pinkSkin == 2)
            {
                setSkinName("M4A1-S | Decimator");
            }
        }
        else if (getClassification() == 3)
        {
            int redSkin = (new Random()).nextInt(2);
            if (redSkin == 0)
            {
                setSkinName("USP-S | Neo-Noir");
                setSkinURL("Cases/Spectrum/USPSNeoNoir.png");
                setStatTrak();
                setWear((float)0.00,(float)0.7);
                if (getWear().equals("Factory New"))
                {
                     if (getStatTrak().equals("")) setSkinPrice(57.38);
                     else setSkinPrice(164.44);
                }
                else if (getWear().equals("Minimal Wear"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(32.91);
                    else setSkinPrice(105.65);
                }
                else if (getWear().equals("Field-Tested"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(23.62);
                    else setSkinPrice(62.65);
                }
                else if (getWear().equals("Well-Worn"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(26.94);
                    else setSkinPrice(73.04);
                }
                else if (getWear().equals("Battle-Scarred"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(14.76);
                    else setSkinPrice(37.86);
                }
            }
            else if (redSkin == 1)
            {
                setSkinName("AK-47 | Bloodsport");
                setSkinURL("Cases/Spectrum/AK47Bloodsport.png");
                setStatTrak();
                setWear((float)0.00,(float)0.45);
                if (getWear().equals("Factory New"))
                {
                     if (getStatTrak().equals("")) setSkinPrice(63.13);
                     else setSkinPrice(180.22);
                }
                else if (getWear().equals("Minimal Wear"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(54.19);
                    else setSkinPrice(139.53);
                }
                else if (getWear().equals("Field-Tested"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(48.33);
                    else setSkinPrice(109.47);
                }
                else if (getWear().equals("Well-Worn"))
                {
                    if (getStatTrak().equals("")) setSkinPrice(26.94);
                    else setSkinPrice(73.04);
                }
            }
        }
        else if (getClassification() == 4)
        {
            int goldSkin = (new Random()).nextInt(30);
            Skin n;
            if (goldSkin == 0)
            {
                n = new Knife("Bowie Knife | Marble Fade");
            }
            if (goldSkin == 1)
            {
                n = new Knife("Bowie Knife | Doppler");
            }
            if (goldSkin == 2)
            {
                n = new Knife("Bowie Knife | Tiger Tooth");
            }
            if (goldSkin == 3)
            {
                n = new Knife("Bowie Knife | Damascus Steel");
            }
            if (goldSkin == 4)
            {
                n = new Knife("Bowie Knife | Ultraviolet");
            }
            if (goldSkin == 5)
            {
                n = new Knife("Bowie Knife | Rust Coat");
            }
            if (goldSkin == 6)
            {
                n = new Knife("Butterfly Knife | Marble Fade");
            }
            if (goldSkin == 7)
            {
                n = new Knife("Butterfly Knife | Doppler");
            }
            if (goldSkin == 8)
            {
                n = new Knife("Butterfly Knife | Tiger Tooth");
            }
            if (goldSkin == 9)
            {
                n = new Knife("Butterfly Knife | Damascus Steel");
            }
            if (goldSkin == 10)
            {
                n = new Knife("Butterfly Knife | Ultraviolet");
            }
            if (goldSkin == 11)
            {
                n = new Knife("Butterfly Knife | Rust Coat");
            }
            if (goldSkin == 12)
            {
                n = new Knife("Falchion Knife | Marble Fade");
            }
            if (goldSkin == 13)
            {
                n = new Knife("Falchion Knife | Doppler");
            }
            if (goldSkin == 14)
            {
                n = new Knife("Falchion Knife | Tiger Tooth");
            }
            if (goldSkin == 15)
            {
                n = new Knife("Falchion Knife | Ultraviolet");
            }
            if (goldSkin == 16)
            {
                n = new Knife("Falchion Knife | Damascus Steel");
            }
            if (goldSkin == 17)
            {
                n = new Knife("Falchion Knife | Rust Coat");
            }
            if (goldSkin == 18)
            {
                n = new Knife("Huntsman Knife | Marble Fade");
            }
            if (goldSkin == 19)
            {
                n = new Knife("Huntsman Knife | Doppler");
            }
            if (goldSkin == 20)
            {
                n = new Knife("Huntsman Knife | Tiger Tooth");
            }
            if (goldSkin == 21)
            {
                n = new Knife("Huntsman Knife | Damascus Steel");
            }
            if (goldSkin == 22)
            {
                n = new Knife("Huntsman Knife | Ultraviolet");
            }
            if (goldSkin == 23)
            {
                n = new Knife("Huntsman Knife | Rust Coat");
            }
            if (goldSkin == 24)
            {
                n = new Knife("Shadow Daggers | Ultraviolet");
            }
            if (goldSkin == 25)
            {
                n = new Knife("Shadow Daggers | Tiger Tooth");
            }
            if (goldSkin == 26)
            {
                n = new Knife("Shadow Daggers | Doppler");
            }
            if (goldSkin == 27)
            {
                n = new Knife("Shadow Daggers | Marble Fade");
            }
            if (goldSkin == 28)
            {
                n = new Knife("Shadow Daggers | Damascus Steel");
            }
            if (goldSkin == 29)
            {
                n = new Knife("Shadow Daggers | Rust Coat");
            }
        }
    }
}
