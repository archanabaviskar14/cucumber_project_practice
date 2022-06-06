Feature:Hooks in cucumber

Scenario:Adding new customer
Given User is on add customer page
When  User fills the cutomer details
Then  customer is added

Scenario:Edit customer
Given User is on edit customer page
When  User updates the contact details
Then  customer is updated

Scenario:Delete customer
Given User is on delete customer page
When  User delete the customer
Then  customer is deleted