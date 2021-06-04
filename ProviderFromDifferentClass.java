package parameterDataprovider;

import org.testng.annotations.DataProvider;

public class ProviderFromDifferentClass {
	@DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
            { "Ami", "hahahaaaa" },
            { "ThuyVi", "huhu" },
            { "Lily", "hihi" }
        };

    }
}
