import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Properties;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class POS_Reservation_Addd extends JFrame 
{
	static String column[]=new String[]{" Name "," Price "," Count "," Total "};
	
	public void POS_Reservation_Addd() 
	{
		final JFrame frame=new JFrame("Order Details");
		
		JPanel Jpanel_MasterPage_POS_Reservation_Add_Mainpanel=new JPanel();
		Jpanel_MasterPage_POS_Reservation_Add_Mainpanel.setBackground(Color.gray);
		
		JPanel Jpanel_MasterPage_POS_Reservation_Add_FirstPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		Jpanel_MasterPage_POS_Reservation_Add_FirstPanel.setBackground(Color.gray);
		Jpanel_MasterPage_POS_Reservation_Add_FirstPanel.setPreferredSize(new Dimension(450,685));
		
		JPanel Jpanel_MasterPage_POS_Reservation_Add_ReservationPanel=new JPanel();
		Jpanel_MasterPage_POS_Reservation_Add_ReservationPanel.setBackground(Color.gray);
		Jpanel_MasterPage_POS_Reservation_Add_ReservationPanel.setPreferredSize(new Dimension(440,280));
		
		JLabel JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_NameLabel=new JLabel("Name");
		JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_NameLabel.setBackground(Color.GRAY);
		JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_NameLabel.setPreferredSize(new Dimension(130,30));
		
		String Name_Combo[]=new String[]{""};
		JComboBox JCombobox_MasterPage_POS_Reservation_Add_ReservationPanel_NameCombo=new JComboBox(Name_Combo);
		JCombobox_MasterPage_POS_Reservation_Add_ReservationPanel_NameCombo.setPreferredSize(new Dimension(250,30));
		
		JLabel JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_PhoneLabel=new JLabel("Phone");
		JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_PhoneLabel.setBackground(Color.GRAY);
		JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_PhoneLabel.setPreferredSize(new Dimension(130,30));
		
		String Phone_Combo[]=new String[]{""};
		JComboBox JCombobox_MasterPage_POS_Reservation_Add_ReservationPanel_PhoneCombo=new JComboBox(Name_Combo);
		JCombobox_MasterPage_POS_Reservation_Add_ReservationPanel_PhoneCombo.setPreferredSize(new Dimension(250,30));
		
		JLabel JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_DateLabel=new JLabel("Date");
		JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_DateLabel.setBackground(Color.GRAY);
		JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_DateLabel.setPreferredSize(new Dimension(130,30));
		
		Properties p = new Properties();
        UtilDateModel model= new UtilDateModel();
        model.setSelected(true);
        JDatePanelImpl datePanel = new JDatePanelImpl(model,p);
        JDatePickerImpl JDatePicker_MasterPage_ViewPanel_POS_ButtonPanel_ReservationButton_typePanel_datePicker = new JDatePickerImpl(datePanel,null);
        JDatePicker_MasterPage_ViewPanel_POS_ButtonPanel_ReservationButton_typePanel_datePicker.setPreferredSize(new Dimension(165,30));
        		
        JSpinner spinner_date=new JSpinner();
		SpinnerDateModel model_date = new SpinnerDateModel();
		model_date.setCalendarField(Calendar.MINUTE);
		spinner_date.setModel(model_date);
		spinner_date.setEditor(new JSpinner.DateEditor(spinner_date, "hh:mm a"));
		spinner_date.setPreferredSize(new Dimension(80,25));
		
		JLabel JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_NumberOfPeopleLabel=new JLabel("Number of People");
		JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_NumberOfPeopleLabel.setBackground(Color.GRAY);
		JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_NumberOfPeopleLabel.setPreferredSize(new Dimension(130,30));
        
		JTextField JTextField_MasterPage_POS_Reservation_Add_ReservationPanel_NumberOfPeopleTextF=new JTextField();
		JTextField_MasterPage_POS_Reservation_Add_ReservationPanel_NumberOfPeopleTextF.setBackground(Color.white);
		JTextField_MasterPage_POS_Reservation_Add_ReservationPanel_NumberOfPeopleTextF.setPreferredSize(new Dimension(250,30));
        
		JLabel JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_CommentLabel=new JLabel("Comment");
		JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_CommentLabel.setBackground(Color.GRAY);
		JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_CommentLabel.setPreferredSize(new Dimension(130,30));
        
		JTextArea JTextArea_MasterPage_POS_Reservation_Add_ReservationPanel_CommentTextA=new JTextArea();
		JTextArea_MasterPage_POS_Reservation_Add_ReservationPanel_CommentTextA.setBackground(Color.white);
		JTextArea_MasterPage_POS_Reservation_Add_ReservationPanel_CommentTextA.setPreferredSize(new Dimension(250,90));
        
		JLabel JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_TableNumberLabel=new JLabel("Table Number");
		JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_TableNumberLabel.setBackground(Color.GRAY);
		JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_TableNumberLabel.setPreferredSize(new Dimension(130,30));
        
		JButton Jbutton_MasterPage_POS_Reservation_Add_ReservationPanel_TableNumberButton=new JButton("Move To Table");
		Jbutton_MasterPage_POS_Reservation_Add_ReservationPanel_TableNumberButton.setBackground(Color.LIGHT_GRAY);
		Jbutton_MasterPage_POS_Reservation_Add_ReservationPanel_TableNumberButton.setPreferredSize(new Dimension(250,30));
        
		Jpanel_MasterPage_POS_Reservation_Add_ReservationPanel.add(JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_NameLabel);
		Jpanel_MasterPage_POS_Reservation_Add_ReservationPanel.add(JCombobox_MasterPage_POS_Reservation_Add_ReservationPanel_NameCombo);
		Jpanel_MasterPage_POS_Reservation_Add_ReservationPanel.add(JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_PhoneLabel);
		Jpanel_MasterPage_POS_Reservation_Add_ReservationPanel.add(JCombobox_MasterPage_POS_Reservation_Add_ReservationPanel_PhoneCombo);
		Jpanel_MasterPage_POS_Reservation_Add_ReservationPanel.add(JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_DateLabel);
		Jpanel_MasterPage_POS_Reservation_Add_ReservationPanel.add(JDatePicker_MasterPage_ViewPanel_POS_ButtonPanel_ReservationButton_typePanel_datePicker);
		Jpanel_MasterPage_POS_Reservation_Add_ReservationPanel.add(spinner_date);
		Jpanel_MasterPage_POS_Reservation_Add_ReservationPanel.add(JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_NumberOfPeopleLabel);
		Jpanel_MasterPage_POS_Reservation_Add_ReservationPanel.add(JTextField_MasterPage_POS_Reservation_Add_ReservationPanel_NumberOfPeopleTextF);
		Jpanel_MasterPage_POS_Reservation_Add_ReservationPanel.add(JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_CommentLabel);
		Jpanel_MasterPage_POS_Reservation_Add_ReservationPanel.add(JTextArea_MasterPage_POS_Reservation_Add_ReservationPanel_CommentTextA);
		Jpanel_MasterPage_POS_Reservation_Add_ReservationPanel.add(JLabel_MasterPage_POS_Reservation_Add_ReservationPanel_TableNumberLabel);
		Jpanel_MasterPage_POS_Reservation_Add_ReservationPanel.add(Jbutton_MasterPage_POS_Reservation_Add_ReservationPanel_TableNumberButton);
		
		DefaultTableModel table_model=new DefaultTableModel(column,0);
		JTable JTable__MasterPage_POS_Reservation_Add_ReservationPanel_Table = new JTable(table_model );
		JScrollPane jsp=new JScrollPane(JTable__MasterPage_POS_Reservation_Add_ReservationPanel_Table);
		jsp.setPreferredSize(new Dimension(430,150));
		
		JLabel empty=new JLabel("");
		empty.setBackground(Color.GRAY);
		empty.setPreferredSize(new Dimension(270,30));
		
		JLabel JLabel_MasterPage_POS_Reservation_Add_TotalPriceLabel=new JLabel("Total Price");
		JLabel_MasterPage_POS_Reservation_Add_TotalPriceLabel.setBackground(Color.GRAY);
		JLabel_MasterPage_POS_Reservation_Add_TotalPriceLabel.setPreferredSize(new Dimension(80,30));
        
		JTextField JTextField_MasterPage_POS_Reservation_Add_TotalPriceTextF=new JTextField();
		JTextField_MasterPage_POS_Reservation_Add_TotalPriceTextF.setBackground(Color.white);
		JTextField_MasterPage_POS_Reservation_Add_TotalPriceTextF.setPreferredSize(new Dimension(40,20));
		
		JLabel empty1=new JLabel("");
		empty1.setBackground(Color.GRAY);
		empty1.setPreferredSize(new Dimension(140,30));
		
		JLabel JLabel_MasterPage_POS_Reservation_Add_TotalItemsLabel=new JLabel("Total Items");
		JLabel_MasterPage_POS_Reservation_Add_TotalItemsLabel.setBackground(Color.GRAY);
		JLabel_MasterPage_POS_Reservation_Add_TotalItemsLabel.setPreferredSize(new Dimension(80,30));
        
		JTextField JTextField_MasterPage_POS_Reservation_Add_TotalItemsTextF=new JTextField();
		JTextField_MasterPage_POS_Reservation_Add_TotalItemsTextF.setBackground(Color.white);
		JTextField_MasterPage_POS_Reservation_Add_TotalItemsTextF.setPreferredSize(new Dimension(40,20));
		
		JLabel JLabel_MasterPage_POS_Reservation_Add_DiscountLabel=new JLabel("Discount");
		JLabel_MasterPage_POS_Reservation_Add_DiscountLabel.setBackground(Color.GRAY);
		JLabel_MasterPage_POS_Reservation_Add_DiscountLabel.setPreferredSize(new Dimension(80,30));
        
		JTextField JTextField_MasterPage_POS_Reservation_Add_DiscountTextF=new JTextField();
		JTextField_MasterPage_POS_Reservation_Add_DiscountTextF.setBackground(Color.white);
		JTextField_MasterPage_POS_Reservation_Add_DiscountTextF.setPreferredSize(new Dimension(40,20));
		
		JLabel empty2=new JLabel("");
		empty2.setBackground(Color.GRAY);
		empty2.setPreferredSize(new Dimension(140,30));
		
		JLabel JLabel_MasterPage_POS_Reservation_Add_TaxLabel=new JLabel("Tax");
		JLabel_MasterPage_POS_Reservation_Add_TaxLabel.setBackground(Color.GRAY);
		JLabel_MasterPage_POS_Reservation_Add_TaxLabel.setPreferredSize(new Dimension(80,30));
        
		JTextField JTextField_MasterPage_POS_Reservation_Add_TaxTextF=new JTextField();
		JTextField_MasterPage_POS_Reservation_Add_TaxTextF.setBackground(Color.white);
		JTextField_MasterPage_POS_Reservation_Add_TaxTextF.setPreferredSize(new Dimension(40,20));
		
		JLabel JLabel_MasterPage_POS_Reservation_Add_ServiceCostLabel=new JLabel("Service Cost");
		JLabel_MasterPage_POS_Reservation_Add_ServiceCostLabel.setBackground(Color.GRAY);
		JLabel_MasterPage_POS_Reservation_Add_ServiceCostLabel.setPreferredSize(new Dimension(80,30));
        
		JTextField JTextField_MasterPage_POS_Reservation_Add_ServiceCostTextF=new JTextField();
		JTextField_MasterPage_POS_Reservation_Add_ServiceCostTextF.setBackground(Color.white);
		JTextField_MasterPage_POS_Reservation_Add_ServiceCostTextF.setPreferredSize(new Dimension(40,20));
		
		JPanel Jpanel_MasterPage_POS_Reservation_Add_GridPanel=new JPanel();
		Jpanel_MasterPage_POS_Reservation_Add_GridPanel.setLayout(new GridLayout(3,3,2,2));
		Jpanel_MasterPage_POS_Reservation_Add_GridPanel.setBackground(Color.gray);
		Jpanel_MasterPage_POS_Reservation_Add_GridPanel.setPreferredSize(new Dimension(440,130));
		
		JButton Jbutton_MasterPage_POS_Reservation_Add_GridPanel_PrintToKitchenButton=new JButton("Print To Kitchen");
		Jbutton_MasterPage_POS_Reservation_Add_GridPanel_PrintToKitchenButton.setBackground(Color.LIGHT_GRAY);
		
		JButton Jbutton_MasterPage_POS_Reservation_Add_GridPanel_SaveButton=new JButton("Save");
		Jbutton_MasterPage_POS_Reservation_Add_GridPanel_SaveButton.setBackground(Color.LIGHT_GRAY);
		
		JButton Jbutton_MasterPage_POS_Reservation_Add_GridPanel_SaveSendButton=new JButton("Save_Send");
		Jbutton_MasterPage_POS_Reservation_Add_GridPanel_SaveSendButton.setBackground(Color.LIGHT_GRAY);
		
		JButton Jbutton_MasterPage_POS_Reservation_Add_GridPanel_DiscountButton=new JButton("Discount");
		Jbutton_MasterPage_POS_Reservation_Add_GridPanel_DiscountButton.setBackground(Color.LIGHT_GRAY);
		
		JButton Jbutton_MasterPage_POS_Reservation_Add_GridPanel_SplitPaymentButton=new JButton("Split Payment");
		Jbutton_MasterPage_POS_Reservation_Add_GridPanel_SplitPaymentButton.setBackground(Color.LIGHT_GRAY);
		
		JButton Jbutton_MasterPage_POS_Reservation_Add_GridPanel_PayButton=new JButton("Pay");
		Jbutton_MasterPage_POS_Reservation_Add_GridPanel_PayButton.setBackground(Color.LIGHT_GRAY);
		
		JButton Jbutton_MasterPage_POS_Reservation_Add_GridPanel_PrintBillButton=new JButton("Print Bill");
		Jbutton_MasterPage_POS_Reservation_Add_GridPanel_PrintBillButton.setBackground(Color.LIGHT_GRAY);
		
		JButton Jbutton_MasterPage_POS_Reservation_Add_GridPanel_CancelButton=new JButton("Cancel");
		Jbutton_MasterPage_POS_Reservation_Add_GridPanel_CancelButton.setBackground(Color.LIGHT_GRAY);
		
		Jbutton_MasterPage_POS_Reservation_Add_GridPanel_CancelButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	frame.dispose();
            }
        });
		
		Jpanel_MasterPage_POS_Reservation_Add_GridPanel.add(Jbutton_MasterPage_POS_Reservation_Add_GridPanel_PrintToKitchenButton);
		Jpanel_MasterPage_POS_Reservation_Add_GridPanel.add(Jbutton_MasterPage_POS_Reservation_Add_GridPanel_SaveButton);
		Jpanel_MasterPage_POS_Reservation_Add_GridPanel.add(Jbutton_MasterPage_POS_Reservation_Add_GridPanel_SaveSendButton);
		Jpanel_MasterPage_POS_Reservation_Add_GridPanel.add(Jbutton_MasterPage_POS_Reservation_Add_GridPanel_DiscountButton);
		Jpanel_MasterPage_POS_Reservation_Add_GridPanel.add(Jbutton_MasterPage_POS_Reservation_Add_GridPanel_SplitPaymentButton);
		Jpanel_MasterPage_POS_Reservation_Add_GridPanel.add(Jbutton_MasterPage_POS_Reservation_Add_GridPanel_PayButton);
		Jpanel_MasterPage_POS_Reservation_Add_GridPanel.add(Jbutton_MasterPage_POS_Reservation_Add_GridPanel_PrintBillButton);
		Jpanel_MasterPage_POS_Reservation_Add_GridPanel.add(Jbutton_MasterPage_POS_Reservation_Add_GridPanel_CancelButton);
		
		Jpanel_MasterPage_POS_Reservation_Add_FirstPanel.add(Jpanel_MasterPage_POS_Reservation_Add_ReservationPanel);
		Jpanel_MasterPage_POS_Reservation_Add_FirstPanel.add(jsp);
		Jpanel_MasterPage_POS_Reservation_Add_FirstPanel.add(empty);
		Jpanel_MasterPage_POS_Reservation_Add_FirstPanel.add(JLabel_MasterPage_POS_Reservation_Add_TotalPriceLabel);
		Jpanel_MasterPage_POS_Reservation_Add_FirstPanel.add(JTextField_MasterPage_POS_Reservation_Add_TotalPriceTextF);
		Jpanel_MasterPage_POS_Reservation_Add_FirstPanel.add(empty1);
		Jpanel_MasterPage_POS_Reservation_Add_FirstPanel.add(JLabel_MasterPage_POS_Reservation_Add_TotalItemsLabel);
		Jpanel_MasterPage_POS_Reservation_Add_FirstPanel.add(JTextField_MasterPage_POS_Reservation_Add_TotalItemsTextF);
		Jpanel_MasterPage_POS_Reservation_Add_FirstPanel.add(JLabel_MasterPage_POS_Reservation_Add_DiscountLabel);
		Jpanel_MasterPage_POS_Reservation_Add_FirstPanel.add(JTextField_MasterPage_POS_Reservation_Add_DiscountTextF);
		Jpanel_MasterPage_POS_Reservation_Add_FirstPanel.add(empty2);
		Jpanel_MasterPage_POS_Reservation_Add_FirstPanel.add(JLabel_MasterPage_POS_Reservation_Add_TaxLabel);
		Jpanel_MasterPage_POS_Reservation_Add_FirstPanel.add(JTextField_MasterPage_POS_Reservation_Add_TaxTextF);
		Jpanel_MasterPage_POS_Reservation_Add_FirstPanel.add(JLabel_MasterPage_POS_Reservation_Add_ServiceCostLabel);
		Jpanel_MasterPage_POS_Reservation_Add_FirstPanel.add(JTextField_MasterPage_POS_Reservation_Add_ServiceCostTextF);
		Jpanel_MasterPage_POS_Reservation_Add_FirstPanel.add(Jpanel_MasterPage_POS_Reservation_Add_GridPanel);
		
		
		
		JPanel Jpanel_MasterPage_POS_Reservation_Add_SecondPanel=new JPanel();
		Jpanel_MasterPage_POS_Reservation_Add_SecondPanel.setBackground(Color.gray);
		Jpanel_MasterPage_POS_Reservation_Add_SecondPanel.setPreferredSize(new Dimension(870,685));
		
		JPanel Jpanel_MasterPage_POS_Reservation_Add_CategoryPanel=new JPanel();
		Jpanel_MasterPage_POS_Reservation_Add_CategoryPanel.setBackground(Color.LIGHT_GRAY);
		Jpanel_MasterPage_POS_Reservation_Add_CategoryPanel.setPreferredSize(new Dimension(870,200));
		
		
		JPanel Jpanel_MasterPage_POS_Reservation_Add_AppentizerPanel=new JPanel();
		Jpanel_MasterPage_POS_Reservation_Add_AppentizerPanel.setBackground(Color.LIGHT_GRAY);
		Jpanel_MasterPage_POS_Reservation_Add_AppentizerPanel.setPreferredSize(new Dimension(870,500));
		
		JTextField JTextField_MasterPage_POS_Reservation_Add_AppentizerPanel_SearchTextF=new JTextField();
		JTextField_MasterPage_POS_Reservation_Add_AppentizerPanel_SearchTextF.setBackground(Color.white);
		JTextField_MasterPage_POS_Reservation_Add_AppentizerPanel_SearchTextF.setPreferredSize(new Dimension(700,40));
		

		
		JButton Jbutton_MasterPage_POS_Reservation_Add_AppentizerPanel_SearchButton=new JButton("search");
		Jbutton_MasterPage_POS_Reservation_Add_AppentizerPanel_SearchButton.setBackground(Color.LIGHT_GRAY);		
		Jbutton_MasterPage_POS_Reservation_Add_AppentizerPanel_SearchButton.setPreferredSize(new Dimension(100,40));
		
		JPanel Jpanel_MasterPage_POS_Reservation_Add_AppentizerPanel_EmptyPanel=new JPanel();
		Jpanel_MasterPage_POS_Reservation_Add_AppentizerPanel_EmptyPanel.setBackground(Color.white);
		Jpanel_MasterPage_POS_Reservation_Add_AppentizerPanel_EmptyPanel.setPreferredSize(new Dimension(870,350));
		
		
		JButton Jbutton_MasterPage_POS_Reservation_Add_AppentizerPanel_CloseButton=new JButton("Close");
		Jbutton_MasterPage_POS_Reservation_Add_AppentizerPanel_CloseButton.setBackground(Color.LIGHT_GRAY);		
		Jbutton_MasterPage_POS_Reservation_Add_AppentizerPanel_CloseButton.setPreferredSize(new Dimension(415,60));
		
		Jbutton_MasterPage_POS_Reservation_Add_AppentizerPanel_CloseButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	frame.dispose();        
            }
        });
		
		JButton Jbutton_MasterPage_POS_Reservation_Add_AppentizerPanel_HoldThisReceiptButton=new JButton("Hold This Receipt");
		Jbutton_MasterPage_POS_Reservation_Add_AppentizerPanel_HoldThisReceiptButton.setBackground(Color.LIGHT_GRAY);		
		Jbutton_MasterPage_POS_Reservation_Add_AppentizerPanel_HoldThisReceiptButton.setPreferredSize(new Dimension(415,60));
				
		Jpanel_MasterPage_POS_Reservation_Add_AppentizerPanel.add(JTextField_MasterPage_POS_Reservation_Add_AppentizerPanel_SearchTextF);
		Jpanel_MasterPage_POS_Reservation_Add_AppentizerPanel.add(Jbutton_MasterPage_POS_Reservation_Add_AppentizerPanel_SearchButton);
		Jpanel_MasterPage_POS_Reservation_Add_AppentizerPanel.add(Jpanel_MasterPage_POS_Reservation_Add_AppentizerPanel_EmptyPanel);
		Jpanel_MasterPage_POS_Reservation_Add_AppentizerPanel.add(Jbutton_MasterPage_POS_Reservation_Add_AppentizerPanel_CloseButton);
		Jpanel_MasterPage_POS_Reservation_Add_AppentizerPanel.add(Jbutton_MasterPage_POS_Reservation_Add_AppentizerPanel_HoldThisReceiptButton);
		
		
		Jpanel_MasterPage_POS_Reservation_Add_SecondPanel.add(Jpanel_MasterPage_POS_Reservation_Add_CategoryPanel);
		Jpanel_MasterPage_POS_Reservation_Add_SecondPanel.add(Jpanel_MasterPage_POS_Reservation_Add_AppentizerPanel);
		
		
		
		
		
		
		Jpanel_MasterPage_POS_Reservation_Add_Mainpanel.add(Jpanel_MasterPage_POS_Reservation_Add_FirstPanel);
		Jpanel_MasterPage_POS_Reservation_Add_Mainpanel.add(Jpanel_MasterPage_POS_Reservation_Add_SecondPanel);
		
		frame.add(Jpanel_MasterPage_POS_Reservation_Add_Mainpanel);
		frame.setVisible(true);
		frame.setSize(1370,730);
	//	frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
	}
}

