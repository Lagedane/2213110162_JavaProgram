import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import javax.swing.*;


public class Test {
	
    static JFrame f=new JFrame("Please select meat.");

    public static void main(String[] args) {
        f.setSize(450,450);
        f.setLayout(null);
        f.setVisible(true);
        button("Beef",30);
        button("Pork",80);
        button("Chicken",130);
        button("Fish",180);
        button("Shripm",230);
        button("Squid",280);
        button("Seafood",330);

    }
    
    public static void button(String meat,int position) {
        JButton memu=new JButton(meat);
        memu.setBounds(150,position,130,30);
        f.add(memu);
    }
    

}