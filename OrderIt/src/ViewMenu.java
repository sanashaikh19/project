import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ViewMenu extends JFrame
{
	public void ViewMenu() 
	{
		final JFrame frame=new JFrame("View Menu");
		
		JPanel Jpanel_MasterPage_ViewMenu_Mainpanel=new JPanel();
		Jpanel_MasterPage_ViewMenu_Mainpanel.setBackground(Color.GRAY);
		
		JPanel Jpanel_MasterPage_ViewMenu_Buttonpanel=new JPanel();
		Jpanel_MasterPage_ViewMenu_Buttonpanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ViewMenu_Buttonpanel.setPreferredSize(new Dimension(480,150));
		
		final JButton Jbutton_MasterPage_ViewMenu_Buttonpanel_POS=new JButton("POS");
		Jbutton_MasterPage_ViewMenu_Buttonpanel_POS.setPreferredSize(new Dimension(110,140));
		Jbutton_MasterPage_ViewMenu_Buttonpanel_POS.setBackground(Color.LIGHT_GRAY);
		
		JButton Jbutton_MasterPage_ViewMenu_Buttonpanel_Kitchen=new JButton("Kitchen");
		Jbutton_MasterPage_ViewMenu_Buttonpanel_Kitchen.setPreferredSize(new Dimension(110,140));
		Jbutton_MasterPage_ViewMenu_Buttonpanel_Kitchen.setBackground(Color.LIGHT_GRAY);
		
		Jbutton_MasterPage_ViewMenu_Buttonpanel_Kitchen.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	KitchenView k=new KitchenView();
            	k.KitchenView();
            }
        });
		
		JButton Jbutton_MasterPage_ViewMenu_Buttonpanel_Bar=new JButton("Bar");
		Jbutton_MasterPage_ViewMenu_Buttonpanel_Bar.setPreferredSize(new Dimension(110,140));
		Jbutton_MasterPage_ViewMenu_Buttonpanel_Bar.setBackground(Color.LIGHT_GRAY);
		
		JButton Jbutton_MasterPage_ViewMenu_Buttonpanel_Starteres=new JButton("Starteres");
		Jbutton_MasterPage_ViewMenu_Buttonpanel_Starteres.setPreferredSize(new Dimension(110,140));
		Jbutton_MasterPage_ViewMenu_Buttonpanel_Starteres.setBackground(Color.LIGHT_GRAY);
		
		Jpanel_MasterPage_ViewMenu_Buttonpanel.setLayout(new GridLayout(1,4,5,5));
		Jpanel_MasterPage_ViewMenu_Buttonpanel.add(Jbutton_MasterPage_ViewMenu_Buttonpanel_POS);
		Jpanel_MasterPage_ViewMenu_Buttonpanel.add(Jbutton_MasterPage_ViewMenu_Buttonpanel_Kitchen);
		Jpanel_MasterPage_ViewMenu_Buttonpanel.add(Jbutton_MasterPage_ViewMenu_Buttonpanel_Bar);
		Jpanel_MasterPage_ViewMenu_Buttonpanel.add(Jbutton_MasterPage_ViewMenu_Buttonpanel_Starteres);
		
		JPanel Jpanel_MasterPage_ViewMenu_Closepanel=new JPanel();
		Jpanel_MasterPage_ViewMenu_Closepanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ViewMenu_Closepanel.setPreferredSize(new Dimension(480,70));
		JButton Jbutton_MasterPage_ViewMenu_Closepanel_Close=new JButton("Close");
		Jbutton_MasterPage_ViewMenu_Closepanel_Close.setPreferredSize(new Dimension(480,70));
		Jbutton_MasterPage_ViewMenu_Closepanel_Close.setBackground(Color.LIGHT_GRAY);
		
		Jbutton_MasterPage_ViewMenu_Closepanel_Close.addActionListener(new ActionListener()
	    {
			public void actionPerformed(ActionEvent e)
	        {
	        	frame.dispose();
	        }
		});
		
		Jpanel_MasterPage_ViewMenu_Closepanel.add(Jbutton_MasterPage_ViewMenu_Closepanel_Close);
		
		Jpanel_MasterPage_ViewMenu_Mainpanel.add(Jpanel_MasterPage_ViewMenu_Buttonpanel);
		Jpanel_MasterPage_ViewMenu_Mainpanel.add(Jpanel_MasterPage_ViewMenu_Closepanel);
		
		frame.add(Jpanel_MasterPage_ViewMenu_Mainpanel);
		frame.setVisible(true);
	//	frame.setAlwaysOnTop(true);
		frame.setSize(510,280);
		frame.setLocation(450, 250);
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}