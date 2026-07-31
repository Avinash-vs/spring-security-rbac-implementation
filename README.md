# Spring Boot Security RBAC Implementation

A Java web application implementing core Spring Security features. This project demonstrates programmatic `SecurityFilterChain` configuration, URL-level Role-Based Access Control (RBAC), and in-memory authentication.

## 🛠️ Tech Stack
* **Language:** Java 17
* **Framework:** Spring Boot 3.x
* **Security:** Spring Security Core
* **Build Tool:** Maven

## ✨ Key Features
* **Custom Security Filter Chain:** Programmatic routing based on user roles and endpoint exposure.
* **Role-Based Access Control (RBAC):** Strict separation of privileges using `.hasRole()` and `.hasAnyRole()` constraints.
* **In-Memory Authentication:** Configured `InMemoryUserDetailsManager` for rapid testing and development.
* **HTTP Basic Auth:** Secure endpoint testing using browser-native authentication.

## 🚀 Getting Started

### Prerequisites
To run this project locally, ensure you have the following installed:
* Java Development Kit (JDK) 17
* Maven
* Your preferred IDE (e.g., Eclipse, IntelliJ, or VS Code)

### Installation & Setup
1. **Clone the repository:**
   ```bash
   git clone [https://github.com/your-username/your-repo-name.git](https://github.com/your-username/your-repo-name.git)
