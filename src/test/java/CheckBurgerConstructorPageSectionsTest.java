import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import PageObject.BurgerСonstructorPage;

public class CheckBurgerConstructorPageSectionsTest {

    @Before
    public void setUp() {
        Configuration.browserSize = "1600x900";
        Configuration.browserPosition = "0x0";
    }

    @After
    public void teardown() {
        Selenide.closeWindow();
    }

    @Test
    @DisplayName("Проверка смены раздела сборки ингредиентов для бургера")
    public void checkSectionBuns() {
        String expectedResult = "Булки";
        String actualResult = Selenide.open(BurgerСonstructorPage.URL, BurgerСonstructorPage.class)
                .checkActiveSectionBuns();
        Assert.assertEquals("Ожидается, что при нажатии на раздел Булки, произойдет скролл до заголовка Булки", expectedResult, actualResult);
    }

    @Test
    @DisplayName("Проверка смены раздела сборки ингредиентов для бургера")
    public void checkSectionSauce() {
        String expectedResult = "Соусы";
        String actualResult = Selenide.open(BurgerСonstructorPage.URL, BurgerСonstructorPage.class)
                .checkActiveSectionSauce();
        Assert.assertEquals("Ожидается, что при нажатии на раздел Соусы, произойдет скролл до заголовка Соусы", expectedResult, actualResult);
    }

    @Test
    @DisplayName("Проверка смены раздела сборки ингредиентов для бургера")
    public void checkSectionFilling() {
        String expectedResult = "Начинки";
        String actualResult = Selenide.open(BurgerСonstructorPage.URL, BurgerСonstructorPage.class)
                .checkActiveSectionFilling();
        Assert.assertEquals("Ожидается, что при нажатии на раздел Начинки, произойдет скролл до заголовка Начинки", expectedResult, actualResult);
    }
}