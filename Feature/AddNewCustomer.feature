Feature:AddNewCustomer

 @Sanity
 Scenario Outline: Add new customer
 Given User Lanch Chrome Browser
 When  User open url "https://admin-demo.nopcommerce.com/login"
 And   User enter Email as "<email>" and password as "<password>"  
 And   User click on Login button
 Then User can view Dashboard
 When User click on customer menu
 And User click on customer menu item
And User click on new add button
Then User can view Add new customer page
When When user enter customer info as "<newEmail>" and "<newPass>" and "<fname>" and "<lname>" and "<gender>" and "<comName>" and "<adminComment>" 
And User click on save button
Then User can see confirmation message "The new customer has been added successfully."
And close browser
 Examples:
|email							|password|newEmail			 |newPass|fname|lname|gender|comName|adminComment|
|admin@yourstore.com|admin	 |store@gmail.com|sapna	 |sapna|joshi|Female|Decor	|Textile		 |
 