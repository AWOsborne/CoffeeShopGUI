import java.awt.*;
import javax.swing.*;

/**
 * Main panel for the spreads on a bagel.
 * @author DrewOsborne
 *
 */
public class SpreadsPanel extends JPanel
{
	private JRadioButton creamCheese;
	private JRadioButton lfCreamCheese;
	private JRadioButton garlicCreamCheese;
	private JRadioButton butter;
	private JRadioButton jam;
	
	private ButtonGroup bg;
	
	private final Double creamCheeseCost = 0.25;
	private final Double lfCreamCheeseCost = 0.30;
	private final Double garlicCreamCheeseCost = 0.35;
	private final Double butterCost = 0.15;
	private final Double jamCost = 0.50;
	
	/**
	 * Constructor
	 */
	public SpreadsPanel()
	{
		creamCheese = new JRadioButton("Regular");
		lfCreamCheese = new JRadioButton("Low Fat");
		garlicCreamCheese = new JRadioButton("Garlic");
		butter = new JRadioButton("Butter");
		jam = new JRadioButton("Jam");
		
		bg = new ButtonGroup();
		
		bg.add(creamCheese);
		bg.add(lfCreamCheese);
		bg.add(garlicCreamCheese);
		bg.add(butter);
		bg.add(jam);
		
		setBorder(BorderFactory.createTitledBorder("Spreads"));
		setLayout(new GridLayout(5, 1));
		
		add(creamCheese);
		add(lfCreamCheese);
		add(garlicCreamCheese);
		add(butter);
		add(jam);
	}
	
	/**
	 * Allows access to which type of spread is selected.
	 * @return Type
	 */
	public String getSpreadType()
	{
		String type = "";
		
		if (creamCheese.isSelected())
			type = "CC";
		else if (lfCreamCheese.isSelected())
			type = "LFCC";
		else if (garlicCreamCheese.isSelected())
			type = "GCC";
		else if (butter.isSelected())
			type = "butter";
		else if (jam.isSelected())
			type = "jam";
		
		return type;
	}
	
	/**
	 * Allows access to the cost of the spread selected.
	 * @return Cost
	 */
	public Double getSpreadCost()
	{
		Double cost = 0.0;
		
		if (creamCheese.isSelected())
			cost = creamCheeseCost;
		else if (lfCreamCheese.isSelected())
			cost = lfCreamCheeseCost;
		else if (garlicCreamCheese.isSelected())
			cost = garlicCreamCheeseCost;
		else if (butter.isSelected())
			cost = butterCost;
		else if (jam.isSelected())
			cost = jamCost;
		
		return cost;
	}
}
