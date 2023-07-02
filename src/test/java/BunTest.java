import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;
import static org.junit.Assert.assertEquals;


public class BunTest {

    // Создаем локальные переменные для ожидаемого результата
    private final String TEST_NAME_BUN = "Инопланетная булка";
    private final float TEST_PRICE_BUN = 10.5f;

    private Bun bun;

    @Before
    public void setUp() {
        bun = new Bun(TEST_NAME_BUN, TEST_PRICE_BUN);
    }

    @Test
    public void getNameReturnActualName() {
        String actual = bun.getName();
        assertEquals("Ошибка в имени булки", TEST_NAME_BUN, actual);
    }

    @Test
    public void getPriceReturnActualPrice() {
        float actual = bun.getPrice();
        assertEquals("Ошибка в цене булки", TEST_PRICE_BUN, actual, 0);
    }
}