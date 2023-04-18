package OrangeHRM;

import shared.BaseTest;

public class Main extends BaseTest {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    @Override
    public void run() {
        HomePage homePage = new HomePage(driver, wait);

        homePage.fetchHomePage();
        homePage.Username("Admin");
        homePage.Password("admin123");
    }
}
