#Project Notes : All about testing

## Date July 17, 2025

# What is testing
- Testing is the process of verifying that an application works as expected and is free of bugs.
- It ensures :
    - Reliability
    - Quality
    - Performance
- Testing ensures software quality by :
    - Finding bugs : Automated tests catch errors early
    - Verifying functionality : Confirms that features work as intended
    - Preventing regressions : These tests run after every change to ensure new code doesn't break the existing features.
    - Checking compatibility : To ensure consistent behaviors, tests are made to run on different browsers and platforms.
    - Improving reliability : Frequent testing increases confidence that the software will work consistently even under different conditiond or over time.

## 7 Testing Principles
- Testing shows the presence of defects, not their absence.However, it doesn't ensures that it is 100% bug-free.Reduced risk != Elimination of bugs.

- Exhaustive testing is impossible because testing all the combinations of inputs and paths is not feasible. So, we test what matters more.Like we can do priority-based or risk-based testing.

- Early testing saves time and money because catching the bugs in requirement/design phase is cheaper than fixing them later in production phase.

- Defects cluster together so it is highly possible that small number of modules often contain most of the defects (80:20cPareto Principle).We can focus more on unstable/high risk areas.Frequent bug areas deserve deeper regression tests.

- Beware of Pesticide Paradox because repeating the same tests will no longer find the new bugs.That is the reason that tests need to be reviewed and updated on regular basis.

- Testing is context-dependent so no one size fits all.Testing strategy should depend on the type of application like safety-critical softwares need stricter testing than a social media app.

- Absence of errors is a fallacy.Testing should verify both correctness and relevance to the business goals.A bug-free system is useless if it doesnot meet user needs. Functioning != Fit for purpose.

## Types of Testing
- Based on development phase :
    1. Unit Testing : Tests individual functions or methods
    2. Integration Testing : Tests interaction between modules.Ensures dataflow between components works.
    3. System Testing : End to end testing of the entire application.Validates complete system against the requirements.
    4. Acceptance Testing : Done by clients or QA to verify system meets business needs.Includes UAT,Alpha,Beta.
- Based on purpose :
    1. Functional Testing : Tests what the system does.Focuses on business logic and features.
        - Smoke Testing : 
            - Broad and shallow;User-manual
            - are my major functions working after I deploy a new build?
            - is the app even stable enough to test further?
            - focus is on core modules,must-have features,basic integrations.
            - Suppose our team pushed a new build.I will check :
                - login/signup
                - homepage loads
                - product listing appears
                - add to cart works
                - checkout page opens
        - Sanity Testing :
            - Narrow and shallow;User-manual
            - after a minor fix, are my specific functionalities working?
            - I made a change and I have to only test modules related to that change.
            - I fixed a bug in Password reset feature, I will check :
                - the password reset page loads
                - email gets sent
                - reset link works
                - can I set a new password
        - Regression Testing :
            - Broad and deep;Heavily automated
            - Did we break anything?
            - after code change, previously working functionalities work or not?
            - I added a new "Save for later" button.I will test "Save for later" button. For Retest,
                - add to cart
                - remove from cart
                - checkout
                - cart total calculations
                - product detail page
        - Exploratory Testing :
            - Testers explore the application freely, using their creativity and domain-knowledge(no scripts).
            - Finds critical defects that script-testing might miss.
            - Tests beyond the boundaries of the test cases.
            - Testing Chat/messaging app:
                - Sends a message with only emojis
                - Copy-paste entire webpage
                - Block a user and check if blocked person can still message
                - Try sending message in airplane mode and then go online.
                - drag and drop a file to a chat;Does it handle unknown file types?
    2. Non-Functional Testing : Tests how system behaves.
        - Performance Testing
        - Security Testing
        - Usability Testing
        - Compatibility Testing
- Based on automation :
    1. Manual Testing :
        - Performed by human-testers.
        - Best for exploratory or Ad-hoc scenarios.
    2. Automation Testing :
        - Performed by scripts/tools.
        - Good for repetitive tasks.

## About Selenium
- Selenium is an open-source automation tool for web browsers.It helps by automating browser actions,running tests quickliy and repeatedly.It supports muliple browsers and integrates with different test frameworks like JUnit and TestNG.
- It is a Functional testing tool to test web-based applications.
- There are four components of Selenium :
    - Selenium IDE : It is a record and playback tool(a browser extension).It is good for beginners for quick prototyping.
    * It lacks database support and dynamic element handling.
    - Selenium RC : It is an older component for controlling browsers remotely (replaced by WebDriver)
    - Selenium WebDriver : It is the core tool for automating browser actions. It interacts directly with browsers
    - Selenium Grid : Allows running tests on multiple machines and browsers in parallel for faster and distributed testing.

## History of Selenium
- Selenium Core (Jason Huggins, 2004) : The original JavaScript based testing tool
- Selenium RC (Paul Hammant, 2005) : Added a server to bypass browser  security restrictions.
*Selenium RC bypassed the same origin policy by acting as a proxy server between the browser and the web application. The same origin policy is a browser security feature that restricts scripts from interacting with content from a different domain. Selenium RC’s proxy injected JavaScript into the browser, allowing it to automate actions across different domains, which would normally be blocked by the browser’s security rules. This workaround is one reason RC was used before WebDriver, which interacts with browsers at a lower level and does not need to bypass the same origin policy.WebDriver allows JavaScript injection on the current page, but it cannot break browser security rules to access other domains like Selenium RC’s proxy could.*
- Selenium IDE (Shinya Kasatani, 2006) : Firefox extension for recording and playing back tests.
- Selenium Grid (Patrick Lightboody, 2008) : Enabled parallel test execution across multiple machines.
- Selenium WebDriver (Simon Stewart, 2006(CONCEPT)->2009) : Direct browser automation , became the main Selenium tool after merging.

## WebDriver over RC
- Direct browser control : WebDriver interacts with browsers natively, making tests faster and more reliable.
- Supports modern browsers : WebDriver works with the latest browsers and standards.
- No need for a seperate server : Unlike RC, WebDriver doesnot require a proxy server to run tests.
- Better API : WebDriver provides a simpler, more intuitive API for writing tests.
- Handles dynamic webpages : WebDriver can work with AJAX and JavaScript-heavy applications more effectively.
- Improved performance : Tests run faster and with fewer compatibility issues.
