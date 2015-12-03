import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Management_Cash_Drawer extends JFrame 
{
	static String column[]=new String[]{"","","Count","Amount"};
	
	public void Management_Cash_Drawer()
	{
		final JFrame frame=new JFrame("CashDrawerForm");
		JPanel Jpanel_MasterPage_ManagementMenu_CashDrawer_Mainpanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		Jpanel_MasterPage_ManagementMenu_CashDrawer_Mainpanel.setBackground(Color.GRAY);
		
		JPanel Jpanel_MasterPage_ManagementMenu_CashDrawer_LabelPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_CashDrawer_LabelPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_LabelPanel.setPreferredSize(new Dimension(780,90));
		
		JLabel JLabel_MasterPage_ManagementMenu_CashDrawer_LabelPanel_CashLabel=new JLabel("Count Cash Drawer");
		JLabel_MasterPage_ManagementMenu_CashDrawer_LabelPanel_CashLabel.setPreferredSize(new Dimension(350,50));
		
		JLabel JLabel_MasterPage_ManagementMenu_CashDrawer_LabelPanel_ClientLabel=new JLabel("Client ID");
		JLabel_MasterPage_ManagementMenu_CashDrawer_LabelPanel_ClientLabel.setPreferredSize(new Dimension(90,50));
		
		JLabel JLabel_MasterPage_ManagementMenu_CashDrawer_LabelPanel_ManagerLabel=new JLabel("Manager");
		JLabel_MasterPage_ManagementMenu_CashDrawer_LabelPanel_ManagerLabel.setPreferredSize(new Dimension(90,50));
		
		JTextField JTextField_MasterPage_ManagementMenu_CashDrawer_LabelPanel_DateTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_CashDrawer_LabelPanel_DateTextF.setPreferredSize(new Dimension(150,30));
		JTextField_MasterPage_ManagementMenu_CashDrawer_LabelPanel_DateTextF.setBackground(Color.GRAY);
//		JTextField_MasterPage_ManagementMenu_CashDrawer_LabelPanel_DateTextF.FOCUS_ACCELERATOR_KEY.isEmpty();
		
		Jpanel_MasterPage_ManagementMenu_CashDrawer_LabelPanel.add(JLabel_MasterPage_ManagementMenu_CashDrawer_LabelPanel_CashLabel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_LabelPanel.add(JLabel_MasterPage_ManagementMenu_CashDrawer_LabelPanel_ClientLabel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_LabelPanel.add(JLabel_MasterPage_ManagementMenu_CashDrawer_LabelPanel_ManagerLabel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_LabelPanel.add(JTextField_MasterPage_ManagementMenu_CashDrawer_LabelPanel_DateTextF);

		JPanel Jpanel_MasterPage_ManagementMenu_CashDrawer_TablePanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_CashDrawer_TablePanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_TablePanel.setPreferredSize(new Dimension(380,470));
		
		JLabel JLabel_MasterPage_ManagementMenu_CashDrawer_TablePanel_BegginingLabel=new JLabel("Beggining Cash");
		JLabel_MasterPage_ManagementMenu_CashDrawer_TablePanel_BegginingLabel.setPreferredSize(new Dimension(150,30));
		
		JTextField JTextField_MasterPage_ManagementMenu_CashDrawer_TablePanel_BeggingTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_CashDrawer_TablePanel_BeggingTextF.setPreferredSize(new Dimension(150,20));
		
		DefaultTableModel table_model=new DefaultTableModel(column,0);
		JTable JTable_MasterPage_ManagementMenu_CashDrawer_TablePanel_Table=new JTable(table_model);
		JScrollPane jsp=new JScrollPane(JTable_MasterPage_ManagementMenu_CashDrawer_TablePanel_Table);
		jsp.setPreferredSize(new Dimension(360,350));
		
		JLabel JLabel_MasterPage_ManagementMenu_CashDrawer_TablePanel_EndingCashLabel=new JLabel("Ending Cash");
		JLabel_MasterPage_ManagementMenu_CashDrawer_TablePanel_EndingCashLabel.setPreferredSize(new Dimension(120,25));
		
		JTextField JTextField_MasterPage_ManagementMenu_CashDrawer_TablePanel_EndingCashTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_CashDrawer_TablePanel_EndingCashTextF.setPreferredSize(new Dimension(170,25));
		
		JLabel JLabel_MasterPage_ManagementMenu_CashDrawer_TablePanel_CashTillDifferenceLabel=new JLabel("Cash Till Difference");
		JLabel_MasterPage_ManagementMenu_CashDrawer_TablePanel_CashTillDifferenceLabel.setPreferredSize(new Dimension(120,25));
		
		JTextField JTextField_MasterPage_ManagementMenu_CashDrawer_TablePanel_CashTillDifferenceTextF=new JTextField();
		JTextField_MasterPage_ManagementMenu_CashDrawer_TablePanel_CashTillDifferenceTextF.setPreferredSize(new Dimension(170,25));
		
		
		Jpanel_MasterPage_ManagementMenu_CashDrawer_TablePanel.add(JLabel_MasterPage_ManagementMenu_CashDrawer_TablePanel_BegginingLabel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_TablePanel.add(JTextField_MasterPage_ManagementMenu_CashDrawer_TablePanel_BeggingTextF);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_TablePanel.add(jsp);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_TablePanel.add(JLabel_MasterPage_ManagementMenu_CashDrawer_TablePanel_EndingCashLabel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_TablePanel.add(JTextField_MasterPage_ManagementMenu_CashDrawer_TablePanel_EndingCashTextF);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_TablePanel.add(JLabel_MasterPage_ManagementMenu_CashDrawer_TablePanel_CashTillDifferenceLabel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_TablePanel.add(JTextField_MasterPage_ManagementMenu_CashDrawer_TablePanel_CashTillDifferenceTextF);
		
		JPanel Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.setPreferredSize(new Dimension(380,470));
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.setLayout(new GridLayout(12,2,10,20));
		

		JLabel JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_ChecksLabel=new JLabel("Checks");
		JTextField JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_ChecksTextF=new JTextField();
	
		JLabel JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_CreditCardLabel=new JLabel("Credit Card");
		JTextField JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_CreditCardTextF=new JTextField();
		
		JLabel JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_GiftCardLabel=new JLabel("Gift Card");
		JTextField JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_GiftCardTextF=new JTextField();
		
		JLabel JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_TravellersChecksLabel=new JLabel("Travellers Checks");
		JTextField JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_TravellersChecksTextF=new JTextField();
		
		JLabel JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_TotalCashSalesLabel=new JLabel("Total Cash Sales");
		JTextField JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_TotalCashSalesTextF=new JTextField();
		
		JLabel JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_TotalSalesLabel=new JLabel("Total Sales");
		JTextField JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_TotalSalesTextF=new JTextField();
		
		JLabel JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_TotalExpensesLabel=new JLabel("Total Expenses");
		JTextField JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_TotalExpensesTextF=new JTextField();
		
		JLabel JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_TotalCashinCounterLabel=new JLabel("Total Cash in Counter");
		JTextField JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_TotalCashinCounterTextF=new JTextField();
		
		JLabel JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_ExpectedRemainingCashinCounterLabel=new JLabel("Expected Remaining Cash in Counter");
		JTextField JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_ExpectedRemainingCashinCounterTextF=new JTextField();
		
		JLabel JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_CashDrawerOffByLabel=new JLabel("Cash Drawer Off By");
		JTextField JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_CashDrawerOffByTextF=new JTextField();
		
		JLabel JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_OnAccountSalesLabel=new JLabel("On Account Sales");
		JTextField JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_OnAccountSalesTextF=new JTextField();
		
		JLabel JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_BeginningBalanceOfNextDayLabel=new JLabel("Beginning Balance Of Next Day");
		JTextField JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_BeginningBalanceOfNextDayTextF=new JTextField();
		
		
		
		
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_ChecksLabel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_ChecksTextF);
		
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_CreditCardLabel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_CreditCardTextF);
		
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_GiftCardLabel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_GiftCardTextF);
		
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_TravellersChecksLabel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_TravellersChecksTextF);
		
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_TotalCashSalesLabel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_TotalCashSalesTextF);
		
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_TotalSalesLabel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_TotalSalesTextF);
		
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_TotalExpensesLabel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_TotalExpensesTextF);
		
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_TotalCashinCounterLabel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_TotalCashinCounterTextF);
		
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_ExpectedRemainingCashinCounterLabel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_ExpectedRemainingCashinCounterTextF);
		
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_CashDrawerOffByLabel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_CashDrawerOffByTextF);
		
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_OnAccountSalesLabel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_OnAccountSalesTextF);
		
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JLabel_MasterPage_ManagementMenu_CashDrawer_GridPanel_BeginningBalanceOfNextDayLabel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel.add(JTextField_MasterPage_ManagementMenu_CashDrawer_GridPanel_BeginningBalanceOfNextDayTextF);
		
		
		
		JButton JButton_MasterPage_ManagementMenu_CashDrawer_Mainpanel_OKbutton=new JButton("OK");
		JButton_MasterPage_ManagementMenu_CashDrawer_Mainpanel_OKbutton.setBackground(Color.LIGHT_GRAY);
		JButton_MasterPage_ManagementMenu_CashDrawer_Mainpanel_OKbutton.setPreferredSize(new Dimension(100,50));
		
		JButton JButton_MasterPage_ManagementMenu_CashDrawer_Mainpanel_Cancelbutton=new JButton("Cancel");
		JButton_MasterPage_ManagementMenu_CashDrawer_Mainpanel_Cancelbutton.setBackground(Color.LIGHT_GRAY);
		JButton_MasterPage_ManagementMenu_CashDrawer_Mainpanel_Cancelbutton.setPreferredSize(new Dimension(100,50));
		
		JButton_MasterPage_ManagementMenu_CashDrawer_Mainpanel_Cancelbutton.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				frame.dispose();
	        }
	    });
				
		
		Jpanel_MasterPage_ManagementMenu_CashDrawer_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_CashDrawer_LabelPanel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_CashDrawer_TablePanel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_CashDrawer_GridPanel);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_Mainpanel.add(JButton_MasterPage_ManagementMenu_CashDrawer_Mainpanel_OKbutton);
		Jpanel_MasterPage_ManagementMenu_CashDrawer_Mainpanel.add(JButton_MasterPage_ManagementMenu_CashDrawer_Mainpanel_Cancelbutton);
		
		
		frame.add(Jpanel_MasterPage_ManagementMenu_CashDrawer_Mainpanel);
		frame.setVisible(true);
		frame.setSize(800,700);
		frame.setLocation(300,10);
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}