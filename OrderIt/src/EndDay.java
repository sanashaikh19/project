import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class EndDay extends JFrame
{
	private static final long serialVersionUID = 1L;

	public void EndDay() 
	{
		final JFrame frame=new JFrame("EndDay");
        
        JPanel Jpanel_MasterPage_SystemPanel_EndDay_Mainpanel=new JPanel();
        Jpanel_MasterPage_SystemPanel_EndDay_Mainpanel.setBackground(Color.GRAY);
        Jpanel_MasterPage_SystemPanel_EndDay_Mainpanel.setPreferredSize(new Dimension(320,190));
        
        /*JPanel Jpanel_MasterPage_SystemPanel_EndDay_LabelPanel=new JPanel();
        Jpanel_MasterPage_SystemPanel_EndDay_LabelPanel.setPreferredSize(new Dimension(300,40));
        Jpanel_MasterPage_SystemPanel_EndDay_LabelPanel.setBackground(Color.GRAY);
        */
        JLabel JLabel_MasterPage_SystemPanel_EndDay_LabelPanel_Label=new JLabel("Please Enter Your login password");
        JLabel_MasterPage_SystemPanel_EndDay_LabelPanel_Label.setBackground(Color.GRAY);
        JLabel_MasterPage_SystemPanel_EndDay_LabelPanel_Label.setPreferredSize(new Dimension(290,30));
        
        //Jpanel_MasterPage_SystemPanel_EndDay_LabelPanel.add(JLabel_MasterPage_SystemPanel_EndDay_LabelPanel_Label);
        
        /*JPanel Jpanel_MasterPage_SystemPanel_EndDay_TextPanel=new JPanel();
        Jpanel_MasterPage_SystemPanel_EndDay_TextPanel.setBackground(Color.GRAY);
        */
        JTextField JTextField_MasterPage_SystemPanel_EndDay_TextPanel_TextF=new JTextField();
        JTextField_MasterPage_SystemPanel_EndDay_TextPanel_TextF.setBackground(Color.white);
        JTextField_MasterPage_SystemPanel_EndDay_TextPanel_TextF.setPreferredSize(new Dimension(290,45));
        
        //Jpanel_MasterPage_SystemPanel_EndDay_TextPanel.add(JTextField_MasterPage_SystemPanel_EndDay_TextPanel_TextF);
        
        /*JPanel Jpanel_MasterPage_SystemPanel_EndDay_ButtonsPanel=new JPanel();
        Jpanel_MasterPage_SystemPanel_EndDay_ButtonsPanel.setPreferredSize(new Dimension(340,60));
        Jpanel_MasterPage_SystemPanel_EndDay_ButtonsPanel.setBackground(Color.GRAY);
        */
        JButton Jbutton_MasterPage_SystemPanel_EndDay_ButtonsPanel_OKButton=new JButton("OK");
        Jbutton_MasterPage_SystemPanel_EndDay_ButtonsPanel_OKButton.setPreferredSize(new Dimension(110,50));
        Jbutton_MasterPage_SystemPanel_EndDay_ButtonsPanel_OKButton.setBackground(Color.LIGHT_GRAY);
                
        JButton Jbutton_MasterPage_SystemPanel_EndDay_ButtonsPanel_EmptyButton=new JButton("");
        Jbutton_MasterPage_SystemPanel_EndDay_ButtonsPanel_EmptyButton.setBorder(new LineBorder(Color.GRAY));
        Jbutton_MasterPage_SystemPanel_EndDay_ButtonsPanel_EmptyButton.setPreferredSize(new Dimension(60,50));
        Jbutton_MasterPage_SystemPanel_EndDay_ButtonsPanel_EmptyButton.setBackground(Color.GRAY);
                
        JButton Jbutton_MasterPage_SystemPanel_EndDay_ButtonsPanel_CancelButton=new JButton("Cancel");
        Jbutton_MasterPage_SystemPanel_EndDay_ButtonsPanel_CancelButton.setPreferredSize(new Dimension(110,50));
        Jbutton_MasterPage_SystemPanel_EndDay_ButtonsPanel_CancelButton.setBackground(Color.LIGHT_GRAY);
        
        Jbutton_MasterPage_SystemPanel_EndDay_ButtonsPanel_CancelButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                frame.dispose();
            }
        });
        
       /* Jpanel_MasterPage_SystemPanel_EndDay_ButtonsPanel.add(Jbutton_MasterPage_SystemPanel_EndDay_ButtonsPanel_OKButton,BorderLayout.WEST);
        Jpanel_MasterPage_SystemPanel_EndDay_ButtonsPanel.add(Jbutton_MasterPage_SystemPanel_EndDay_ButtonsPanel_EmptyButton,BorderLayout.CENTER);
        Jpanel_MasterPage_SystemPanel_EndDay_ButtonsPanel.add(Jbutton_MasterPage_SystemPanel_EndDay_ButtonsPanel_CancelButton,BorderLayout.EAST);
        */
        /*Jpanel_MasterPage_SystemPanel_EndDay_Mainpanel.add(Jpanel_MasterPage_SystemPanel_EndDay_LabelPanel);
        Jpanel_MasterPage_SystemPanel_EndDay_Mainpanel.add(Jpanel_MasterPage_SystemPanel_EndDay_TextPanel);
        Jpanel_MasterPage_SystemPanel_EndDay_Mainpanel.add(Jpanel_MasterPage_SystemPanel_EndDay_ButtonsPanel);
        */
        Jpanel_MasterPage_SystemPanel_EndDay_Mainpanel.add(JLabel_MasterPage_SystemPanel_EndDay_LabelPanel_Label);
        Jpanel_MasterPage_SystemPanel_EndDay_Mainpanel.add(JTextField_MasterPage_SystemPanel_EndDay_TextPanel_TextF);
        Jpanel_MasterPage_SystemPanel_EndDay_Mainpanel.add(Jbutton_MasterPage_SystemPanel_EndDay_ButtonsPanel_OKButton);
        Jpanel_MasterPage_SystemPanel_EndDay_Mainpanel.add(Jbutton_MasterPage_SystemPanel_EndDay_ButtonsPanel_EmptyButton);
        Jpanel_MasterPage_SystemPanel_EndDay_Mainpanel.add(Jbutton_MasterPage_SystemPanel_EndDay_ButtonsPanel_CancelButton);
        
        frame.add(Jpanel_MasterPage_SystemPanel_EndDay_Mainpanel);
        frame.setVisible(true);
        frame.setSize(330,200);
        frame.setLocation(520,250);
      //  frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}