$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Side_tray_add_sell_order.feature");
formatter.feature({
  "line": 1,
  "name": "ADD Sell order side tray validation",
  "description": "",
  "id": "add-sell-order-side-tray-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#This feature will validate the Add sell order side tray functionalities"
    },
    {
      "line": 4,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 5,
  "name": "Validate the Place an order button on PV Screen for the portfolios which is up-to-date",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-place-an-order-button-on-pv-screen-for-the-portfolios-which-is-up-to-date",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is on Hive DashBoard screen",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user selects any portfolio from portfolio dropdown which is up-to-date",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "page should be navigated to selected Portfolio summary screen and ‘Place an Order’ button should be enabled on PV screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Hive_DashBoard_screen()"
});
formatter.result({
  "duration": 38739128158,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_selects_any_portfolio_from_portfolio_dropdown_which_is_up_to_date()"
});
formatter.result({
  "duration": 28075065209,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.page_should_be_navigated_to_selected_Portfolio_summary_screen_and_Place_an_Order_button_should_be_enabled_on_PV_screen()"
});
formatter.result({
  "duration": 5070629074,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 10,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 11,
  "name": "Validate the Place order side tray",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-place-order-side-tray",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user is on Portfolio screen",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "the user clicks the ‘Place an order’ button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "place order side tray should open",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "place order, portfolio dropdown should be pre-populated the selected portfolio tab",
  "keyword": "And "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Portfolio_screen()"
});
formatter.result({
  "duration": 14663895,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_clicks_the_Place_an_order_button()"
});
formatter.result({
  "duration": 4124453400,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.place_order_side_tray_should_open()"
});
formatter.result({
  "duration": 3243424734,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.place_order_portfolio_dropdown_should_be_pre_populated_the_selected_portfolio_tab()"
});
formatter.result({
  "duration": 3307812976,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 17,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 18,
  "name": "Validate the search portfolio from side tray",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-search-portfolio-from-side-tray",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "user is on place an order side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user clicks the portfolio dropdown in `place an order` side tray",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user should be able to search different portfolios from the portfolio dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_place_an_order_side_tray()"
});
formatter.result({
  "duration": 3207295066,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_clicks_the_portfolio_dropdown_in_place_an_order_side_tray()"
});
formatter.result({
  "duration": 22002091089,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_should_be_able_to_search_different_portfolios_from_the_portfolio_dropdown()"
});
formatter.result({
  "duration": 9270338495,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 23,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 24,
  "name": "Validate the sell order screen",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-sell-order-screen",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "user is on place an order side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "the user clicks the sell order button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "‘Add a sell order’ extended side tray should be display",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_place_an_order_side_tray()"
});
formatter.result({
  "duration": 3182518638,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_clicks_the_sell_order_button()"
});
formatter.result({
  "duration": 8197494819,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.add_a_sell_order_extended_side_tray_should_be_display()"
});
formatter.result({
  "duration": 45387215,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 29,
      "value": "# Validate sell Extended Side tray"
    },
    {
      "line": 30,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 31,
  "name": "Validate the cancel button in extended side tray",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-cancel-button-in-extended-side-tray",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "the user clicks the cancel button from the extended side tray",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "extended side tray should be closed and the user should navigate back to place order side tray",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 3099423003,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_clicks_the_cancel_button_from_the_extended_side_tray()"
});
formatter.result({
  "duration": 5173392516,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.extended_side_tray_should_be_closed_and_the_user_should_navigate_back_to_place_order_side_tray()"
});
formatter.result({
  "duration": 11240669255,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 36,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 37,
  "name": "Validate the portfolio holding searchbox",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-portfolio-holding-searchbox",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "user search for any portfolio holding using the searchbox",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user should get the result based on the search keyword and select the portfolio_holding",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 3104389503,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_search_for_any_portfolio_holding_using_the_searchbox()"
});
formatter.result({
  "duration": 13486650402,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_should_get_the_result_based_on_the_search_keyword_and_select_the_portfolio_holding()"
});
formatter.result({
  "duration": 3308375339,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 42,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 43,
  "name": "Validate the exit price",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-exit-price",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 44,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "user finds the availble exit price of that portfolio holding on extended side tray",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "available exit price for that unit should be displayed with est.label",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 3081187003,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_finds_the_availble_exit_price_of_that_portfolio_holding_on_extended_side_tray()"
});
formatter.result({
  "duration": 40132311,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.available_exit_price_for_that_unit_should_be_displayed_with_est_label()"
});
formatter.result({
  "duration": 740711,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 48,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 49,
  "name": "Validate the Order amount field on add sell order screen",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-order-amount-field-on-add-sell-order-screen",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 50,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "the user clicks anywhere in the screen without entering anything on the order amount field",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "error message should be displayed under the order amount screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 3084576478,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_clicks_anywhere_in_the_screen_without_entering_anything_on_the_order_amount_filed()"
});
formatter.result({
  "duration": 84485612,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.error_message_should_be_displayed_under_the_order_amount_screen()"
});
formatter.result({
  "duration": 2056761757,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 54,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 55,
  "name": "Validate the order amount field validation",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-order-amount-field-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 56,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 57,
  "name": "the user enters the Special character and text values in the order amount text box",
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "user should not be allowed to enter the special character and text values into the order amount field",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 3064770271,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_enters_the_Special_character_and_text_values_in_the_order_amount_text_box()"
});
formatter.result({
  "duration": 132331254,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_should_not_be_allowed_to_enter_the_special_character_and_text_values_into_the_order_amount_field()"
});
formatter.result({
  "duration": 2062234009,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 60,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 61,
  "name": "Validate the add button on the ‘add a sell order button’",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-add-button-on-the-‘add-a-sell-order-button’",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 62,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 63,
  "name": "the user didn’t enter/select anything on the screen",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "‘Add’ button should be in disable mode",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 3081857581,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_didn_t_enter_select_anything_on_the_screen()"
});
formatter.result({
  "duration": 31067104,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.add_button_should_be_in_disable_mode()"
});
formatter.result({
  "duration": 2049652703,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 66,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 67,
  "name": "validate the maximum order amount",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-maximum-order-amount",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 68,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 69,
  "name": "the user enters more than available units",
  "keyword": "When "
});
formatter.step({
  "line": 70,
  "name": "error message should be displayed under the order amount text box",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 3103350729,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_enters_more_than_available_units()"
});
formatter.result({
  "duration": 193867428,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.error_message_should_be_displayed_under_the_order_amount_text_box()"
});
formatter.result({
  "duration": 2058841017,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 72,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 73,
  "name": "validate order amount and available units are the same",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-order-amount-and-available-units-are-the-same",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 74,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 75,
  "name": "the user enter the enters the order amount which is equal to available units",
  "keyword": "When "
});
formatter.step({
  "line": 76,
  "name": "user should get the \u0027Full redemption\u0027 message under the order value text box",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 3124142160,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_enter_the_enters_the_order_amount_which_is_equal_to_available_units()"
});
formatter.result({
  "duration": 300472291,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_should_get_the_Full_redemption_message_under_the_order_value_text_box()"
});
formatter.result({
  "duration": 2057180063,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 78,
      "value": "#\tScenario: validate the Minimum order amount"
    },
    {
      "line": 79,
      "value": "#\tGiven user is on ‘Add a sell order’ extended side tray"
    },
    {
      "line": 80,
      "value": "#\tWhen the order value is less than the transaction fee"
    },
    {
      "line": 81,
      "value": "#\tThen user should not allow placing the order and error message should be displayed on the screen and +add or update button should be disabled"
    },
    {
      "line": 82,
      "value": "#"
    },
    {
      "line": 83,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 84,
  "name": "Validate the order value calculation",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-order-value-calculation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 85,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 86,
  "name": "the user enters the order units",
  "keyword": "When "
});
formatter.step({
  "line": 87,
  "name": "order units should be multiplied with the exit price and the result should be subtracted with a transaction fee",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "Final calculated value should be displayed as order value est with 2 decimal places",
  "keyword": "And "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 3171742142,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_enters_the_order_units()"
});
formatter.result({
  "duration": 120293418,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.order_units_should_be_multiplied_with_the_exit_price_and_the_result_should_be_subtracted_with_a_transaction_fee()"
});
formatter.result({
  "duration": 70139393,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 67
    }
  ],
  "location": "Add_sell_order.final_calculated_value_should_be_display_as_order_value_est_with_decimal_places(int)"
});
formatter.result({
  "duration": 36764473,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 90,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 91,
  "name": "Validate the Advice given ’No’ radio button",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-advice-given-’no’-radio-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 92,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 93,
  "name": "user select the ’No’ option",
  "keyword": "When "
});
formatter.step({
  "line": 94,
  "name": "\u0027Advice given\u0027 details should not be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 3108853725,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_select_the_No_option()"
});
formatter.result({
  "duration": 331666658,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.advice_given_details_should_not_be_displayed()"
});
formatter.result({
  "duration": 2050518794,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 96,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 97,
  "name": "validate the Advice given ‘Yes’ radio button",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-advice-given-‘yes’-radio-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 98,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 99,
  "name": "user select the ’Yes’ option",
  "keyword": "When "
});
formatter.step({
  "line": 100,
  "name": "advice reason, date, summary and advice method fields should be display under the advice given label",
  "keyword": "Then "
});
formatter.step({
  "line": 101,
  "name": "Date field should have todays\u0027s field as default",
  "keyword": "And "
});
formatter.step({
  "line": 102,
  "name": "add button should be enabled",
  "keyword": "And "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 3180004541,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_select_the_Yes_option()"
});
formatter.result({
  "duration": 2164405599,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.advice_reason_date_summary_and_advice_method_fields_should_be_display_under_the_advice_given_label()"
});
formatter.result({
  "duration": 4839871667,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.date_field_should_have_todays_s_field_as_default()"
});
formatter.result({
  "duration": 56458232,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.add_button_should_be_enabled()"
});
formatter.result({
  "duration": 30467013,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 105,
      "value": "#\t# @RegressionTest @SmokeTest"
    },
    {
      "line": 106,
      "value": "#\tScenario: Validate the disclaimer footer message"
    },
    {
      "line": 107,
      "value": "#\tGiven user is on ‘Add a sell order’ extended side tray"
    },
    {
      "line": 108,
      "value": "#\tWhen the user selects the disclaimer footer message checkbox along with complete all the mandatory fields"
    },
    {
      "line": 109,
      "value": "#\tThen add button should be enabled"
    },
    {
      "line": 111,
      "value": "#\tDraft order scenarios"
    },
    {
      "line": 113,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 114,
  "name": "Validate the draft order page",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-draft-order-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 115,
  "name": "user is on ‘Add a sell order’ extended side tray",
  "keyword": "Given "
});
formatter.step({
  "line": 116,
  "name": "the user clicks the add button from Add a sell order extended side tray",
  "keyword": "When "
});
formatter.step({
  "line": 117,
  "name": "order should be saved as draft order and should be displayed on the place order screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 3091966256,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_clicks_the_add_button_from_Add_a_sell_order_extended_side_tray()"
});
formatter.result({
  "duration": 155205164,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.order_should_be_saved_as_draft_order_and_should_be_displayed_on_the_place_order_screen()"
});
formatter.result({
  "duration": 5067398070,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 119,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 120,
  "name": "Validate the draft order",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-draft-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 121,
  "name": "user is on the draft order screen",
  "keyword": "Given "
});
formatter.step({
  "line": 122,
  "name": "user click the available draft order",
  "keyword": "When "
});
formatter.step({
  "line": 123,
  "name": "add sell order extended side tray should open and user should be able to edit the order",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_the_draft_order_screen()"
});
formatter.result({
  "duration": 32393009,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_click_the_available_draft_order()"
});
formatter.result({
  "duration": 86391983,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.add_sell_order_extended_side_tray_should_open_and_user_should_be_able_to_edit_the_order()"
});
formatter.result({
  "duration": 5069547396,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 125,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 126,
  "name": "validate the edit order",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-edit-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 127,
  "name": "user is on the edit order screen",
  "keyword": "Given "
});
formatter.step({
  "line": 128,
  "name": "user changes the different asset or order value",
  "keyword": "When "
});
formatter.step({
  "line": 129,
  "name": "click the update button",
  "keyword": "And "
});
formatter.step({
  "line": 130,
  "name": "updated new changes should be displayed in the draft order screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_the_edit_order_screen()"
});
formatter.result({
  "duration": 5038513702,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_changes_the_different_asset_or_order_value()"
});
formatter.result({
  "duration": 2120869076,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.click_the_update_button()"
});
formatter.result({
  "duration": 160880492,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.updated_new_changes_should_be_displayed_in_the_draft_order_screen()"
});
formatter.result({
  "duration": 5100735386,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 132,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 133,
  "name": "Validate the multiple orders",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-multiple-orders",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 134,
  "name": "user is on the draft order screen",
  "keyword": "Given "
});
formatter.step({
  "line": 135,
  "name": "the user clicks the sell button and places the another order",
  "keyword": "When "
});
formatter.step({
  "line": 136,
  "name": "newly placed order should be displayed under the previous order on the draft order screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_the_draft_order_screen()"
});
formatter.result({
  "duration": 35572723,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_clicks_the_sell_button_and_places_the_another_order()"
});
formatter.result({
  "duration": 28319017694,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.newly_placed_order_should_be_displayed_under_the_previous_order_on_the_draft_order_screen()"
});
formatter.result({
  "duration": 2123833123,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 138,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 139,
  "name": "validate the close order button",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-close-order-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 140,
  "name": "user is on the draft order screen",
  "keyword": "Given "
});
formatter.step({
  "line": 141,
  "name": "user clicks the close button for any draft order card",
  "keyword": "When "
});
formatter.step({
  "line": 142,
  "name": "confirmation pop-up message should be displayed on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_the_draft_order_screen()"
});
formatter.result({
  "duration": 78853767,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_clicks_the_close_button_for_any_draft_order_card()"
});
formatter.result({
  "duration": 2177124478,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.confirmation_pop_up_message_should_be_displayed_on_the_screen()"
});
formatter.result({
  "duration": 2125913107,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 144,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 145,
  "name": "Validate the Go back button on the confirmation popup",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-go-back-button-on-the-confirmation-popup",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 146,
  "name": "user is can able to view the confirmation pop-up for close order",
  "keyword": "Given "
});
formatter.step({
  "line": 147,
  "name": "the user clicks the Go back button",
  "keyword": "When "
});
formatter.step({
  "line": 148,
  "name": "that order should not be closed and order should be displayed on the draft order screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_can_able_to_view_the_confirmation_pop_up_for_close_order()"
});
formatter.result({
  "duration": 2094128272,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_clicks_the_Go_back_button()"
});
formatter.result({
  "duration": 223157831,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.that_order_should_not_be_closed_and_order_should_be_displayed_on_the_draft_order_screen()"
});
formatter.result({
  "duration": 3067698382,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 150,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 151,
  "name": "Validate the cancel order button on the confirmation popup",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-cancel-order-button-on-the-confirmation-popup",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 152,
  "name": "user is can able to view the confirmation popup for close order",
  "keyword": "Given "
});
formatter.step({
  "line": 153,
  "name": "the user clicks the cancel order button",
  "keyword": "When "
});
formatter.step({
  "line": 154,
  "name": "that particular order should be get disappear from the draft order screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_can_able_to_view_the_confirmation_popup_for_close_order()"
});
formatter.result({
  "duration": 6316770382,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_clicks_the_cancel_order_button()"
});
formatter.result({
  "duration": 3265891856,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.that_particular_order_should_be_get_disappear_from_the_draft_order_screen()"
});
formatter.result({
  "duration": 5049920280,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 156,
      "value": "#Preview Order screen scenarios"
    },
    {
      "line": 158,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 159,
  "name": "validate the preview screen",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-preview-screen",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 160,
  "name": "user is on the draft order screen",
  "keyword": "Given "
});
formatter.step({
  "line": 161,
  "name": "the user clicks the preview button from the draft order screen",
  "keyword": "When "
});
formatter.step({
  "line": 162,
  "name": "User should navigate to the preview order screen",
  "keyword": "Then "
});
formatter.step({
  "line": 163,
  "name": "transaction summary value on preview order screen and addition of draft orders value should be same",
  "keyword": "And "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_the_draft_order_screen()"
});
formatter.result({
  "duration": 36847423,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_clicks_the_preview_button_from_the_draft_order_screen()"
});
formatter.result({
  "duration": 2149667217,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_should_navigate_to_the_preview_order_screen()"
});
formatter.result({
  "duration": 5122715102,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.transaction_summary_value_on_preview_order_screen_and_addition_of_draft_orders_value_should_be_same()"
});
formatter.result({
  "duration": 112334574,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 165,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 166,
  "name": "Validate the Preview order screen",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-preview-order-screen",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 167,
  "name": "user is on the preview order screen",
  "keyword": "Given "
});
formatter.step({
  "line": 168,
  "name": "the user finds before and after portfolio impact of the available units",
  "keyword": "When "
});
formatter.step({
  "line": 169,
  "name": "available units should be reduced based on the order units for that Asset type",
  "keyword": "Then "
});
formatter.step({
  "line": 170,
  "name": "Asset name and asset code should be displayed under the before and after impacts of Units",
  "keyword": "And "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_the_preview_order_screen()"
});
formatter.result({
  "duration": 5029924463,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_finds_before_and_after_portfolio_impact_of_the_available_units()"
});
formatter.result({
  "duration": 41434783,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.available_units_should_be_reduced_based_on_the_order_units_for_that_Asset_type()"
});
formatter.result({
  "duration": 648058,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.asset_name_and_asset_code_should_be_displayed_under_the_before_and_after_impacts_of_Units()"
});
formatter.result({
  "duration": 81010653,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 172,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 173,
  "name": "Validate the back button on preview order screen",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-back-button-on-preview-order-screen",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 174,
  "name": "user is on the preview order screen",
  "keyword": "Given "
});
formatter.step({
  "line": 175,
  "name": "user clicks the back button",
  "keyword": "When "
});
formatter.step({
  "line": 176,
  "name": "User should be navigated to the order draft screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_the_preview_order_screen()"
});
formatter.result({
  "duration": 5036362908,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_clicks_the_back_button()"
});
formatter.result({
  "duration": 2122821622,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_should_be_navigated_to_the_order_draft_screen()"
});
formatter.result({
  "duration": 28306315,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 178,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 179,
  "name": "Validate the Confirm order button",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-confirm-order-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 180,
  "name": "user is on the draft order screen",
  "keyword": "Given "
});
formatter.step({
  "line": 181,
  "name": "the user clicks the preview button from the draft order screen",
  "keyword": "When "
});
formatter.step({
  "line": 182,
  "name": "the user didn’t select the disclaimer checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 183,
  "name": "Confirm order button should be in disable mode",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_the_draft_order_screen()"
});
formatter.result({
  "duration": 25741575,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_clicks_the_preview_button_from_the_draft_order_screen()"
});
formatter.result({
  "duration": 2183649724,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.the_user_didn_t_select_the_disclaimer_checkbox()"
});
formatter.result({
  "duration": 5000167161,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.confirm_order_button_should_be_in_disable_mode()"
});
formatter.result({
  "duration": 73379748,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 185,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 186,
  "name": "Validate the disclaimer acknowledgement pop-up",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-disclaimer-acknowledgement-pop-up",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 187,
  "name": "user is on the preview order screen",
  "keyword": "Given "
});
formatter.step({
  "line": 188,
  "name": "user clicks the disclaimer link from the preview order screen footer",
  "keyword": "When "
});
formatter.step({
  "line": 189,
  "name": "Disclaimer popup should be display",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_the_preview_order_screen()"
});
formatter.result({
  "duration": 5098525118,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_clicks_the_disclaimer_link_from_the_preview_order_screen_footer()"
});
formatter.result({
  "duration": 6142854892,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.Disclaimer_popup_should_be_display()"
});
formatter.result({
  "duration": 3144233251,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 191,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 192,
  "name": "validate the disclaimer checkbox",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-disclaimer-checkbox",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 193,
  "name": "user is on the preview order screen",
  "keyword": "Given "
});
formatter.step({
  "line": 194,
  "name": "User selects the disclaimer checkbox",
  "keyword": "When "
});
formatter.step({
  "line": 195,
  "name": "Order Confirm button should be enabled",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_the_preview_order_screen()"
});
formatter.result({
  "duration": 5023864784,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_selects_the_disclaimer_checkbox()"
});
formatter.result({
  "duration": 2099319057,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.order_Confirm_button_should_be_enabled()"
});
formatter.result({
  "duration": 34102136,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 197,
      "value": "# @RegressionTest @SmokeTest"
    }
  ],
  "line": 198,
  "name": "Validate the order confirmation button",
  "description": "",
  "id": "add-sell-order-side-tray-validation;validate-the-order-confirmation-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 199,
  "name": "user is on the preview order screen",
  "keyword": "Given "
});
formatter.step({
  "line": 200,
  "name": "User click the order confirm button after selecting all the mandatory fields",
  "keyword": "When "
});
formatter.step({
  "line": 201,
  "name": "Order should be submitted",
  "keyword": "Then "
});
formatter.step({
  "line": 202,
  "name": "unique reference number should be generated for each order on order confirmation screen",
  "keyword": "And "
});
formatter.match({
  "location": "Add_sell_order.user_is_on_the_preview_order_screen()"
});
formatter.result({
  "duration": 5075240354,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.user_click_the_order_confirm_button_after_selecting_all_the_mandatory_fields()"
});
formatter.result({
  "duration": 7233984800,
  "status": "passed"
});
formatter.match({
  "location": "Add_sell_order.order_should_be_submitted()"
});
formatter.result({
  "duration": 123220892109,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: Proxy element for: DefaultElementLocator \u0027By.id: confirm-order-container\u0027 (tried for 120 second(s) with 500 milliseconds interval)\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\n\tat com.pw.publicLib.UIHandler_2.wait_until_clickable(UIHandler_2.java:1856)\n\tat com.pw.publicLib.UIHandler_2.valdiate_order_confirmation(UIHandler_2.java:1829)\n\tat com.pw.pw_screens.Add_sell_order.order_should_be_submitted(Add_sell_order.java:587)\n\tat ✽.Then Order should be submitted(Features/Side_tray_add_sell_order.feature:201)\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"confirm-order-container\"}\n  (Session info: chrome\u003d72.0.3626.81)\n  (Driver info: chromedriver\u003d2.46.628388 (4a34a70827ac54148e092aafb70504c4ea7ae926),platform\u003dLinux 4.15.0-66-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027parvatha-varthni\u0027, ip: \u0027192.168.43.4\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.15.0-66-generic\u0027, java.version: \u00271.8.0_222\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.46.628388 (4a34a70827ac54..., userDataDir: /tmp/.org.chromium.Chromium...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:34709}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 72.0.3626.81, webStorageEnabled: true}\nSession ID: 72f01421a3001bcfc7bb99566724f33d\n*** Element info: {Using\u003did, value\u003dconfirm-order-container}\n\tat sun.reflect.GeneratedConstructorAccessor25.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy19.isDisplayed(Unknown Source)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:314)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:43)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:300)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:297)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$23.apply(ExpectedConditions.java:670)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$23.apply(ExpectedConditions.java:666)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\n\tat com.pw.publicLib.UIHandler_2.wait_until_clickable(UIHandler_2.java:1856)\n\tat com.pw.publicLib.UIHandler_2.valdiate_order_confirmation(UIHandler_2.java:1829)\n\tat com.pw.pw_screens.Add_sell_order.order_should_be_submitted(Add_sell_order.java:587)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:583)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:989)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\n\tat org.testng.TestRunner.run(TestRunner.java:505)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\n\tat org.testng.TestNG.run(TestNG.java:1017)\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\n",
  "status": "failed"
});
formatter.match({
  "location": "Add_sell_order.unique_reference_number_should_be_generated_for_each_order_on_order_confirmation_screen()"
});
formatter.result({
  "status": "skipped"
});
});