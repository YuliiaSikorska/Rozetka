package rozetkaTest;

import model.Filter;
import model.Filters;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.CurrencyUtil;
import util.XMLToObject;

import java.math.BigDecimal;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class ProductAddToBasketTest extends BaseTest {

    @DataProvider(name = "data", parallel = true)
    public static Object[][] getDataFromXmlFile() {
        XMLToObject xmlToObject = new XMLToObject();
        Filters filters = xmlToObject.convert();
        List<Filter> filter = filters.getFilters();
        Object[][] filterTable = new Object[filter.size()][3];
        for (int i = 0; i < filter.size(); i++) {
            filterTable[i][0] = filter.get(i).getItem();
            filterTable[i][1] = filter.get(i).getBrand();
            filterTable[i][2] = filter.get(i).getSum();
        }
        return filterTable;
    }

    @Test(dataProvider = "data")
    public void checkThatSumOfProductLessGivenSum(String item, String brand, Integer price) {
        getHomePageBO().searchOfProduct(item);
        getSearchResultPageBO().searchResult(brand);
        getProductDetailsPageBO().byuOption();
        BigDecimal totalPrice = CurrencyUtil.removeCurrency(getCheckoutPage().getProductPrice());
        assertEquals(totalPrice.compareTo(BigDecimal.valueOf(price)), -1);
    }
}
