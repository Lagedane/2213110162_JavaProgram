import javax.swing.*;
public class CoffeeShopDemo1 {

	public static void main(String[] args) {
		Barista staff1 = new Barista("Leon"  , 'M');
		Barista staff2 = new Barista("Claire", 'F');
		Barista[] baristas = { staff1, staff2 }; //be added after
		
		int typeDrink  = Integer.parseInt
							(JOptionPane.showInputDialog
								(null, "( No.01 ) Hot \n( No.02 ) Cold"));
		int typeCoffee = Integer.parseInt
							(JOptionPane.showInputDialog
								(null, "( No.01 ) Americano \n( No.02 ) Espresso \n( No.03 ) Cappucino"));
		char sizeCoffee = JOptionPane.showInputDialog
							    (null, "( S ) Short \n( T ) Tall \n( G ) Grande \n( V ) Venti").toUpperCase().charAt(0);
		/**int barista    = Integer.parseInt
							(JOptionPane.showInputDialog
								(null, "( No.01 ) Leon \n( No.02 ) Claire"));
		Coffee order = new Coffee(typeDrink, typeCoffee);
		if(barista == 1) {
			order = new Coffee(typeDrink, sizeCoffee, typeCoffee, staff1);
		} else if(barista == 2) {
				order = new Coffee(typeDrink, sizeCoffee, typeCoffee, staff2);
		} //end of else-if */
		
		int barista     = Integer.parseInt
				(JOptionPane.showInputDialog
					(null, "( No.01 ) Leon \n( No.02 ) Claire")) - 1; //be edited after

		Coffee order = new Coffee(typeDrink, sizeCoffee, typeCoffee, baristas[barista]); //be edited after
		
		JOptionPane.showMessageDialog(null, order + "\nThe Barista is " 
									  + order.getBarista().getName() + 
									  " (" + order.getBarista().getGenderName() + ").");
	} //end of main()
} //end class
