
Feature: To Check Online Doctor Consult Page

  Scenario Outline: Verify Login functionality with Valid registered number
   Given Chrome is opened and Apollo247 app is opened
   When User clicks on Consult Section
   Then User navigates on the Consult Page
   When  User clicks on popular cities 
   Then User naviagtes to Doctors Details Page
   When User Clicks on the Book Hospital Visit button
   And  User enters contact number
   And  User clicks on login button
   Then It shows Booking Details option with Payment checkout page

 

    Examples:

      | Contact Number |

      | 8700042264 |
      
      

   Scenario Outline: Verify Login functionality with Invalid registered number
   Given Chrome is opened and Apollo247 app is opened
   When User clicks on Consult Section
   Then User navigates on the Consult Page
   When  User clicks on popular cities 
   Then User naviagtes to Doctors Details Page
   When User Clicks on the Book Hospital Visit button
   And  User enters contact number
   And  User clicks on login button
   Then It shows This seems like a wrong number

 

    Examples:

      | Contact Number  |

      | 000000000 |
      | 030304040 |

      


