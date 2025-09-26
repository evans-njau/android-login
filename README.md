# 📘 SMIS LoginActivity – Assignment  

## 📌 Project Overview  
This project is part of my Mobile Application (Kotlin) assignment.  
It implements a simple **LoginActivity** for the **Student Management Information System (SMIS)** app.  

The activity allows students to log in using their email and password, validates input, and redirects to a dashboard screen after successful login.  

---

## 🎯 Features Implemented  
- **Two input fields:**  
  - Email (username) → must be in valid email format (e.g., `email@example.com`).  
  - Password → must:  
    - Be at least 6 characters long.  
    - Contain both letters and numbers.  
- **Login button:**  
  - `"Please enter credentials"` → if fields are empty.  
  - `"Invalid email format"` → if email is incorrect.  
  - `"Password must be ≥6 chars and contain letters & numbers"` → if password is weak.  
  - `"Login Successful"` → if validation passes.  
- Redirects to a **Dashboard screen** after login.  

---

## 🛠️ Technologies Used  
- **Kotlin** – Android programming language  
- **Android Studio** – Development environment  
- **XML** – For UI layout design  

---

## 📷 Screenshots  

### 1. Login Screen  
![Login Screen](https://github.com/evans-njau/android-login/blob/master/login%20page.jpg)  

### 2. Dashboard Screen (after login)  
![Dashboard Screen](https://github.com/evans-njau/android-login/blob/master/welcome%20page.jpg)
---

## 🚀 How to Run the Project  
1. Clone the repository:  
   ```bash
   git clone https://github.com/<your-username>/<repo-name>.git
