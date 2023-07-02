import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import praktikum.Bun;

@RunWith(Parameterized.class)
public class BunParameterTest {

    private final String name;
    private final float price;

    @Mock
    private Bun bun;

    public BunParameterTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    // добавили аннотацию
    @Parameterized.Parameters(name = "Проверка возвращаемого значения в зависимости от переданного")
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Флюоресцентная булка", -1f},
                {"Краторная булка", 0f},
                {"Инопланетная булка", 10f},
                {"Солнечная булка",100f},
        };
    }

    @Test
    public void getActualNameAndPrice() {
        bun = new Bun(name, price);
        Assert.assertEquals(name, bun.getName());
        Assert.assertEquals(price, bun.getPrice(), 0);
    }

}