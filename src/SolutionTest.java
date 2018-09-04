import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest 
{

    @Test
    public void test1() 
    {
        assertTrue(Solution.checkDivide(8));
    }
    @Test
    public void test2()
    {
        assertFalse(Solution.checkDivide(2));
    }
    @Test
    public void test3()
    {
        assertFalse(Solution.checkDivide(0));
    }

}
