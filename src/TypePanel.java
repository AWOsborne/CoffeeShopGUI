import java.awt.*;
import javax.swing.*;

/**
 * Main panel to select which type of coffee to add to the order.
 * @author DrewOsborne
 *
 */
public class TypePanel extends JPanel
{
	private JRadioButton rCoffee;
	private JRadioButton dCoffee;
	private JRadioButton hCoffee;
	private ButtonGroup typeGroup;
	
	/**
	 * Constructor
	 */
	public TypePanel()
	{
		setLayout(new GridLayout(3, 1));
		
		rCoffee = new JRadioButton("Regular");
		dCoffee = new JRadioButton("Decafinated");
		hCoffee = new JRadioButton("Half Cafinated");
		
		typeGroup = new ButtonGroup();
		
		typeGroup.add(rCoffee);
		typeGroup.add(dCoffee);
		typeGroup.add(hCoffee);
		
		setBorder(BorderFactory.createTitledBorder("Type"));
		
		add(rCoffee);
		add(dCoffee);
		add(hCoffee);
	}

	/**
	 * Allows access to which type of coffee is selected.
	 * @return Type
	 */
	public String getCoffeeType()
	{
		String type = "";
		
		if (rCoffee.isSelected())
			type = "regular";
		else if (dCoffee.isSelected())
			type = "decafinated";
		else if (hCoffee.isSelected())
			type = "half cafinated";
		
		return type;	
	}
}
