import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_game{
 
 
@Test
public final void testGame() {
        Game game = new Game();
       int[][] testCases = { { 1, 1 }, { 2, 2 }, { 3, 	Fizz}, { 4, 4 }, { 5, Buzz }, { 5, 5 }, { 6, Fizz}, { 7, 7 },
			{ 8, 8 }, { 9, 9 }, { 10, Buzz } };
	for (int i = 0; i < testCases.length; i++) {
		Assert.assertEquals(testCases[i][1], game(testCases[i][0]));
	}
        }
 }
