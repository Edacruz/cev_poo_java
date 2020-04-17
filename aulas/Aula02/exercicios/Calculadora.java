import javax.swing.JOptionPane;

public class Calculadora{
	int n1;
	int n2;
	
	void somar(){
		JOptionPane.showMessageDialog(null, n1 + n2);
		
		}
	void subtrair(){
		JOptionPane.showMessageDialog(null, n1 - n2);
		
		}
	void multiplicar(){
		JOptionPane.showMessageDialog(null, n1 * n2);
		
		}
	void dividir(){
		JOptionPane.showMessageDialog(null, n1 / n2);
		
		}
}
