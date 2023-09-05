Feature:Admin

@Smoke
Scenario: Login with valid Credential
 Given User Lanch Chrome Browser
 When  User open url "https://admin-demo.nopcommerce.com/login"
 When  User enter Email as "admin@yourstore.com" and password as "admin"  
 When  User click on Login button
 Then USer Verify page title is "Dashboard / nopCommerce administration"
Then close browser 


@Sanity
 Scenario Outline: Login Data Driven
 Given User Lanch Chrome Browser
 When  User open url "https://admin-demo.nopcommerce.com/login"
 And   User enter Email as "<email>" and password as "<password>"  
 And   User click on Login button
Then USer Verify page title is "Dashboard / nopCommerce administration"
And close browser
 Examples:
|email                   |password     |
|admin@yourstore.com     |admin        |
|admin@yourstore.com     |admin2		     |
