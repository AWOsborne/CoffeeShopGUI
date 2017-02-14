import javax.swing.*;
import java.awt.*;

/*
 * Main panel for pastries.
 */
public class PastryPanel extends JPanel
{
	private pastryTypesPanel pastries;
	
	/**
	 * Constructor
	 */
	public PastryPanel()
	{
		setLayout(new GridLayout(3, 1));
		pastries = new pastryTypesPanel();
		
		add(pastries);
	}

	/**
	 * Allows access to the cost of the pastries.
	 * @return Cost
	 */
	public Double getPastryCost()
	{
		return pastries.getPastryCost();
	}
	
	/**
	 * Allows access to the type of pastry.
	 * @return Type
	 */
	public String getPastryType()
	{
		return "A " + pastries.getPastryType();
	}
}