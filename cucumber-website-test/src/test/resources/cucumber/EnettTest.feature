@Enett_1
Feature: Enett webpage Test 1

Scenario Outline: Enett webpage changes language successfully

Given user opens Enett main page
When user changes language to "<another>"
Then The page has been changed accordingly to the "<new>"

Examples:
| another | new     |
| English | English |
| Deutsch | Deutsch |
| 日本語   | 日本語   |
| Italiano| Italiano|

Scenario: What are VANs?

Given user opens Enett main page
When user clicks "What are VANs?"
Then user gets the description of VANs - "Virtual Account Numbers"
When user clicks "Watch Video"
Then the video is played



