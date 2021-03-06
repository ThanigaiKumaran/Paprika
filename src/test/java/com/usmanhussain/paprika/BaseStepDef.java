package com.usmanhussain.paprika;

import com.usmanhussain.habanero.framework.WebDriverDiscovery;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseStepDef extends WebDriverDiscovery {

    protected static final Logger LOG = LoggerFactory.getLogger(BaseStepDef.class);

    public WebDriver getDriver() {
        return remoteWebDriver;
    }

}