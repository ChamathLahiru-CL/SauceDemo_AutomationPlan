# 🚀 SauceDemo Automation Project

This is a Java-based Test Automation Framework for testing the [SauceDemo](https://www.saucedemo.com/) web application using **Selenium WebDriver**, **TestNG**, and **ExtentReports**. It follows the **Page Object Model (POM)** design pattern for better code maintainability and scalability.

---
## 🧪 SauceDemo Automation Project

[👉 View this project on GitHub](https://github.com/ChamathLahiru-CL/SauceDemo_AutomationPlan)

This is a Java-based Test Automation Framework for testing the [SauceDemo](https://www.saucedemo.com/) web application...


## 📁 Project Structure
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


## 🧪 Test Case – `HappyPath.java`

This test simulates a full purchase journey on the SauceDemo website:

1. **Login** using valid credentials
2. **Navigate** to product page and verify it loaded
3. **Add items** to cart
4. **Proceed to checkout** and enter shipping info
5. **Validate price** before confirming the order
6. **Confirm success message** and return home

All assertions are used to verify functionality step-by-step.

---

## ⚙️ BaseTest Setup – `BaseTest.java`

- Initializes **ChromeDriver**
- Configures **implicit wait** and maximizes the window
- Launches SauceDemo website
- Initializes all page objects
- Sets up **ExtentReports** for generating HTML reports
- Handles result logging via `@AfterMethod`
- Quits the driver and flushes report via `@AfterTest`

---

## 📸 Reporting – `ExtentReports`

- Generates an HTML report at:  
  `src/reports/index.html`
- Displays test status: **PASS / FAIL / SKIP**
- Can be extended to include **screenshots on failure**

---

## 🧱 Technologies Used

- Java
- Maven
- Selenium WebDriver
- TestNG
- ExtentReports (for HTML test reporting)
- Page Object Model (POM) Design Pattern

---

## 🧑‍💻 Author Info

👤 **Lahiru Jayasuriya**  
Tested and implemented as part of QA automation learning project.

---

## ✅ To Run the Tests

1. Open project in **IntelliJ** or any IDE
2. Run `HappyPath.java` via TestNG
3. View results in the generated report:  
   `saucedemo-Automation/src/reports/index.html`

---

## 📌 Future Enhancements

- Add failure screenshots
- Use DataProvider for multiple test data
- Parameterize browser selection
- Integrate with CI tools like Jenkins

---

🧡 *This project demonstrates end-to-end automation and clean code structure using Selenium best practices.*

