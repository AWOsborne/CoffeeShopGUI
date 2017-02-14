import java.util.*;

import javax.swing.*;

/**
 * Panel for the list of items added to the order.
 * @author DrewOsborne
 *
 */
public class ListPanel extends JPanel
{
	private JScrollPane scrollPanel;
	private JList<String> orders;
	private Vector listInfo;
	
	/**
	 * Constructor
	 */
	public ListPanel()
	{
		//Vector to hold the items to add.
		listInfo = new Vector();
		
		//Creates the list.
		orders = new JList(listInfo);
		orders.setVisibleRowCount(25);
		scrollPanel = new JScrollPane(orders);
		add(scrollPanel);
	}
	
	/**
	 * Adds an item to the list of items.
	 * @param order Item to add.
	 */
	public void addToList(String order)
	{
		listInfo.addElement(order);
		orders.setListData(listInfo);
		
		//Updates the panel.
		scrollPanel.validate();
		scrollPanel.repaint();
	}
}
