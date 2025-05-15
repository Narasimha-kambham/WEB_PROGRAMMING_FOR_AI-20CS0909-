# Web Programming for Artificial Intelligence Lab

This repository contains implementations of all the experiments from the **Web Programming for Artificial Intelligence Lab Manual** for III B.Tech - II Semester at Siddhartha Institute of Science and Technology.

## Course Details
- **Course Code:** 20CS0909
- **Course Name:** Web Programming for Artificial Intelligence
- **Department:** Computer Science and Engineering (CSM)

## Lab Experiments

### List of Experiments
1. **Create a table to show your class time table**
   - *AIM:* Display a class timetable using HTML tables.

2. **Create a simple Job Registration Form**
   - *AIM:* Design a job registration form with HTML form elements.

3. **Create a webpage using HTML5 Media Elements**
   - *AIM:* Embed video and audio using HTML5 media tags.

4. **Add a Cascading Style Sheet for designing the web page**
   - *AIM:* Apply CSS styles to HTML elements for better design.

5. **Write a Java Servlet Program to display the Current time on the server**
   - *AIM:* Display server date and time using Java Servlets.

6. **Write a Java Servlet Program session lifetime cookies**
   - *AIM:* Demonstrate session tracking and cookies in Java Servlets.

7. **Design a shopping cart application using Laravel framework**
   - *AIM:* Build a shopping cart with Laravel.

8. **Create a MongoDB collection of "Research articles" with required details**
   - *AIM:* Set up a MongoDB collection and perform CRUD operations.

9. **Design an application in Node.js for student management**
   - *AIM:* Develop a student management system using Node.js.

10. **Create an application using MeteorJS framework**
    - *AIM:* Build a simple application with MeteorJS.

## Technologies Used
- HTML, CSS, JavaScript
- Java Servlets
- MongoDB
- Node.js
- MeteorJS

---

# 🚀 ServletDemo – Java Maven Web Application using Tomcat

This project demonstrates how to build and run a **Java Servlet-based web application** using **Apache Maven**, **Visual Studio Code**, and **Apache Tomcat**. It includes instructions for setting up the development environment and deploying a `.war` file using the Tomcat extension.

---

## 💻 Software Requirements

```bash
🔧 JDK               : Version 20  
🌐 Node.js           : Latest Stable  
🧠 MongoDB Compass   : Optional (for 8th experiment)  
📦 Apache Maven      : 3.8 or later  
🌐 Apache Tomcat     : Version 9.x  
💻 Visual Studio Code: Latest  
🌠 Meteor.js         : Optional (only for 10th experiment)

```

🧩 VS Code Extensions
```bash

📌 Extension Pack for Java  
📌 Maven for Java  
📌 Project Manager for Java  
📌 Red Hat Commons  
📌 Tomcat for Java  Or  Community Server Connections
```
🪜Step by Step process to run a Servlet from scratch

📂 Example Project Structure 
```bash

ServletDemo/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/HelloServlet.java
│       └── webapp/
│           ├── WEB-INF/
│           │   └── web.xml
│           └── index.html
├── pom.xml
└── target/
    └── ServletDemo.war
```
🛠 Step-by-Step Setup
✅ Step 1: Create Maven Web Project
```bash

1. Open VS Code  
2. Open Command Palette (Ctrl + Shift + P)  
3. Select: Maven: Create Maven Project  
4. Choose: maven-archetype-webapp  
5. Enter Group ID   : com.example  
6. Enter Artifact ID: ServletDemo  
7. Finish & Wait for project generation
```
✅ Step 2: Create & Register Servlet
```java

// src/main/java/com/example/HelloServlet.java

package com.example;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Hello from Servlet!</h2>");
    }
}
```
```xml

<!-- src/main/webapp/WEB-INF/web.xml -->

<web-app xmlns="http://jakarta.ee/xml/ns/jakartaee"
         version="5.0">
    <servlet>
        <servlet-name>HelloServlet</servlet-name>
        <servlet-class>com.example.HelloServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>HelloServlet</servlet-name>
        <url-pattern>/hello</url-pattern>
    </servlet-mapping>
</web-app>
```
✅ Step 3: Package the Project
```bash

# Open terminal in VS Code
cd ServletDemo
mvn clean package
# Output: target/ServletDemo.war
```
✅ Step 4: Download & Add Tomcat Server
```bash

🔗 Download Tomcat 9.x:  
https://tomcat.apache.org/download-90.cgi


📁 Extract it to: C:\Tomcat9 or ~/Tomcat9

🛠️ In VS Code:  
1. Open "Tomcat Servers" panel  
2. Click ➕ icon → Select extracted Tomcat folder
```
✅ Step 5: Deploy WAR to Tomcat
```bash
1. In VS Code Tomcat tab → Right-click on Tomcat  
2. Click: "Add Deployment"  
3. Choose: target/ServletDemo.war  
4. Start Server
```
✅ Step 6: Run Application in Browser
```bash
🌐 Open Browser:  
http://localhost:8080/ServletDemo/hello

# You should see: Hello from Servlet!
```
🧠 Optional: MongoDB Integration

```bash
1. Install MongoDB Compass  
2. Use Community Server Connections extension in VS Code  
3. Connect your app with MongoDB via a DAO layer (future feature)
```
📑 Resources
```bash
Tomcat Official Site

VS Code Java Docs

Maven Web Projects

MongoDB Compass
```
👤 Author
```bash
👨‍💻 Narasimha  

```







