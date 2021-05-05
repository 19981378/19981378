/*--	 
 * 
 * Thhe code below converts alphanumeric, text or word and to Binary
 * UTFS-8 character chart was used for representing alphabets to numbers
 * 
 * */

import javax.swing.JOptionPane;
public class TextorNumbersToBinary extends TextorNumbersToMorseCode {

	
    private int[] num = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    
    public TextorNumbersToBinary()
    {
    	super.input = null;
    	super.output = "";
    }
    
    /*-- Convert input number to Binary*/
    public int toBinayNumber(int input)
    {
    		output = Integer.toBinaryString(input); //convert number to Binary using built-in method
    	    return Integer.parseInt(output);
    }
    
    /*--	convert Word to Binary with the help of the above method toBinayNumber*/
    public String toBinayTextorNum(String input)
    {
    	try 
    	{
    		this.input = input.toLowerCase(); // all texts or string should be in l
    	     
    	     for(int i = 0; i <= input.length() - 1; i++)
    	     {
    	      for(int y = 0; y <= alphabetandNum.length - 11; y++)
    	      {
    	       if(input.charAt(i) == alphabetandNum[y])
    	       {
    	    	output += toBinayNumber(num[y]) + " ";
    	       }
    	      }
    	     }
    		
    	}catch(Exception e)
    	{
    		JOptionPane.showMessageDialog(null, "Enter a text word, numbers only or combination of both. \n Try again ");
    	}
    	
    	return output;
    }
    
    public String toString()
	{
		return "Binary Number of "+input.toUpperCase()+" is "+output;
	}
}
