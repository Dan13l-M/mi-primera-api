# 🚀 Task Management REST API

A professional and scalable REST API built with **Spring Boot 3** and **Java 21** for comprehensive task management with full CRUD operations and modern development practices.

## ✨ Features

- 🔧 **Full CRUD Operations** - Create, Read, Update, Delete tasks
- 🌐 **RESTful Architecture** - Standard HTTP methods and status codes  
- 📊 **JSON API** - Clean JSON request/response format
- ⚡ **Hot Reload** - Development mode with automatic restart
- 🎯 **Input Validation** - Data integrity and error handling
- 📖 **API Documentation** - Interactive endpoints documentation
- 🏗️ **Modular Architecture** - Clean separation of concerns
- 🔒 **Error Handling** - Comprehensive exception management

## 🛠️ Tech Stack

| Technology | Version | Purpose |
|------------|---------|---------|
| **Java** | 21 LTS | Programming Language |
| **Spring Boot** | 3.2+ | Application Framework |
| **Spring Web** | Latest | REST API Development |
| **Maven** | 3.6+ | Build & Dependency Management |
| **Jackson** | Latest | JSON Processing |

## 🗄️ Database Integration

- **MySQL 8.0** - Production database
- **Spring Data JPA** - ORM framework
- **Hibernate** - Database abstraction layer
- **Automatic table creation** - DDL auto-generation

## 🔧 Database Setup

### Prerequisites
- MySQL 8.0+ installed and running
- Database `task_management` created

### Configuration
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/task_management
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

## 🚀 Quick Start

### Prerequisites

Ensure you have the following installed:

- ☕ **Java 21** or higher ([Download](https://adoptium.net/))
- 📦 **Maven 3.6+** ([Install Guide](https://maven.apache.org/install.html))
- 🔧 **Git** for cloning the repository

### Installation & Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/Dan13l-M/mi-primera-api.git
   cd mi-primera-api
   ```

2. **Build the project**
   ```bash
   mvn clean compile
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

4. **Verify installation**
   ```bash
   curl http://localhost:8080/hello
   ```

🎉 The API will be available at `http://localhost:8080`

## 📡 API Reference

### Health Check Endpoints

| Method | Endpoint | Description | Response |
|--------|----------|-------------|----------|
| `GET` | `/hello` | Welcome message | `200 OK` |
| `GET` | `/date` | Current server timestamp | `200 OK` |
| `GET` | `/greet/{name}` | Personalized greeting | `200 OK` |

### Task Management API

| Method | Endpoint | Description | Status Codes |
|--------|----------|-------------|--------------|
| `GET` | `/api/tasks` | Retrieve all tasks | `200 OK` |
| `GET` | `/api/tasks/{id}` | Get specific task | `200 OK`, `404 Not Found` |
| `POST` | `/api/tasks` | Create new task | `201 Created`, `400 Bad Request` |
| `PUT` | `/api/tasks/{id}` | Update existing task | `200 OK`, `404 Not Found` |
| `DELETE` | `/api/tasks/{id}` | Remove task | `204 No Content`, `404 Not Found` |

## 📝 API Usage Examples

### Retrieve All Tasks
```bash
curl -X GET http://localhost:8080/api/tasks \
  -H "Accept: application/json"
```

**Response:**
```json
[
  {
    "id": 1,
    "title": "Learn Spring Boot",
    "description": "Master Spring Boot fundamentals",
    "completed": false,
    "createdAt": "2024-01-15T10:30:00Z"
  }
]
```

### Create New Task
```bash
curl -X POST http://localhost:8080/api/tasks \
  -H "Content-Type: application/json" \
  -d '{
    "title": "Learn Docker",
    "description": "Complete Docker tutorial and containerization",
    "completed": false
  }'
```

### Update Existing Task
```bash
curl -X PUT http://localhost:8080/api/tasks/1 \
  -H "Content-Type: application/json" \
  -d '{
    "title": "Learn Docker - Updated",
    "description": "Complete advanced Docker concepts",
    "completed": true
  }'
```

### Delete Task
```bash
curl -X DELETE http://localhost:8080/api/tasks/1
```

## 🏗️ Project Architecture

```
src/
├── main/
│   ├── java/com/ejemplo/miprimerapi/
│   │   ├── MiPrimeraApiApplication.java    # Main application class
│   │   ├── controller/
│   │   │   ├── HelloWorldController.java   # Basic endpoints
│   │   │   └── TaskController.java         # Task CRUD operations
│   │   ├── model/
│   │   │   └── Task.java                   # Task entity model
│   │   ├── service/
│   │   │   └── TaskService.java            # Business logic
│   │   └── repository/
│   │       └── TaskRepository.java         # Data access layer
│   └── resources/
│       ├── application.properties          # Configuration
│       └── application-dev.properties      # Development config
└── test/                                   # Unit and integration tests
```

## ⚙️ Configuration

### Application Properties
```properties
# Server Configuration
server.port=8080
server.servlet.context-path=/

# Development Profile
spring.profiles.active=dev

# JSON Configuration
spring.jackson.serialization.indent-output=true
spring.jackson.serialization.write-dates-as-timestamps=false
```

## 🧪 Testing

Run the test suite:
```bash
# Unit tests
mvn test

# Integration tests
mvn integration-test

# Test with coverage
mvn test jacoco:report
```

## 🚀 Deployment

### Local Production Build
```bash
mvn clean package
java -jar target/mi-primera-api-1.0.0.jar
```

### Docker Support
```dockerfile
FROM openjdk:21-jre-slim
COPY target/mi-primera-api-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
```

## 📈 Roadmap

### Phase 1 - Foundation ✅
- [x] Basic REST API structure
- [x] CRUD operations
- [x] JSON serialization

### Phase 2 - Enhancement 🔄
- [ ] **Database Integration** (H2/MySQL/PostgreSQL)
- [ ] **Data Validation** (Bean Validation)
- [ ] **Exception Handling** (Global error handler)
- [ ] **API Documentation** (OpenAPI/Swagger)

### Phase 3 - Advanced 📋
- [ ] **Authentication & Authorization** (Spring Security)
- [ ] **Pagination & Filtering** 
- [ ] **Rate Limiting**
- [ ] **Monitoring & Metrics** (Actuator)

### Phase 4 - Production 🚀
- [ ] **Unit & Integration Tests** (JUnit 5)
- [ ] **CI/CD Pipeline** (GitHub Actions)
- [ ] **Cloud Deployment** (AWS/Azure/GCP)
- [ ] **Performance Optimization**

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch: `git checkout -b feature/amazing-feature`
3. Commit changes: `git commit -m 'Add amazing feature'`
4. Push to branch: `git push origin feature/amazing-feature`
5. Submit a Pull Request


## 👨‍💻 Author

**Daniel M** - *Software Engineering Student*

- 🐱 GitHub: Dan13l-M.(https://github.com/Dan13l-M)
  
---

### ⭐ Support

If this project helped you, please consider giving it a ⭐ on GitHub!

**Made with ❤️ and ☕ by Daniel M**
