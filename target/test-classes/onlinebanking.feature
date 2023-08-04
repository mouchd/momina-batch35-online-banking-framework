@Smoke @Regression
Feature: Login function for Smarttech online Banking
Description:

@Positive_Scenario @TC_LP-18
Scenario: Login function test with valid credential.
Given Open the Browser
And Go to Application URL
When valid user name
And valid password
And login
Then check logout button there or not

@Negative_Scenerio @TC_LP-19
Scenario: Login function test with invalid credential.

Given Open the Browser
And Go to Application URL
Given put invalid username
When put invalid password
And click login
And Accept Alert
Then Logout button should not visible



