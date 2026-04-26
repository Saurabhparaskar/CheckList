# CheckList - Java Learning Project

A simple Java project containing basic educational programs demonstrating fundamental programming concepts like user authentication and conditional logic.

## 📁 Project Structure

```
CheckList/
├── Login.java           # User authentication program
├── VotingSystem.java    # Voting eligibility checker
└── Readme.md            # Project documentation
```

## 📋 Programs Included

### 1. Login.java
A simple login authentication system that validates user credentials.

**Features:**
- Hardcoded username and password verification
- Simple if-else conditional logic
- Console-based user feedback

**Credentials:**
- Username: `admin`
- Password: `123`

**How to Run:**
```bash
javac Login.java
java Login
```

**Output:**
```
Login Successful
```
or
```
Invalid Credentials
```

---

### 2. VotingSystem.java
A voting eligibility checker that determines if a user is eligible to vote based on their age.

**Features:**
- Takes user age as input via Scanner
- Validates eligibility (age >= 18)
- Displays eligibility status with visual indicators

**How to Run:**
```bash
javac VotingSystem.java
java VotingSystem
```

**Example Usage:**
```
Enter your age: 20
You are eligible to vote ✅
```

or

```
Enter your age: 15
You are NOT eligible to vote ❌
```

---

## 🛠️ Requirements

- Java Development Kit (JDK) 8 or higher
- Any text editor or IDE (VS Code, IntelliJ IDEA, Eclipse, etc.)

## 🚀 Getting Started

1. Clone or download the project
2. Navigate to the project directory
3. Compile each Java file using `javac`
4. Run the program using `java`

## 💡 Learning Concepts

This project demonstrates:
- **Basic Java Syntax**: Class structure, main method
- **Conditional Logic**: if-else statements
- **String Comparison**: Using `.equals()` method
- **User Input**: Using Scanner class
- **Console Output**: Using `System.out.println()`

## 📝 Notes

- These are educational programs with simplified logic
- Credentials in Login.java are hardcoded for demonstration purposes
- Consider implementing secure authentication and input validation for production use

---

**Author:** Java Learning Project  
**Date:** April 2026
