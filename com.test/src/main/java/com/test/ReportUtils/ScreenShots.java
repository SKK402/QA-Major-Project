import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public String captureScreenshot(String screenshotName) {
        String filePath = System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png";

        try {
            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            File directory = new File(System.getProperty("user.dir") + "/screenshots/");
            if (!directory.exists()) {
                directory.mkdir();
            }

            FileHandler.copy(source, new File(filePath));
            System.out.println("Screenshot saved: " + filePath);

        } catch (IOException e) {
            System.out.println("Exception while taking screenshot: " + e.getMessage());
        }

        return filePath;
    }