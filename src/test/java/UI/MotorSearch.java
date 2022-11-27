package UI;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MotorSearch {
	
	private WebDriver driver;
	  
  @BeforeMethod
	public void GoToHomePage() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.trademe.co.nz");
	}
	
  @AfterMethod
    public void CloseBrowser() {
	  driver.close();
 }

  @Test
    public void SearchFerrari() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/tm-root/div[1]/main/div/tm-dynamic-homepage/tm-homepage-search-header/nav/div[2]/ul/li[3]/a")).click();
      Thread.sleep(5000);
      WebElement DropDown = driver.findElement(By.name("selectedMake"));
      Select select = new Select(DropDown);
      select.selectByValue(("Ferrari"));
      Thread.sleep(5000);

      driver.findElement(By.xpath("/html/body/tm-root/div[1]/main/div/tm-motors-home-page/tm-motors-home-page-header/div/div/tm-motors-search-form/form/tm-motors-used-cars-large/tg-row[3]/tg-col[3]/button")).click();
      Thread.sleep(5000);

      WebElement SearchResult1 = driver.findElement(By.xpath("/html/body/tm-root/div[1]/main/div/tm-motors-search-results/div/div/div[1]/div/tm-search-header-result-count"));
      WebElement MakeDropdown = driver.findElement(By.xpath("/html/body/tm-root/div[1]/main/div/tm-motors-search-results/tm-search-header/div/div/tm-refine-header/div[4]/tm-tags/tm-drop-down-tag[4]/tg-tag/span/button"));
      String ExpectMake = "Make: Ferrari";
      //To verify "Ferrari" is displayed in the Make dropdown menu after searching
      Assert.assertEquals(MakeDropdown.getText(),ExpectMake);
      System.out.println("Ferrari was found and the test passed");
      //To get and print out the search result
      String ActualResult = SearchResult1.getText();
      System.out.println(ActualResult);  
  }
  
  @Test
    public void SearchBMW() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/tm-root/div[1]/main/div/tm-dynamic-homepage/tm-homepage-search-header/nav/div[2]/ul/li[3]/a")).click();
      Thread.sleep(5000);
      WebElement DropDown = driver.findElement(By.name("selectedMake"));
      Select select = new Select(DropDown);
      select.selectByValue(("BMW"));
      Thread.sleep(5000);

      driver.findElement(By.xpath("/html/body/tm-root/div[1]/main/div/tm-motors-home-page/tm-motors-home-page-header/div/div/tm-motors-search-form/form/tm-motors-used-cars-large/tg-row[3]/tg-col[3]/button")).click();
      Thread.sleep(5000);

      WebElement SearchResult1 = driver.findElement(By.xpath("/html/body/tm-root/div[1]/main/div/tm-motors-search-results/div/div/div[1]/div/tm-search-header-result-count"));
      WebElement MakeDropdown = driver.findElement(By.xpath("/html/body/tm-root/div[1]/main/div/tm-motors-search-results/tm-search-header/div/div/tm-refine-header/div[4]/tm-tags/tm-drop-down-tag[4]/tg-tag/span/button"));
      String ExpectMake = "Make: BMW";
      //To verify "BMW" is displayed in the Make dropdown menu after searching
      Assert.assertEquals(MakeDropdown.getText(),ExpectMake);
      System.out.println("BMW was found and the test passed");
      //To get and print out the search result
      String ActualResult = SearchResult1.getText();
      System.out.println(ActualResult); 
 }
  
  @Test
    public void SearchHonda() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/tm-root/div[1]/main/div/tm-dynamic-homepage/tm-homepage-search-header/nav/div[2]/ul/li[3]/a")).click();
      Thread.sleep(5000);
      WebElement DropDown = driver.findElement(By.name("selectedMake"));
      Select select = new Select(DropDown);
      select.selectByValue(("Honda"));
      Thread.sleep(5000);

      driver.findElement(By.xpath("/html/body/tm-root/div[1]/main/div/tm-motors-home-page/tm-motors-home-page-header/div/div/tm-motors-search-form/form/tm-motors-used-cars-large/tg-row[3]/tg-col[3]/button")).click();
      Thread.sleep(5000);

      WebElement SearchResult1 = driver.findElement(By.xpath("/html/body/tm-root/div[1]/main/div/tm-motors-search-results/div/div/div[1]/div/tm-search-header-result-count"));
      WebElement MakeDropdown = driver.findElement(By.xpath("/html/body/tm-root/div[1]/main/div/tm-motors-search-results/tm-search-header/div/div/tm-refine-header/div[4]/tm-tags/tm-drop-down-tag[4]/tg-tag/span/button"));
      String ExpectMake = "Make: Honda";
      //To verify "Honda" is displayed in the Make dropdown menu after searching
      Assert.assertEquals(MakeDropdown.getText(),ExpectMake);
      System.out.println("Honda was found and the test passed");
      //To get and print out the search result
      String ActualResult = SearchResult1.getText();
      System.out.println(ActualResult);  
 }
  
  @Test
    public void SearchMazda() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/tm-root/div[1]/main/div/tm-dynamic-homepage/tm-homepage-search-header/nav/div[2]/ul/li[3]/a")).click();
      Thread.sleep(5000);
      WebElement DropDown = driver.findElement(By.name("selectedMake"));
      Select select = new Select(DropDown);
      select.selectByValue(("Mazda"));
      Thread.sleep(5000);

      driver.findElement(By.xpath("/html/body/tm-root/div[1]/main/div/tm-motors-home-page/tm-motors-home-page-header/div/div/tm-motors-search-form/form/tm-motors-used-cars-large/tg-row[3]/tg-col[3]/button")).click();
      Thread.sleep(5000);

      WebElement SearchResult1 = driver.findElement(By.xpath("/html/body/tm-root/div[1]/main/div/tm-motors-search-results/div/div/div[1]/div/tm-search-header-result-count"));
      WebElement MakeDropdown = driver.findElement(By.xpath("/html/body/tm-root/div[1]/main/div/tm-motors-search-results/tm-search-header/div/div/tm-refine-header/div[4]/tm-tags/tm-drop-down-tag[4]/tg-tag/span/button"));
      String ExpectMake = "Make: Mazda";
      //To verify "Mazda" is displayed in the Make dropdown menu after searching
      Assert.assertEquals(MakeDropdown.getText(),ExpectMake);
      System.out.println("Mazda was found and the test passed");
      //To get and print out the search result
      String ActualResult = SearchResult1.getText();
      System.out.println(ActualResult);  
 }
}
