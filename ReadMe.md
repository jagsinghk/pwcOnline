
**Requires to have Java/JDK set up**

**Requires to have Maven set up** 

**To run all scenarios:** 

mvn clean 
mvn test

**To run all scenarios:** 

mvn test 

**To run specific tests**

mvn test -Dcucumber.options="--tags @CarousleFeatures"


Functional Test Improvements 

1. Carousle Feature can be improved to check for article names (Previous articles)
2. Contact Us Feature checks for all headings but can check for links as well. 

Framework Improvement: (Tried to keep simple and stick to times)

1. Pass URL as paramater to support multiple env runs 
2. Browser Support 





