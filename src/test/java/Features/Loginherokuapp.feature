#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Herokuapp Login
  

  @tag1
  Scenario: Login browser navigate to dropdown option
    Given Open the browser 
    And Enter the URL "http://the-internet.herokuapp.com/"
    When Click on dropdown Menu 
    And select a value from the dropdown 
    And Navigate to Back Page
    Then select Checkboxes Value
   # And Close the Browser
   # Then User must successfully login to the web page
   # And check more outcomes

  @tag2
  Scenario Outline: Login
    Given Open the browser 
    And Enter the URL "http://the-internet.herokuapp.com/"
    When Click on dropdown Menu 
    And select options option1 "<OPTION1>"
    And select options option2 "<OPTION2>" 
    And Navigate back to browser
    Then select Checkboxes Value  	
     Examples: 
      | OPTION1 |  | OPTION2|
      |Option 1 |  | Option 2|
          
   
  
      
 
  
   @tag3
  Scenario: Login browser and Upload the File
    Given Open the browser 
    And Enter the URL "http://the-internet.herokuapp.com/"
    When Click on file Upload upload a file
    Then File Uploaded Sucessfully
    
 
 @Datatable
 Scenario: Log-in 
 Given Open the browser 
 When Enter the URL "http://the-internet.herokuapp.com/" 
 And select Checkboxes Value 
And click Checkboxes Link
# | Checkboxes |
 Then Navigate back to browser
# And Click on login button 
# Then User must successfully login to the web page   
