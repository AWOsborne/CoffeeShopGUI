import java.awt.*;
import javax.swing.*;

/**
 * Panel to hold the coffee extras.
 * @author DrewOsborne
 *
 */
public class ExtrasPanel extends JPanel
{
	private JCheckBox cream;
	private JCheckBox sugar;
	private ButtonGroup extrasGroup;
	
	private final Double sugarCost = 0.25;
	private final Double creamCost = 0.25;
	
	/**
	 * Constructor
	 */
	public ExtrasPanel()
	{
		cream = new JCheckBox("Cream");
		sugar = new JCheckBox("Sugar");
		
		setBorder(BorderFactory.createTitledBorder("Extras"));
		
		add(cream);
		add(sugar);
	}
	
	/*
	 * Gives access to the cost of the extras added into the coffee.
	 */
	public Double getExtrasCost()
	{
		Double cost = 0.0;
		
		if (cream.isSelected())
			cost += creamCost;
		if (sugar.isSelected())
			cost += sugarCost;
		
		return cost;
	}
	
	/*
	 * Describes the extras added into the coffee.
	 */
	public String getExtras()
	{
		String extras = "";
		
		//Checks for which boxes are selected.
		if (cream.isSelected() && sugar.isSelected())
			extras = "cream + sugar";
		else if (cream.isSelected())
			extras = "cream";
		else if (sugar.isSelected())
			extras = "sugar";
		
		return extras;
	}
}
