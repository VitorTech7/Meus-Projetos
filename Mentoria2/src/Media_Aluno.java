import java.util.Locale; 
import javax.swing.JOptionPane;
public class Media_Aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		String nome;
		double nota1, nota2, nota3, nota4, media;
		int idade; 
		
		Locale.setDefault(Locale.US);
		
		
		nome = JOptionPane.showInputDialog("Informe o seu nome: "); 
		
		idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a sua idade")); 
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a primeira nota: ")); 
		nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a segunda nota: ")); 
		nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a terceira nota")); 
		nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quarta nota: ")); 
		
		
		
		media = (nota1 + nota2 + nota3 + nota4)/4; 
		
		
		int resposta = JOptionPane.showConfirmDialog(null, "Você confirma a sua média? " + media); 
		
		if(resposta == JOptionPane.YES_OPTION) {
			if(media >= 7) {
				JOptionPane.showMessageDialog(null, "Olá " + nome + "Você foi aprovado"); 
				
			}else if(media <5 && media >7) {
				JOptionPane.showMessageDialog(null, "Olá " + nome + "Você está em recuperação");
			}else {
				JOptionPane.showMessageDialog(null, "Olá" + nome + "Você está reprovado");
			}
		
		}else if(resposta == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Refaça");
			
		
		}	else {
			JOptionPane.showMessageDialog(null, "Tchau"); 
		}
		
		
		
		
		
		
	}
	
	
}
