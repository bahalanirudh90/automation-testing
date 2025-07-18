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
        - Performance Testing :
            - Tests how the system performs under a specific workload.
            - Focuses on speed, scalability, stability, and responsiveness.
            - Example: Checking how the application responds when 1,000 users log in simultaneously (Load Testing) or finding the breaking point by increasing users until it fails (Stress Testing).
        - Security Testing :
            - Uncovers vulnerabilities and ensures the application is protected from threats.
            - Focuses on data confidentiality, integrity, and authentication.
            - Example: Simulating an attack to find security holes (Penetration Testing) or checking for common vulnerabilities like SQL Injection.
        - Usability Testing :
            - Evaluates how easy and user-friendly the application is.
            - Focuses on the user's experience, ease of navigation, and clarity of the interface.
            - Example: Observing a new user trying to complete a task without instructions to see where they struggle.
        - Compatibility Testing :
            - Ensures the software works correctly across different environments.
            - Focuses on different browsers, operating systems, devices, and network conditions.
            - Example: Verifying that the website looks and functions the same on Chrome, Firefox, and Safari.
        - Accessibility Testing (a11y) :
            - Ensures the application is usable by people with disabilities.
            - Focuses on compliance with standards like WCAG, screen reader compatibility, and keyboard navigation.
            - Example: Verifying that all images have `alt` text and that a user can navigate the entire site using only the tab key.
        - Reliability Testing :
            - Measures the software's ability to perform without failure for a specified time in a given environment.
            - Focuses on stability and robustness over extended periods.
            - Example: Running an automated test suite continuously for 24 hours to detect memory leaks or crashes.
- Based on automation :
    1. Manual Testing :
        - Performed by human-testers.
        - Best for exploratory or Ad-hoc scenarios.
    2. Automation Testing :
        - Performed by scripts/tools.
        - Good for repetitive tasks.

- Based on Code Visibility :
    1. White-Box Testing :
        - Tests the internal code structure, logic, and paths.
        - Focuses on code coverage, control flow, and data flow.
        - Example: A developer writes a unit test to ensure every `if-else` branch in a function is executed.
    2. Black-Box Testing :
        - Tests the application's functionality without seeing the internal code.
        - Focuses on inputs and outputs, treating the system as a "black box."
        - Example: Testing a login form by entering valid and invalid credentials and checking the outcome, without knowing how the validation is coded.
    3. Grey-Box Testing :
        - A mix of White-Box and Black-Box; the tester has partial knowledge of the internal system.
        - Focuses on testing interactions between components with some understanding of the underlying data structures or algorithms.
        - Example: An integration test where the tester knows how the database is structured to create specific test data, but tests the application through the UI.

## Software Development Life Cycle (SDLC)
- The SDLC is a structured process that defines the tasks performed at each step in the software development process. It provides a framework for planning, creating, testing, and deploying high-quality software.

### Key Phases of SDLC
1.  **Requirement Gathering and Analysis**: Collecting requirements from stakeholders to understand what the system should do.
2.  **Design**: Creating the system architecture and software design based on the requirements.
3.  **Implementation or Coding**: Writing the actual code for the software.
4.  **Testing**: Verifying and validating that the software is bug-free and meets the requirements.
5.  **Deployment**: Releasing the software to the production environment for users.
6.  **Maintenance**: Making modifications to the software after release to fix bugs, improve performance, or add features.

### Popular SDLC Models
- Different models are used based on the project's complexity, scope, and requirements.
    - **Waterfall Model**:
        - A linear, sequential approach where each phase must be fully completed before the next begins.
        - **Pros**: Simple and easy to manage.
        - **Cons**: Inflexible; no room for changing requirements once a phase is complete.
        - **Best for**: Small projects with clear, well-documented, and fixed requirements.
    - **V-Model (Verification & Validation Model)**:
        - An extension of the Waterfall model where a testing phase is planned in parallel with each development phase (e.g., unit testing is planned with the coding phase).
        - **Pros**: Emphasizes early test planning, which helps find defects at an early stage.
        - **Cons**: Still rigid and not flexible for requirement changes.
    - **Iterative Model**:
        - The development process is broken into small, repeated cycles (iterations). A new, working version of the software is produced at the end of each iteration.
        - **Pros**: Produces a working version early in the cycle; more flexible than Waterfall.
        - **Cons**: Can be complex to manage all the iterations.
    - **Agile Model**:
        - An iterative and incremental approach that emphasizes flexibility, customer collaboration, and rapid delivery of working software in small increments (sprints).
        - **Pros**: Highly flexible and adaptive to changing requirements; promotes strong teamwork.
        - **Cons**: Less predictable in terms of final deadlines and costs.
        - **Examples**: Scrum, Kanban. This is the most widely used model in the industry today.
    - **Spiral Model**:
        - Combines elements of the iterative model with the risk analysis of the Waterfall model. It's used for large, complex, and high-risk projects.
        - **Pros**: Excellent for risk management.
        - **Cons**: Very complex and can be expensive.

## Software Testing Life Cycle (STLC)
- A systematic process to ensure software quality. It defines the steps to be performed in a specific order during testing.
    1. **Requirement Analysis**:
        - The QA team studies the requirements from a testing perspective.
        - Identifies testable requirements and clarifies any ambiguities.
        - **Output**: Requirement Traceability Matrix (RTM).
    2. **Test Planning**:
        - The Test Lead or Manager creates the Test Plan.
        - Defines the scope, objectives, resources, and schedule of testing.
        - **Output**: Test Plan and Test Estimation documents.
    3. **Test Case Development**:
        - Test cases and test scripts are created based on the requirements.
        - Test data is prepared.
        - **Output**: Test Cases, Test Scripts, and Test Data.
    4. **Test Environment Setup**:
        - The necessary hardware, software, and network configurations are set up.
        - A smoke test is performed on the build to ensure the environment is ready.
        - **Output**: A ready test environment with test data.
    5. **Test Execution**:
        - Testers execute the test cases based on the test plan.
        - Bugs are reported and tracked, and retesting is done once bugs are fixed.
        - **Output**: Test execution results and defect reports.
    6. **Test Cycle Closure**:
        - The testing process is evaluated against the defined objectives.
        - A Test Closure Report is prepared, summarizing the testing effort, outcomes, and lessons learned.
        - **Output**: Test Closure Report.

## The Bug Life Cycle
- This cycle describes the journey of a defect from its discovery to its resolution. The exact states can vary between teams, but this is a common flow, often managed in tools like Jira.
    1.  **New**: A tester finds a bug and reports it with detailed information (steps to reproduce, screenshots, logs). The bug is now in the system.
    2.  **Assigned**: The project lead or manager assigns the bug to a developer for analysis.
    3.  **Open**: The developer accepts the bug and starts working on a fix.
    4.  **Fixed**: The developer has implemented a fix and deployed it to the test environment.
    5.  **Pending Retest**: The bug is assigned back to the tester to verify the fix.
    6.  **Retest**: The tester performs retesting to confirm that the original bug has been fixed.
    7.  **Verified**: The tester confirms the fix works as expected.
    8.  **Closed**: The bug is officially considered resolved.
    - **Other Possible States**:
        - **Reopened**: If the tester finds that the fix did not work, the bug goes back to the developer.
        - **Rejected/Invalid**: The developer determines that the reported issue is not a valid bug (e.g., it's intended behavior or a misunderstanding of the requirements).
        - **Deferred**: The bug is valid, but the fix is postponed for a future release due to low priority or other business reasons.
        - **Duplicate**: The bug has already been reported by someone else.

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

## Automation Testing Frameworks
- A testing framework provides a set of guidelines, rules, and tools for creating and designing test cases. It helps standardize the testing process and makes test automation more efficient and reusable.
- Popular frameworks for Java include JUnit and TestNG, which are often used with Selenium.

### JUnit
- The most popular and widely-used unit testing framework for Java.
- **Key Features**:
    - **Annotations**: Uses annotations like `@Test`, `@BeforeEach`, `@AfterEach` to identify and structure test methods.
    - **Assertions**: Provides `Assertions` methods (e.g., `assertEquals()`, `assertTrue()`) to verify test outcomes.
    - **Test Runners**: Manages the execution of test cases.
- **Best for**: Unit testing, where simplicity and ease of use are important.

### TestNG
- A more powerful testing framework inspired by JUnit, but with additional features designed for broader testing needs (unit, functional, integration, end-to-end). "NG" stands for "Next Generation".
- **Key Features**:
    - **Advanced Annotations**: Includes more granular setup/teardown annotations like `@BeforeSuite`, `@BeforeTest`, `@BeforeClass`, and `@BeforeMethod`.
    - **Parallel Execution**: Natively supports running tests in parallel, which significantly speeds up the test suite.
    - **Test Dependencies**: Allows you to define dependencies between test methods (e.g., a test runs only if another one succeeds).
    - **Parameterization**: Easily pass parameters to test methods from an XML configuration file (`testng.xml`).
    - **Grouping**: Organize tests into groups (e.g., "smoke", "regression") and run specific groups.
- **Best for**: Complex testing scenarios, integration testing, and end-to-end testing where features like parallel execution and advanced test configuration are crucial.

### JUnit vs. TestNG Annotations
- Annotations are metadata that you add to your code to tell the framework how to run your tests. Here’s a comparison of the most common annotations in JUnit 5 and TestNG.

| Annotation Purpose                                       | JUnit 5 (`org.junit.jupiter.api.*`) | TestNG (`org.testng.annotations.*`)                               |
| -------------------------------------------------------- | ----------------------------------- | ----------------------------------------------------------------- |
| Marks a method as a test case                            | `@Test`                             | `@Test`                                                           |
| Runs **before each** test method                         | `@BeforeEach`                       | `@BeforeMethod`                                                   |
| Runs **after each** test method                          | `@AfterEach`                        | `@AfterMethod`                                                    |
| Runs once **before all** tests in the class              | `@BeforeAll` (must be static)       | `@BeforeClass`                                                    |
| Runs once **after all** tests in the class               | `@AfterAll` (must be static)        | `@AfterClass`                                                     |
| Runs before any test in a `<test>` tag in `testng.xml`   | *N/A*                               | `@BeforeTest`                                                     |
| Runs after all tests in a `<test>` tag in `testng.xml`   | *N/A*                               | `@AfterTest`                                                      |
| Runs once **before all** tests in the suite              | *N/A*                               | `@BeforeSuite`                                                    |
| Runs once **after all** tests in the suite               | *N/A*                               | `@AfterSuite`                                                     |
| Disables a test method or class                          | `@Disabled`                         | `@Test(enabled = false)`                                          |
| Provides data for parameterized tests                    | `@ParameterizedTest` (with sources) | `@DataProvider`                                                   |

As you can see, TestNG offers a more granular test execution lifecycle with Suite and Test-level annotations, which is why it's often preferred for complex integration and end-to-end test suites.

### Deep Dive: TestNG's @DataProvider
- The `@DataProvider` annotation is used to run the same test method multiple times with different data sets. This approach is called **Data-Driven Testing**.

- **How it works:**
    1.  You create a method and annotate it with `@DataProvider(name = "your-provider-name")`.
    2.  This method returns a 2D object array (`Object[][]`), where each inner array (`Object[]`) represents one set of test data for your test method.
    3.  You create a test method and link it to the data provider using `@Test(dataProvider = "your-provider-name")`.
    4.  The parameters of your test method will receive the data from the provider. TestNG will run the test once for each inner array in the data set.

- **When to use it?**
    - When you need to test the same functionality with many different inputs.
    - **Examples**:
        - Testing a login form with multiple combinations of valid and invalid usernames and passwords.
        - Testing a search function with various search terms.
        - Testing a calculation function with different input numbers and expected results.

- **Example:**
    - Here's how you would test a login feature with two different sets of credentials.

    ```java
    import org.testng.annotations.DataProvider;
    import org.testng.annotations.Test;
    import org.testng.Assert;

    public class LoginTest {

        // 1. Create the Data Provider method
        @DataProvider(name = "loginCredentials")
        public Object[][] provideLoginData() {
            return new Object[][] {
                { "user@example.com", "password123", true },  // Case 1: Valid credentials
                { "invaliduser", "wrongpassword", false }     // Case 2: Invalid credentials
            };
        }

        // 2. Create the Test method and link it to the Data Provider
        @Test(dataProvider = "loginCredentials")
        public void testLogin(String username, String password, boolean expectedResult) {
            System.out.println("Testing with Username: " + username + ", Password: " + password);
            // In a real test, you would use Selenium to perform the login and get the actual result.
            boolean actualResult = "user@example.com".equals(username) && "password123".equals(password);
            Assert.assertEquals(actualResult, expectedResult);
        }
    }
    ```
    - In this example, the `testLogin` method will be executed **twice**:
        1.  First run: `username` = "user@example.com", `password` = "password123", `expectedResult` = `true`.
        2.  Second run: `username` = "invaliduser", `password` = "wrongpassword", `expectedResult` = `false`.

## Types of Automation Frameworks
- Beyond specific tools like JUnit or TestNG, automation frameworks are designed based on different strategies. Here are the most common types:

### 1. Linear Scripting Framework (Record and Playback)
- **What it is**: The simplest framework where test steps are recorded and played back sequentially.
- **Pros**: Very fast to create initial tests. No programming knowledge is needed.
- **Cons**: Not scalable. Scripts are not reusable, and any small UI change breaks the test.
- **Best for**: Simple, one-off tasks or learning automation concepts.
- **Example**: Using Selenium IDE to record a login sequence.

### 2. Modular Driven Framework
- **What it is**: The application is broken down into smaller, independent modules (or functions). A separate, reusable test script is created for each module.
- **Pros**: High reusability. Easier to maintain since a change in one module only requires updating that specific script.
- **Cons**: Requires more planning and setup time.
- **Example**: Creating a `login()` function and a `logout()` function that can be called by multiple test cases.

### 3. Data-Driven Framework
- **What it is**: Test logic is separated from the test data. The same test script can be run multiple times with different data inputs.
- **How it works**: Test data is stored in external files like Excel, CSV, or a database. The framework reads the data and passes it to the test scripts.
- **Pros**: Reduces the number of scripts. Easy to add new test cases by just adding a new row of data.
- **Example**: Using TestNG's `@DataProvider` to read login credentials from a CSV file.

### 4. Keyword-Driven Framework
- **What it is**: An application-independent framework that uses keywords (action words) to describe the actions to be performed.
- **How it works**: Keywords like `login`, `clickButton`, and `verifyText` are defined in a library. Testers (even non-technical ones) can create test cases by combining these keywords in a table (like an Excel sheet).
- **Pros**: Highly reusable. Easy for non-programmers to write tests.
- **Cons**: High initial setup complexity.

### 5. Behavior-Driven Development (BDD) Framework
- **What it is**: A framework that focuses on the application's behavior from the user's perspective. It encourages collaboration between developers, QAs, and business analysts.
- **How it works**: Test cases are written in a natural, human-readable language called Gherkin, using `Given-When-Then` syntax. These plain-text feature files are then linked to the underlying test code (called step definitions).
- **Pros**: Tests are easy to understand for everyone, promoting a shared understanding of requirements.
- **Popular Tools**: Cucumber, JBehave, SpecFlow.
- **Example (`login.feature` file)**:
    ```gherkin
    Feature: User Login
      Scenario: Successful login with valid credentials
        Given I am on the login page
        When I enter "user@example.com" and "password123"
        Then I should be redirected to the dashboard
    ```

### Deep Dive: BDD with Cucumber and Gherkin
- **What is Cucumber?**
    - Cucumber is a popular BDD tool that allows you to write tests in a human-readable format called Gherkin. It acts as a bridge between the business-facing feature specifications and the underlying test automation code.

- **What is Gherkin?**
    - Gherkin is the structured, plain-text language used to write test scenarios. Its purpose is to ensure that test cases are documented in a way that can be easily understood by non-technical stakeholders.

- **Key Gherkin Keywords:**
    - `Feature`: A high-level description of a software feature.
    - `Scenario`: A specific example illustrating a business rule.
    - `Given`: Sets up the initial state or precondition.
    - `When`: Describes an action performed by the user.
    - `Then`: Specifies the expected outcome or result.
    - `And`, `But`: Used to add more conditions to any `Given`, `When`, or `Then` step.
    - `Background`: A set of steps that run before *each* scenario in a feature file (e.g., logging in).

- **How it Connects: Feature Files and Step Definitions**
    - **1. Feature File (`.feature`)**: You write your test scenarios here using Gherkin syntax.
    - **2. Step Definition File (`.java`)**: This Java file contains the implementation code for each Gherkin step. Cucumber uses annotations (`@Given`, `@When`, `@Then`) to link the plain-text steps from the feature file to the Java methods that execute the browser actions.

- **Example:**
    - **`login.feature` file:**
    ```gherkin
    Feature: User Login
      Scenario: Successful login with valid credentials
        Given I am on the login page
        When I enter "user@example.com" in the username field
        And I enter "password123" in the password field
        And I click the login button
        Then I should see the dashboard page
    ```
    - **`LoginStepDefinitions.java` file:**
    ```java
    import io.cucumber.java.en.*;

    public class LoginStepDefinitions {
        // WebDriver setup would be here...

        @Given("I am on the login page")
        public void i_am_on_the_login_page() { /* Selenium code to navigate to the login URL */ }

        @When("I enter {string} in the username field")
        public void i_enter_username(String username) { /* Selenium code to find username field and type */ }

        @When("I enter {string} in the password field")
        public void i_enter_password(String password) { /* Selenium code to find password field and type */ }

        @When("I click the login button")
        public void i_click_the_login_button() { /* Selenium code to click the login button */ }

        @Then("I should see the dashboard page")
        public void i_should_see_the_dashboard_page() { /* Selenium code to verify dashboard is visible */ }
    }
    ```

### 6. Hybrid Framework
- **What it is**: A combination of two or more of the above frameworks to leverage their respective strengths. This is the most common approach in modern test automation.
- **Pros**: Very flexible and scalable.
- **Cons**: Can be complex to design and maintain.
- **Example**: A framework that uses Cucumber (BDD) for feature files, reads test data from Excel (Data-Driven), and uses modular functions for its step definitions (Modular).

## Common Design Patterns in Automation

### Page Object Model (POM)
- **What it is**: A design pattern, not a framework itself, used to create an object repository for the UI elements of an application. It is the most widely used pattern for enhancing test maintenance and reducing code duplication.

- **How it works**:
    - **Page Classes**: For each page of your application (e.g., Login Page, Home Page), you create a corresponding Java class.
    - **Element Locators**: This class holds all the locators (e.g., `By.id("username")`) for the web elements on that specific page.
    - **Page Methods**: The class also contains public methods that represent the services or actions the page offers (e.g., `login(String user, String pass)`). The test scripts will call these methods, not interact with the elements directly.

- **Why use it? (Pros)**:
    - **Maintainability**: If a UI element's locator changes (e.g., an ID is updated), you only need to fix it in one place: the corresponding Page Class. Without POM, you would have to find and update it in every single test that uses it.
    - **Readability**: Test scripts become clean and easy to understand. They describe the *intent* of the test, not the implementation details. For example, `loginPage.performLogin("user", "pass")` is much clearer than a series of `findElement` and `sendKeys` commands.
    - **Reusability**: You can reuse the page methods across multiple test cases, which eliminates duplicate code.

- **Example Structure**:
    - **`LoginPage.java` (The Page Class)**
    ```java
    public class LoginPage {
        private WebDriver driver;

        // Locators
        private By usernameField = By.id("username");
        private By passwordField = By.id("password");
        private By loginButton = By.id("login-button");

        // Constructor, methods...
    }
    ```
    - **`LoginTest.java` (The Test Class)**
    ```java
    public class LoginTest {
        // WebDriver and Page Objects would be initialized in a @BeforeEach method
        @Test
        public void testSuccessfulLogin() {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.enterUsername("standard_user");
            loginPage.enterPassword("secret_sauce");
            DashboardPage dashboardPage = loginPage.clickLoginButton();
            Assert.assertTrue(dashboardPage.isUserLoggedIn());
        }
        // WebDriver would be closed in an @AfterEach method
    }
    ```

## Core Selenium WebDriver Concepts

### 1. Selenium Locators
- Locators are the core of Selenium. They are the mechanism by which you find and interact with HTML elements on a web page.
- **8 Types of Locators**:
    1.  **`id`**: The most reliable and fastest locator. IDs should be unique on a page. `By.id("login-button")`
    2.  **`name`**: Finds elements by their `name` attribute. `By.name("username")`
    3.  **`className`**: Finds elements by their `class` attribute. Be careful if a class is used on multiple elements. `By.className("input-error")`
    4.  **`tagName`**: Finds elements by their HTML tag (e.g., `<a>`, `<div>`, `<input>`). `By.tagName("a")`
    5.  **`linkText`**: Finds an anchor tag (`<a>`) by its exact visible text. `By.linkText("Forgot Password?")`
    6.  **`partialLinkText`**: Finds an anchor tag (`<a>`) by a partial match of its visible text. `By.partialLinkText("Forgot")`
    7.  **`cssSelector`**: A powerful and fast locator that uses CSS selector syntax to find elements. Often the best choice when an ID is not available. `By.cssSelector("input#username")`
    8.  **`xpath`**: The most flexible locator, which can navigate the entire HTML DOM. It can be slower than CSS selectors and should be used when no other locator works. `By.xpath("//input[@id='username']")`

### 2. Finding Elements: `findElement` vs `findElements`
- **`findElement(By locator)`**:
    - Finds the **first** web element that matches the locator.
    - Returns a single `WebElement` object.
    - If no element is found, it throws a `NoSuchElementException`.
- **`findElements(By locator)`**:
    - Finds **all** web elements that match the locator.
    - Returns a `List<WebElement>`.
    - If no elements are found, it returns an **empty list** (it does not throw an exception).

### 3. Handling Dynamic Elements with Waits
- Modern web pages are dynamic. Elements may take time to load, appear, or become clickable. Waits are essential to prevent `NoSuchElementException` and create stable, reliable tests.
- **Implicit Wait**:
    - Tells WebDriver to wait for a certain amount of time *before* throwing an exception if an element is not immediately found.
    - It's a global setting, applied to all `findElement` calls for the entire session.
    - **Usage**: `driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));`
    - **Con**: Can slow down tests if used with a long timeout, as it will wait for the full duration for elements that truly don't exist.
- **Explicit Wait**:
    - The preferred approach. It waits for a specific *condition* to be met before proceeding. It's applied only where you define it.
    - Uses the `WebDriverWait` and `ExpectedConditions` classes.
    - **Usage**:
        ```java
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("my-element")));
        ```
    - **Pro**: More intelligent and flexible. You can wait for visibility, clickability, text to be present, etc.

### 4. Common WebDriver Commands
- **`driver.get("URL")`**: Navigates the browser to a specific URL.
- **`driver.getTitle()`**: Gets the title of the current page.
- **`driver.getCurrentUrl()`**: Gets the URL of the current page.
- **`driver.close()` vs `driver.quit()`**:
    - **`driver.close()`**: Closes the currently focused browser window or tab. If it's the only window open, it will also quit the browser session.
    - **`driver.quit()`**: Closes **all** browser windows/tabs opened by the WebDriver session and safely ends the session, terminating the `chromedriver` process. **This is the command you should almost always use in your `@After...` methods to ensure proper cleanup.**

## Test Strategy and Verification

### The Test Pyramid
- A model that helps structure your test suite for efficiency and stability. It suggests the proportion of tests you should have at different levels.
    1.  **Unit Tests (Base)**:
        - The largest part of the pyramid.
        - Tests individual methods or classes in isolation.
        - They are fast, reliable, and easy to maintain.
    2.  **Integration / Service Tests (Middle)**:
        - Fewer than unit tests.
        - Tests how different components or services work together (e.g., how your code interacts with a database or an external API).
        - Slower than unit tests but faster than UI tests.
    3.  **UI / End-to-End Tests (Top)**:
        - The smallest part of the pyramid.
        - Tests the entire application flow from the user's perspective (e.g., using Selenium).
        - They are slow, can be brittle (prone to breaking), and are expensive to run and maintain. Only use them for critical user journeys.

### Assertions: Verifying Outcomes
- An assertion is a statement that verifies if the actual outcome of a test matches the expected outcome. If the assertion fails, the test is marked as failed.
- **Hard Assertions**:
    - This is the default behavior in both JUnit and TestNG (`Assert.assertEquals`, `Assert.assertTrue`, etc.).
    - When a hard assertion fails, the test method is **immediately aborted**, and subsequent steps in that method are not executed.
    - **Use Case**: Best for critical checks where the rest of the test cannot proceed if the assertion fails (e.g., verifying a successful login before testing dashboard features).
- **Soft Assertions (TestNG)**:
    - Allows the test to continue executing even after an assertion fails. It collects all failures and reports them at the end of the test.
    - Implemented using the `SoftAssert` class in TestNG.
    - **Use Case**: Ideal for verifying multiple, independent things on a single page where one failure shouldn't stop you from checking the others (e.g., checking the text of a title, a header, and a footer all at once).
    - **Example**:
        ```java
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, "Expected Title"); // Will not stop here if it fails
        softAssert.assertTrue(header.isDisplayed());
        softAssert.assertAll(); // Reports all failures collected so far and fails the test if any exist
        ```

## Version Control with Git for Testers
- **What is Git?**
    - Git is a distributed version control system used to track changes in source code. For testers, it's essential for managing automation code, collaborating with developers, and integrating with CI/CD pipelines.
- **Why do testers need it?**
    - **Code Management**: To save and track changes to your Selenium, REST Assured, or other test scripts.
    - **Collaboration**: To work on the same automation codebase with other testers and developers without overwriting each other's work.
    - **Branching**: To create isolated branches to develop new tests for a new feature without affecting the main test suite.
    - **CI/CD Integration**: Jenkins and other CI tools rely on Git to get the latest code to build and test.
- **Most Common Git Commands for Testers**:
    - `git clone <repository-url>`: Downloads a copy of the project from a remote repository (like GitHub) to your local machine.
    - `git pull`: Fetches the latest changes from the remote repository and merges them into your current branch.
    - `git branch <branch-name>`: Creates a new branch.
    - `git checkout <branch-name>`: Switches to a different branch.
    - `git add .`: Stages all your changed files, preparing them to be committed.
    - `git commit -m "Your descriptive message"`: Saves your staged changes to your local repository with a message explaining what you did.
    - `git push`: Uploads your committed changes from your local branch to the remote repository.

### Troubleshooting and Advanced Commands
    - `git status`: Shows the current state of your working directory and staging area. It tells you which files are modified, staged, or untracked.
    - `git log`: Displays the commit history for the current branch. Use `git log --oneline` for a compact view.
    - **Undoing Changes**:
        - `git reset <file>`: Unstages a file, but keeps the changes in your working directory.
        - `git checkout -- <file>`: Discards all changes in a file in your working directory, reverting it to the last committed version. **Use with caution, as this is destructive.**
        - `git revert <commit-hash>`: Creates a new commit that undoes the changes from a specific previous commit. This is the safest way to undo changes on a shared branch because it doesn't alter the project history.
    - **Handling Merge Conflicts**:
        - When a `git pull` or `git merge` results in a conflict, Git will mark the conflicting files.
        - Open the marked file(s) in your editor. You will see markers like `<<<<<<< HEAD`, `=======`, and `>>>>>>>`.
        - Manually edit the file to resolve the conflict, keeping the code you want and removing the markers.
        - Once resolved, use `git add <conflicted-file>` and `git commit` to finalize the merge.
    - **Removing Large Files from History**:
        - **Problem**: You accidentally committed a large file (e.g., a video or a JAR file), and now your repository is huge. A simple `git rm` and a new commit won't fix it, because the file still exists in the repository's history.
        - **Solution**: You need to rewrite the repository's history to remove the file from all commits. The modern, recommended tool for this is `git-filter-repo`.
        - **Example Steps (using `git-filter-repo`)**:
            1.  Install `git-filter-repo` (it's a separate tool).
            2.  Run the command: `git filter-repo --path /path/to/your/large-file --invert-paths`
            3.  This will go through your entire history and remove the specified file.
            4.  You will then need to force-push the changes to the remote repository: `git push --force`. **Warning**: Force-pushing is dangerous and should only be done if you are coordinating with your entire team, as it rewrites the shared history.

## CI/CD and Jenkins for Testers
- As a tester, understanding the Continuous Integration/Continuous Delivery (CI/CD) pipeline is crucial because it's where your automated tests provide the most value.

### What is CI/CD?
- **Continuous Integration (CI)**:
    - A development practice where developers frequently merge their code changes into a central repository (like Git).
    - After each merge, an automated build and automated tests are run.
    - **Goal**: To find and address bugs quicker, improve software quality, and reduce the time it takes to validate and release new software updates.
- **Continuous Delivery (CD)**:
    - An extension of CI. It's a practice where code changes are automatically built, tested, and prepared for a release to production.
    - The final step—deploying to a live production environment—is triggered manually.
    - **Goal**: To ensure you can release new changes to your customers quickly and sustainably.
- **Continuous Deployment (also CD)**:
    - The next step after Continuous Delivery. Every change that passes all stages of your production pipeline is released to your customers automatically. There's no human intervention.

### What is Jenkins?
- Jenkins is an open-source automation server that acts as the engine for CI/CD.
- It automates the different stages of your delivery pipeline, such as building the code, running tests, and deploying the application.
- A pipeline is defined in a special file called a **`Jenkinsfile`**, which lives in your project's code repository. This is known as "Pipeline as Code".

### A Typical CI/CD Pipeline for a Tester
1.  **Commit**: A developer commits code to a Git repository.
2.  **Trigger**: The commit automatically triggers a Jenkins pipeline (via a webhook).
3.  **Build**: Jenkins checks out the latest code and uses Maven to compile it (`mvn compile`).
4.  **Unit Test**: Jenkins runs all the fast unit tests (`mvn test`). If any test fails, the pipeline stops and notifies the team. The build is "broken".
5.  **Package & Deploy to QA**: If unit tests pass, Jenkins packages the application (`mvn package`) and deploys it to a dedicated QA/testing environment.
6.  **Run Automated E2E/UI Tests**: This is where your Selenium suite comes in! Jenkins executes your regression suite against the newly deployed application in the QA environment.
    - For example, Jenkins might run the command: `mvn test -P e2e-tests` (where `e2e-tests` is a profile in your `pom.xml` configured to run your TestNG/Selenium tests).
7.  **Publish Reports**: After the tests are complete, Jenkins publishes the test results (e.g., TestNG reports), code coverage reports, and other artifacts.
8.  **Notify**: The team is notified of the pipeline status (e.g., via Slack or email). If the E2E tests failed, the team can review the reports to see what broke.
9.  **Manual Promotion (Continuous Delivery)**: If all tests pass, the build is marked as "stable" and is ready to be deployed to production with a single click.

### Why is this important for you?
- **Immediate Feedback**: Your tests provide immediate feedback on the health of the application after every single change.
- **Find Regressions Fast**: You catch bugs introduced by new code almost instantly, not days or weeks later.
- **Reliable and Repeatable**: Your tests run in a consistent, automated environment, eliminating "it works on my machine" problems.
- **Enables "Shift-Left" Testing**: By integrating tests early in the pipeline, you are "shifting left"—moving testing closer to the development phase, which is cheaper and more efficient.

## API Testing Fundamentals (The Postman Basics)
- Before diving into API test automation, it's important to understand the core components you interact with, often first explored using tools like Postman.

### Anatomy of an API Request
- An API request is like placing an order with a waiter (the API). It has several parts:
    1.  **HTTP Method**: The verb that tells the server what action to perform.
        -   `GET`: Retrieve data.
        -   `POST`: Create new data.
        -   `PUT`: Update existing data completely.
        -   `DELETE`: Remove data.
    2.  **Endpoint**: The specific URL where the request is sent (e.g., `https://api.example.com/users`).
    3.  **Headers**: Key-value pairs that send metadata about your request.
        -   `Content-Type`: Tells the server the format of your request body (e.g., `application/json`).
        -   `Authorization`: Carries credentials to prove who you are. This is where you put **Bearer Tokens** or **Basic Auth** information.
        -   `X-API-Key`: A common header for sending an **API Key**.
    4.  **Query Parameters**: Key-value pairs added to the end of the URL to filter or customize a `GET` request. They start with `?` and are separated by `&`.
        -   **Example**: `https://api.example.com/users?status=active&sort=name`
    5.  **Request Body**: The data sent to the server with `POST` or `PUT` requests, usually in JSON format.
        -   **Example JSON Body**:
            ```json
            {
                "name": "New User",
                "email": "new.user@example.com"
            }
            ```

### Anatomy of an API Response
- After processing the request, the server sends back a response, which includes:
    1.  **Status Code**: A 3-digit number indicating the result of the request. As a tester, you should be familiar with the most common ones:
        | Code | Category | Name | What it Means |
        | --- | --- | --- | --- |
        | **200** | **Success** | **OK** | The request succeeded. The standard response for successful GET requests. |
        | **201** | **Success** | **Created** | The request succeeded, and a new resource was created as a result (e.g., after a POST). |
        | **204** | **Success** | **No Content** | The server successfully processed the request but is not returning any content (e.g., after a DELETE). |
        | **301** | **Redirection** | **Moved Permanently** | The requested resource has been permanently moved to a new URL. |
        | **302** | **Redirection** | **Found** | The requested resource is temporarily at a different URL. |
        | **400** | **Client Error** | **Bad Request** | The server cannot process the request due to a client error (e.g., malformed JSON, invalid parameters). |
        | **401** | **Client Error** | **Unauthorized** | You are not authenticated. You need to provide valid credentials (like a Bearer Token or API Key) to access the resource. |
        | **403** | **Client Error** | **Forbidden** | You are authenticated, but you do not have permission to access this resource. It's a permissions issue, not an authentication issue. |
        | **404** | **Client Error** | **Not Found** | The server cannot find the requested resource or endpoint. |
        | **405** | **Client Error** | **Method Not Allowed** | The HTTP method you used (e.g., GET, POST) is not supported for the requested resource. |
        | **409** | **Client Error** | **Conflict** | The request could not be completed because of a conflict with the current state of the resource (e.g., trying to create a user with an email that already exists). |
        | **415** | **Client Error** | **Unsupported Media Type** | The server is rejecting the request because the request body is in a format not supported by the requested resource. |
        | **429** | **Client Error** | **Too Many Requests** | The user has sent too many requests in a given amount of time (rate limiting). |
        | **500** | **Server Error** | **Internal Server Error** | A generic error on the server's side. It means something went wrong on the server, and it's not your fault. |
        | **502** | **Server Error** | **Bad Gateway** | The server, while acting as a gateway or proxy, received an invalid response from an inbound server it accessed. |
        | **503** | **Server Error** | **Service Unavailable** | The server is currently unable to handle the request due to being overloaded or down for maintenance. |
        | **504** | **Server Error** | **Gateway Timeout** | The server, while acting as a gateway, did not get a response in time from the upstream server. |
    2.  **Response Body**: The data or message sent back from the server (e.g., the user data you requested).
    3.  **Response Headers**: Metadata about the response (e.g., `Content-Type`, `Date`).

## API Testing with REST Assured
- **What is REST Assured?**
    - REST Assured is a popular open-source Java library specifically designed for testing RESTful APIs. It provides a simple, domain-specific language (DSL) that makes writing powerful and readable API tests easy.

    - It simplifies the process of making HTTP requests (GET, POST, PUT, DELETE) and validating the responses.

- **Why use it for API Testing?**
    - **Readable BDD Syntax**: It uses a `Given-When-Then` syntax, similar to Cucumber, which makes tests easy to read and understand even for non-developers.
    - **Java Integration**: Being a Java library, it integrates seamlessly with existing Java-based automation frameworks like JUnit or TestNG.
    - **No Boilerplate Code**: It handles a lot of the setup and teardown code (like creating an HTTP client, sending requests, and parsing responses) for you, so you can focus on the test logic.
    - **Powerful Assertions**: It has rich support for validating response data, including status codes, headers, cookies, and complex JSON/XML body content using tools like JSONPath and XMLPath.

- **Core Concepts: The Given/When/Then Structure**
    - **`Given()`**: This is where you set up the request preconditions. This includes setting headers, authentication, cookies, or request body content.
    - **`When()`**: This is where you specify the HTTP method and the endpoint URL. This is the action part of the test.
    - **`Then()`**: This is where you validate the response. You can assert the status code, check headers, and verify the response body content.

- **Example: A Simple GET Request**
    - Let's say we want to test the public API `https://reqres.in/` to get user data.

    ```java
    import io.restassured.RestAssured;
    import org.testng.annotations.Test;
    import static io.restassured.RestAssured.*;
    import static org.hamcrest.Matchers.*;

    public class ApiTest {

        @Test
        public void testGetUser() {
            // Set the base URI for the API
            RestAssured.baseURI = "https://reqres.in/api";

            given().
                // No specific preconditions for this simple GET request
            when().
                get("/users/2"). // Send a GET request to the endpoint
            then().
                statusCode(200). // Assert that the status code is 200 (OK)
                body("data.id", equalTo(2)). // Assert the 'id' in the response body is 2
                body("data.first_name", equalTo("Janet")); // Assert the 'first_name'
        }
    }
    ```

- **Adding REST Assured to your Project**
    - To use REST Assured, you just need to add its dependency to your `pom.xml` file.

    ```xml
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>rest-assured</artifactId>
        <version>5.4.0</version> <!-- Or the latest version -->
        <scope>test</scope>
    </dependency>
    ```
