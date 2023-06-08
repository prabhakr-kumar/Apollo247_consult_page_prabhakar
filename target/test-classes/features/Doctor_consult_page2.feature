
Feature: To Check Online Doctor Consult Page

  #Scenario Outline: Verify Login functionality with Valid registered number
   #Given Chrome is opened and Apollo247 app is opened
   #When User clicks on Consult Section
   #Then User navigates on the Consult Page
   #When  User clicks on popular cities
    #Then Doctors detail fields are visible to user
   #When User clicks on sort by Field 
   #And User selects Price- Low to High
   #Then Application sorts the doctors list based on price
   #When User Clicks on the Book Hospital Visit button
   #And  User enters contact number "8700042264"
   #Then User click on arrow button
   #Then User enters OTP and clicks clicks on arrow button
   #Then It shows Booking Details option with Payment checkout page

   

   Scenario Outline: Verify Login functionality with Invalid registered number
   Given Chrome is opened and Apollo247 app is opened
   When User clicks on Consult Section
   Then User navigates on the Consult Page
   When  User clicks on popular cities 
   Then Doctors detail fields are visible to user
   When User clicks on sort by Field 
   And User selects Price- Low to High
   Then Application sorts the doctors list based on price
   When User Clicks on the Book Hospital Visit button
   And  User enters contact number "8700042264"
   Then User click on arrow button
   Then User enters Wrong OTP "<otp>" and clicks on arrow button
   Then User is not able to login sucessfully
   
   Examples:  
   |otp|
   |000000|



      


