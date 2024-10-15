Feature: Login

Scenario: Successful login with valid credential
Given User launch chrome browser
When User open URL "https://admin-demo.nopcommerce.com/login"
And User enters email as "admin@yourstore.com" and password as "admin"
And Click on login
Then Page title should be "Dashboard / nopCommerce administration"
When User click on logout link
Then Page title should be "Your store. Login"
And close browser