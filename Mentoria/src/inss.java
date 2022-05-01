
public class inss {

	public double salario_bruto; 
	public double aliquota_inss;
	public double valor_inss;
	public double aliquota_ir;
	public double redutor_ir; 
	public double resultado_inss; 
	public double resultado_ir; 
	public double valor_ir; 
	public double resultado_liquido; 
	
	
	public void calc_inss(double sal_bru, double ali_inss, double resul_inss) {
	
	this.salario_bruto = sal_bru; 
	this.aliquota_inss = ali_inss; 
	this.resultado_inss = resul_inss; 
		
	resul_inss = (sal_bru * ali_inss)/100; 
	
	System.out.println("Seu inss é: " + resul_inss);
		
		
	}
	
	
	public void calc_ir(double sal_bru, double val_inss, double ali_ir, double resul_ir, double red_ir) {
	
	this.salario_bruto = sal_bru;
	this.valor_inss = val_inss; 
	this.aliquota_ir = ali_ir; 
	this.resultado_ir = resul_ir; 	
	this.redutor_ir = red_ir; 
	
	
	resul_ir = ((sal_bru - val_inss) * ali_ir)/100 - red_ir; 
	
	System.out.println("Seu valor do IR é: " + resul_ir);	
	
	
	
	}
	
	
	public void calc_sal_liquido(double sal_bru, double val_inss, double val_ir, double resul_liq) {
	
	this.salario_bruto = sal_bru; 
	this.valor_inss = val_inss; 
	this.valor_ir = val_ir; 
	this.resultado_liquido = resul_liq; 
	
	resul_liq = (sal_bru - val_inss - val_ir); 	
	
	System.out.println("Seu salário líquido é: " + resul_liq);
		
		
		
		
		
	}
	
}
