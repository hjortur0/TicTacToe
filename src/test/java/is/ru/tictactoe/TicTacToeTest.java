package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;

public class TicTacToeTest
{
    @Test
    public void testCheckInitial()
    {
        TicTacToe tic = new TicTacToe();
        assertEquals('.', tic.getMark(1, 2));
    }

    @Test
    public void testMarkSpace()
    {
    	TicTacToe tic = new TicTacToe();
    	tic.markSpace(1, 1);
    	assertEquals('x', tic.getMark(1, 1));
    }

    @Test
    public void testMarkSpaceInvalidIndex()
    {
    	try
    	{
    		TicTacToe tic = new TicTacToe();
    		tic.markSpace(3,3);
    		Assert.fail();
    	}
    	catch (Exception e)
    	{
    		String messageExpected  = "Error: Board index out of bounds";
    		assertEquals(messageExpected, e.getMessage());
    	}

    	try
    	{
			TicTacToe tic = new TicTacToe();
    		tic.markSpace(-1,0);
    		Assert.fail();
    	}
    	catch (Exception e)
    	{
			String messageExpected  = "Error: Board index out of bounds";
    		assertEquals(messageExpected, e.getMessage());
    	}
    	
    }
}
