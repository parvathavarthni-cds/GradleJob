Feature: Risk Based Test Set for HIVE OP SELL
This Feature Details with the SELL order features for the DG Adviser

@RegressionTest @SmokeTest
Scenario: Login as PWL admin 
Given the user is on the hive login screen
When the user enters the username and password for PWL ADMIN user and clicks on submit
Then user should land on the users screen

#SIM-1127
@RegressionTest @SmokeTest
Scenario: Adviser user with access to a portfolio, but without Order Pad permission Create.
Given the user is on portfolio valuation screen
When the user does not have the permissions to order-pad create
Then the 'Place an order' button should be in a disabled state

#SIM-1128
@RegressionTest @SmokeTest
Scenario: Adviser user with access to a portfolio, but does not have access to cancel orders
Given the user is on the portfolio valuation screen
When the user clicks on orders on the global header
Then the user should able to see 'Open orders' in the 'Order screen'

@RegressionTest @SmokeTest
Scenario: Adviser user with access to a portfolio, but does not have access to cancel orders
Given the user is on 'Orders screen'
And the user does not have the permissions to cancel orders
When the user selects any one SELL order with order status 'Submitted'
Then the user should see a disabled 'Cancel order' button in the 'Order details' side tray

@RegressionTest @SmokeTest
Scenario: Validate - Provide the Cancel order permission to the Adviser user
Given the user is on PWL Admin login and provides permissions to cancel order feature
When the adviser user logs back in and selects any one SELL order with order status 'Submitted'
Then the adviser user should have the permissions to 'Cancel order' in the 'Order details' side tray
And check whether the order is successfully cancelled or not when the user clicks 'Cancel order' button

#SIM-1114
@RegressionTest @SmokeTest
Scenario: Validate SELL order- When Asset is not held in portfolio
Given user is on the 'Place orders' side tray
And the user clicks on 'SELL' button & navigates to 'Portfolio holdings' dropdown
When the user searches any 'Asset name/Asset code' which is not held under the current portfolio
Then the user should see 'No Holdings' message inside the dropdown

@RegressionTest @SmokeTest
Scenario: Validate SELL order- with insufficient units
Given the user is on the 'Place orders' side tray
And the user selects one asset from 'Portfolio holdings' dropdown
When the user enters units to sell in 'Order amount' field, which should be greater than the available unit
Then the user should see the error message 'You're exceeding your holdings'

@RegressionTest @SmokeTest
Scenario: Validate SELL order- with insufficient units - units already allocated to another draft SELL order
Given the user is on the 'Place orders' side tray
And the user creates a SELL order based on the units (not full redemption)
When the user tries to create a second SELL order for the same asset
Then the user should not be allowed to create a second SELL order
And the user should see the message 'You already have a draft order for this asset' along with the 'Edit draft order' button

@RegressionTest @SmokeTest
Scenario: Validate SELL order- with insufficient units - units already allocated to open a sell order
Given the user is on the 'Place orders' side tray
And the user should have a value in 'open orders' for the selected portfolio and asset
When the user tries to create a new SELL order with units greater than the remaining 'Available units' for the same asset
Then the user should not be allowed to create a SELL order
And the user should see the error message 'You're exceeding your holdings'

#@RegressionTest @SmokeTest
#Scenario: Validate SELL order- Asset is not PWL Operationally Ready - cannot sell
#Given the user is on 'KitKat family Trust' portfolio
#And the user clicks on 'place an order' button and clicks on 'SELL' button to navigate to 'portfolio holdings' dropdown
#When the user selects the asset 'AAP3656AU', which contains 'Operationally Ready = NO' in securities master
#Then the user should see 'No Holdings' message in the dropdown
##Test data: Can use 171810594 Kitkat Family Trust, Fund AAP3656AU - Jackie

#SIM-1123
@RegressionTest @SmokeTest
Scenario: Validate SELL order- Asset is 'Operationally Ready' but 'RedeemOK=NO' - cannot sell
Given the user is on 'Kitkat Family Trust' portfolio
And the user clicks on 'place an order' button and clicks on 'SELL' button to navigate to 'portfolio holdings' dropdown
When the user selects the asset 'Asset code', which contains 'Operationally Ready = YES' and 'RedeemOK=N' in securities master
Then the user should see 'This product is closed for sell' message along with the option to view fund details
#Test Data: AUG0001AU

#SIM-1159
@RegressionTest @SmokeTest
Scenario: Validate SELL order- by creating order less than the minimum order size
Given the user is on 'Add a SELL order' side tray under 'PWL1 Test' portfolio
When the user selects the asset 'GTU0102AU' in the 'portfolio holdings' dropdown and selects 'units' radio button
And user enters '0.9' in the 'Order amount' field and clicks outside
Then the user should see the error message 'Order should be at least 1 unit'

@RegressionTest @SmokeTest
Scenario: Validate SELL order- by creating order less than the minimum order size
Given the user is on 'Add a SELL order' side tray under 'PWL1 Test' portfolio
When the user selects the asset 'GTU0102AU' in the 'portfolio holdings' dropdown and selects 'value' radio button
And user enters '0.9' in the 'Order amount' field and clicks outside
Then the user should see the sell error message 'Order should be at least $1'

@RegressionTest @SmokeTest
Scenario: Validate SELL order- by creating order greater than the minimum order size
Given the user is on 'Add a SELL order' side tray under 'PWL1 Test' portfolio
When the user selects the asset 'GTU0102AU' in the 'portfolio holdings' dropdown and selects 'units' radio button
And user enters '1.1' in 'Order amount' field and clicks outside
Then the user should not see the error message 'Order should be at least 1 unit'

@RegressionTest @SmokeTest
Scenario: Validate SELL order- by creating order greater than the minimum order size
Given the user is on 'Add a SELL order' side tray under 'PWL1 Test' portfolio
When the user selects the asset 'GTU0102AU' in the 'portfolio holdings' dropdown and selects 'value' radio button
And user enters '1.1' in 'Order amount' field and clicks outside
Then the user should not see the error message 'Order should be at least $1'

#SIM-1124
@RegressionTest @SmokeTest
Scenario: Validate SELL order- When 'Dollar redemption=NO' in the security master
Given the user is on 'Add a SELL order' side tray under 'Kitkat Family Trust' portfolio
When the user selects the asset 'Asset_code' in the 'portfolio holdings' dropdown
And that asset should have 'Dollar Redemption=NO' in the security master
Then the user should not be allowed to select 'Sell by value' radio button
#Test data: 171810594 Kitkat Family Trust; fund MAQ0842AU (holding is being created today) - Jackie

@RegressionTest @SmokeTest
Scenario: Validate SELL order- When 'Dollar redemption=NO' in the security master
Given the user is on 'Add a SELL order' side tray under 'Kitkat Family Trust' portfolio
When the user selects the asset 'Asset_code' in the 'portfolio holdings' dropdown
And that asset should have 'Dollar Redemption=NO' in the security master
Then the user should be able to select ‘Sell by units' and 'Full redemption' radio buttons
#Test data: 171810594 Kitkat Family Trust; fund MAQ0842AU (holding is being created today) - Jackie

@RegressionTest @SmokeTest
Scenario: Validate SELL order- Wholesale fund
Given the user is on 'Add a SELL order' screen
And select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = WP' in the security master
When the user adds the SELL order And clicks on 'Preview' button
Then the 'Wholesale acknowledgement' checkbox should be hidden in the preview screen 
#Test Data: BLK0022AU

@RegressionTest @SmokeTest
Scenario: Validate SELL order- Wholesale fund
Given the user is on 'Add a SELL order' screen
And select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = IM' in the security master
When the user adds the SELL order And clicks on 'Preview' button
Then the 'Wholesale acknowledgement' checkbox should be hidden in the preview screen
#Test Data: ETL3604AU

@RegressionTest @SmokeTest
Scenario: Validate SELL order- retail fund
Given the user is on 'Add a SELL order' screen
And select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = RP' in the security master
When the user adds the SELL order And clicks on 'Preview' button
Then the 'Wholesale acknowledgement' checkbox should be hidden in the preview screen
#Test Data: PER0727AU

#@RegressionTest @SmokeTest
#Scenario: Validate SELL order- retail fund
#Given the user is on 'Add a SELL order' screen
#And select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = NA' in the security master
#When the user adds the SELL order And clicks on 'Preview' button
#Then the 'Wholesale acknowledgement' checkbox should be hidden in the preview screen

@RegressionTest @SmokeTest
Scenario: Validate SELL order- Disclaimer acknowledgement for SELL wholesale fund
Given the user is on 'Add a SELL order' screen
And select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = WP' in the security master
When the user adds the SELL order based on 'units' and clicks on 'Preview' button
Then the user should see 'Disclaimer acknowledgement' checkbox in preview screen
And without selecting 'Disclaimer acknowledgement' checkbox user should not be allowed to confirm the order

@RegressionTest @SmokeTest
Scenario: Validate SELL order- Disclaimer acknowledgement for SELL retail fund
Given the user is on 'Add a SELL order' screen
And select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = RP' in the security master
When the user adds the SELL order based on 'values' and clicks on 'Preview' button
Then the user should see 'Disclaimer acknowledgement' checkbox in preview screen
And without selecting 'Disclaimer acknowledgement' checkbox user should not be allowed to confirm the order

@RegressionTest @SmokeTest
Scenario: Validate SELL order- Disclaimer acknowledgement for SELL retail fund
Given the user is on 'Add a SELL order' screen
And select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = RP' in the security master
When the user adds the SELL order with 'full redemption' and clicks on 'Preview' button
Then the user should see 'Disclaimer acknowledgement' checkbox in preview screen
And without selecting 'Disclaimer acknowledgement' checkbox user should not be allowed to confirm the order

@RegressionTest @SmokeTest
Scenario: Validate SELL order- Disclaimer acknowledgement for SELL wholesale fund
Given the user is on 'Add a SELL order' screen
And select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = WP' in the security master
When the user adds the SELL order based on 'values' and clicks on 'Preview' button
Then the user should see 'Disclaimer acknowledgement' checkbox in preview screen
And without selecting 'Disclaimer acknowledgement' checkbox user should not be allowed to confirm the order

@RegressionTest @SmokeTest
Scenario: Validate SELL order- Disclaimer acknowledgement for SELL retail fund
Given the user is on 'Add a SELL order' screen
And select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = WP' in the security master
When the user adds the SELL order with 'full redemption' and clicks on 'Preview' button
Then the user should see 'Disclaimer acknowledgement' checkbox in preview screen
And without selecting 'Disclaimer acknowledgement' checkbox user should not be allowed to confirm the order

@RegressionTest @SmokeTest
Scenario: Validate SELL order- Disclaimer acknowledgement for SELL retail fund
Given the user is on 'Add a SELL order' screen
And select one asset from the 'Portfolio holdings' dropdown, which should have 'Disc-docs = RP' in the security master
When the user adds the SELL order based on 'units' and clicks on 'Preview' button
Then the user should see 'Disclaimer acknowledgement' checkbox in preview screen
And without selecting 'Disclaimer acknowledgement' checkbox user should not be allowed to confirm the order

@RegressionTest @SmokeTest
Scenario: Validate SELL order- 'Was Advice Given?' section
Given user is on 'Add a SELL order' screen
When user selects 'Yes' radio button under 'Was Advice Given?' section
Then user should see Advice reason, Advice date, Advice summary and Advice method fields
And the Advice reason, Advice date, Advice method fields should be mandatory

@RegressionTest @SmokeTest
Scenario: Validate SELL order- 'Was Advice Given?' section
Given user is on 'Add a SELL order' screen
When user selects 'Yes' radio button under 'Was Advice Given?' section
Then user should see Advice reason, Advice date, Advice summary and Advice method fields
And the Advice summary field should be mAndatory only When the 'Other' option is selected in the 'Advice option' field

@RegressionTest @SmokeTest
Scenario: Validate SELL order- 'Was Advice Given?' section
Given user is on 'Add a SELL order' screen
When user selects 'NO' radio button under 'Was Advice Given?' section
Then other advice questions should be hidden

@RegressionTest @SmokeTest
Scenario: Validate SELL order- PDS acknowledgement
Given user is on the 'Add a SELL order' screen
When the user selects one asset from the 'Portfolio holdings' dropdown
Then the user should not see the 'PDS acknowledgement' checkbox
