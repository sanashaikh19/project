import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Report extends JFrame implements ActionListener
{
	static JButton button_SalesReport,button_ProductReport,button_OrderLogReport,button_CashDrawer,button_WastageReport,button_Feedback,
	button_ZHistory,button_DispatchReport,button_Close;
	JFrame frame=new JFrame("Report Menu");
	/*public static void main(String[] args) 
	{
		Report r=new Report();
	}*/
	public void Report()
	{
		JPanel panel_Main=new JPanel();
		panel_Main.setBackground(Color.GRAY);
		
		JPanel panel_Button=new JPanel();
		panel_Button.setBackground(Color.GRAY);
		
		button_SalesReport=new JButton("Sales Report");
		button_SalesReport.setPreferredSize(new Dimension(105,120));
		button_SalesReport.setBackground(Color.LIGHT_GRAY);
		button_SalesReport.addActionListener((ActionListener) this);
		
		button_ProductReport=new JButton("Product Report");
		button_ProductReport.setPreferredSize(new Dimension(105,120));
		button_ProductReport.setBackground(Color.LIGHT_GRAY);
		button_ProductReport.addActionListener((ActionListener) this);
		
	    button_OrderLogReport=new JButton("Order Log Report");
		button_OrderLogReport.setPreferredSize(new Dimension(105,120));
		button_OrderLogReport.setBackground(Color.LIGHT_GRAY);
		button_OrderLogReport.addActionListener((ActionListener) this);
		
		button_CashDrawer=new JButton("Cash Drawer");
		button_CashDrawer.setPreferredSize(new Dimension(105,120));
		button_CashDrawer.setBackground(Color.LIGHT_GRAY);
		button_CashDrawer.addActionListener((ActionListener) this);
		
		button_WastageReport=new JButton("Wastage Report");
		button_WastageReport.setPreferredSize(new Dimension(100,120));
		button_WastageReport.setBackground(Color.LIGHT_GRAY);
		button_WastageReport.addActionListener((ActionListener) this);
		
		button_Feedback=new JButton("Feedback");
		button_Feedback.setPreferredSize(new Dimension(100,120));
		button_Feedback.setBackground(Color.LIGHT_GRAY);
		button_Feedback.addActionListener((ActionListener) this);
		
		button_ZHistory=new JButton("Z History");
		button_ZHistory.setPreferredSize(new Dimension(100,120));
		button_ZHistory.setBackground(Color.LIGHT_GRAY);
		button_ZHistory.addActionListener((ActionListener) this);
		
		button_DispatchReport=new JButton("Dispatch Report");
		button_DispatchReport.setPreferredSize(new Dimension(100,120));
		button_DispatchReport.setBackground(Color.LIGHT_GRAY);
		button_DispatchReport.addActionListener((ActionListener) this);
		
		panel_Button.setLayout(new GridLayout(2,4,8,8));
		panel_Button.add(button_SalesReport);
		panel_Button.add(button_ProductReport);
		panel_Button.add(button_OrderLogReport);
		panel_Button.add(button_CashDrawer);
		panel_Button.add(button_WastageReport);
		panel_Button.add(button_Feedback);
		panel_Button.add(button_ZHistory);
		panel_Button.add(button_DispatchReport);
		
		button_Close=new JButton("Close");
		button_Close.setPreferredSize(new Dimension(450,80));
		button_Close.setBackground(Color.LIGHT_GRAY);
		button_Close.addActionListener(this);
		
		panel_Main.add(panel_Button);
		panel_Main.add(button_Close);
		
		frame.add(panel_Main);
		frame.setVisible(true);
		frame.setSize(480,390);
		frame.setLocation(400, 100);
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==button_SalesReport)
		{
			Sales_Report sr=new Sales_Report();
			sr.Sales_Report();
		}
		if(ae.getSource()==button_ProductReport)
		{
			Product_Report pr=new Product_Report();
			pr.Product_Report();
		}
		if(ae.getSource()==button_OrderLogReport)
		{
			Order_Report or=new Order_Report();
			or.Order_Report();
		}
		if(ae.getSource()==button_CashDrawer)
		{
			Cash_Drawer cd=new Cash_Drawer();
			cd.Cash_Drawer();
		}
		if(ae.getSource()==button_WastageReport)
		{
			Wastage_Report wr=new Wastage_Report();
			wr.Wastage_Report();
		}
		if(ae.getSource()==button_Feedback)
		{
			Feedback_List fl=new Feedback_List();
			fl.Feedback_List();
		}
		if(ae.getSource()==button_ZHistory)
		{
			Z_History zh=new Z_History();
			zh.Z_History();
		}
		if(ae.getSource()==button_DispatchReport)
		{
			Delivery_Report dr=new Delivery_Report();
			dr.Delivery_Report();
		}
		if(ae.getSource()==button_Close)
		{
			frame.dispose();
		}
	}
}