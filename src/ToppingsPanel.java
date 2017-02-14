import java.awt.GridLayout;

import javax.swing.*;

/**
 * Main panel for the toppings on a bagel.
 * @author DrewOsborne
 *
 */
public class ToppingsPanel extends JPanel
{
	private JCheckBox lox;
	private JCheckBox novaLox;
	private ButtonGroup bg;
	
	private final Double loxCost = 2.50;
	private final Double novaLoxCost = 2.50;
	
	/**
	 * Constructor
	 */
	public ToppingsPanel()
	{
		lox = new JCheckBox("Lox");
		novaLox = new JCheckBox("Nova Lox");
		
		setBorder(BorderFactory.createTitledBorder("Toppings"));
		setLayout(new GridLayout(2, 1));
		
		add(lox);
		add(novaLox);
	}
	
	/**
	 * Allows access to the cost of the toppings selected..
	 * @return
	 */
	public Double getToppingsCost()
	{
		Double cost = 0.0;
		
		if (lox.isSelected())
			cost += loxCost;
		if (novaLox.isSelected())
			cost += novaLoxCost;
		
		return cost;
	}
	
	/**
	 * Allows access to the type of toppings selected.
	 * @return
	 */
	public String getToppings()
	{
		String extras = "";
		
		if (lox.isSelected() && novaLox.isSelected())
			extras = "lox, and nova lox";
		else if (lox.isSelected())
			extras = "lox";
		else if (novaLox.isSelected())
			extras = "nova lox";
		
		return extras;
	}
}
