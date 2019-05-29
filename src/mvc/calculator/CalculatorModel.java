/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.calculator;

/**
 *
 * @author user
 */
import javax.swing.JButton;
import javax.swing.JTextField;
 
public class CalculatorModel
{
	private int sum;
	private int number;
	private char opt;
 
	public CalculatorModel()
	{
		sum = 0;
		number = 0;
	}
 
	public int set(JButton idenifier, JTextField number)
	{
		//this will receive '+' '-' '/' etc
		opt = idenifier.getText().charAt(0);
 
		//getting value from JTextField and setting it as a integer
		this.number = Integer.parseInt(number.getText());
 
		return calculate(opt);
                
	}
 
	public void setNumber(int number)
	{
		this.number = number;
	}
 
	public int getSum() {
		return sum;
	}
 
	private void setSum(int sum) 
	{
		this.sum = sum;
	}
 
	int calculate(char sign)
	{
		switch(sign)
		{
		case '+':
			sum += number; 
			//setSum(sum);
			break;
		case '-':
			sum -= number;
			//setSum(sum);
			break;
 
		case '/':
			sum/= number;
			//setSum(sum);
			break;
 
		case '*':
			sum *= number;
			//setSum(sum);
			break;
 
		case '=':
			//setSum(sum);
			break;
		case 'C':
			opt = 0;
			number = 0;
			sum = 0;
			//setSum(sum);
			break;
			default: 
		}
                return sum;
	}
        
        
}

