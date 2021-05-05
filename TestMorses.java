import java.util.*;

import org.eclipse.jgit.lib.Repository;
import org.refactoringminer.api.GitHistoryRefactoringMiner;
import org.refactoringminer.api.GitService;
import org.refactoringminer.api.Refactoring;
import org.refactoringminer.api.RefactoringHandler;
import org.refactoringminer.rm1.GitHistoryRefactoringMinerImpl;
import org.refactoringminer.util.GitServiceImpl;
public class TestMorses {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		TextorNumbersToMorseCode morse = new TextorNumbersToMorseCode(); //creating and instantiating objects
		TextorNumbersToBinary bin = new TextorNumbersToBinary();
		
		Scanner in = new Scanner(System.in);
		String input;
		
		System.out.println("Enter alphanumeric text or word "); //Enter word or number
		input = in.next();
		
			
		try 
		{
		 if(!(input.equals("")))
		 {
		  morse.setInput(input);
				
		  morse.morseCode(morse.getInput()); // convert entered text or number to Morse Code
		  bin.toBinayTextorNum(morse.getInput()); // convert input to binary
				
		  System.out.println(morse.toString() +" \n"+ bin.toString()); //output result
		 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(in != null)
			{
				in.close();
			}
		}
		GitService gitService = new GitServiceImpl();
		GitHistoryRefactoringMiner miner = new GitHistoryRefactoringMinerImpl();

		Repository repo = gitService.cloneIfNotExists(
		    "tmp/refactoring-toy-example",
		    "https://github.com/danilofes/refactoring-toy-example.git");

		miner.detectAll(repo, "master", new RefactoringHandler() {
		  @Override
		  public void handle(String commitId, List<Refactoring> refactorings) {
		    System.out.println("Refactorings at " + commitId);
		    for (Refactoring ref : refactorings) {
		      System.out.println(ref.toString());
		    }
		  }
		});
		
		
	}

}

























