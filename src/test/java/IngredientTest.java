import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class IngredientTest {

    private final String TEST_NAME_INGREDIENT = "Соус метеорный";
    private final float TEST_PRICE_INGREDIENT = 10f;
    private Ingredient ingredient;


    @Before
    public void setUp() {
        ingredient = new Ingredient(IngredientType.SAUCE, TEST_NAME_INGREDIENT, TEST_PRICE_INGREDIENT);
    }


    @Test
    public void getPriceTest() {
        Assert.assertEquals("Цена ингридиента неверная", TEST_PRICE_INGREDIENT, ingredient.getPrice(), 0);
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals("Неправильное наименование ингридиента", TEST_NAME_INGREDIENT, ingredient.getName());
    }

    @Test
    public void getTypeTest() {
        Assert.assertEquals("Типы ингредиентов не совпадают", IngredientType.SAUCE, ingredient.getType());
    }

}
