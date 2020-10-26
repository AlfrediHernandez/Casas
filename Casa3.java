import javax.swing.*;
import java.awt.*;
public class Casa3 extends JFrame{
	public Casa3(){
		setDefaultCloseOperation(3);
		setResizable(false);
		setSize(400,400);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("Alfredihdz 26-octubre-2020");
		getContentPane().add(new Lienzo3());
	}
	public static void main(String [] ar){
		new Casa3();
	}
}
class Lienzo3 extends Canvas{
	public void paint(Graphics g){
		// fondo negro
		g.setColor(Color.black);	
		g.fillRect(0,0,getWidth(),getHeight());
		//techo Casa
		int x[] = {100,200,300};
		int y[] = {100,20,100};
		g.setColor(Color.orange);
		g.fillPolygon(x,y,3);
		// cuadrado de la Casa
		g.setColor(Color.blue);
		g.fillRect(100,100,200,200);
		// ventanas de la Casa
		g.setColor(Color.red);
		g.fillRect(120,150,40,50);
		g.fillRect(240,150,40,50);
		// puerta
		g.setColor(Color.pink);
		g.fillRect(175,200,50,100);
	}
}
