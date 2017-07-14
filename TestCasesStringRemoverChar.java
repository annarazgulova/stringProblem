package interview;
import org.testng.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestCasesStringRemoverChar {
		 	/******* String exercise **********/
			@Test(dataProvider = "testString",  groups={"stringExercise"})
		 	public void testRemoveChar(String string, char charToRemove) {
		 		String res = StringRemoveChar.removeChar(string, charToRemove);
		  		Assert.assertTrue(!StringRemoveChar.verifyNoChar(res, charToRemove));		 
		 	}
		 
		 	@DataProvider(name = "testString")
		 	public static Object[][] RemoveAllInstanceChar() {
		 		return new Object[][] {
		 				{ "anna", 'a' },
		 				{ "anna", '\n', },
		 				{ "anna", '\n', },
		 				{ "", '\0' },
		 				{ null, '8' },
		 				{ "anna", '0' },
		 				{ "aSDFGHJKL;LKJHGFRTYUIOPOIFCVBNM,..,JHGTYOIUYTDSDF;LKHCV...", 'a'} };
		 	}		 	
		
}
