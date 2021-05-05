/*
 * 
 * The Code below converts Alphanumeric text or words to Morse code
 * 
 * 
 * */
import javax.swing.JOptionPane;
public class TextorNumbersToMorseCode {
	
	protected char[] alphabetandNum = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7','8',
	        '9', '0'};
	private String[] morse = { /*A*/".-", /*B*/"-...", /*C*/"-.-.", /*D*/"-..", /*E*/".", /*F*/"..-.", /*G*/"--.",
	        /*H*/"....", /*I*/"..", /*J*/".---", /*K*/"-.-", /*L*/".-..", /*M*/"--", /*N*/"-.", /*O*/"---", /*P*/".--.",
	        /*Q*/"--.-", /*R*/".-.", /*S*/"...", /*T*/"-", /*U*/"..-", /*V*/"...-", /*W*/".--", /*X*/"-..-",
	        /*Y*/"-.--", /*Z*/"--..", /*1*/".----", /*2*/"..---", /*3*/"...--", /*4*/"....-", /*5*/".....",
	        /*6*/"-....", /*7*/"--...", /*8*/"---..", /*9*/"----.", /*0*/"-----"}; //morse code array

	protected String input;
	protected String output;
	
	/*-- Class Constructor	--*/
	public TextorNumbersToMorseCode()
	{
		this.input = null;
		this.output = "";
	}
	
	/*-- End Class Constructor	--*/
	
	/*	Getter and Setter methods	*/
	public String getInput()
	{
		return this.input;
	}
		
	public void setInput(String input)
	{
		this.input = input;
	}
	/*	End Getter and Setter methods	*/
	
	/*	Morse Code Method	*/
	public void morseCode(String input)
	{
		
		try 
		{
			this.input = input;
			
			for(int i = 0; i <= input.length() - 1; i++)
	        {
	         for(int y = 0; y <= alphabetandNum.length - 1; y++)
	         {
	          if(input.charAt(i) == alphabetandNum[y])
	          {
	            output += morse[y] +" ";
	          }
	         }
	        }
		} 
		catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "Please enter a word or whole number only. \n Try again ");
		}
		
        
	}
	
	public String toString()
	{
		return "Morse Code of "+input.toUpperCase()+" is "+this.output;
	}

}
