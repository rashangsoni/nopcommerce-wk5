package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay Vaghani
 */
public class TestData {

    @DataProvider(name = "credentials")
    public Object[][] getData(){// for creation of data
        Object[][] data = new Object[][]{
                {"test1@gmail.com","test123"},
                {"test2@gmail.com","test124"},
                {"test3@gmail.com","test125"},
        };
        return data;
    }

}
