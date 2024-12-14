package tests.userTests;

import model.userModel.UserRequestModel;
import model.userModel.GetUserResponseModel;
import model.userModel.ResponseModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class GetUserTest extends BaseTest {

    @Test(priority = 1)
    public void postCreateListUser() {
        UserRequestModel userRequestModel = new UserRequestModel(
                595959595995595L,"店に入る","ストリング","ストリング","ストリング","店に入る","ストリング",0);
        List<UserRequestModel> usersList = new ArrayList<>();
        usersList.add(userRequestModel);
        ResponseModel model = USER_API.postCreateListUser(usersList);
        Assert.assertEquals(model.getCode(), "200");
    }

    @Test(priority = 2)
    public void getUserByUser() {
        GetUserResponseModel model = USER_API.getUserByUserName("アントニオ");
        Assert.assertEquals(model.getUsername(), "ニキタ");
    }

    @Test(priority = 3)
    public void putChangeUser() {
        UserRequestModel userRequestModel = new UserRequestModel(
                595959595995595L,"アントニオ","バイト","バイト","ストリング","ヴラディレーナ・ミリーゼ","ストリング",0);
        ResponseModel model = USER_API.putChangeUser("バイト",userRequestModel);
        Assert.assertEquals(model.getCode(), "200");
    }

    @Test(priority = 4)
    public void postCreateUser() {
        UserRequestModel userRequestModel = new UserRequestModel(
                5959595959955952L,"86","バイト","アントニオ",
                "アントニオ","86","アントニオ",0);
        ResponseModel model = USER_API.postCreateUser(userRequestModel);
        Assert.assertEquals(model.getCode(), "200");
    }

    @Test(priority = 7)
    public void deleteUser() {
        ResponseModel model = USER_API.deleteUser("アントニオ");
        Assert.assertEquals(model.getCode(), "200");
    }

    @Test(priority = 5)
    public void getLogin() {
        ResponseModel model = USER_API.getLogin("アントニオ","ストリンゴ");
        Assert.assertEquals(model.getCode(), "200");
    }


    @Test(priority = 6)
    public void getLogout() {
        ResponseModel model = USER_API.getLogout();
        Assert.assertEquals(model.getCode(), "200");
    }


}
