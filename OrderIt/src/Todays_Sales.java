import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Todays_Sales {

	public void Todays_Sales()
	{
		final JFrame MainFrame=new JFrame("Todays Sale");
		
		JPanel panel_todaysale=new JPanel();
		panel_todaysale.setPreferredSize(new Dimension(400,350));
		
		JPanel panel_Main=new JPanel();
		panel_Main.setBackground(Color.GRAY);
		panel_Main.setPreferredSize(new Dimension(500,450));
		
		JPanel panel_close=new JPanel();
		panel_close.setPreferredSize(new Dimension(300,50));
		
		ImageIcon image_takeout_sale = new ImageIcon("a.jpg");
		ImageIcon image_dinig_sale = new ImageIcon("a.jpg");
		ImageIcon image_delivery_sale = new ImageIcon("a.jpg");
		ImageIcon image_reservation = new ImageIcon("a.jpg");
		
		JLabel label_image_takeout_sale =new JLabel(image_takeout_sale );
		JLabel label_image_dinig_sale =new JLabel(image_dinig_sale);
		JLabel label_image_delivery_sale=new JLabel(image_delivery_sale);
		JLabel label_image_reservation =new JLabel(image_reservation);
		
		JLabel label_takeout_sale=new JLabel("Takeout Sale(0)");
		JLabel label_dinig_sale=new JLabel("Dining Sale(0)");
		JLabel label_delivery_sale=new JLabel("Delivery Sale(0)");
		JLabel label_reservation=new JLabel("Reservation");
		JLabel label_todays_total_sale=new JLabel("Today's Total Sale(0)");

		JTextField text_takeout_sale=new JTextField("0.00",5);
		text_takeout_sale.setBackground(Color.GRAY);
		JTextField text_dinig_sale=new JTextField("0.00",5);
		text_dinig_sale.setBackground(Color.GRAY);
		JTextField text_delivery_sale=new JTextField("0.00",5);
		text_delivery_sale.setBackground(Color.GRAY);
		JTextField text_reservation=new JTextField("0",5);
		text_reservation.setBackground(Color.GRAY);
		JTextField text_todays_total_sale=new JTextField("0",5);
		text_todays_total_sale.setBackground(Color.GRAY);
		
		JButton button_close=new JButton("Close");
		button_close.setPreferredSize(new Dimension(100,50));
		
		button_close.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	MainFrame.dispose();            	
            }
        });
		
		JLabel label_takeout_sale_currency=new JLabel("BHT");
		JLabel label_dinig_sale_currency=new JLabel("BHT");
		JLabel label_delivery_sale_currency=new JLabel("BHT");
		JLabel label_reservation_currency=new JLabel("");
		JLabel label_todays_total_sale_currency=new JLabel("BHT");
		
		JLabel label_image_reservation_currency=new JLabel("");
		
		panel_todaysale.add(label_image_takeout_sale );
		panel_todaysale.add(label_takeout_sale);
		panel_todaysale.add(text_takeout_sale);
		panel_todaysale.add(label_takeout_sale_currency);
		
		panel_todaysale.add(label_image_dinig_sale );
		panel_todaysale.add(label_dinig_sale);
		panel_todaysale.add(text_dinig_sale);
		panel_todaysale.add(label_dinig_sale_currency);
		
		panel_todaysale.add(label_image_delivery_sale);
		panel_todaysale.add(label_delivery_sale);
		panel_todaysale.add(text_delivery_sale);
		panel_todaysale.add(label_delivery_sale_currency);
		
		panel_todaysale.add(label_image_reservation);
		panel_todaysale.add(label_reservation);
		panel_todaysale.add(text_reservation);
		panel_todaysale.add(label_reservation_currency);
		
		
		panel_todaysale.add(label_image_reservation_currency);
		panel_todaysale.add(label_todays_total_sale);
		panel_todaysale.add(text_todays_total_sale);
		panel_todaysale.add(label_todays_total_sale_currency);
		
		panel_todaysale.setLayout(new GridLayout(5,4,10,10));
		panel_todaysale.setBackground(Color.GRAY);
		
		panel_close.add(button_close);
		panel_close.setBackground(Color.GRAY);
		
		
		panel_Main.add(panel_todaysale);
		panel_Main.add(panel_close);
		MainFrame.add(panel_Main);
		MainFrame.setVisible(true);
		MainFrame.setSize(400, 540);
		MainFrame.setLocation(400,150);
		MainFrame.pack();
		
	}

}
