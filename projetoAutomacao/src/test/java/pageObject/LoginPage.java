package pageObject;

        import drivers.MyDriver;
        import org.junit.Assert;
        import org.openqa.selenium.By;

public class LoginPage {
    public void opensite() {
        MyDriver.driver.get("www.quintoandar.com.br");
    }

    public void openWaffleMenu() {
        MyDriver.driver.findElement(By.id("waffle-menu-button")).click();
    }


    public void validateWaffleMenu() {
        MyDriver.driver.findElement(By.className("sc-eqIVtm"));
        Assert.assertTrue(MyDriver.driver.findElement(By.className("sc-eqIVtm")).isDisplayed());
    }

    public void openLogin() {
        MyDriver.driver.findElement(By.className("sc-eqIVtm")).click();

    }

    public void countrycode() {
        MyDriver.driver.findElement(By.name("ddi")).clear();
        MyDriver.driver.findElement(By.name("ddi")).sendKeys("+55");
    }

    public void areacode() {
        MyDriver.driver.findElement(By.name("ddd")).clear();
        MyDriver.driver.findElement(By.name("ddd")).sendKeys("11");
    }
    public void validnumber() {
        MyDriver.driver.findElement(By.name("phone")).clear();
        MyDriver.driver.findElement(By.name ("phone")).sendKeys("963878894");
    }
    public void confirmbutton(){
        MyDriver.driver.findElement(By.className("jss673")).click();
    }
    public void smscode(){
        MyDriver.driver.switchTo().alert().sendKeys("143987");

    }
    public void popup() {
        MyDriver.driver.switchTo().alert().accept();


    }
    public void continuebutton(){
        MyDriver.driver.switchTo().alert().accept();

    }

    public void validateauthentication(){
        MyDriver.driver.findElement(By.id("waffle-menu-button")).click();
        Assert.assertEquals(MyDriver.driver.findElement(By.className("fBRUSb")).getText(),"Carolina");
    }

}
