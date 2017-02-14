import java.awt.*;
import javax.swing.JPanel;

/**
 * Main panel for bagels and its sub-parts.
 * @author DrewOsborne
 *
 */
public class BagelPanel extends JPanel
{
	private FlavorPanel flavor;
	private SpreadsPanel spreads;
	private ToppingsPanel toppings;
	
	/**
	 * Constructor
	 */
	public BagelPanel()
	{
		setLayout(new GridLayout(3, 1));
		flavor = new FlavorPanel();
		spreads = new SpreadsPanel();
		toppings = new ToppingsPanel();
		
		add(flavor);
		add(spreads);
		add(toppings);
	}
	
	/**
	 * Total cost of the bagel.
	 * @return Total cost.
	 */
	public Double getBagelTotalCost()
	{
		//Adds up the totals of each sub-panel.
		double flavorCost = flavor.getBagelCost();
		double spreadsCost = spreads.getSpreadCost();
		double toppingsCost = toppings.getToppingsCost();
		double bagelCost = flavorCost + spreadsCost + toppingsCost;
		
		return bagelCost;
	}
	
	/**
	 * Description of the bagel.
	 * @return	Description.
	 */
	public String getBagelTotalType()
	{
		//Adds the descriptions of each sub-panel.
		String flavorString = flavor.getBagelType();
		String spreadsString = spreads.getSpreadType();
		String toppingsString = toppings.getToppings();
		
		return "A " + flavorString + " bagel with " + spreadsString + ", " + toppingsString;
	}
}
