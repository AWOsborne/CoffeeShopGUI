import javax.swing.*;
import java.awt.*;

/**
 * Main panel for coffee.
 * @author DrewOsborne
 *
 */
public class CoffeePanel extends JPanel
{
	private SizePanel size;
	private TypePanel type;
	private ExtrasPanel extras;
	
	/**
	 * Constructor
	 */
	public CoffeePanel()
	{
		setLayout(new GridLayout(3, 1));
		size = new SizePanel();
		type = new TypePanel();
		extras = new ExtrasPanel();
		
		add(size);
		add(type);
		add(extras);
	}
	
	/**
	 * Total cost of the coffee.
	 * @return Cost
	 */
	public Double getCoffeeTotalCost()
	{
		double sizeCost = size.getSizeCost();
		double extrasCost = extras.getExtrasCost();
		double coffeeCost = sizeCost + extrasCost;
		
		return coffeeCost;
	}
	
	/**
	 * Total description of the coffee.
	 * @return Description
	 */
	public String getCoffeeTotalType()
	{
		String sizeString = size.getCoffeeSize();
		String coffeeString = type.getCoffeeType();
		String extrasString = extras.getExtras();
		
		return "A " + sizeString + ", " + coffeeString + " w/ " + extrasString;
	}
}
