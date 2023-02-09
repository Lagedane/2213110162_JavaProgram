import javax.swing.*;

public class CoffeeShopDemo2 {

    public static void main(String[] args) {
        Barista staff1 = new Barista("Leon"  , 'M');
        Barista staff2 = new Barista("Claire", 'F');
        Barista[] baristas = { staff1, staff2 };
        
        String orderList = "";
        int totalPrice = 0;
        
        while(true) {
            int typeDrink   = Integer.parseInt
                                (JOptionPane.showInputDialog
                                        (null, "( No.01 ) Hot \n( No.02 ) Cold"));
            int typeCoffee  = Integer.parseInt
                                (JOptionPane.showInputDialog
                                        (null, "( No.01 ) Americano \n( No.02 ) Espresso \n( No.03 ) Cappucino"));
            char sizeCoffee = JOptionPane.showInputDialog
                                        (null, "( S ) Short \n( T ) Tall \n( G ) Grande \n( V ) Venti").toUpperCase().charAt(0);
            int barista     = Integer.parseInt
                                (JOptionPane.showInputDialog
                                        (null, "( No.01 ) Leon \n( No.02 ) Claire")) - 1;
        
            Coffee order = new Coffee(typeDrink, sizeCoffee, typeCoffee, baristas[barista]);
            
            totalPrice += order.getTotalPrice();
            
            orderList += "[" + order.getBarista().getName() + "] " + order.toString() + "\n";
        
            int choice = JOptionPane.showConfirmDialog(null, "Do you want more?", "Coffee Shop", JOptionPane.YES_NO_OPTION);
            
            if(choice == 1) break;
        } //end of while
        
        orderList += "The total price is " + totalPrice + " baht.";
        JOptionPane.showMessageDialog(null, orderList);
        
    } //end of main()
} //end class