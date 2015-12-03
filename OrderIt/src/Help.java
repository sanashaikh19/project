import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Help extends JFrame implements ActionListener
{
	JFrame frame=new JFrame("Help Menu");
	JButton button_FAQ,button_InsructionVideos,button_OpenTroubleTicket,button_DownloadApps,button_AndroidClient,button_POSManual,button_Register,
	button_LicenseInfo,button_CheckUpdate,button_AboutUs,button_TableQR,button_TakeawayQR,button_Close;
/*	public static void main(String[] args) 
	{	
		Help h=new Help();
	}*/
	public void Help()
	{
		JPanel panel_Main=new JPanel();
		panel_Main.setBackground(Color.GRAY);

		JPanel panel_Button=new JPanel();
		panel_Button.setBackground(Color.GRAY);

		button_FAQ=new JButton("FAQ");
		button_FAQ.setPreferredSize(new Dimension(105,140));
		button_FAQ.setBackground(Color.LIGHT_GRAY);
		button_FAQ.addActionListener(this);

		button_InsructionVideos=new JButton("Insruction Videos");
		button_InsructionVideos.setPreferredSize(new Dimension(105,140));
		button_InsructionVideos.setBackground(Color.LIGHT_GRAY);
		button_InsructionVideos.addActionListener(this);

		button_OpenTroubleTicket=new JButton("Open Trouble Ticket");
		button_OpenTroubleTicket.setPreferredSize(new Dimension(105,140));
		button_OpenTroubleTicket.setBackground(Color.LIGHT_GRAY);
		button_OpenTroubleTicket.addActionListener(this);

		button_DownloadApps=new JButton("Download Apps");
		button_DownloadApps.setPreferredSize(new Dimension(105,140));
		button_DownloadApps.setBackground(Color.LIGHT_GRAY);
		button_DownloadApps.addActionListener(this);

		button_AndroidClient=new JButton("Android Client Installation Guide");
		button_AndroidClient.setPreferredSize(new Dimension(100,140));
		button_AndroidClient.setBackground(Color.LIGHT_GRAY);
		button_AndroidClient.addActionListener(this);

		button_POSManual=new JButton("POS Manual");
		button_POSManual.setPreferredSize(new Dimension(100,140));
		button_POSManual.setBackground(Color.LIGHT_GRAY);
		button_POSManual.addActionListener(this);

		button_Register=new JButton("Register");
		button_Register.setPreferredSize(new Dimension(100,140));
		button_Register.setBackground(Color.LIGHT_GRAY);
		button_Register.addActionListener(this);

		button_LicenseInfo=new JButton("LicenseInfo");
		button_LicenseInfo.setPreferredSize(new Dimension(100,140));
		button_LicenseInfo.setBackground(Color.LIGHT_GRAY);
		button_LicenseInfo.addActionListener(this);

		button_CheckUpdate=new JButton("Check Update");
		button_CheckUpdate.setPreferredSize(new Dimension(100,140));
		button_CheckUpdate.setBackground(Color.LIGHT_GRAY);
		button_CheckUpdate.addActionListener(this);

		button_AboutUs=new JButton("About Us");
		button_AboutUs.setPreferredSize(new Dimension(100,140));
		button_AboutUs.setBackground(Color.LIGHT_GRAY);
		button_AboutUs.addActionListener(this);

		button_TableQR=new JButton("Table QR Code Generator");
		button_TableQR.setPreferredSize(new Dimension(100,140));
		button_TableQR.setBackground(Color.LIGHT_GRAY);
		button_TableQR.addActionListener(this);

		button_TakeawayQR=new JButton("Takeaway QR Code Generator");
		button_TakeawayQR.setPreferredSize(new Dimension(100,140));
		button_TakeawayQR.setBackground(Color.LIGHT_GRAY);
		button_TakeawayQR.addActionListener(this);

		panel_Button.setLayout(new GridLayout(3,4,8,8));
		panel_Button.add(button_FAQ);
		panel_Button.add(button_InsructionVideos);
		panel_Button.add(button_OpenTroubleTicket);
		panel_Button.add(button_DownloadApps);
		panel_Button.add(button_AndroidClient);
		panel_Button.add(button_POSManual);
		panel_Button.add(button_Register);
		panel_Button.add(button_LicenseInfo);
		panel_Button.add(button_CheckUpdate);
		panel_Button.add(button_AboutUs);
		panel_Button.add(button_TableQR);
		panel_Button.add(button_TakeawayQR);

		button_Close=new JButton("Close");
		button_Close.setPreferredSize(new Dimension(450,80));
		button_Close.setBackground(Color.LIGHT_GRAY);
		button_Close.addActionListener(this);

		panel_Main.add(panel_Button);
		panel_Main.add(button_Close);

		frame.add(panel_Main);
		frame.setVisible(true);
		frame.setSize(500,580);
		frame.setLocation(400, 50);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == button_Close)
		{
			frame.dispose();
		}
		if (ae.getSource() == button_FAQ)
		{
			JOptionPane.showMessageDialog(frame,
				    "Eggs are not supposed to be green.",
				    "Inane error",
				    JOptionPane.ERROR_MESSAGE);
		}
		if (ae.getSource() == button_InsructionVideos)
		{
			 JOptionPane.showMessageDialog(frame, "Sample dialog box");
		}
		if (ae.getSource() == button_OpenTroubleTicket)
		{
			 JOptionPane.showMessageDialog(frame, "Sample dialog box");
		}
		if (ae.getSource() == button_DownloadApps)
		{
			Download_Apps da=new Download_Apps();

		}
		if (ae.getSource() == button_AndroidClient)
		{
			 JOptionPane.showMessageDialog(frame, "Sample dialog box");
		}

		if (ae.getSource() == button_POSManual)
		{

		}
		if (ae.getSource() == button_Register)
		{

		}
		if (ae.getSource() == button_LicenseInfo)
		{
			OderIt_POS_Lisence_Activation la=new OderIt_POS_Lisence_Activation();

		}
		if (ae.getSource() == button_CheckUpdate)
		{

		}
		if (ae.getSource() == button_AboutUs)
		{
			About a=new About();

		}
		if (ae.getSource() == button_TableQR)
		{
			Table_QRCode_Generator TQRCode=new Table_QRCode_Generator();

		}
		if (ae.getSource() == button_TakeawayQR)
		{
			Takeaway_QRCode_Generator takeaway=new Takeaway_QRCode_Generator();

		}

	}
}
