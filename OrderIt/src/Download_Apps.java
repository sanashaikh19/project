import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class Download_Apps implements ActionListener
{
	JFrame MainFrame=new JFrame("Download Apps");
	JButton button_close,button_download_pos,button_download_waiter;
	public static void main(String[] args)
	{
		Download_Apps da=new Download_Apps();
	}
	public Download_Apps()
	{
		JPanel panel_main=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_main.setBackground(Color.GRAY);
		panel_main.setPreferredSize(new Dimension(420,600));
		
		JPanel panel_orderit_pos_app=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_orderit_pos_app.setBackground(Color.GRAY);
		panel_orderit_pos_app.setBorder(new TitledBorder("OderIt POS App"));
		panel_orderit_pos_app.setPreferredSize(new Dimension(200,500));
		
		JPanel panel_orderit_waiter_app=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_orderit_waiter_app.setBackground(Color.GRAY);
		panel_orderit_waiter_app.setBorder(new TitledBorder("OderIt waiter App"));
		panel_orderit_waiter_app.setPreferredSize(new Dimension(200,500));	

		JPanel panel_qrcode_orderit_pos_app=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_qrcode_orderit_pos_app.setBackground(Color.GRAY);
		panel_qrcode_orderit_pos_app.setBorder(new TitledBorder(""));
		panel_qrcode_orderit_pos_app.setPreferredSize(new Dimension(180,180));
		
		JPanel panel_qrcode_orderit_waiter_app=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_qrcode_orderit_waiter_app.setBackground(Color.GRAY);
		panel_qrcode_orderit_waiter_app.setBorder(new TitledBorder(""));
		panel_qrcode_orderit_waiter_app.setPreferredSize(new Dimension(180,180));
		
		JLabel label_scan_qrcode_to_download_to_u_device=new JLabel("Scan QRCode to Download to Your Device");
		label_scan_qrcode_to_download_to_u_device.setPreferredSize(new Dimension(400,30));
		
		JLabel label_oderit_pos_app_or=new JLabel("OR");
		JLabel label_oderit_waiter_app_or=new JLabel("OR");
		
		button_close=new JButton("Close");
		button_close.setPreferredSize(new Dimension(200,50));
		button_close.addActionListener(this);
		
		ImageIcon image_oderit_pos_app= new ImageIcon("a.jpg");
		JLabel label_oderit_pos_app=new JLabel(image_oderit_pos_app);
		label_oderit_pos_app.setPreferredSize(new Dimension(180,200));
		
		ImageIcon image_oderit_waiter_app= new ImageIcon("a.jpg");
		JLabel label_oderit_waiter_app=new JLabel(image_oderit_waiter_app);
		label_oderit_waiter_app.setPreferredSize(new Dimension(180,200));
		
		button_download_pos=new JButton("Download Directly to Computer");
		button_download_pos.setPreferredSize(new Dimension(180,50));
		button_download_pos.addActionListener(this);
		
		button_download_waiter=new JButton("Download Directly to Computer");
		button_download_waiter.setPreferredSize(new Dimension(180,50));
		button_download_waiter.addActionListener(this);
		
		panel_orderit_pos_app.add(label_oderit_pos_app);
		panel_orderit_pos_app.add(panel_qrcode_orderit_pos_app);
		panel_orderit_pos_app.add(label_oderit_pos_app_or);
		panel_orderit_pos_app.add(button_download_pos);
		
		panel_orderit_waiter_app.add(label_oderit_waiter_app);
		panel_orderit_waiter_app.add(panel_qrcode_orderit_waiter_app);
		panel_orderit_waiter_app.add(label_oderit_waiter_app_or);
		panel_orderit_waiter_app.add(button_download_waiter);
		
		panel_main.add(label_scan_qrcode_to_download_to_u_device);
		panel_main.add(panel_orderit_pos_app);
		panel_main.add(panel_orderit_waiter_app);
		panel_main.add(button_close);
		MainFrame.add(panel_main);
		MainFrame.setVisible(true);
		MainFrame.setSize(500,500);
		MainFrame.pack();
		MainFrame.setLocation(400, 50);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == button_close)
		{
			MainFrame.dispose();
		}
		if (ae.getSource() == button_download_pos)
		{
			
		}
		if (ae.getSource() == button_download_waiter)
		{
		
		}
		
	}

}
