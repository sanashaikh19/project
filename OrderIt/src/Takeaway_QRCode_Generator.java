import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class Takeaway_QRCode_Generator implements ActionListener
{
	JButton button_close,button_download;
	JFrame MainFrame = new JFrame("Takeaway QRCode Generator");
	public static void main(String[] args) 
	{
		Takeaway_QRCode_Generator takeaway=new Takeaway_QRCode_Generator();
	}
	public Takeaway_QRCode_Generator()
	{
		JPanel panel_main = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_main.setBackground(Color.GRAY);
		panel_main.setPreferredSize(new Dimension(280, 230));
		
		JPanel panel_qrcode=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_qrcode.setBackground(Color.GRAY);
		panel_qrcode.setBorder(new TitledBorder(""));
		panel_qrcode.setPreferredSize(new Dimension(150,150));	
		
		button_close=new JButton("Close");
		button_close.setPreferredSize(new Dimension(130,50));
		button_close.addActionListener(this);
		
		button_download=new JButton("Download");
		button_download.setPreferredSize(new Dimension(130,50));
		button_download.addActionListener(this);

		panel_main.add(panel_qrcode);
		panel_main.add(button_download);
		panel_main.add(button_close);
		
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500,500);
		MainFrame.pack();
		MainFrame.setLocation(450, 200);
	}
	public void actionPerformed(ActionEvent ae) 
	{
		if (ae.getSource() == button_close)
		{
			MainFrame.dispose();
		}
		if (ae.getSource() == button_download)
		{

		}
		
	}

}
