package com.pw.pw_screens;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pw.publicLib.API_Handler;
import com.pw.publicLib.DataProvider;
import com.pw.publicLib.PW_login;
import com.pw.publicLib.UIHandler_2;
import com.pw.publicLib.UIHandler_3;
import com.pw.publicLib.UIHandler_1;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Risk_Based_Test_Set_for_HIVE_OP_SELL extends DataProvider{
	public static WebDriver driver;
	private UIHandler_1 Pagefactory_UH1 = PageFactory.initElements(driver, UIHandler_1.class);
	private UIHandler_3 Pagefactory = PageFactory.initElements(driver, UIHandler_3.class);
	private Logger LOGGER = Logger.getLogger(Risk_Based_Test_Set_for_HIVE_OP_SELL.class.getName());	
	
	@Given("^the user is on the hive login screen$")
	public void the_user_is_on_the_hive_login_screen() throws Throwable {
		PW_login login = new PW_login();
		driver = login.getdata(url);
		LOGGER.log(Level.INFO, "Chrome Browser Launched"); 
		UIHandler_1 pwl_admin = PageFactory.initElements(driver, UIHandler_1.class);
		pwl_admin.Adviser_login(driver, dg_admin_username, password);
		Pagefactory.change_otp_settings_to_once(driver);
		Pagefactory.logout_dg_admin(driver);	
	}
	@When("^the user enters the username and password for PWL ADMIN user and clicks on submit$")
	public void the_user_enters_the_username_and_password_for_PWL_ADMIN_user_and_clicks_on_submit() throws Throwable {
		Pagefactory_UH1.Adviser_login(driver, "arvindk@crystaldelta.com", "HiveTest@0555");
		String title= driver.getTitle();
		Assert.assertEquals("Hive", title);
	}
	@Then("^user should land on the users screen$")
	public void user_should_land_on_the_users_screen() throws Throwable {
		Pagefactory.check_user_is_in_PWL_Admin_homaepage(driver);
		Pagefactory.disable_can_trade_option(driver, "gunaseeelan.p100@gmail.com");
		Pagefactory_UH1.logout_dg_admin(driver);
	}
	@Given("^the user is on portfolio valuation screen$")
	public void the_user_is_on_portfolio_valuation_screen() throws Throwable {
		PW_login login = new PW_login();
		driver = login.getdata(url);
		UIHandler_1 Pagefactory_UH1 = PageFactory.initElements(driver, UIHandler_1.class);
		Pagefactory_UH1.Adviser_login(driver, username, password);
		String title= driver.getTitle();
		Assert.assertEquals("Hive", title);
		Pagefactory.investor_selection(driver, "PWL1 Test");
	}
	@When("^the user does not have the permissions to order-pad create$")
	public void the_user_does_not_have_the_permissions_to_order_pad_create() throws Throwable {
		Pagefactory.check_place_an_order_button(driver);
	}
	@Then("^the 'Place an order' button should be in a disabled state$")
	public void the_Place_an_order_button_should_be_in_a_disabled_state() throws Throwable {

	}
	@Given("^the user is on the portfolio valuation screen$")
	public void the_user_is_on_the_portfolio_valuation_screen() throws Throwable {
		Pagefactory.check_user_is_in_portfolio_screen(driver);
	}
	@When("^the user clicks on orders on the global header$")
	public void the_user_clicks_on_orders_on_the_global_header() throws Throwable {
		Pagefactory.navigate_to_global_order_list(driver);
	}

	@Then("^the user should able to see 'Open orders' in the 'Order screen'$")
	public void the_user_should_able_to_see_Open_orders_in_the_Order_screen() throws Throwable {
		Pagefactory.close_global_order_list(driver);
	}

	@Given("^the user is on 'Orders screen'$")
	public void the_user_is_on_Orders_screen() throws Throwable {
		Pagefactory.navigate_to_global_order_list(driver);
	}

	@Given("^the user does not have the permissions to cancel orders$")
	public void the_user_does_not_have_the_permissions_to_cancel_orders() throws Throwable {
		Pagefactory.navigate_to_portfolio_order_list(driver);
	}

	@When("^the user selects any one SELL order with order status 'Submitted'$")
	public void the_user_selects_any_one_SELL_order_with_order_status_Submitted() throws Throwable {
		Pagefactory.select_one_sell_order_with_submitted_status(driver);
	}

	@Then("^the user should see a disabled 'Cancel order' button in the 'Order details' side tray$")
	public void the_user_should_see_a_disabled_Cancel_order_button_in_the_Order_details_side_tray() throws Throwable {
		Pagefactory.check_if_cancel_order_button_is_disabled(driver);
	}

	@Given("^the user is on PWL Admin login and provides permissions to cancel order feature$")
	public void the_user_is_on_PWL_Admin_login_and_provides_permissions_to_cancel_order_feature() throws Throwable {
		driver.navigate().refresh();
		Pagefactory.logout_advisor(driver);
		Pagefactory_UH1.Adviser_login(driver, "arvindk@crystaldelta.com", "HiveTest@0555");
		Pagefactory.enable_can_trade_and_can_cancel_option(driver, "gunaseeelan.p100@gmail.com");
		Pagefactory_UH1.logout_dg_admin(driver);
	}

	@When("^the adviser user logs back in and selects any one SELL order with order status 'Submitted'$")
	public void the_adviser_user_logs_back_in_and_selects_any_one_SELL_order_with_order_status_Submitted() throws Throwable {
		UIHandler_1 Pagefactory_UH1 = PageFactory.initElements(driver, UIHandler_1.class);
		Pagefactory_UH1.Adviser_login(driver, username, password);
		Pagefactory.select_one_sell_order_with_submitted_status(driver);
		}

	@Then("^the adviser user should have the permissions to 'Cancel order' in the 'Order details' side tray$")
	public void the_adviser_user_should_have_the_permissions_to_Cancel_order_in_the_Order_details_side_tray() throws Throwable {
		Pagefactory.check_if_cancel_order_button_is_enabled(driver);
	}

	@Then("^check whether the order is successfully cancelled or not when the user clicks 'Cancel order' button$")
	public void check_whether_the_order_is_successfully_cancelled_or_not_when_the_user_clicks_Cancel_order_button() throws Throwable {
		Pagefactory.cancel_the_SELL_order(driver);
		Pagefactory.logout_advisor(driver);
		UIHandler_1 pwl_admin = PageFactory.initElements(driver, UIHandler_1.class);
		pwl_admin.Adviser_login(driver, "gunaseelan.p@crystaldelta.com", "HiveTest@0555");
		Pagefactory.change_OTP_setting_to_update(driver);
	}
	@Given("^user is on the 'Place orders' side tray$")
	public void user_is_on_the_Place_orders_side_tray() throws Throwable {
		String get_OTP_query = "select direct_otp from users where email = 'gunaseeelan.p100@gmail.com'";
		UIHandler_1 Pagefactory_UH1 = PageFactory.initElements(driver, UIHandler_1.class);
		Pagefactory_UH1.Adviser_login(driver, username, password);
		Pagefactory.select_mobile_as_otp_device(driver);
		Pagefactory_UH1.database(driver, get_OTP_query);
		Pagefactory.place_orders_side_tray(driver);
	}
	@Given("^the user is on the 'Place orders' side tray$")
	public void the_user_is_on_the_Place_orders_side_tray() throws Throwable {
		Pagefactory.place_orders_side_tray(driver);
	}

	@Given("^the user clicks on 'SELL' button & navigates to 'Portfolio holdings' dropdown$")
	public void the_user_clicks_on_SELL_button_navigates_to_Portfolio_holdings_dropdown() throws Throwable {
		Pagefactory.Add_a_SELL_order_side_tray(driver);
	}

	@When("^the user searches any 'Asset name/Asset code' which is not held under the current portfolio$")
	public void the_user_searches_any_Asset_name_Asset_code_which_is_not_held_under_the_current_portfolio() throws Throwable {
		Pagefactory.Portfolio_holdings_asset_search(driver, "HOW0098AU");
	}

	@Then("^the user should see 'No Holdings' message inside the dropdown$")
	public void the_user_should_see_No_Holdings_message_inside_the_dropdown() throws Throwable {
		Pagefactory.No_Holdings_check(driver);
	}

	@Given("^the user selects one asset from 'Portfolio holdings' dropdown$")
	public void the_user_selects_one_asset_from_Portfolio_holdings_dropdown() throws Throwable {
		Pagefactory.Add_a_SELL_order_side_tray(driver);
		Pagefactory.Portfolio_holdings_asset_selection(driver, "IOF0045AU");
	}

	@When("^the user enters units to sell in 'Order amount' field, which should be greater than the available unit$")
	public void the_user_enters_units_to_sell_in_Order_amount_field_which_should_be_greater_than_the_available_unit() throws Throwable {
		Pagefactory.enter_units_in_order_amount_field(driver);
	}

	@Then("^the user should see the error message 'You're exceeding your holdings'$")
	public void the_user_should_see_the_error_message_You_re_exceeding_your_holdings() throws Throwable {
		Pagefactory.user_should_see_the_error_message(driver);
	}

	@Given("^the user creates a SELL order based on the units \\(not full redemption\\)$")
	public void the_user_creates_a_SELL_order_based_on_the_units_not_full_redemption() throws Throwable {
		Pagefactory.Add_a_SELL_order_side_tray(driver);
		Pagefactory.Portfolio_holdings_asset_selection(driver, "IOF0045AU");
		Pagefactory.enter_lesser_units_in_order_amount_field(driver);
		Pagefactory.add_the_sell_order(driver);
	}

	@When("^the user tries to create a second SELL order for the same asset$")
	public void the_user_tries_to_create_a_second_SELL_order_for_the_same_asset() throws Throwable {
		Pagefactory.Add_a_SELL_order_side_tray(driver);
		Pagefactory.Portfolio_holdings_asset_selection(driver, "IOF0045AU");
	}

	@Then("^the user should not be allowed to create a second SELL order$")
	public void the_user_should_not_be_allowed_to_create_a_second_SELL_order() throws Throwable {
		Pagefactory.check_if_add_button_is_in_disabled_state(driver);
	}

	@Then("^the user should see the message 'You already have a draft order for this asset' along with the 'Edit draft order' button$")
	public void the_user_should_see_the_message_You_already_have_a_draft_order_for_this_asset_along_with_the_Edit_draft_order_button() throws Throwable {
		Pagefactory.user_should_see_the_message_You_already_have_a_draft_order(driver);
		Pagefactory.remove_draft_orders(driver);
	}

//	@Given("^the user is on 'Add a SELL order' side tray$")
//	public void the_user_is_on_Add_a_SELL_order_side_tray() throws Throwable {
//	}

	@Given("^the user should have a value in 'open orders' for the selected portfolio and asset$")
	public void the_user_should_have_a_value_in_open_orders_for_the_selected_portfolio_and_asset() throws Throwable {
		Pagefactory.Add_a_SELL_order_side_tray(driver);
		Pagefactory.Portfolio_holdings_asset_selection(driver, "IOF0045AU");
		Pagefactory.check_open_order_value_sell(driver);
	}

	@When("^the user tries to create a new SELL order with units greater than the remaining 'Available units' for the same asset$")
	public void the_user_tries_to_create_a_new_SELL_order_with_units_greater_than_the_remaining_Available_units_for_the_same_asset() throws Throwable {
		Pagefactory.add_a_sell_order(driver);
	}

	@Then("^the user should not be allowed to create a SELL order$")
	public void the_user_should_not_be_allowed_to_create_a_SELL_order() throws Throwable {
		Pagefactory.check_if_add_button_is_in_disabled_state(driver);
	}

	@Given("^the user is on 'KitKat family Trust' portfolio$")
	public void the_user_is_on_KitKat_family_Trust_portfolio() throws Throwable {
		Pagefactory.place_orders_side_tray(driver);
		Pagefactory.change_portfolio_in_place_orders_sidetray(driver, "KitKat family Trust");
	}

	@Given("^the user clicks on 'place an order' button and clicks on 'SELL' button to navigate to 'portfolio holdings' dropdown$")
	public void the_user_clicks_on_place_an_order_button_and_clicks_on_SELL_button_to_navigate_to_portfolio_holdings_dropdown() throws Throwable {
		Pagefactory.Add_a_SELL_order_side_tray(driver);
	}

	@When("^the user selects the asset 'AAP(\\d+)AU', which contains 'Operationally Ready = NO' in securities master$")
	public void the_user_selects_the_asset_AAP_AU_which_contains_Operationally_Ready_NO_in_securities_master(int arg1) throws Throwable {
		Pagefactory.Portfolio_holdings_asset_search(driver, "AAP3656AU");
	}

	@Then("^the user should see 'No Holdings' message in the dropdown$")
	public void the_user_should_see_No_Holdings_message_in_the_dropdown() throws Throwable {
		Pagefactory.No_Holdings_check(driver);
	}

	@Given("^the user is on 'Kitkat Family Trust' portfolio$")
	public void the_user_is_on_Kitkat_Family_Trust_portfolio() throws Throwable {
		Pagefactory.place_orders_side_tray(driver);
		Pagefactory.change_portfolio_in_place_orders_sidetray(driver, "KitKat family Trust");
	}

	@When("^the user selects the asset 'Asset code', which contains 'Operationally Ready = YES' and 'RedeemOK=N' in securities master$")
	public void the_user_selects_the_asset_Asset_code_which_contains_Operationally_Ready_YES_and_RedeemOK_N_in_securities_master() throws Throwable {
		Pagefactory.Portfolio_holdings_asset_search(driver, "AUG0001AU");
	}

	@Then("^the user should see 'This product is closed for sell' message along with the option to view fund details$")
	public void the_user_should_see_This_product_is_closed_for_sell_message_along_with_the_option_to_view_fund_details() throws Throwable {
		Pagefactory.check_asset_is_closed_for_SELL_in_Portfolio_holdings_list(driver);
		Pagefactory.select_closed_for_SELL_asset_in_Portfolio_holdings_list(driver);
	}
	
	@Given("^the user is on 'Add a SELL order' side tray under 'PWL(\\d+) Test' portfolio$")
	public void the_user_is_on_Add_a_SELL_order_side_tray_under_PWL_Test_portfolio(int arg1) throws Throwable {
		Pagefactory.place_orders_side_tray(driver);
		Pagefactory.Add_a_SELL_order_side_tray(driver);	    
	}

	@When("^the user selects the asset 'GTU(\\d+)AU' in the 'portfolio holdings' dropdown and selects 'units' radio button$")
	public void the_user_selects_the_asset_GTU_AU_in_the_portfolio_holdings_dropdown_and_selects_units_radio_button(int arg1) throws Throwable {
		Pagefactory.Portfolio_holdings_asset_selection(driver, "GTU0102AU");
	}

	@When("^user enters '(\\d+)\\.(\\d+)' in the 'Order amount' field and clicks outside$")
	public void user_enters_in_the_Order_amount_field_and_clicks_outside(int arg1, int arg2) throws Throwable {
		Pagefactory.enter_units_in_order_amount_field(driver, (float) 0.9);
		Pagefactory.click_on_add_button(driver);
	}

	@Then("^the user should see the error message 'Order should be at least (\\d+) unit'$")
	public void the_user_should_see_the_error_message_Order_should_be_at_least_unit(int arg1) throws Throwable {
		Pagefactory.user_should_see_the_error_message_min_order_size(driver);
	}

	@When("^the user selects the asset 'GTU(\\d+)AU' in the 'portfolio holdings' dropdown and selects 'value' radio button$")
	public void the_user_selects_the_asset_GTU_AU_in_the_portfolio_holdings_dropdown_and_selects_value_radio_button(int arg1) throws Throwable {
		Pagefactory.Portfolio_holdings_asset_selection(driver, "GTU0102AU");
		Pagefactory.click_on_value_radio_button(driver);

	}
	@Then("^the user should see the sell error message 'Order should be at least \\$(\\d+)'$")
	public void the_user_should_see_the_sell_error_message_Order_should_be_at_least_$(int arg1) throws Throwable {
		Pagefactory.user_should_see_the_sell_error_message_Order_should_be_at_least_$(driver);
	}
	
	@When("^user enters '(\\d+)\\.(\\d+)' in 'Order amount' field and clicks outside$")
	public void user_enters_in_Order_amount_field_and_clicks_outside(int arg1, int arg2) throws Throwable {
		Pagefactory.enter_units_in_order_amount_field(driver, (float) 1.1);
		Pagefactory.fill_details_sell(driver);
	}
	
	@Then("^the user should not see the error message 'Order should be at least (\\d+) unit'$")
	public void the_user_should_not_see_the_error_message_Order_should_be_at_least_unit(int arg1) throws Throwable {
		Pagefactory.check_if_add_button_is_in_enabled_state(driver);
	}

	@Then("^the user should not see the error message 'Order should be at least \\$(\\d+)'$")
	public void the_user_should_not_see_the_error_message_Order_should_be_at_least_$(int arg1) throws Throwable {
		Pagefactory.check_if_add_button_is_in_enabled_state(driver);
	}

	@Given("^the user is on 'Add a SELL order' side tray under 'Kitkat Family Trust' portfolio$")
	public void the_user_is_on_Add_a_SELL_order_side_tray_under_Kitkat_Family_Trust_portfolio() throws Throwable {
		Pagefactory.place_orders_side_tray(driver);
		Pagefactory.change_portfolio_in_place_orders_sidetray(driver, "KitKat family Trust");
		Pagefactory.Add_a_SELL_order_side_tray(driver);	    
	}

	@When("^the user selects the asset 'Asset_code' in the 'portfolio holdings' dropdown$")
	public void the_user_selects_the_asset_Asset_code_in_the_portfolio_holdings_dropdown() throws Throwable {
		Pagefactory.Portfolio_holdings_asset_selection(driver, "MAQ0842AU");
	}

	@When("^that asset should have 'Dollar Redemption=NO' in the security master$")
	public void that_asset_should_have_Dollar_Redemption_NO_in_the_security_master() throws Throwable {
		LOGGER.log(Level.INFO, "MAQ0842AU--->Dollar Redemption=NO"); 
	}

	@Then("^the user should not be allowed to select 'Sell by value' radio button$")
	public void the_user_should_not_be_allowed_to_select_Sell_by_value_radio_button() throws Throwable {
		Pagefactory.check_sell_by_value_radio_button_is_disabled(driver);
	}

	@Then("^the user should be able to select ‘Sell by units' and 'Full redemption' radio buttons$")
	public void the_user_should_be_able_to_select_Sell_by_units_and_Full_redemption_radio_buttons() throws Throwable {
		Pagefactory.check_sell_by_units_value_and_full_redemption_radio_button_availability(driver);
	}

	@Given("^the user is on 'Add a SELL order' screen$")
	public void the_user_is_on_Add_a_SELL_order_screen() throws Throwable {
		Pagefactory.place_orders_side_tray(driver);
		Pagefactory.Add_a_SELL_order_side_tray(driver);	  
	}

	@Given("^select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = WP' in the security master$")
	public void select_one_asset_from_the_Portfolio_holdings_dropdown_which_should_have_Disc_docs_WP_in_the_security_master() throws Throwable {
		Pagefactory.Portfolio_holdings_asset_selection(driver, "BLK0022AU");
	}

	@When("^the user adds the SELL order And clicks on 'Preview' button$")
	public void the_user_adds_the_SELL_order_And_clicks_on_Preview_button() throws Throwable {
		Pagefactory.enter_units_in_order_amount_field(driver, (float) 10.00);
		Pagefactory.add_the_sell_order(driver);
		Pagefactory.navigate_to_preview_screen(driver);	
	}

	@Then("^the 'Wholesale acknowledgement' checkbox should be hidden in the preview screen$")
	public void the_Wholesale_acknowledgement_checkbox_should_be_hidden_in_the_preview_screen() throws Throwable {
		Pagefactory.check_there_is_no_Wholesale_acknowledgement_checkbox_for_sell(driver);
	}

	@Given("^select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = IM' in the security master$")
	public void select_one_asset_from_the_Portfolio_holdings_dropdown_which_should_have_Disc_docs_IM_in_the_security_master() throws Throwable {
		Pagefactory.Portfolio_holdings_asset_selection(driver, "ETL3604AU");
	}

	@Given("^select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = RP' in the security master$")
	public void select_one_asset_from_the_Portfolio_holdings_dropdown_which_should_have_Disc_docs_RP_in_the_security_master() throws Throwable {
		Pagefactory.Portfolio_holdings_asset_selection(driver, "PER0727AU");
	}

//	@Given("^select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = NA' in the security master$")
//	public void select_one_asset_from_the_Portfolio_holdings_dropdown_which_should_have_Disc_docs_NA_in_the_security_master() throws Throwable {
//	}

	@When("^the user adds the SELL order based on 'units' and clicks on 'Preview' button$")
	public void the_user_adds_the_SELL_order_based_on_units_and_clicks_on_Preview_button() throws Throwable {
		Pagefactory.enter_units_in_order_amount_field(driver, (float) 10.00);
		Pagefactory.add_the_sell_order(driver);
		Pagefactory.navigate_to_preview_screen(driver);	
	}

	@Then("^the user should see 'Disclaimer acknowledgement' checkbox in preview screen$")
	public void the_user_should_see_Disclaimer_acknowledgement_checkbox_in_preview_screen() throws Throwable {
		Pagefactory.Disclaimer_acknowledgement_checkbox_in_preview_screen(driver);
	}

	@Then("^without selecting 'Disclaimer acknowledgement' checkbox user should not be allowed to confirm the order$")
	public void without_selecting_Disclaimer_acknowledgement_checkbox_user_should_not_be_allowed_to_confirm_the_order() throws Throwable {
		Pagefactory.check_desclaimer_checkbox_validation(driver);
	}

	@When("^the user adds the SELL order based on 'values' and clicks on 'Preview' button$")
	public void the_user_adds_the_SELL_order_based_on_values_and_clicks_on_Preview_button() throws Throwable {
		Pagefactory.click_on_value_radio_button(driver);
		Pagefactory.enter_units_in_order_amount_field(driver, (float) 10.00);
		Pagefactory.add_the_sell_order(driver);
		Pagefactory.navigate_to_preview_screen(driver);
	}

	@When("^the user adds the SELL order with 'full redemption' and clicks on 'Preview' button$")
	public void the_user_adds_the_SELL_order_with_full_redemption_and_clicks_on_Preview_button() throws Throwable {
		Pagefactory.click_on_full_redemption_radio_button(driver);
		Pagefactory.add_the_sell_order(driver);
		Pagefactory.navigate_to_preview_screen(driver);
	}

	@Given("^user is on 'Add a SELL order' screen$")
	public void user_is_on_Add_a_SELL_order_screen() throws Throwable {
		Pagefactory.place_orders_side_tray(driver);
		Pagefactory.Add_a_SELL_order_side_tray(driver);	
		Pagefactory.Portfolio_holdings_asset_selection(driver, "BLK0022AU");
		Pagefactory.enter_units_in_order_amount_field(driver, (float) 10.00);
	}
	@When("^user selects 'Yes' radio button under 'Was Advice Given\\?' section$")
	public void user_selects_Yes_radio_button_under_Was_Advice_Given_section() throws Throwable {
		Pagefactory.click_advice_given_as_YES(driver);
	}

	@Then("^user should see Advice reason, Advice date, Advice summary and Advice method fields$")
	public void user_should_see_Advice_reason_Advice_date_Advice_summary_and_Advice_method_fields() throws Throwable {
		Pagefactory.check_Advice_reason_Advice_date_Advice_summary_and_Advice_method_fields(driver);
	}

	@Then("^the Advice reason, Advice date, Advice method fields should be mandatory$")
	public void the_Advice_reason_Advice_date_Advice_method_fields_should_be_mandatory() throws Throwable {
		Pagefactory.check_fields_are_mandatory_when_YES_is_selected_sell(driver);
	}

	@Then("^the Advice summary field should be mAndatory only When the 'Other' option is selected in the 'Advice option' field$")
	public void the_Advice_summary_field_should_be_mAndatory_only_When_the_Other_option_is_selected_in_the_Advice_option_field() throws Throwable {
		Pagefactory.check_the_field_OTHER_is_mandatory_when_YES_is_selected_sell(driver);
	}

	@When("^user selects 'NO' radio button under 'Was Advice Given\\?' section$")
	public void user_selects_NO_radio_button_under_Was_Advice_Given_section() throws Throwable {
		Pagefactory.click_advice_given_as_NO(driver);
	}

	@Then("^other advice questions should be hidden$")
	public void other_advice_questions_should_be_hidden() throws Throwable {
		Pagefactory.check_advice_section_is_hidden(driver);
	}
	
	@Given("^user is on the 'Add a SELL order' screen$")
	public void user_is_on_the_Add_a_SELL_order_screen() throws Throwable {
		Pagefactory.place_orders_side_tray(driver);
		Pagefactory.Add_a_SELL_order_side_tray(driver);	
	}

	@When("^the user selects one asset from the 'Portfolio holdings' dropdown$")
	public void the_user_selects_one_asset_from_the_Portfolio_holdings_dropdown() throws Throwable {
		Pagefactory.Portfolio_holdings_asset_selection(driver, "BLK0022AU");
	}

	@Then("^the user should not see the 'PDS acknowledgement' checkbox$")
	public void the_user_should_not_see_the_PDS_acknowledgement_checkbox() throws Throwable {
		Pagefactory.enter_units_in_order_amount_field(driver, (float) 10.00);
		Pagefactory.click_advice_given_as_NO(driver);
		Pagefactory.NO_PDS_checkbox(driver);
		Pagefactory.check_if_add_button_is_in_enabled_state(driver);
		driver.quit();
	}
}