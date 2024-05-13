package POM;

import org.openqa.selenium.By;

public class ContactPOM {

    public By Name = By.xpath("//div[@class='contact-form mb-2 aos-init aos-animate']//input[@id='name']");

    public By Email = By.xpath("//div[@class='contact-form mb-2 aos-init aos-animate']//input[@id='email']");

    public By Phone = By.xpath("//div[@class='contact-form mb-2 aos-init aos-animate']//input[@id='phone']");

    public By Message = By.xpath("//div[@class='contact-form mb-2 aos-init aos-animate']//textarea[@id='message']");

    public By Submit = By.xpath("//div[@class='text-center pt-2']//button[@type='submit'][normalize-space()='Submit']");

    public By Directions = By.xpath("//div[.='Directions']");

    public By rocket = By.xpath("//div[@id='rocket-container']");

    public By review = By.xpath("//a[.='24 reviews']");

    public By Large = By.xpath("//a[.='View larger map']");

    public By hcbf = By.cssSelector("input#username");

    public By Bold = By.cssSelector("input.login_input");   /// css selector with class

    public By Bold132e =(By.cssSelector("input[id='username']"));
}

