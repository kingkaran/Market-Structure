package com.marketstructure;

import com.marketstructure.web.i18n.i18nService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MarketStructureApplicationTests {

	@Autowired
	private i18nService I18NService;

	@Test
	public void testMessageByLocaleService() throws Exception {
		String expectedResult = "Bootstrap starter template";
		String messageID = "index.main.callout";
		String actual = I18NService.getMessage(messageID);
		Assert.assertEquals("Strings do not match", expectedResult, actual);
	}

}
