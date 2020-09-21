import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_game{
 
 
@Test
public final void testGame() {
        Game game = new Game();
        Assert.assertEquals(1, game(1));
        Assert.assertEquals(2, game(2));
        Assert.assertEquals("Fizz", game(3));
        Assert.assertEquals("Buzz", game(5));
        Assert.assertEquals("FizzBuzz", game(15));
        }
 }
