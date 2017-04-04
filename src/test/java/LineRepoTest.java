import Repo.LineRepo;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

/**
 * Created by ttomaka on 04.04.2017.
 */
public class LineRepoTest {

    @Test
    public void testGetIntValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        LineRepo repo = new LineRepo();
        Method getIntValueMethod = LineRepo.class.getDeclaredMethod("getIntValue", String.class);
        getIntValueMethod.setAccessible(true);
        int num1 = (int) getIntValueMethod.invoke(repo, "1");
        int num1_1 = (int) getIntValueMethod.invoke(repo, "1*");
        int num1_2 = (int) getIntValueMethod.invoke(repo, "*1*");

        int num123 = (int) getIntValueMethod.invoke(repo, "123");
        int num123_1 = (int) getIntValueMethod.invoke(repo, "123!@#");
        int num123_2 = (int) getIntValueMethod.invoke(repo, "*$123**&");

        assertEquals(num1, 1);
        assertEquals(num1_1, 1);
        assertEquals(num1_2, 1);

        assertEquals(num123, 123);
        assertEquals(num123_1, 123);
        assertEquals(num123_2, 123);
    }


}

