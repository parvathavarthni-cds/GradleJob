Feature: Risk Based Test Set for HIVE OP BUY
This Feature Details with the BUY order features for the DG Adviser

@RegressionTest @SmokeTest
Scenario: Login into Hive application
Given the user is on hive login screen
When the user enters the username and password and clicks on submit
Then user should land on the portfolio valuation screen

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Insufficient cash in CMA balance 
Given the user is on 'Add a BUY order' side tray
When the user tries to place a BUY order with 'Order value' greater than 'Available CMA cash balance'
Then the user should not be allowed to place the BUY order
And the user should see the error message 'You are exceeding your available funds'

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Insufficient cash due to cash allocated to another draft buy order
Given the user is on 'Add a BUY order' side tray
And the user creates a BUY order for value less than 'Available CMA cash balance'
When the user tries to create a second BUY order for a value greater than the remaining 'Available CMA cash balance'
Then the user should not able to create a second BUY order
And the user should see the error message "You are exceeding your available funds"

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Insufficient cash due to cash allocated to open buy order
Given the user is on 'Add a BUY order' side tray
And the user should have values in 'open orders' for the selected portfolio and asset
When the user tries to create a new BUY order with a value greater than the remaining 'Available CMA cash balance' for the same portfolio
Then the user should not be allowed to place the BUY order
And the user should see the error message "You are exceeding your available funds" in the side tray

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Available cash should be displayed after excluding minimum cash
Given the user is on 'Add a BUY order' side tray
When the user selects one asset from the 'APL' dropdown
Then the user should see the 'Available funds = CMA Cash - Open order - Other'

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Available Cash must not include SMA or other non-CMA cash
Given the user is on 'PWL HIVE MF Test' summary screen
And the portfolio holds multiple cash accounts
When the user tries to create a BUY order 
Then the user should see only CMA cash as the 'Available funds'
#Test data: can use portfolio 171810611 Slayd Super Fund – Jackie

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Minimum Cash balance for multiple BUY orders
Given the user is on 'Add a BUY order' side tray
When the user adds one BUY order with all the cash validations
And the user tries to create a second BUY order 
Then the user should see the same 'Minimum cash' value in the others section

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Asset not on the Master APL	
Given the user is on 'Place orders' side tray
And the user clicks on 'BUY' button And navigates to 'APL' dropdown
When the user searches any 'Managed funds' which is not present in the APL
Then the user should see 'No Assets' message inside the dropdown

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Asset is on the Master APL for PIA but not approved for the portfolio's Badge PIA APL	
Given the user is on 'Place orders' side tray
And the user clicks on 'BUY' button And navigates to 'APL' dropdown
When the user searches the asset 'ADV0050AU' , which is not approved for the 'Smartwrap' badge
Then the user should see 'No Assets' message inside the dropdown

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Asset is on the Master APL for PIA And approved for the portfolio's Badge but not approved for a Dealer group
Given the user is on 'Place orders' side tray
And the user clicks on 'BUY' button And navigates to 'APL' dropdown
When the user searches the asset 'Asset_code', which is under 'investment' product and 'smartwrap' badge but not under the dealer group 'Test organisation B(1718)'
Then the user should see 'No Assets' message inside the dropdown
#Test Data: VAN0110AU

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Asset is 'PWL Operationally Ready=Yes' And 'IssueOK=Yes'
Given the user is on 'Add a BUY order' side tray
When the user searches the asset 'CRE0005AU' , which contains 'Operationally Ready = Yes' and 'IssueOK = Yes'
Then the user should see the fund in the asset dropdown

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Asset is 'PWL Operationally Ready=Yes' And 'IssueOK=Yes' but not under the badge 'smartwrap'
Given the user is on 'Add a BUY order' side tray
And the user has removed the asset 'ASX8411AU' from the 'Smartwrap' badge
When the user searches the asset 'ASX8411AU' , which contains 'Operationally Ready = Yes' and 'IssueOK = Yes'
Then the user should see 'No Assets' message inside the dropdown

#@RegressionTest @SmokeTest
#Scenario: Validate BUY order- Asset is not PWL Operationally Ready - cannot buy	
#Given the user is on 'PWL1 Test' portfolio
#And the user clicks on 'place an order' button and clicks on 'BUY' button to navigate to 'APL' dropdown
#When the user searches the asset 'MAQ0058AU' , which contains 'Operationally Ready = NO'
#Then the user should see 'No Assets' message inside the dropdown

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Asset is 'Operationally Ready' but 'IssueOK=NO'- cannot buy 
Given the user is on 'PWL1 Test' portfolio
And the user clicks on 'place an order' button and clicks on 'BUY' button to navigate to 'APL' dropdown
When the user selects the asset 'ASC0003AU' , which contains 'Operationally Ready = YES' and 'IssueOK=N' in securities master
Then the user should see 'This product is closed for investment' message along with the option to 'view fund details'

@RegressionTest @SmokeTest
Scenario: Validate BUY order- by creating order less than the minimum order size
Given the user is on 'Add a BUY order' side tray under 'PWL1 Test' portfolio
When the user selects the asset 'ETL0201AU'
And user enters the amount '5' in the 'investment amount' field And clicks on '+Add' button
Then the user should see the error message 'Order should be at least $10'

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Wholesale fund 
Given the user is on 'Add a BUY order' side tray
And select one asset from the APL dropdown, which should have 'Disc-docs = WP' in the security master
When the user adds the BUY order and clicks on the 'Preview' button
Then the user should see the 'Wholesale acknowledgement' checkbox in the preview screen
#Test data: ASX6124AU

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Wholesale fund 
Given the user is on 'Add a BUY order' side tray
And select one asset from the APL dropdown, which should have 'Disc-docs = IM' in the security master
When the user adds the BUY order and clicks on the 'Preview' button
Then the user should see the 'Wholesale acknowledgement' checkbox in the preview screen
#Test data: BAR0001AU

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Wholesale fund
Given the user is on 'Add a BUY order' side tray
And selects one asset 'ETL0072AU' from the APL dropdown, which has 'Disc-docs = NA' in the security master
When the user adds the BUY order and clicks on the 'Preview' button
Then the user should not see the 'Wholesale acknowledgement' checkbox in the preview screen

@RegressionTest @SmokeTest
Scenario: Validate BUY order- retail fund 
Given the user is on 'Add a BUY order' side tray
And select one asset from the APL dropdown, which should have 'Disc-docs = RP' in the security master
When the user adds the BUY order and clicks on the 'Preview' button
Then the user should not see the 'Wholesale acknowledgement' checkbox in the preview screen
#Test data:BFL0001AU

#@RegressionTest @SmokeTest
#**********************
#Scenario: Validate BUY order- Wholesale fund while placing both BUY And SELL orders
#Given the user is on 'Add a BUY order' side tray
#And the user has added two BUY orders one with wholesale fund '(Disc-docs=WP)' and another with retail fund '(Disc-docs=RP)'
#And also added two SELL orders one with wholesale fund '(Disc-docs=WP)' and another with retail fund '(Disc-docs=RP)'
#When the user clicks on the 'Preview' button
#Then the user should see the 'Wholesale acknowledgement' checkbox in the preview screen
#**********************

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Disclaimer acknowledgement for BUY wholesale fund
Given the user is on 'Add a BUY order' side tray
And select one asset from the APL dropdown, which should have 'Disc-docs = WP' in the security master
When the user adds the BUY order and clicks on the 'Preview' button
Then the user should see the 'Disclaimer acknowledgement' checkbox in the preview screen
And without selecting the 'Disclaimer acknowledgement' checkbox user should not be allowed to confirm the order

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Disclaimer acknowledgement for BUY retail fund
Given the user is on 'Add a BUY order' side tray
And select one asset from the APL dropdown, which should have 'Disc-docs = RP' in the security master
When the user adds the BUY order and clicks on the 'Preview' button
Then the user should see 'Disclaimer acknowledgement' checkbox in the preview screen
And without selecting the 'Disclaimer acknowledgement' checkbox user should not be allowed to confirm the order

@RegressionTest @SmokeTest
Scenario: Validate BUY order- 'Was Advice Given?' section
Given the user is on 'Add a BUY order' side tray
When the user selects 'Yes' radio button under 'Was Advice Given?' section
Then the user should see Advice reason, Advice date, Advice summary and Advice method fields 
And Advice reason, Advice date, Advice method fields should be mandatory

@RegressionTest @SmokeTest
Scenario: Validate BUY order- 'Was Advice Given?' section
Given the user is on 'Add a BUY order' side tray
When the user selects 'Yes' radio button under 'Was Advice Given?' section
Then the user should see Advice reason, Advice date, Advice summary and Advice method fields 
And Advice summary field should be mAndatory only When the 'Other' option is selected in the 'Advice option' field

@RegressionTest @SmokeTest
Scenario: Validate BUY order- 'Was Advice Given?' section
Given the user is on 'Add a BUY order' side tray
When the user selects 'NO' radio button under 'Was Advice Given?' section
Then the other advice questions should be hidden

@RegressionTest @SmokeTest
Scenario: Validate BUY order- PDS acknowledgement
Given the user is on 'Add a BUY order' side tray
When the user selects an asset from the APL dropdown
Then the user should see the 'PDS acknowledgement' checkbox
And without selecting the 'PDS acknowledgement' checkbox user should not be allowed to add the order in the draft section

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Asset is on the Master APL for PIA but not for SPA
Given the user is on 'Place orders' side tray under a portfolio with pension account
And the user clicks on 'BUY' button And navigates to 'APL' dropdown
When the user searches the asset 'Asset_code' , which is approved for 'PIA' but not for 'SPA'
Then the user should see 'No Assets' message inside the dropdown
#Test Data: APN0023AU

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Asset is on the Master APL for SPA and approved for the badge(smartwrap) but not enabled for the DealerGroup(1718)
Given the user is on 'Place orders' side tray under the 'DealerGroup(1718)' and a portfolio with 'Pension' account
And the user clicks on 'BUY' button And navigates to 'APL' dropdown
When the user searches the asset 'Asset_code' , which is 'Operationally Ready=YES' and 'IssueOK=YES'
And the asset 'Asset_code' is approved for 'SAP' and 'badge(smartwrap)' but not enabled for the 'DealerGroup(1718)'
Then the user should see 'No Assets' message inside the dropdown
#Test Data: EQI0028AU

#SIM-1119
#//Old_Scenario: Validate BUY order- Asset is on the Master APL and approved for SPA and a badge(smartwrap) but not approved for the second badge(Wealth Account)
#//Given the user is on 'Place orders' side tray under the second badge '(Wealth Account)'
#//And the user clicks on 'BUY' button And navigates to 'APL' dropdown
#//When the user searches the asset 'Asset_code' , which is approved for 'SAP' and 'badge(smartwrap)'
#//And the asset 'Asset_code' is not approved for 'SPA' and 'badge(Wealth Account)'
#//Then the user should see 'No Assets' message inside the dropdown

@RegressionTest @SmokeTest
Scenario: Validate BUY order- Asset is on the Master APL and approved for PIA and a badge(wealth account) but not approved for the second badge(Smartwrap)
Given the user is on 'Place orders' side tray under the second badge '(Smartwrap)'
And the user clicks on 'BUY' button And navigates to 'APL' dropdown
When the user searches the asset 'Asset_code' , which is approved for 'PIA' and 'badge(wealth account)'
And the asset 'Asset_code' is not approved for 'PIA' and 'badge(Smartwrap)'
Then the user should see the 'No Assets' message inside the dropdown
#Test Data: WHT0023AU
#NOTE: Since there no portfolio with pension account in the 'Wealth Account' badge, 
#I have changed the scenario to this --> Asset is on the Master APL and approved for PIA and a badge(wealth account) but not approved for the second badge(Smartwrap)


