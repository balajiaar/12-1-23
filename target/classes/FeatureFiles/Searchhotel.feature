Feature: adactin loginn functionality
Scenario Outline: login
Given user should be in login page
When user should enter the "<username>" and "<password>"
And user should click login bun
Then user should receive sucess msg
And user sholud check all fields by searchhotel "<location>","<hotels>","<roomtype>","<noofrooms>","<checkindate>","<checkoutdate>","<adulrperroom>","<childperroom>"
Then user should click the search button and receive the select hotel message
Examples:
|username |password     |location|hotels     |rommtype|noofrooms|checkindate|checkoutdate|adultperroom|childperroom|
|Naveenaso| Naveenmech1!|Syndey  |Hotel creek|Standard|2-Two      |11/01/2023 |12/01/2023  |1-One       |1-One       |