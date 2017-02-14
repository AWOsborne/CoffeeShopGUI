import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.*;

public class MainPanel extends JFrame
{
	private GreetingPanel greeting;
	private ProductsPanel products;
	private CoffeePanel coffeePanel;
	private BagelPanel bagelPanel;
	private PastryPanel pastryPanel;
	private ListPanel list;
	private ButtonPanel buttons;

	//Price of the entire order.
	private Double totalPrice = 0.0;

	public MainPanel()
	{
		//Sets up the panel.
		setTitle("Coffee Shop");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Creates all of the sub-panels.
		greeting = new GreetingPanel();
		products = new ProductsPanel();
		coffeePanel = new CoffeePanel();
		bagelPanel = new BagelPanel();
		pastryPanel = new PastryPanel();
		list = new ListPanel();
		buttons = new ButtonPanel();

		//Adds the subpanels to the main panel.
		add(greeting, BorderLayout.NORTH);
		add(products, BorderLayout.WEST);
		add(coffeePanel, BorderLayout.CENTER);
		add(list, BorderLayout.EAST);
		add(buttons, BorderLayout.SOUTH);

		pack();
		setVisible(true);
		
		//Adds action listeners to the buttons on sub-panels.
		ProductsPanel.coffeeButton.addActionListener(new RadioButtonListener());
		ProductsPanel.bagelButton.addActionListener(new RadioButtonListener());
		ProductsPanel.pastryButton.addActionListener(new RadioButtonListener());

		ButtonPanel.addItemButton.addActionListener(new AddButtonListener());
		ButtonPanel.totalButton.addActionListener(new TotalButtonListener());
		ButtonPanel.newOrderButton.addActionListener(new NewOrderButtonListener());
	}
	
	/**
	 * Removes everything from the center panel.
	 */
	public void removeCenterPanel()
	{
		remove(coffeePanel);
		remove(bagelPanel);
		remove(pastryPanel);
	}
	
	/**
	 * Adds the coffee panel to the center panel.
	 */
	public void addCoffeePanel()
	{
		add(coffeePanel, BorderLayout.CENTER);
		validate();
		repaint();
	}
	
	/**
	 * adds the bagel panel to the center panel.
	 */
	public void addBagelPanel()
	{
		add(bagelPanel, BorderLayout.CENTER);
		validate();
		repaint();
	}

	/**
	 * adds the pastry panel to the center panel.
	 */
	public void addPastryPanel()
	{
		add(pastryPanel, BorderLayout.CENTER);
		validate();
		repaint();
	}

	/**
	 * Action Listener for switching the center panel.
	 * @author DrewOsborne
	 *
	 */
	private class RadioButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Checks which button is selected.
			if (ProductsPanel.coffeeButton.isSelected())
			{
				//Removes everything and adds the coffee panel.
				removeCenterPanel();
				addCoffeePanel();
			}
			else if (ProductsPanel.bagelButton.isSelected())
			{
				//Removes everything and adds the bagel panel.
				removeCenterPanel();
				addBagelPanel();
			}
			else if (ProductsPanel.pastryButton.isSelected())
			{
				//Removes everything and adds the pastry panel.
				removeCenterPanel();
				addPastryPanel();
			}

		}
	}

	/**
	 * Action listener for adding the item to the order.
	 * @author DrewOsborne
	 *
	 */
	private class AddButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Formats the final output into dollars.
			NumberFormat formatter = new DecimalFormat("#0.00");

			//Checks which button is selected.
			if (ProductsPanel.coffeeButton.isSelected())
			{
				String order = coffeePanel.getCoffeeTotalType();
				Double cost = coffeePanel.getCoffeeTotalCost();

				//System.out.println(order + " : " + cost);
				
				//Makes the final string to output.
				String totalOrder = order + " : $" + (formatter.format(cost)).toString();

				totalPrice += cost;
				list.addToList(totalOrder);
				
				//Updates the display.
				list.validate();
				list.repaint();

			}
			else if (ProductsPanel.bagelButton.isSelected())
			{
				String order = bagelPanel.getBagelTotalType();
				Double cost = bagelPanel.getBagelTotalCost();

				//System.out.println(order + " : " + cost);
				
				//Makes the final string to output.
				String totalOrder = order + " : $" + (formatter.format(cost)).toString();

				totalPrice += cost;
				list.addToList(totalOrder);
				
				//Updates the display.
				list.validate();
				list.repaint();

			}
			else if (ProductsPanel.pastryButton.isSelected())
			{
				String order = pastryPanel.getPastryType();
				Double cost = pastryPanel.getPastryCost();

				//System.out.println(order + " : " + cost);
				
				//Makes the final string to output.
				String totalOrder = order + " : $" + (formatter.format(cost)).toString();

				totalPrice += cost;
				list.addToList(totalOrder);
				
				//Updates the display.
				list.validate();
				list.repaint();

			}
		}
	}
	
	/**
	 * Action listener for displaying the final total.
	 * @author DrewOsborne
	 *
	 */
	private class TotalButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Formats to dollars
			NumberFormat formatter = new DecimalFormat("#0.00");

			JOptionPane.showMessageDialog(null, "Total Cost: $" + formatter.format(totalPrice));
		}
	}

	/**
	 * Action listener for resetting the program to enter a new order.
	 * @author DrewOsborne
	 *
	 */
	private class NewOrderButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			new MainPanel();
		}
	}

	/**
	 * Main method for starting the program.
	 * @param args
	 */
	public static void main(String[] args)
	{
		new MainPanel();
	}
}
