import javax.swing.JOptionPane;

public class Calcular{
	public static void main(String[]args){
		Calculadora calc1 = new Calculadora();
		int operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a operação: \n1: soma\n2: subtração\n3: divisão\n4: multiplicação"));
		if (operacao == 1){
			calc1.n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "N1: "));
			calc1.n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "N2: "));
			calc1.somar();
		}
		else if (operacao == 2){
			calc1.n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "N1: "));
			calc1.n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "N2: "));
			calc1.subtrair();
		}
		else if (operacao == 3){
			calc1.n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "N1: "));
			calc1.n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "N2: "));
			calc1.dividir();
		}
		else if (operacao == 4){
			calc1.n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "N1: "));
			calc1.n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "N2: "));
			calc1.multiplicar();
		}
	}
}
