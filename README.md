# 👥 OrangeHRM Social Features Testing Project

## 📌 Overview
This project contains **manual and automation testing artifacts** for the OrangeHRM social module.  
Features covered: **Login/Logout, Post Creation & Deletion, Likes, Comments, Share**.  
Automation implemented using **Java + Selenium + TestNG + Extent Reports**.

---

## 📂 Project Structure
- **TestPlan/** → Detailed test plan  
- **TestCases/** → Test cases per module (Login, Posts, Comments, Likes, Share)  
- **BugReports/** → Reported bugs with severity & priority  
- **TestSummaryReport/** → Final execution report with coverage  
- **src/** → Automation scripts (Page Objects, Tests, Utilities)
- **test-output/** → Test Outputs   
- **reports/** → Extent HTML Reports  
- **test-data/** → Credentials and input data  
- **testng.xml** → TestNG suite configuration  
- **pom.xml** → Maven dependencies

---

## ✅ Covered Features
- **Login/Logout**: Valid/invalid login, account lock, forgot password  
- **Posts**: Create, edit, delete posts with text/attachments  
- **Likes**: Like/unlike posts & comments  
- **Comments**: Add, edit, delete comments  
- **Share**: Share posts with validation  

Automation scripts mirror manual coverage with **detailed logging and reporting**.

---

## 📊 Test Coverage

| Module  | Manual | Automation |
|---------|--------|------------|
| Login   | ~90%   | ~100%      |
| Posts   | ~85%   | ~95%       |
| Likes   | ~85–90%| ~95%       |
| Comments| ~80–85%| ~90%       |
| Share   | ~80%   | ~90%       |
| **Overall** | ~85% | ~92%      |

---

## 🚀 How to Use

### Manual Testing
1. Review **TestPlan/** for scope & strategy.  
2. Check **TestCases/** Excel files for test steps.  
3. Explore **BugReports/** for issues.  
4. See **TestSummaryReport/** for coverage & results.  

### Automation Testing
1. Clone the repo:  
```bash
git clone https://github.com/AntoAhamed/orange-hrm-testing-project.git
```
2. Import into Eclipse as a Maven project.
3. Run tests via TestNG (testng.xml).
4. View Test Output: test-output/index.html.
5. View Extent Report: reports/ExtentReport.html.

---

## 🔮 Future Work
- Add **API testing** (Postman / RestAssured)
- Extend **performance \& security testing**
- Integrate with **CI/CD pipelines** for automated execution