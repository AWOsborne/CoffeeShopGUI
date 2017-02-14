import java.awt.*;
import javax.swing.*;

/**
 * Main panel for the sizes of coffee.
 * @author DrewOsborne
 *
 */
public class SizePanel extends JPanel
{
	private JRadioButton sCoffee;
	private JRadioButton mCoffee;
	private JRadioButton lCoffee;
	private ButtonGroup sizeGroup;

	private final Double sCost = 0.75;
	private final Double mCost = 1.00;
	private final Double lCost = 1.25;
	
	/**
	 * Constructor
	 */
	public SizePanel()
	{
		setLayout(new GridLayout(3, 1));
		
		sCoffee = new JRadioButton("Small Coffee");
		mCoffee = new JRadioButton("Medium Coffee");
		lCoffee = new JRadioButton("Large Coffee");
		sizeGroup = new ButtonGroup();
		sizeGroup.add(sCoffee);
		sizeGroup.add(mCoffee);
		sizeGroup.add(lCoffee);
		
		setBorder(BorderFactory.createTitledBorder("Size"));
		
		add(sCoffee);
		add(mCoffee);
		add(lCoffee);
	}
	
	/**
	 * Allows access to the size of coffee selected.
	 * @return Size
	 */
	public String getCoffeeSize()
	{
		String size = "";
		
		if (sCoffee.isSelected())
			size = "small";
		else if (mCoffee.isSelected())
			size = "medium";
		else if (lCoffee.isSelected())
			size = "large";
		
		return size;	
	}
	
	/**
	 * Allows access to the price of the coffee selected.
	 * @return Cost
	 */
	public Double getSizeCost()
	{
		double cost = 0.0;
		
		if (sCoffee.isSelected())
			cost = sCost;
		else if (mCoffee.isSelected())
			cost = mCost;
		else if (lCoffee.isSelected())
			cost = lCost;
		
		return cost;	
	}
}
