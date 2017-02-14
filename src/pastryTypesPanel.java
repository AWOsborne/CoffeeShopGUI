import java.awt.*;
import javax.swing.*;

/**
 * List of pastries to add to the Pastry Panel.
 * @author DrewOsborne
 *
 */
public class pastryTypesPanel extends JPanel
{
	private JList pastryList;
	private String[] pastries = {"Apricot Danish", "Prune Danish",
											"Crossant", "English Muffin", "Blueberry Muffin"};
	
	private final Double[] pastriesCost = {2.50, 2.50, 1.75, 2.00, 2.25};
	
	/**
	 * Constructor
	 */
	public pastryTypesPanel()
	{
		//Creates a list of pastries and fills it from the pastry array.
		pastryList = new JList(pastries);
		
		setBorder(BorderFactory.createTitledBorder("Pastries"));
		
		add(pastryList);
	}
	
	/**
	 * Allows access to which pastry is selected.
	 * @return Type
	 */
	public String getPastryType()
	{
		return (String) pastryList.getSelectedValue();
	}
	
	/**
	 * Allows access to the cost of each pastry.
	 * @return Cost
	 */
	public double getPastryCost()
	{
		int i = pastryList.getSelectedIndex();
		return pastriesCost[i];
	}
}
