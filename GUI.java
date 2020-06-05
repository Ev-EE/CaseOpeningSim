
/**
 * This is the GUI class, the final goal is to show an animation.
 *
 * @EvEE
 * @1.2
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class GUI extends JFrame implements ActionListener
{
    private JButton open, tryAgain;
    private ImageIcon casePic, skinPic;
    private JLabel imageLabel, imageLabel2, name;
    private boolean caseIsShown = true;

    public GUI()
    {
        setLayout(new FlowLayout());
        setSize(300,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        //JPanel pan = new JPanel();
        //add(pan);
        
        open = new JButton("Open Case");
        tryAgain = new JButton("Try Again"); //invisible
        
        casePic = new ImageIcon("Cases/Spectrum/SpectrumCase.jpeg");
        imageLabel = new JLabel(casePic);
        
        
        imageLabel.setBounds(22,100,256,198);
        open.setBounds(90,60,120,30);
        tryAgain.setBounds(90,60,120,30);
        
        open.addActionListener(this);
        tryAgain.addActionListener(this);
        
        add(tryAgain);
        tryAgain.setVisible(false);
        
        add(open);
        add(imageLabel);
        
    }

    public void actionPerformed(ActionEvent e)
    {
        //JOptionPane.showMessageDialog(null, "Joe MAMA");
        if (e.getSource() == open && caseIsShown)
        {
            open.setVisible(false);
            imageLabel.setVisible(false);
            
            //we need a way to get the info of the skins.
            Skin s = new Spectrum();
            
            skinPic = new ImageIcon(s.getSkinURL());
            Image i = getScaledImage(skinPic.getImage(), 256, 192);
            skinPic = new ImageIcon(i);
            imageLabel2 = new JLabel(skinPic);
            
            name = new JLabel(s.getSkinName());
            name.setBounds(5,300,300,15);
            add(name);
            
            imageLabel2.setBounds(22,100,256,192);
            add(imageLabel2);
            
            tryAgain.setVisible(true);
            caseIsShown = false;
        }
        else if (e.getSource() == tryAgain && !(caseIsShown))
        {
            open.setVisible(true);
            remove(imageLabel2);
            remove(name);
            imageLabel.setVisible(true);
            tryAgain.setVisible(false);
            caseIsShown = true;
        }
        revalidate();
    }
    
    private Image getScaledImage(Image srcImg, int w, int h)
    {
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
    }
}
