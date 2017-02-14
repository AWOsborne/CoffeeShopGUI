import java.awt.*;

import javax.swing.*;

/**
 * Panel for bagel flavors.
 * @author DrewOsborne
 *
 */
public class FlavorPanel extends JPanel
{
	private JRadioButton white;
	private JRadioButton wheat;
	private JRadioButton salt;
	private JRadioButton seseme;
	private JRadioButton popy;
	private ButtonGroup bg;
	
	//Final costs of each type of bagel.
	private final Double whiteCost = 0.75;
	private final Double wheatCost = 0.85;
	private final Double saltCost = 0.75;
	private final Double sesemeCost = 0.90;
	private final Double popyCost = 0.90;
	
	/**
	 * Constructor
	 */
	public FlavorPanel()
	{
		white = new JRadioButton("White");
		wheat = new JRadioButton("Wheat");
		salt = new JRadioButton("Salt");
		seseme = new JRadioButton("Seseme");
		popy = new JRadioButton("Popy");
		
		bg = new ButtonGroup();
		
		bg.add(white);
		bg.add(wheat);
		bg.add(salt);
		bg.add(seseme);
		bg.add(popy);
		
		setBorder(BorderFactory.createTitledBorder("Bagel Flavor"));
		setLayout(new GridLayout(5, 1));
		
		add(white);
		add(wheat);
		add(salt);
		add(seseme);
		add(popy);
	}
	
	/**
	 * Allows access to the type of bagel.
	 * @return Type
	 */
	public String getBagelType()
	{
		String type = "";
		
		//Determines which bagel is selected.
		if (white.isSelected())
			type = "white";
		else if (wheat.isSelected())
			type = "wheat";
		else if (salt.isSelected())
			type = "salt";
		else if (seseme.isSelected())
			type = "seseme";
		else if (popy.isSelected())
			type = "popy";
		
		return type;	
	}
	
	/**
	 * Allows acess to the cost of each type of bagel.
	 * @return Cost
	 */
	public Double getBagelCost()
	{
		Double cost = 0.0;
		
		//Determines which bagel is selected.
		if (white.isSelected())
			cost = whiteCost;
		else if (wheat.isSelected())
			cost = wheatCost;
		else if (salt.isSelected())
			cost = saltCost;
		else if (seseme.isSelected())
			cost = sesemeCost;
		else if (popy.isSelected())
			cost = popyCost;
		
		return cost;
	}
}
