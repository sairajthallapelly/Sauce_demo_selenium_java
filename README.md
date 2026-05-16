
# Sauce Demo Automation Suite (Java & Selenium)

This repository contains the basic automated test suite for the Sauce Demo application as part of the Take-Home Assignment.

## Scenarios Automated
1. **Successful Login & Product Add:** Validates credentials, verifies navigation to product page, and asserts cart badge incrementation.
2. **End-to-End Checkout:** login to the completion screen, verifying success elements.

## Prerequisites

* **Java Development Kit (JDK 17 or higher)**
* **Apache Maven** (Make sure `mvn` is added to your environment path variable)
* **Google Chrome** browser
* **POM**

## Project Structure

I have usedbasic POM structure, Login, Add to Cart, Checkout attributes stored in separate package location : src/main/java/Sauce_demo
and testcase data properties stored in separate files location : src/test/java/test_saucedemo.

├── src
│ └── java
│     └── Sauce_demo
│           └── LoginPage
│           └── Add Product To Cart
│           └── Successful Checkout
│ └── test
|       └──java
|             └──test_case_saucedemo
|                    └──SauceDemo_Test(executable file)
|
|└── pom.xml # Dependency Management F
└── testng.xml
