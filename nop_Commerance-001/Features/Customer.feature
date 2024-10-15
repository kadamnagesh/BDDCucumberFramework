Feature: Customer

Scenario: Successful login with valid credential
Given User launch chrome browser
When User open URL "https://admin-demo.nopcommerce.com/login"
And User enters email as "admin@yourstore.com" and password as "admin"
And Click on login
Then User can view Dashboard
When User click on customers menu
And Click on customer menu item
And click on add new button
Then User can view add new customer page
When User enter customer info
And Click on save button
Then User can view confirmation message "the new customer has beeen added successfully."
And close browser