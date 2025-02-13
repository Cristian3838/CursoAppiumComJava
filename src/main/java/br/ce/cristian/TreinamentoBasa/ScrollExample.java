package br.ce.cristian.TreinamentoBasa;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

public class ScrollExample {
    private AppiumDriver<MobileElement> driver;

    public ScrollExample(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void scrollVertical() {
        Dimension size = driver.manage().window().getSize();
        int startX = size.width / 2;
        int startY = (int) (size.height * 0.1);
        int endY = (int) (size.height * 0.1);

        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(startX, startY))
                   .moveTo(PointOption.point(startX, endY))
                   .release()
                   .perform();
    }
}
