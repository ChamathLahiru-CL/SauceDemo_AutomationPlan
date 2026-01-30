# SauceDemo Automation Project

## Project Overview

This project demonstrates an **end-to-end automated test framework** for the **SauceDemo (Swag Labs)** web application.  
The automation covers a complete purchase workflow using **Selenium WebDriver with Java**, **TestNG**, and **ExtentReports**, following **industry best practices** such as the **Page Object Model (POM)**.


---

The following end‑to‑end workflow is automated:

1. Navigate to the SauceDemo website
2. Log in using valid credentials
3. Verify successful login by checking:
    - Products page URL
    - “Products” header visibility
4. Add **Sauce Labs Backpack** and **Sauce Labs Bike Light** to the cart
5. Navigate to the cart
6. Click **Checkout**
7. Enter dummy checkout information
8. Click **Continue**
9. Verify **Item Total** is correct (sum of selected products)
10. Click **Finish**
11. Assert final success message:  
    **“Thank you for your order!”**
---

[//]: # (## 🧪 SauceDemo Automation Project)

[//]: # ()
[//]: # ([👉 View this project on GitHub]&#40;https://github.com/ChamathLahiru-CL/SauceDemo_AutomationPlan&#41;)

[//]: # ()
[//]: # (This is a Java-based Test Automation Framework for testing the [SauceDemo]&#40;https://www.saucedemo.com/&#41; web application...)


## Project Structure
```
├── .idea/ # IntelliJ config files
├── .mvn/ # Maven wrapper
├── src/
│ ├── main/
│ │ └── java/
│ │ └── org.pages/ # Page Object Model classes
│ │ ├── CartPage.java
│ │ ├── CheckOutCompletePage.java
│ │ ├── CheckOutOverviewPage.java
│ │ ├── CheckOutPage.java
│ │ ├── LoginPage.java
│ │ └── ProductsPage.java
│ └── resources
│
├── src/
│ └── test/
│ └── java/
│ └── org.testCases/
│ ├── BaseTest.java # Base setup and teardown
│ └── HappyPath.java # Main test case (E2E flow)
│
├── reports/
│ ├── screenshots/ # Screenshots folder 
│ └── index.html # ExtentReports output
│
├── target/ # Maven build output
├── pom.xml # Project dependencies
└── .gitignore
```
---

## Tools & Technologies Used

| Tool / Framework | Purpose |
|------------------|--------|
| **Java** | Programming language for automation |
| **Selenium WebDriver** | Browser automation |
| **TestNG** | Test execution, assertions, annotations |
| **Maven** | Dependency and build management |
| **WebDriverManager** | Automatic browser driver management |
| **ExtentReports** | Professional HTML test reporting |
| **Chrome Browser** | Test execution environment |

### Why These Tools?

- Selenium + Java is an **industry‑standard automation stack**
- TestNG provides **structured test execution and assertions**
- Page Object Model improves **maintainability and reusability**
- ExtentReports offers **clear, visual test execution reports**
- Maven simplifies **dependency and project management**

---

## Setup & Execution Guide

###  Prerequisites

- Java JDK 17 or later
- Maven installed and configured
- Google Chrome browser
- IDE (IntelliJ IDEA / Eclipse recommended)

---

### How to Run the Tests

1. **Clone the repository**
   ```bash
   git clone https://github.com/ChamathLahiru-CL/SauceDemo_AutomationPlan.git
2. **Navigate to the project**
    ```bash
   cd SauceDemo_AutomationPlan
3. **Run the test suite**
    ```bash
   mvn clean test
4. **View the test report**
    ```bash
   src/reports/index.html

---


## Framework Design


### Page Object Model (POM)

Each page has a dedicated class:
- LoginPage
- ProductsPage
- CartPage
- CheckOutPage
- CheckOutOverviewPage
- CheckOutCompletePage
- These assertions ensure the workflow functions as expected.
#### This approach improves code readability, reusability, and maintenance.

---
## BaseTest Setup – `BaseTest.java`

- Initializes **ChromeDriver**
- Configures **implicit wait** and maximizes the window
- Launches SauceDemo website
- Initializes all page objects
- Sets up **ExtentReports** for generating HTML reports
- Handles result logging via `@AfterMethod`
- Quits the driver and flushes report via `@AfterTest`

---
## Test Case – `HappyPath.java`

This test simulates a full purchase journey on the SauceDemo website:

1. **Login** using valid credentials
2. **Navigate** to product page and verify it loaded
3. **Add items** to cart
4. **Proceed to checkout** and enter shipping info
5. **Validate price** before confirming the order
6. **Confirm success message** and return home

All assertions are used to verify functionality step-by-step.


---
## Validations & Assertions Implemented

- Login success validation (URL & header)
- Product page visibility
- Cart navigation
- Checkout flow verification
- Item total calculation validation
- Final success message assertion
---

## Reporting – `ExtentReports`

- Generates an HTML report at:  
  `src/reports/index.html`
- Displays test status: **PASS / FAIL / SKIP**
- Can be extended to include **screenshots on failure**

---

## Bonus Challenge – AI‑Powered QA Tool

### Research Summary
As part of the assignment, multiple AI‑powered QA tools were researched:

| **Tool**        | **Issue Identified**                                    |
|-----------------|----------------------------------------------------------|
| Testim          | Requires company email                                   |
| Katalon Recorder | Input parsing issues & unreliable login behavior         |
| **BugBug.io**  | Selected tool                                             |


---
### Why BugBug.io?

- Free and beginner‑friendly
- Supports personal email registration
- Browser‑based (no installation)
- No‑code test recording
- Suitable for quick UI test automation demos
---
### Scenario Automated Using BugBug

- Login to SauceDemo
- Add products to cart
- Checkout process
- Verify success message
---
### Limitations Observed

- Most AI tools require company emails
- Free versions have restricted features
- Some tools struggle with dynamic web elements
- Limited control for advanced test logic

---
## Useful Links

- **Google Drive (Video, Slides, Reports):**  `https://drive.google.com/drive/folders/1s8qBxuFlaCtfbQic31GuN8AtE3-N6Nrv?usp=drive_link`
- **GitHub Repository:** `https://github.com/ChamathLahiru-CL/SauceDemo_AutomationPlan`
- **GitHub Profile:** `https://github.com/ChamathLahiru-CL`
- **LinkedIn Profile:** `https://www.linkedin.com/in/lahiru-jayasuriya`
---
## Author Info

 **Lahiru Jayasuriya**  
Tested and implemented as part of QA automation learning project.

---

## To Run the Tests

1. Open project in **IntelliJ** or any IDE
2. Run `HappyPath.java` via TestNG
3. View results in the generated report:  
   `saucedemo-Automation/src/reports/index.html`

---


🧡 *This project demonstrates end-to-end automation and clean code structure using Selenium best practices.*

