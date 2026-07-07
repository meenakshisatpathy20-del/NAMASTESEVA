# NamasteSeva

NamasteSeva is a Java-based Low-Level Design (LLD) project that models a multi-service restaurant platform supporting **food ordering, table reservations, and party/catering bookings**.

The project focuses on applying **Object-Oriented Programming, design patterns, object relationships, and separation of responsibilities** to model real-world application workflows.

## Features

- Restaurant, Menu, and MenuItem management
- Cart and CartItem-based food selection
- Delivery partner assignment
- Coupon support and order amount management
- Food order creation and lifecycle tracking using `OrderStatus`
- Table reservation management
- Party and catering booking management
- Custom catering packages with:
  - Silver and Gold package options
  - Veg, Non-Veg, and Both food preferences
  - Buffet option
  - Staff service selection
- Booking lifecycle tracking using `BookingStatus`
- Multiple payment methods:
  - Card Payment
  - UPI Payment
  - Net Banking Payment
- Reusable Notification Engine supporting:
  - Simple notifications
  - Timestamp and Signature decorators
  - Email, SMS, and Popup notification strategies
  - Notification Observable structure
  - Singleton Logger

## Design Patterns Used

- **Factory Pattern** — used for creating food orders and party/catering bookings.
- **Singleton Pattern** — used for centralized managers and Logger.
- **Strategy Pattern** — used for payment methods and notification delivery channels.
- **Decorator Pattern** — used for dynamically adding timestamps and signatures to notifications.
- **Observer / Observable Structure** — used as the foundation for notification state management and observer-based communication.

## Tech Stack

- Java
- Object-Oriented Programming (OOP)
- Low-Level Design (LLD)
- Java Collections
- Interfaces and Abstract Classes
- Enums
- SOLID Design Principles
- Factory, Singleton, Strategy, Decorator, and Observer design concepts

## Project Structure

```text
src/
├── enums/
├── factories/
├── main/
├── managers/
├── models/
├── notification/
├── notificationstrategy/
├── observer/
├── services/
└── strategies/
```

## Future Enhancements

- Spring Boot integration and REST APIs
- Database persistence using Spring Data JPA and MySQL/PostgreSQL
- Authentication and role-based authorization
- Map integration for nearby restaurant discovery, delivery tracking, route visualization, and catering venue logistics
- Real-time order tracking
- Automatic event-driven notifications on order and booking status changes
- Multi-channel user notification preferences
- Catering coordinator and team management
- Rating and review system
- Exception handling and business validation
- Unit and integration testing
- Docker containerization
- CI/CD pipeline integration
- AWS deployment

## Learning Outcomes

NamasteSeva demonstrates practical implementation of OOP and LLD concepts through object modeling, composition, interfaces, polymorphism, centralized managers, factories, lifecycle management, interchangeable strategies, and a reusable notification subsystem.

