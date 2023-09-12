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
When User enter customer info as "<newemail>" and "<newpass>"	and "<fname>" and "<lname>" and "<gender>"and"<comname>"and "<admincomment>" 
And User click on save button
Then User can see confirmation message "The new customer has been added successfully."
And close browser
 Examples:
|email							|password|newemail			 |newpass|fname|lname|gender|comname|admincomment|
|admin@yourstore.com|admin	 |sapna@gmail.com|sapna	 |sapna|joshi|Female|Decor	|Textile		 |
 