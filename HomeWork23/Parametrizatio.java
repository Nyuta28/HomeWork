package HomeWork23;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parametrizatio {
    @Test(dataProvider = "getData")
    public void doLogin(String username, String password){
        System.out.println(username + "-----" + password);
    }


    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[5][2];

        data[0][0] = "test1@test.com";
        data[0][1] = "passwd1";

        data[1][0]= "test2@test.com";
        data[1][1] = "passwd2";

        data[2][0]= "test3@test.com";
        data[2][1] = "passwd3";

        data[3][0]= "test4@test.com";
        data[3][1] = "passwd4";

        data[4][0]= "test5@test.com";
        data[4][1] = "passwd5";

        return data;
    }

}

