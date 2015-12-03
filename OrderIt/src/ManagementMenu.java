import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ManagementMenu extends JFrame
{		
	public void ManagementMenu() 
	{
		final JFrame frame=new JFrame("Management Menu");
		
		JPanel Jpanel_MasterPage_ManagementMenu_Mainpanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Mainpanel.setBackground(Color.GRAY);
		
		JPanel Jpanel_MasterPage_ManagementMenu_Buttonpanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Buttonpanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_Buttonpanel.setPreferredSize(new Dimension(540,360));
		
		
		JButton Jbutton_MasterPage_ManagementMenu_Buttonpanel_Language=new JButton("Language");
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Language.setPreferredSize(new Dimension(100,140));
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Language.setBackground(Color.LIGHT_GRAY);
		
		JButton Jbutton_MasterPage_ManagementMenu_Buttonpanel_Category=new JButton("Category");
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Category.setPreferredSize(new Dimension(100,140));
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Category.setBackground(Color.LIGHT_GRAY);
		
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Category.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				Management_Category cat=new Management_Category();
				cat.Management_Category();
	        }
	    });
		
		JButton Jbutton_MasterPage_ManagementMenu_Buttonpanel_Items=new JButton("Items");
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Items.setPreferredSize(new Dimension(100,140));
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Items.setBackground(Color.LIGHT_GRAY);
		
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Items.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				Management_Items item=new Management_Items();
				item.Management_Items();
	        }
	    });
		
		JButton Jbutton_MasterPage_ManagementMenu_Buttonpanel_Promotion=new JButton("Promotion");
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Promotion.setPreferredSize(new Dimension(100,140));
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Promotion.setBackground(Color.LIGHT_GRAY);
		
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Promotion.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				Management_Promotion promotion=new Management_Promotion();
				promotion.Management_Promotion();
	        }
	    });
		
		JButton Jbutton_MasterPage_ManagementMenu_Buttonpanel_Table=new JButton("Table");
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Table.setPreferredSize(new Dimension(100,140));
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Table.setBackground(Color.LIGHT_GRAY);
		
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Table.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				Management_Table table=new Management_Table();
				table.Management_Table();
	        }
	    });
		
		JButton Jbutton_MasterPage_ManagementMenu_Buttonpanel_Currency=new JButton("Currency");
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Currency.setPreferredSize(new Dimension(100,140));
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Currency.setBackground(Color.LIGHT_GRAY);
		
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Currency.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				Management_Currency currency=new Management_Currency();
				currency.Management_Currency();
	        }
	    });
		
		JButton Jbutton_MasterPage_ManagementMenu_Buttonpanel_ItemModifier=new JButton("Item Modifier");
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_ItemModifier.setPreferredSize(new Dimension(100,140));
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_ItemModifier.setBackground(Color.LIGHT_GRAY);
		
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_ItemModifier.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				Management_Item_Modifier managementitemmodifier=new Management_Item_Modifier();
				managementitemmodifier.Management_Item_Modifier();
	        }
	    });
		
		JButton Jbutton_MasterPage_ManagementMenu_Buttonpanel_MenuRelative=new JButton("Menu Relative");
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_MenuRelative.setPreferredSize(new Dimension(100,140));
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_MenuRelative.setBackground(Color.LIGHT_GRAY);
		
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_MenuRelative.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				Management_Menu_Relative managementmenurelative=new Management_Menu_Relative();
				managementmenurelative.Management_Menu_Relative();
	        }
	    });
		
		JButton Jbutton_MasterPage_ManagementMenu_Buttonpanel_Customer=new JButton("Customer");
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Customer.setPreferredSize(new Dimension(100,140));
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Customer.setBackground(Color.LIGHT_GRAY);
		
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Customer.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				Management_Customer managementcustomer=new Management_Customer();
				managementcustomer.Management_Customer();
	        }
	    });
		
		JButton Jbutton_MasterPage_ManagementMenu_Buttonpanel_SpecialInstruction=new JButton("Special Insruction");
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_SpecialInstruction.setPreferredSize(new Dimension(100,140));
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_SpecialInstruction.setBackground(Color.LIGHT_GRAY);
		
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_SpecialInstruction.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				Management_Special_Instruction managementspecialinstruction =new Management_Special_Instruction();
				managementspecialinstruction.Management_Special_Instruction();
	        }
	    });
		
		JButton Jbutton_MasterPage_ManagementMenu_Buttonpanel_Device=new JButton("Device");
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Device.setPreferredSize(new Dimension(100,140));
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Device.setBackground(Color.LIGHT_GRAY);
		
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Device.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				Management_Device managementdevice=new Management_Device();
				managementdevice.Management_Device();
	        }
	    });
		
		JButton Jbutton_MasterPage_ManagementMenu_Buttonpanel_CashDrawer=new JButton("Cash Drawer");
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_CashDrawer.setPreferredSize(new Dimension(100,140));
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_CashDrawer.setBackground(Color.LIGHT_GRAY);
		
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_CashDrawer.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				Management_Cash_Drawer managementcashdrawer=new Management_Cash_Drawer();
				managementcashdrawer.Management_Cash_Drawer();
	        }
	    });
		
		JButton Jbutton_MasterPage_ManagementMenu_Buttonpanel_Expenses=new JButton("Expenses");
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Expenses.setPreferredSize(new Dimension(100,140));
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Expenses.setBackground(Color.LIGHT_GRAY);
		
		Jbutton_MasterPage_ManagementMenu_Buttonpanel_Expenses.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				Expenses expenses=new Expenses();
				expenses.Expenses();
	        }
	    });
		
		Jpanel_MasterPage_ManagementMenu_Buttonpanel.setLayout(new GridLayout(3,5,5,5));
		Jpanel_MasterPage_ManagementMenu_Buttonpanel.add(Jbutton_MasterPage_ManagementMenu_Buttonpanel_Language);
		Jpanel_MasterPage_ManagementMenu_Buttonpanel.add(Jbutton_MasterPage_ManagementMenu_Buttonpanel_Category);
		Jpanel_MasterPage_ManagementMenu_Buttonpanel.add(Jbutton_MasterPage_ManagementMenu_Buttonpanel_Items);
		Jpanel_MasterPage_ManagementMenu_Buttonpanel.add(Jbutton_MasterPage_ManagementMenu_Buttonpanel_Promotion);
		Jpanel_MasterPage_ManagementMenu_Buttonpanel.add(Jbutton_MasterPage_ManagementMenu_Buttonpanel_Table);
		Jpanel_MasterPage_ManagementMenu_Buttonpanel.add(Jbutton_MasterPage_ManagementMenu_Buttonpanel_Currency);
		Jpanel_MasterPage_ManagementMenu_Buttonpanel.add(Jbutton_MasterPage_ManagementMenu_Buttonpanel_ItemModifier);
		Jpanel_MasterPage_ManagementMenu_Buttonpanel.add(Jbutton_MasterPage_ManagementMenu_Buttonpanel_MenuRelative);
		Jpanel_MasterPage_ManagementMenu_Buttonpanel.add(Jbutton_MasterPage_ManagementMenu_Buttonpanel_Customer);
		Jpanel_MasterPage_ManagementMenu_Buttonpanel.add(Jbutton_MasterPage_ManagementMenu_Buttonpanel_SpecialInstruction);
		Jpanel_MasterPage_ManagementMenu_Buttonpanel.add(Jbutton_MasterPage_ManagementMenu_Buttonpanel_Device);
		Jpanel_MasterPage_ManagementMenu_Buttonpanel.add(Jbutton_MasterPage_ManagementMenu_Buttonpanel_CashDrawer);
		Jpanel_MasterPage_ManagementMenu_Buttonpanel.add(Jbutton_MasterPage_ManagementMenu_Buttonpanel_Expenses);
		
		JPanel Jpanel_MasterPage_ManagementMenu_Closepanel=new JPanel();
		Jpanel_MasterPage_ManagementMenu_Closepanel.setBackground(Color.GRAY);
		Jpanel_MasterPage_ManagementMenu_Closepanel.setPreferredSize(new Dimension(540,60));
		
		
		JButton Jbutton_MasterPage_ManagementMenu_Closepanel_Close=new JButton("Close");
		Jbutton_MasterPage_ManagementMenu_Closepanel_Close.setPreferredSize(new Dimension(540,50));
		Jbutton_MasterPage_ManagementMenu_Closepanel_Close.setBackground(Color.LIGHT_GRAY);
		
		Jbutton_MasterPage_ManagementMenu_Closepanel_Close.addActionListener(new ActionListener() 
	    {
			public void actionPerformed(ActionEvent e) 
	        {
				frame.dispose();
	        }
	    });
		
		Jpanel_MasterPage_ManagementMenu_Closepanel.add(Jbutton_MasterPage_ManagementMenu_Closepanel_Close);
		
		Jpanel_MasterPage_ManagementMenu_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Buttonpanel);
		Jpanel_MasterPage_ManagementMenu_Mainpanel.add(Jpanel_MasterPage_ManagementMenu_Closepanel);
		
		frame.add(Jpanel_MasterPage_ManagementMenu_Mainpanel);
		frame.setVisible(true);
		//frame.setAlwaysOnTop(true);
		frame.setSize(570,470);
		frame.setLocation(370,180);
	//	frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);				
	}
}
