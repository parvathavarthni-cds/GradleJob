package com.pw.publicLib;

import java.io.File;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.pw.pw_screens.Risk_Based_Test_Set_for_HIVE_OP_BUY;

public class UIHandler_3 extends Page_factory{
	
//	*************************************Risk_Based_Test_Set_for_HIVE_OP_BUY*************************************

	private Logger LOGGER = Logger.getLogger(SD_UIHandler.class.getName());	
	public static String Ref_id = null;
	public String remove_created_order = "DELETE FROM `orderpaddb`.`orders` WHERE `order_reference` = ";
	static float open_order_value;
	static float open_order_value_sell;
	static float available_unit_sell;
	public static String Units;
	private static DecimalFormat df = new DecimalFormat("0.00");
	public String get_OTP_query = "select direct_otp from users where email = 'gunaseeelan.p100@gmail.com'";
	public WebDriver investor_selection(WebDriver driver, String portfolio) throws InterruptedException {
		driver.navigate().refresh();
		wait_by_visibility(driver, global_portfolio_list_button, 120);
		Thread.sleep(8000);
		global_portfolio_list_button.click();
		wait_by_visibility(driver, Name_under_portfolio_list, 120);
		Search_by_portfolio_name_or_ID_search_box.click();
		Search_by_portfolio_name_or_ID_search_box.sendKeys(portfolio);
		Thread.sleep(12000);
		investor_name.click();
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver get_CMA_cash(WebDriver driver) throws InterruptedException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, UnirestException {
		API_Handler.get_CMA_cash(driver);
	    LOGGER.log(Level.INFO, "CMA_CASH==>" + Risk_Based_Test_Set_for_HIVE_OP_BUY.CMA_CASH_DATA); 
		return driver;
	}
	public WebDriver get_all_CMA_cash(WebDriver driver) throws InterruptedException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, UnirestException {
		API_Handler.get_all_CMA_cash(driver);
	    LOGGER.log(Level.INFO, "ANZ CMA_CASH==>" + Risk_Based_Test_Set_for_HIVE_OP_BUY.ANZ_Bank_CMA_CASH_DATA);
	    LOGGER.log(Level.INFO, "MAQ CMA_CASH==>" + Risk_Based_Test_Set_for_HIVE_OP_BUY.Macquarie_Bank_CMA_CASH_DATA); 
		return driver;
	}
	public WebDriver place_orders_side_tray(WebDriver driver) throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(5000);
		wait_until_clickable(driver, cash_section_under_summary_tab, 120);
		place_an_order_button.click();
		return driver;
	}
	public WebDriver Add_a_BUY_order_side_tray(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, BUY_Button, 120);
		BUY_Button.click();
		wait_until_clickable(driver, Approved_product_list_dropdown, 120);
		return driver;
	}
	public WebDriver APL_asset_selection(WebDriver driver, String Asset_code) throws InterruptedException {
		Approved_product_list_dropdown.click();
//		wait_by_visibility(driver, Approved_product_list_dropdown_result, 120);
		Thread.sleep(10000);
		APL_searchbox.click();
		APL_searchbox.sendKeys(Asset_code);
		Approved_product_list_1st_value.click();
		wait_by_visibility(driver, investment_amount_field, 120);
		return driver;
	}
	public WebDriver enter_value_in_investment_amount_field(WebDriver driver, double cMA_CASH_DATA) throws InterruptedException {
		wait_by_visibility(driver, investment_amount_field, 120);
		investment_amount_field.sendKeys(String.valueOf(cMA_CASH_DATA));
		return driver;
	}
	public WebDriver fill_neccessary_fields_to_enable_add_button(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, adviser_given_no, 120);
		adviser_given_no.click();
		BUY_PDS_Checkbox.click();
		return driver;
	}
	public WebDriver check_if_add_button_is_in_disabled_state(WebDriver driver) throws InterruptedException {
		Assert.assertEquals(add_button.getAttribute("class").contains("add-disabled"), true);
	    LOGGER.log(Level.INFO, "+Add button is disabled"); 
		return driver;
	}
	public WebDriver validate_exceeding_your_available_funds(WebDriver driver) throws InterruptedException {
		assertEquals(driver, order_amount_validation_error_message, "You are exceeding your available funds", "You are not allowed to place an order");
		return driver;
	}
	public WebDriver check_if_add_button_is_in_enabled_state(WebDriver driver) throws InterruptedException {
		Assert.assertEquals(add_button.getAttribute("class").contains("add-enabled"), true);
	    LOGGER.log(Level.INFO, "+Add button is enabled");
	    Thread.sleep(2000);
		return driver;
	}
	public WebDriver click_on_add_button(WebDriver driver) throws InterruptedException {
	    add_button.click();
		return driver;
	}
	public WebDriver remove_draft_orders(WebDriver driver) throws InterruptedException {
		extended_sidetray_add_sell_cancel.click();
		wait_until_clickable(driver, draft_cancel, 120);
		draft_cancel.click();
		wait_until_clickable(driver, confirm_popUp_cancel_order, 120);
		confirm_popUp_cancel_order.click();
		Thread.sleep(4000);
		return driver;
	}

	public WebDriver check_open_order_value(WebDriver driver) throws InterruptedException {
		open_order_value(driver);
		if ((open_order_value<(Risk_Based_Test_Set_for_HIVE_OP_BUY.CMA_CASH_DATA)-1000) & (open_order_value>0)) {
		    LOGGER.log(Level.INFO, String.valueOf(open_order_value)); 
		}
		return driver;
	}
	public WebDriver remove_the_created_order_from_orders_DB(WebDriver driver) throws InterruptedException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
		DataBase remove = PageFactory.initElements(driver, DataBase.class);
		remove.delete_open_orders(driver, "DELETE FROM `orderpaddb`.`orders` WHERE `advisor_id` = 100 AND `order_reference` = "+Ref_id+"");
		return driver;
	}
	public WebDriver APL_asset_search(WebDriver driver, String asset_code) throws InterruptedException {
		Approved_product_list_dropdown.click();
		wait_by_visibility(driver, Approved_product_list_dropdown_result, 120);
		Thread.sleep(3000);
		APL_searchbox.click();
		APL_searchbox.sendKeys(asset_code);
		return driver;
	}
	public WebDriver Available_funds_equals_to_CMA_Cash_minus_Other(WebDriver driver) throws InterruptedException {
		String available_fund = available_funds.getText();
		String AF = available_fund.replaceAll(",", "");
		int length = AF.length();
		AF = AF.substring(0, length-3);
		open_order_value(driver);
		double cash = Risk_Based_Test_Set_for_HIVE_OP_BUY.CMA_CASH_DATA - open_order_value - 100;
		String cash_final = String.valueOf((int) cash);
//		System.out.println(cash_final);
//		System.out.println(AF);
		Assert.assertEquals(AF, "$"+cash_final);
	    LOGGER.log(Level.INFO, "Available funds = CMA Cash - Open order value - Other"); 
		return driver;
	}
	public WebDriver ANZ_CMA_cash_as_the_Available_funds(WebDriver driver) throws InterruptedException {
		String available_fund = available_funds.getText();
		String AF = available_fund.replaceAll(",", "");
		open_order_value(driver);
		float cash = Risk_Based_Test_Set_for_HIVE_OP_BUY.ANZ_Bank_CMA_CASH_DATA - open_order_value - 100;
		String cash_final = df.format(cash);
		System.out.println(cash);
		System.out.println(cash_final);
		System.out.println(open_order_value);
		System.out.println(Risk_Based_Test_Set_for_HIVE_OP_BUY.ANZ_Bank_CMA_CASH_DATA);
		System.out.println(AF);
		Assert.assertEquals(AF, "$"+cash_final);
	    LOGGER.log(Level.INFO, "Available funds = ANZ CMA Cash - Open order value - Other"); 
		return driver;
	}
	public WebDriver close_current_portfolio_tab(WebDriver driver) throws InterruptedException {
		driver.navigate().refresh();
		wait_by_visibility(driver, place_an_order_button, 120);
		portfolio_tab_close.click();
		return driver;
	}
	public WebDriver Minimum_cash_value_in_the_others_section(WebDriver driver) throws InterruptedException {
		assertEquals(driver,other_min_cash , "-$100.00", "Same minimum cash");
		return driver;
	}
	public WebDriver No_Assets_check(WebDriver driver) throws InterruptedException {
		assertEquals(driver,no_holdings_message , "No Assets", "Asset is not present in the APL");
		return driver;
	}
	public WebDriver check_asset_is_in_the_APL_list(WebDriver driver, String Asset_code) throws InterruptedException {
		assertEquals(driver,asset_code_in_the_search_result , Asset_code, "Asset is present in the APL");
		return driver;
	}
	public WebDriver validate_portfolio_tab_name(WebDriver driver, String name) throws InterruptedException {
		driver.navigate().refresh();
		wait_by_visibility(driver, cash_section_under_summary_tab, 120);
		assertEquals(driver,portfolio_name_inside_portfolio_tab , name, "User is in PWL1 Test portfolio");
		return driver;
	}
	public WebDriver check_asset_is_closed_for_investment_in_APL_list(WebDriver driver) throws InterruptedException {
		assertEquals(driver,closed_for_investment , "CLOSED FOR INVESTMENT", "Asset is closed for investment in the HIVE APL");
		return driver;
	}
	public WebDriver select_closed_for_investment_asset_form_the_APL(WebDriver driver) throws InterruptedException {
		Approved_product_list_1st_value.click();
		wait_by_visibility(driver, view_fund_details, 120);
		assertEquals(driver,This_product_closed_for_investment , "This product is closed for investment", "This product is closed for investment");
		return driver;
	}
	public WebDriver check_investor_name_orderpad_sidetray(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, portfolio_selection_dropdown_orders, 120);
		Thread.sleep(2500);
		assertEquals(driver, portfolio_selection_dropdown_orders, "PWL1 Test (17187815)", "PWL1 Test (17187815) is selected in portfolio selection dropdown");
		return driver;
	}
	public WebDriver Check_minimum_order_size(WebDriver driver) throws InterruptedException {
		Approved_product_list_1st_value.click();
		wait_by_visibility(driver, investment_amount_field, 120);
		add_button.click();
		assertEquals(driver, order_amount_validation_error_message, "Order should be at least $10", "Order should be at least $10");
		investment_amount_field.click();
		Float amount = (float) 5;
		investment_amount_field.sendKeys(String.valueOf(amount));
		add_button.click();
		return driver;
	}
	public WebDriver assert_minimum_order_size(WebDriver driver) throws InterruptedException {
		assertEquals(driver, order_amount_validation_error_message, "Order should be at least $10", "Your order value is less than 10$");
		return driver;
	}
	public WebDriver select_asset_form_the_APL(WebDriver driver, String asset_code, Float amount) throws InterruptedException {
		Approved_product_list_dropdown.click();
		wait_by_visibility(driver, Approved_product_list_dropdown_result, 120);
		Thread.sleep(3000);
		APL_searchbox.click();
		APL_searchbox.sendKeys(asset_code);
		Approved_product_list_1st_value.click();
		wait_by_visibility(driver, investment_amount_field, 120);
		investment_amount_field.sendKeys(String.valueOf(amount));
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver add_order_to_draft(WebDriver driver, String asset_code) throws InterruptedException {
		Approved_product_list_dropdown.click();
		wait_by_visibility(driver, Approved_product_list_dropdown_result, 120);
		Thread.sleep(3000);
		APL_searchbox.click();
		APL_searchbox.sendKeys(asset_code);
		Approved_product_list_1st_value.click();
		wait_by_visibility(driver, investment_amount_field, 120);
		double amount = Risk_Based_Test_Set_for_HIVE_OP_BUY.CMA_CASH_DATA/2;
		investment_amount_field.sendKeys(String.valueOf(amount));
		Thread.sleep(3000);
		return driver;
	}
	public WebDriver navigate_to_preview_screen(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		wait_by_visibility(driver, preview_order_button, 120);
		preview_order_button.click();
		return driver;
	}
	public WebDriver check_the_Wholesale_acknowledgement_checkbox(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, preview_wholesale_acknowledge_checkbox, 120);
		assertEquals(driver, wholesale_acknowledge_disclaimer, "I confirm that this investor is a wholesale client for the purposes of Chapter 7 of the Corporations Act 2001.", "This is a wholesale fund");
		close_sidetray_when_there_is_draft_order(driver);
		return driver;
	}
	public WebDriver check_there_is_no_Wholesale_acknowledgement_checkbox(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, preview_checkbox_footer, 120);
		if(driver.findElements(By.xpath("//div[@class='disc_docs']//span")).size() != 0)
		{
			assertEquals(driver, wholesale_acknowledge_disclaimer, "This element should not be here", "This should be a retail fund");
		}
		else
		{
			wait_until_clickable(driver, preview_disclaimer_checkbox, 120);
			preview_disclaimer_checkbox.click();
			Assert.assertEquals(confirm_order.getAttribute("class").contains("confirm-order-enable-btn"), true);
		    LOGGER.log(Level.INFO, "This asset is a Retail fund"); 
		}
		preview_X_button.click();
		wait_until_clickable(driver, confirm_popUp_cancel_order, 120);
		confirm_popUp_cancel_order.click();
		Thread.sleep(6000);
		return driver;
	}
	public WebDriver check_the_Wholesale_acknowledgement_and_Disclaimer_acknowledgement_checkbox(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, preview_wholesale_acknowledge_checkbox, 120);
		if(Wholesale_checkbox.isDisplayed()) {
			Wholesale_checkbox.click();
		}
		else {
		    LOGGER.log(Level.WARNING, "Wholesale checkbox is not available"); 
		}
		if(Disclaimer_checkbox.isDisplayed()) {
			double_click(driver, Disclaimer_checkbox);
		}
		else {
		    LOGGER.log(Level.WARNING, "Disclaimer checkbox is not available"); 
		}
		return driver;
	}
	public WebDriver check_if_confirm_this_order_button_is_enabled(WebDriver driver) throws InterruptedException {
		Assert.assertEquals(confirm_order.getAttribute("class").contains("btn m-btn m-btn--icon footer-btn-style confirm-order-btn"), true);
	    LOGGER.log(Level.INFO, "Confirm this order button is disabled"); 
		close_sidetray_when_there_is_draft_order(driver);
		return driver;
	}
	public WebDriver close_sidetray_when_there_is_draft_order(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		preview_X_button.click();
		wait_until_clickable(driver, confirm_popUp_cancel_order, 120);
		confirm_popUp_cancel_order.click();
		Thread.sleep(5000);
		return driver;
	}
	public WebDriver check_the_Disclaimer_acknowledgement_checkbox(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Disclaimer_checkbox, 120);
		if(Disclaimer_checkbox.isDisplayed()) {
			double_click(driver, Disclaimer_checkbox);
		}
		return driver;
	}
	public WebDriver check_Advice_reason_Advice_date_Advice_summary_and_Advice_method_fields(WebDriver driver) throws InterruptedException {
		if(advice_section.isDisplayed()) {
			Assert.assertTrue(advice_reason_drop.isDisplayed());
			Assert.assertTrue(advice_summary.isDisplayed());
			Assert.assertTrue(advice_date_cal.isDisplayed());
			Assert.assertTrue(advice_method_phone.isDisplayed());
		}
		return driver;
	}
	public WebDriver check_fields_are_mandatory_when_YES_is_selected(WebDriver driver) throws InterruptedException {
		disclaimer_check_box.click();
		check_if_add_button_is_in_disabled_state(driver);
		dropdown(driver, advice_reason_drop_value, "Short Term Growth");
		check_if_add_button_is_in_disabled_state(driver);
		advice_method_phone.click();
		check_if_add_button_is_in_enabled_state(driver);
		return driver;
	}
	public WebDriver check_the_field_OTHER_is_mandatory_when_YES_is_selected(WebDriver driver) throws InterruptedException {
		check_fields_are_mandatory_when_YES_is_selected(driver);
		dropdown(driver, advice_reason_drop_value, "Other");
		check_if_add_button_is_in_disabled_state(driver);
		advice_summary.sendKeys("Test");		
		check_if_add_button_is_in_enabled_state(driver);
		return driver;
	}
	public WebDriver click_advice_given_as_NO(WebDriver driver) throws InterruptedException{
		adviser_given_no.click();
		return driver;
	}
	public WebDriver check_advice_section_is_hidden(WebDriver driver) throws InterruptedException{
		Assert.assertTrue(driver.findElement(By.id("advice_div")).getAttribute("style").equals("display: none;"));
	    LOGGER.log(Level.INFO, "Advice section is hidden"); 
		return driver;
	}
	public WebDriver check_PDS_checkbox(WebDriver driver) throws InterruptedException{
		assertEquals(driver, PDS_text, "I have read and understood this product’s profile and product disclosure statement, and provided a copy to the investor.", "PDS is available");
		return driver;
	}
	
	public WebDriver enter_required_fields(WebDriver driver) throws InterruptedException{
		investment_amount_field.sendKeys("100");
		adviser_given_no.click();
		return driver;
	}
	public WebDriver check_Add_button_validation_based_on_PDS_checkbox(WebDriver driver) throws InterruptedException{
		check_if_add_button_is_in_disabled_state(driver);
		BUY_PDS_Checkbox.click();
		check_if_add_button_is_in_enabled_state(driver);
		return driver;
	}
	public WebDriver check_PDS_link(WebDriver driver) throws InterruptedException{
		BUY_PDS_link.click();
		wait_by_visibility(driver, PDS_attachment_list_section, 120);
		PDS_download_icon.click();
		Thread.sleep(5000);
		return driver;
	}
	
	
//	*************************************common_methods*************************************
	public WebDriver sd_form_scroll(WebDriver driver, WebElement element) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver; //form scroll
		js.executeScript("arguments[0].scrollIntoView();", element);
		return driver;
	}
	public WebDriver wait_by_visibility(WebDriver driver, WebElement element, int time) throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
		return driver;
	}
	public WebDriver wait_until_clickable(WebDriver driver, WebElement element, int time) throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return driver;
	}
	public WebDriver dropdown(WebDriver driver, WebElement element, String search_term) throws InterruptedException {
		Thread.sleep(3000);
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(search_term);		
		return driver;
	}
	public WebDriver assertEquals(WebDriver driver, WebElement element, String Expected_Text, String message) throws InterruptedException {
		wait_by_visibility(driver, element, 120);
		String Actual_Text = element.getText();
		Assert.assertEquals(Actual_Text, Expected_Text);
	    LOGGER.log(Level.INFO, message); 
		return driver;
	}
	public WebDriver open_order_value(WebDriver driver) throws InterruptedException {
		String open_orders = open_orders_buy.getText();
	    LOGGER.log(Level.INFO, "Open orders" + open_orders); 
		open_orders = open_orders.replaceAll(",", "");
		int length = open_orders.length();
		open_order_value = Float.parseFloat(open_orders.substring(2, length));
		return driver;
	}
	public WebDriver double_click(WebDriver driver, WebElement element) throws InterruptedException{
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
		return driver;
	}
	public WebDriver click_advice_given_as_YES(WebDriver driver) throws InterruptedException{
		adviser_given_yes.click();
		wait_until_clickable(driver, advice_reason_drop, 120);
		return driver;
	}
	
//	*************************************Risk_Based_Test_Set_for_HIVE_OP_SELL*************************************
	
	public WebDriver change_otp_settings_to_once(WebDriver driver) throws InterruptedException{
		wait_by_visibility(driver, user_list_table, 120);
	    LOGGER.log(Level.INFO, "User is in DG-Admin Home page"); 
	    menu_icon.click();
		menu_settings.click();
		sd_form_scroll(driver, once_otp_settings);
		once_otp_settings.click();
		sd_form_scroll(driver, update_button);
		update_button.click();
		return driver;
	}
	
	public WebDriver logout_dg_admin(WebDriver driver) throws InterruptedException{
		profile_icon.click();
		logout.click();
		return driver;
	}
	public WebDriver check_user_is_in_PWL_Admin_homaepage(WebDriver driver) throws InterruptedException{
		wait_by_visibility(driver, user_list_table, 120);
	    LOGGER.log(Level.INFO, "User is in PWL-Admin Home page"); 
		return driver;
	}
	public WebDriver navigate_to_edit_screen(WebDriver driver, String email) throws InterruptedException{
		user_search_box.click();
		user_search_box.sendKeys(email);
		Thread.sleep(2000);
		user_edit_icon.click();
		Thread.sleep(3000);
		assertEquals(driver, edit_screen_user_profile_email, "gunaseeelan.p100@gmail.com", "User is in gunaseeelan P edit screen");
		return driver;
	}
	public WebDriver disable_can_trade_option(WebDriver driver, String email) throws InterruptedException{
		navigate_to_edit_screen(driver, email);
		wait_by_visibility(driver, order_pad_permission_section, 120);
		sd_form_scroll(driver, order_pad_permission_section);
		if(can_trade.isSelected())
		{
		 wait_until_clickable(driver, can_trade_checkbox, 60);
		 can_trade_checkbox.click();
		 Thread.sleep(2000);
		}
		if(can_cancel_trade.isSelected())
		{
		 wait_until_clickable(driver, can_cancel_trade_checkbox, 60);
		 can_cancel_trade_checkbox.click();
		 Thread.sleep(2000);
		}
		update_profile_button.click();
		return driver;
	}
	public WebDriver Adviser_login_with_OTP(WebDriver driver, String username, String password) throws InterruptedException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
		// Thread.sleep(6000);
		wait_until_clickable(driver, username_field, 60);
		username_field.clear();
		username_field.sendKeys(username);
		password_field.clear();
		password_field.sendKeys(password);
		sign_in.click();
		validate_otp_screen(driver);
		otp_device(driver);
		get_otp_from_DB(driver);
		return driver;
	}
	public WebDriver validate_otp_screen(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, otp_email, 60);
		Assert.assertTrue(driver.getCurrentUrl().contains("two_factor_authentication"));
		Assert.assertTrue(otp_email.isDisplayed());
		Assert.assertTrue(otp_mobile.isDisplayed());
		return driver;
	}
	public WebDriver otp_device(WebDriver driver) throws InterruptedException {
		otp_mobile.click();
		wait_until_clickable(driver, otp_box_1, 60);
		return driver;
	}
	public WebDriver get_otp_from_DB(WebDriver driver) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InterruptedException, SQLException {
		UIHandler_1 validate_database = PageFactory.initElements(driver, UIHandler_1.class);
		driver = validate_database.database(driver, get_OTP_query);
		Thread.sleep(5000);
		return driver;
	}
	public WebDriver check_place_an_order_button(WebDriver driver) throws InterruptedException{
		wait_by_visibility(driver, PV_searchbox, 120);
		Assert.assertEquals(place_an_order_button.getAttribute("class").contains("add-disabled disabled"), true);
	    LOGGER.log(Level.INFO, "Place an order button is disabled"); 
		return driver;
	}
//	public WebDriver check_place_an_order_button_in_global_order_list(WebDriver driver) throws InterruptedException{
//		global_orders_list.click();
//		wait_by_visibility(driver, place_an_order_button_in_order_list_global, 120);
//		Assert.assertEquals(place_an_order_button_in_order_list_global.getAttribute("class").contains("error-try-again header-order-place  add-disabled disabled"), true);
//	    LOGGER.log(Level.INFO, "Place an order button in global order list is disabled"); 
//		global_orders_list.click();
//	    return driver;
//	}
//	public WebDriver check_place_an_order_button_in_portfolio_order_list(WebDriver driver) throws InterruptedException{
//		wait_by_visibility(driver, orders_tab, 120);
//		orders_tab.click();
//		wait_by_visibility(driver, place_an_order_button_in_order_list_global, 120);
//		Assert.assertEquals(place_an_order_button_in_order_list_global.getAttribute("class").contains("error-try-again header-order-place  add-disabled disabled"), true);
//	    LOGGER.log(Level.INFO, "Place an order button in global order list is disabled"); 
//		global_orders_list.click();
//	    return driver;
//	}
	
	public WebDriver check_user_is_in_portfolio_screen(WebDriver driver) throws InterruptedException{
		wait_by_visibility(driver, PV_searchbox, 120);
		assertEquals(driver, investor_name_under_investor_tab, "PWL1 Test", "User is under PWL1 Test portfolio");
		return driver;
	}
	public WebDriver navigate_to_global_order_list(WebDriver driver) throws InterruptedException{
		global_orders_list.click();
		wait_by_visibility(driver, orders_list_section, 120);
		return driver;
	}
	public WebDriver navigate_to_portfolio_order_list(WebDriver driver) throws InterruptedException{
		global_orders_list.click();
		wait_by_visibility(driver, orders_tab, 120);
		orders_tab.click();
		wait_by_visibility(driver, orders_list_section_portfolio_level, 120);
		return driver;
	}
	public WebDriver close_global_order_list(WebDriver driver) throws InterruptedException{
		global_orders_list.click();
		return driver;
	}
	public WebDriver select_one_sell_order_with_submitted_status(WebDriver driver) throws InterruptedException{
		navigate_to_global_order_list(driver);	
		status_dropdown_global_order_list.click();
		status_dropdown_global_order_list_search.click();
		status_dropdown_global_order_list_search.sendKeys("submitted");
		status_dropdown_global_order_list_first_value.click();
		status_dropdown_global_order_list.click();
		return driver;
	}
	public WebDriver check_if_cancel_order_button_is_disabled(WebDriver driver) throws InterruptedException{
		wait_by_visibility(driver, global_order_list_first_record, 120);
		global_order_list_first_record.click();
		wait_by_visibility(driver, order_status_label, 120);
		Assert.assertEquals(cancel_order_button.getAttribute("class").contains("disabled"), true);
		return driver;
	}
	public WebDriver check_if_cancel_order_button_is_enabled(WebDriver driver) throws InterruptedException{
		wait_by_visibility(driver, global_order_list_first_record, 120);
		global_order_list_first_record.click();
		wait_by_visibility(driver, order_status_label, 120);
		Thread.sleep(5000);
		Assert.assertEquals(cancel_order_button.getAttribute("class").contains("cancel_disable_color disabled"), false);
		return driver;
	}
	
	public WebDriver enable_can_trade_and_can_cancel_option(WebDriver driver, String email) throws InterruptedException{
		navigate_to_edit_screen(driver, email);
		wait_by_visibility(driver, order_pad_permission_section, 120);
		sd_form_scroll(driver, order_pad_permission_section);
		if(!can_trade.isSelected())
		{
		 wait_until_clickable(driver, can_trade_checkbox, 60);
		 can_trade_checkbox.click();
		 Thread.sleep(2000);
		}
		if(!can_cancel_trade.isSelected())
		{
		 wait_until_clickable(driver, can_cancel_trade_checkbox, 60);
		 can_cancel_trade_checkbox.click();
		 Thread.sleep(2000);
		}
		update_profile_button.click();
		return driver;
	}
	public WebDriver cancel_the_SELL_order(WebDriver driver) throws InterruptedException{
		cancel_order_button.click();
		assertEquals(driver, cancel_order_popup_description, "Are you sure you want to cancel?", "Cancel order button is clicked");
		cancel_order_Go_back.click();
//		cancel_order_popup_cancel_order_button.click();
//		wait_by_visibility(driver, order_status_label, 120);
//		Assert.assertEquals(cancel_order_button.getAttribute("class").contains("cancel_btn cancel_order cancel_disable_color disabled"), true);
		return driver;
	}
	
	public WebDriver logout_advisor(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);	
		driver.navigate().refresh();
		wait_until_clickable(driver, profile_icon_advisor, 120);
		profile_icon_advisor.click();
		logout_advisor.click();
		return driver;
	}
//	****************************************************************************
	
	public WebDriver Add_a_SELL_order_side_tray(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, SELL_Button, 120);
		SELL_Button.click();
		wait_until_clickable(driver, portfolio_holdings_drop, 120);
		return driver;
	}
	
	public WebDriver Portfolio_holdings_asset_search(WebDriver driver, String asset_code) throws InterruptedException {
		portfolio_holdings_drop.click();
		wait_by_visibility(driver, portofolio_holding_details, 120);
		Thread.sleep(3000);
		portfolio_holdings_searchbox.click();
		portfolio_holdings_searchbox.sendKeys(asset_code);
		return driver;
	}
	
	public WebDriver No_Holdings_check(WebDriver driver) throws InterruptedException {
		assertEquals(driver,no_holdings_message , "No Holdings", "This Fund is not held under this portfolio");
		return driver;
	}
	public WebDriver Portfolio_holdings_asset_selection(WebDriver driver, String Asset_code) throws InterruptedException {
		portfolio_holdings_drop.click();
		wait_until_clickable(driver, Portfolio_holdings_list_units, 120);
//		Thread.sleep(5000);
		portfolio_holdings_searchbox.click();
		portfolio_holdings_searchbox.sendKeys(Asset_code);
		Units = Portfolio_holdings_list_units.getText();
		Units = Units.replaceAll(",", "");
	    LOGGER.log(Level.INFO, "No.of Units " + Asset_code + " holds " + Units); 
		Portfolio_holdings_list_1st_value.click();
		return driver;
	}
	public WebDriver enter_units_in_order_amount_field(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, order_amount_textbox, 120);
		order_amount_textbox.click();
		double d = Double.valueOf(Units) + 100.00;
		order_amount_textbox.sendKeys(String.valueOf(d));
		return driver;
	}
	public WebDriver enter_lesser_units_in_order_amount_field(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, order_amount_textbox, 120);
		String AU = available_units.getText();
		AU = AU.replaceAll(",", "");
		double d = Double.valueOf(AU) - 1.00;
		order_amount_textbox.click();
		order_amount_textbox.sendKeys(String.valueOf(d));
		return driver;
	}
	public WebDriver enter_units_in_order_amount_field(WebDriver driver, float unit) throws InterruptedException {
		wait_by_visibility(driver, order_amount_textbox, 120);
		order_amount_textbox.click();
		order_amount_textbox.sendKeys(String.valueOf(unit));
		return driver;
	}
	public WebDriver user_should_see_the_error_message(WebDriver driver) throws InterruptedException {
		assertEquals(driver, SELL_order_amount_error, "You’re exceeding your holdings.", "You’re exceeding your holdings.");
		return driver;
	}
	public WebDriver add_the_sell_order(WebDriver driver) throws InterruptedException {
		adviser_given_no.click();
		check_if_add_button_is_in_enabled_state(driver);
		add_button.click();
		wait_until_clickable(driver, preview_order_button, 120);
		return driver;
	}
	
	public WebDriver user_should_see_the_message_You_already_have_a_draft_order(WebDriver driver) throws InterruptedException {
		assertEquals(driver, already_have_a_draft_order, "You already have a draft order for this asset", "You already have a draft order for this asset");
		Assert.assertTrue(edit_draft_order_button.isEnabled());
		return driver;
	}
	
	public WebDriver change_portfolio_in_place_orders_sidetray(WebDriver driver, String portfolio) throws InterruptedException {
		wait_until_clickable(driver, portfolio_selection_dropdown_orders, 120);
		portfolio_selection_dropdown_orders.click();
		Thread.sleep(8000);
		portfolio_selection_dropdown_orders_searchbox.click();
		portfolio_selection_dropdown_orders_searchbox.sendKeys(portfolio);
		Thread.sleep(10000);
		portfolio_selection_dropdown_orders_first_value.click();
		return driver;
	}
	public WebDriver check_asset_is_closed_for_SELL_in_Portfolio_holdings_list(WebDriver driver) throws InterruptedException {
		assertEquals(driver,closed_for_sell , "CLOSED FOR SELL", "Asset is closed for SELL.");
		return driver;
	}
	public WebDriver select_closed_for_SELL_asset_in_Portfolio_holdings_list(WebDriver driver) throws InterruptedException {
		Portfolio_holdings_list_1st_value.click();
		wait_by_visibility(driver, view_fund_details, 120);
		assertEquals(driver,This_product_closed_for_sell , "This product is closed for sell", "This product is closed for sell");
		return driver;
	}
	public WebDriver user_should_see_the_error_message_min_order_size(WebDriver driver) throws InterruptedException {
		assertEquals(driver, SELL_order_amount_error, "Order should be at least 1 unit.", "Order should be at least 1 unit.");
		return driver;
	}
	public WebDriver user_should_see_the_sell_error_message_Order_should_be_at_least_$(WebDriver driver) throws InterruptedException {
		assertEquals(driver, SELL_order_amount_error, "Order should be at least $1", "Order should be at least $1");
		return driver;
	}
	
	public WebDriver click_on_value_radio_button(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, value_radio_button, 120);
		value_radio_button.click();
		return driver;
	}
	public WebDriver click_on_full_redemption_radio_button(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, value_radio_button, 120);
		full_redemption_radio_button.click();
		return driver;
	}
	public WebDriver fill_details_sell(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, adviser_given_no, 120);
		adviser_given_no.click();
		return driver;
	}
	public WebDriver check_sell_by_value_radio_button_is_disabled(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, value_label, 120);
		Assert.assertEquals(value_label.getAttribute("class").contains("m-radio-disabled"), true);
		LOGGER.log(Level.INFO, "Sell by value radio button is disabled"); 
		return driver;
	}
	public WebDriver check_sell_by_units_value_and_full_redemption_radio_button_availability(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, value_label, 120);
		Assert.assertEquals(value_label.getAttribute("class").contains("m-radio-disabled"), true);
		LOGGER.log(Level.INFO, "Sell by value radio button is disabled"); 
		Assert.assertTrue(units_label.isEnabled());
		LOGGER.log(Level.INFO, "Sell by unit radio button is enabled"); 
		Assert.assertTrue(full_redemption_label.isEnabled());
		LOGGER.log(Level.INFO, "Sell by full redemption radio button is enabled"); 
		return driver;
	}
	
	public WebDriver check_there_is_no_Wholesale_acknowledgement_checkbox_for_sell(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, preview_disclaimer_checkbox, 120);
		preview_disclaimer_checkbox.click();
		Assert.assertEquals(confirm_order.getAttribute("class").contains("confirm-order-enable-btn"), true);
		LOGGER.log(Level.INFO, "There is no wholesale acknowledgement checkbox"); 
		preview_X_button.click();
		wait_until_clickable(driver, confirm_popUp_cancel_order, 120);
		confirm_popUp_cancel_order.click();
		Thread.sleep(6000);
		return driver;
	}

	public WebDriver Disclaimer_acknowledgement_checkbox_in_preview_screen(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, Disclaimer_checkbox, 120);
		Assert.assertTrue(Disclaimer_checkbox.isDisplayed());
		return driver;
	}
	public WebDriver check_desclaimer_checkbox_validation(WebDriver driver) throws InterruptedException {
		Assert.assertEquals(confirm_order.getAttribute("class").contains("btn m-btn m-btn--icon footer-btn-style confirm-order-btn"), true);
		LOGGER.log(Level.INFO, "Confirm this order button is disabled"); 
		Disclaimer_checkbox.click();
		Assert.assertEquals(confirm_order.getAttribute("class").contains("confirm-order-enable-btn"), true);
		LOGGER.log(Level.INFO, "Confirm this order button is enabled");
		preview_X_button.click();
		wait_until_clickable(driver, confirm_popUp_cancel_order, 120);
		confirm_popUp_cancel_order.click();
		Thread.sleep(6000);
		return driver;
	}
	public WebDriver check_fields_are_mandatory_when_YES_is_selected_sell(WebDriver driver) throws InterruptedException {
		check_if_add_button_is_in_disabled_state(driver);
		dropdown(driver, advice_reason_drop_value, "Short Term Growth");
		check_if_add_button_is_in_disabled_state(driver);
		advice_method_phone.click();
		check_if_add_button_is_in_enabled_state(driver);
		return driver;
	}
	public WebDriver check_the_field_OTHER_is_mandatory_when_YES_is_selected_sell(WebDriver driver) throws InterruptedException {
		check_fields_are_mandatory_when_YES_is_selected_sell(driver);
		dropdown(driver, advice_reason_drop_value, "Other");
		check_if_add_button_is_in_disabled_state(driver);
		advice_summary.sendKeys("Test");		
		check_if_add_button_is_in_enabled_state(driver);
		return driver;
	}
	
	public WebDriver NO_PDS_checkbox(WebDriver driver) throws InterruptedException {
		Assert.assertTrue(!PDS_text.isDisplayed());
		return driver;
	}
	
	public WebDriver change_OTP_setting_to_update(WebDriver driver) throws InterruptedException {
		wait_until_clickable(driver, menu_icon, 120);
		menu_icon.click();
		Thread.sleep(2000);
		menu_settings.click();
		sd_form_scroll(driver, only_account_updated);
		wait_until_clickable(driver, only_account_updated, 120);
		only_account_updated.click();
		Thread.sleep(2000);
		sd_form_scroll(driver, update_button);
		update_button.click();
		LOGGER.log(Level.INFO, "OTP Settings changed");
		wait_by_visibility(driver, only_account_updated, 120);
		profile_icon_advisor_dg_admin.click();
		logout_advisor_dg_admin.click();
		return driver;
	}
	public WebDriver select_mobile_as_otp_device(WebDriver driver) throws InterruptedException {
		otp_mobile.click();
		wait_until_clickable(driver, otp_box_1, 120);
		return driver;
	}
	public WebDriver open_order_value_sell(WebDriver driver) throws InterruptedException {
		wait_by_visibility(driver, open_orders_sell, 120);
		String open_orders = open_orders_sell.getText();
	    LOGGER.log(Level.INFO, "Open orders" + open_orders); 
		open_orders = open_orders.replaceAll(",", "");
		int length = open_orders.length();
		open_order_value_sell = Float.parseFloat(open_orders.substring(1, length));
		
		String AU = available_units_sell_order_screen.getText();
	    LOGGER.log(Level.INFO, "Available units sell" + AU); 
	    AU = AU.replaceAll(",", "");
		available_unit_sell = Float.parseFloat(AU);
		return driver;
	}
	public WebDriver check_open_order_value_sell(WebDriver driver) throws InterruptedException {
		open_order_value_sell(driver);
		if ((open_order_value_sell < available_unit_sell) & (open_order_value_sell>0)) {
		    LOGGER.log(Level.INFO, String.valueOf(open_order_value_sell)); 
		}
		return driver;
	}
	public WebDriver add_a_sell_order(WebDriver driver) throws InterruptedException {
		if ((open_order_value_sell < available_unit_sell) & (open_order_value_sell>0)) {
			enter_units_in_order_amount_field(driver,(available_unit_sell + 100));
		}
		else {
		    LOGGER.log(Level.WARNING, "There is no open orders"); 
		}
		return driver;
	}
	
}
