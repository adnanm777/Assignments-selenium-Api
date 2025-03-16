🚀 Java Automation Project

This project contains a set of Java-based automation scripts using Selenium, TestNG, RestAssured, and Apache POI for testing web applications and APIs.


🗂️ Folder Structure
css
Copy
Edit
├── src  
│   ├── DataDriven.java  
│   ├── fileInput.java  
│   ├── iframe.java  
│   ├── Windowhnadle.java  
│   ├── APIpractice.java  
├── postman  
│   └── dummy.postman_collection.json  
└── README.md  

📄 Files Description

1. 📊 DataDriven.java
✅ Implements data-driven testing using Apache POI to read data from an Excel file.
🔑 URL: https://practicetestautomation.com/practice-test-login/
📝 Loads username and password from Excel.
🚀 Performs login operation using Selenium.


3. 📂 fileInput.java
🚧 Empty class. Can be used for handling file inputs in future development.


4. 🪟 iframe.java
✅ Demonstrates handling of single and nested iframes using Selenium.
🌐 URL: https://demo.automationtesting.in/Frames.html
🔀 Handles switching between parent and child iframes.


5. 🌍 Windowhnadle.java
✅ Demonstrates handling of multiple browser windows using Selenium.
🌐 URL: https://www.globalsqa.com/demo-site/frames-and-windows/#
🔀 Handles window switching and extracts content from a new window.


6. 🌐 APIpractice.java
✅ Uses RestAssured to send HTTP GET requests.
🌍 Base URL: https://dummyjson.com
🥗 Endpoint: /recipes
🎯 Purpose: Fetches all available recipes.


7. 📮 dummy.postman_collection.json
✅ Postman collection for API testing:

📥 GET all recipes
📤 GET recipe by ID
🔍 Search recipe by keyword
➕ POST a new recipe (mocked)
✏️ PUT (update) a recipe (mocked)
❌ DELETE a recipe by ID


🛠️ Requirements
✔️ Java (JDK 8 or above)
✔️ Maven
✔️ Selenium
✔️ TestNG
✔️ RestAssured
✔️ Apache POI

