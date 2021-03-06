package com.pages;

import static com.pages.SeleniumDriver.getDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import clima.start.ProjectDataVariables;
import com.utils.AppGetter;
import com.utils.ax;

public abstract class AbstractPage<T> {

	public static final String BASE_URL = AppGetter.getApplicationURL(ProjectDataVariables.ENV) + "/" + ProjectDataVariables.REG ;
			
	private static final int LOAD_TIMEOUT = 30;
	private static final int REFRESH_RATE = 2;

	public T loadPage(Class<T> clazz) {
		T page = PageFactory.initElements(getDriver(), clazz);
//		getDriver().get(BASE_URL + getPageUrl());
		ExpectedCondition<?> pageLoadCondition = ((AbstractPage<?>) page).getPageLoadCondition();
		waitForPageToLoad(pageLoadCondition);
		return page;
	}
	public T loadPageWithExpectedTitle(Class<T> clazz) {
		T page = PageFactory.initElements(getDriver(), clazz);
		ExpectedCondition<?> pageLoadCondition = ((AbstractPage<?>) page).getPageLoadCondition(getExpectedPageTitle());
		waitForPageToLoad(pageLoadCondition);
		return page;
	}	
	public T loadPageWithExpectedTitle(Class<T> clazz, String title) {
		T page = PageFactory.initElements(getDriver(), clazz);
		ExpectedCondition<?> pageLoadCondition = ((AbstractPage<?>) page).getPageLoadCondition(title);
		waitForPageToLoad(pageLoadCondition);
		return page;
	}	
	public T loadPageWithUrl(Class<T> clazz) {
		T page = PageFactory.initElements(getDriver(), clazz);
		String EUCR_TOKEN = "";
		String PageSourse = getDriver().getPageSource();
		
		if(PageSourse.contains("?CRF_TOKEN=")){
			CRF_TOKEN = "?CRF_TOKEN=" + ax.getCrfTokenFromSource(PageSourse);
		}else{
			EUCR_TOKEN = "";
		}
		getDriver().get(BASE_URL + getPageUrl() + CRF_TOKEN);
		ExpectedCondition<?> pageLoadCondition = ((AbstractPage<?>) page).getPageLoadCondition();
		waitForPageToLoad(pageLoadCondition);
		return page;
	}

	private void waitForPageToLoad(ExpectedCondition<?> pageLoadCondition) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
				.withTimeout(LOAD_TIMEOUT, TimeUnit.SECONDS)
				.pollingEvery(REFRESH_RATE, TimeUnit.SECONDS);

		wait.until(pageLoadCondition);
	}

	
	public abstract String getExpectedPageTitle();
	
	/**
	 * Provides condition when page can be considered as fully loaded.
	 *
	 * @return
	 */
	protected abstract ExpectedCondition<?> getPageLoadCondition();
	public abstract ExpectedCondition<?> getPageLoadCondition(String titlePart);

	/**
	 * Provides page relative URL/
	 *
	 * @return
	 */
	public abstract String getPageUrl();
	
	
	
}
