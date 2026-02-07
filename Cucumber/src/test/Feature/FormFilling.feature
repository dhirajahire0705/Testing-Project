Feature: Form Filling 

Scenario: Form Filling with Credential
Given User open Form Filling website as "https://demoqa.com/automation-practice-form"
When User enter first name "Ashish"
And Enter last name "Suryawanshi"
And Enter email "sonwanep108@gmail.com"
And User click on male radio button
And Enter Mobile no. as "9176543210"
And Select Date of Birth
And Enter subject as "Customer Detail"
And Select hobbies checkbox
And Enter Address "Plot no. 6 Nagpur"
And Select State as "Haryana" and City as "Karnal"
Then click on Submit Button
