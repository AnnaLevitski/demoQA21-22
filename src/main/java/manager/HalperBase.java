package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface HalperBase extends AppManager{
    default void clikBase(By locator){
        wd.findElement(locator).click();
    }
    default void pause(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    default void type(By locator, String text){
        WebElement el = wd.findElement(locator);
        el.clear();
        el.click();
        el.sendKeys(text);
    }
}

