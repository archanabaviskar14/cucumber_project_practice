Feature: MyAccount-Login Feature
  Description: This feature will test a Login feature

  #Simple login without parameters
	#Scenario: Log-in with valid username and password 
	#Given Open the browser
	#When Enter the URL "http://practice.automationtesting.in/"
	#And Click on My Account Menu
	#And Enter registered username and password
	#And Click on login button
	#Then User must successfully login to the web page
	
	#Simple login without parameters
	#Scenario: Log-in with valid username and password 
	#Given Open the browser
	#When Enter the URL "http://practice.automationtesting.in/"
	#And Click on My Account Menu
	#And Enter registered username "archu.sonawane@gmail.com" and password "taranayan1420"
	#And Click on login button
	#Then User must successfully login to the web page
	
	#scenario outline and example
	#Scenario Outline: Log-in with valid username and password 
	#Given Open the browser
	#When Enter the URL "http://practice.automationtesting.in/"
	#And Click on My Account Menu
	#And Enter registered username "<username>" and password "<password>"
	#And Click on login button
	#Then Verify login
	#Examples:
	#| username | password |
	#| archu.sonawane@gmail.com | taranayan1420 |
	#| ravi@gmail.com | test123 |
	#| rashi@gmail.com | tennis123 | 
	
	#Simple login with Data table for single input without header
	#Scenario: Log-in with valid username and password 
	#Given Open the browser
	#When Enter the URL "http://practice.automationtesting.in/"
	#And Click on My Account Menu
	#And Enter registered username and password
		#	| archu.sonawane@gmail.com | taranayan1420 |
	#And Click on login button
	#Then User must successfully login to the web page
	
	#Simple login with Data table for single input with header
	#Scenario: Log-in with valid username and password 
	#Given Open the browser
	#When Enter the URL "http://practice.automationtesting.in/"
	#And Click on My Account Menu
	#And Enter registered username and password
	#		| username | password |
	#		| archu.sonawane@gmail.com | taranayan1420 |
	#		| ravi@gmail.com | test123 |
	#And Click on login button
	#Then User must successfully login to the web page
	
	#Simple login with incorrect username and correct password
	#Scenario:Log-in with incorrect username and correct password
	#Given Open the browser
	#When  Enter the URL "http://practice.automationtesting.in/"
	#And   Click on My Account Menu
	#And   Enter incorrect username "arrr@gmail.com" and password "taranayan1420"
	#And   Click on login button
	#Then  Proper error must be displayed and promt to login again
	
	#Simple login with correct username and incorrect password
	#Scenario:Log-in with incorrect username and correct password
	#Given Open the browser
	#When  Enter the URL "http://practice.automationtesting.in/"
	#And   Click on My Account Menu
	#And   Enter incorrect username "archu.sonawane@gmail.com" and password "taranayan"
	#And   Click on login button
	#Then  Proper error must be displayed and promt to login again
	
	
	#Simple login with incorrect username and incorrect password
	#Scenario:Log-in with incorrect username and incorrect password
	#Given Open the browser
	#When  Enter the URL "http://practice.automationtesting.in/"
	#And   Click on My Account Menu
	#And   Enter incorrect username "ar14@gmail.com" and password "1234"
	#And   Click on login button
	#Then  Proper error must be displayed and promt to login again
	
	#Simple login with correct username and empty password
	#Scenario:Log-in with correct username and empty password
	#Given Open the browser
	#When  Enter the URL "http://practice.automationtesting.in/"
	#And   Click on My Account Menu
	#And   Enter incorrect username "archu.sonawane@gmail.com" and password ""
	#And   Click on login button
	#Then  Proper error must be displayed and promt to login again
	
	#Simple login with empty username and correct password
	#Scenario:Log-in with empty username and correct password
	#Given Open the browser
	#When  Enter the URL "http://practice.automationtesting.in/"
	#And   Click on My Account Menu
	#And   Enter incorrect username "" and password "taranayan1420"
	#And   Click on login button
	#Then  Proper error must be displayed and promt to login again
	
	#Simple login with empty username and empty password
	#Scenario:Log-in with empty username and empty password
	#Given Open the browser
	#When  Enter the URL "http://practice.automationtesting.in/"
	#And   Click on My Account Menu
	#And   Enter incorrect username "" and password ""
	#And   Click on login button
	#Then  Proper error must be displayed and promt to login again


#Scenario:Verify Logout feature
#Given  Open the browser
#When   Enter the URL "http://practice.automationtesting.in/"
#And   Click on My Account Menu
#And   Enter registered username "archu.sonawane@gmail.com" and password "taranayan1420"
#And   Click on login button
#And   User must successfully login to the web page
#And   Click on Logout
#Then  After clicking logout,User must successfully come out of the website
	
#Scenario:Verify My Account-Dashboard feature
#Given Open the browser
#When  Enter the URL "http://practice.automationtesting.in/"
#And   Click on My Account Menu
#And   Enter registered username "archu.sonawane@gmail.com" and password "taranayan1420"
#And   Click on login button
#And   User must successfully login to the web page
#And   Click on Dashboard
#Then  User must view Dashboard of the website

#Scenario:Verify My Account-Order feature
#Given Open the browser
#When  Enter the URL "http://practice.automationtesting.in/"
#And   Click on My Account Menu
#And   Enter registered username "archu.sonawane@gmail.com" and password "taranayan1420"
#And   Click on login button
#And   User must successfully login to the web page
#And   Click on Orders
#Then  User must view all their orders after clicking orders link

#Scenario:Verify My Account-Order Details feature
#Given Open the browser
#When  Enter the URL "http://practice.automationtesting.in/"
#And   Click on My Account Menu
#And   Enter registered username "archu.sonawane@gmail.com" and password "taranayan1420"
#And   Click on login button
#And   User must successfully login to the web page
#And   Click on Orders
#And   Click on View button
#Then  User must view his orders details,customer details and billing details after clicking orders link

#Scenario:Verify My Account-Address feature
#Given Open the browser
#When  Enter the URL "http://practice.automationtesting.in/"
#And   Click on My Account Menu
#And   Enter registered username "archu.sonawane@gmail.com" and password "taranayan1420"
#And   Click on login button
#And   User must successfully login to the web page
#And   Click on Address
#Then  User must view his billing address and shipping address after clicking Address link

#Scenario:Verify My Account-Edit Address functionality
#Given Open the browser
#When  Enter the URL "http://practice.automationtesting.in/"
#And   Click on My Account Menu
#And   Enter registered username "archu.sonawane@gmail.com" and password "taranayan1420"
#And   Click on login button
#And   User must successfully login to the web page
#And   Click on Address
#And   Click on edit Billing Address
#And   Click on edit Shipping Address
#Then  User details must be updated

#Scenario:Verify Shop-Filter by product category functionality
#Given Open the browser
#When  Enter the URL "http://practice.automationtesting.in/"
#And   Click on Shop Menu
#And   Click on any of the product links available in product category
#Then  Now user can view that particular product

Scenario:Verify Shop-Filter by price category functionality
Given Open the browser
When  Enter the URL "http://practice.automationtesting.in/"
And   Click on Shop Menu
And   Adjust the filter by price between 246 and 400 rs
And   Click on filter button
Then  User can view books only between 246 to 400 rs price











		