package Driver;

import org.openqa.selenium.WebDriver;


public class DriverClass {

    public static WebDriver driver;

    public static final String SITE_PAGE = "http://the-internet.herokuapp.com/";
    private String site;
    private String redirectUrl = SITE_PAGE + site;


    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
}
