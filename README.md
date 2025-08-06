## **🚀 Task Management REST API**


```markdown
A professional REST API built with **Spring Boot** and **Java 21** for managing tasks with full CRUD operations.

## 🛠️ Technologies Used

- **Java 21** - Latest LTS version
- **Spring Boot 3.x** - Enterprise framework
- **Spring Web** - RESTful web services
- **Maven** - Dependency management
- **IntelliJ IDEA** - Development environment

## 📋 Features

- ✅ **Create** new tasks
- ✅ **Read** all tasks or specific task by ID
- ✅ **Update** existing tasks
- ✅ **Delete** tasks
- ✅ **JSON** responses
- ✅ **RESTful** architecture
- ✅ **Hot reload** development

## 🚀 Quick Start

### Prerequisites
- Java 21 or higher
- Maven 3.6+

### Installation
```bash
git clone https://github.com/yourusername/mi-primera-api.git
cd mi-primera-api
mvn spring-boot:run
```

The API will be available at `http://localhost:8080`

## 📡 API Endpoints

### Basic Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/hello` | Welcome message |
| GET | `/date` | Current server date |
| GET | `/greet/{name}` | Personalized greeting |

### Task Management
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/tasks` | Get all tasks |
| GET | `/api/tasks/{id}` | Get task by ID |
| POST | `/api/tasks` | Create new task |
| PUT | `/api/tasks/{id}` | Update task |
| DELETE | `/api/tasks/{id}` | Delete task |

## 📝 Usage Examples

### Get all tasks
```bash
GET http://localhost:8080/api/tasks
```

### Create a new task
```bash
POST http://localhost:8080/api/tasks
Content-Type: application/json

{
  "title": "Learn Docker",
  "description": "Complete Docker tutorial and practice",
  "completed": false
}
```

## 🏗️ Project Structure
```
src/
├── main/java/com/ejemplo/miprimerapi/
│   ├── MiPrimeraApiApplication.java
│   ├── HelloWorldController.java
│   ├── TaskController.java
│   └── Task.java
└── resources/
    └── application.properties
```

## 🚀 Next Steps
- [ ] Add database integration (MySQL/PostgreSQL)
- [ ] Implement user authentication
- [ ] Add input validation
- [ ] Deploy to cloud (AWS/Heroku)
- [ ] Add unit tests

## 👨‍💻 Author
**Daniel M** - Software Engineering Student

---
⭐ **Star this repository if you found it helpful!**
```

---

## **🚨 ACCIÓN INMEDIATA**

**Pega este README.md en tu proyecto y personaliza:**
- Cambia "yourusername" por tu usuario de GitHub
- Cambia "Your Name" por tu nombre real

**¿Listo para subirlo a GitHub y impresionar al mundo?**