package Driver;

import org.openqa.selenium.WebDriver;


public class driverClass {

    public static WebDriver driver;

    public static final String SitePage = "http://the-internet.herokuapp.com/";
    private String site;
    public String redirectUrl = SitePage + site;


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
