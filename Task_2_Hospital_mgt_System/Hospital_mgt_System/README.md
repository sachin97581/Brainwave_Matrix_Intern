[//]: # (![Screenshot 2025-09-16 180330.png]&#40;../../../Pictures/Screenshots/Screenshot%202025-09-16%20180330.png&#41;)
![Screenshot](images/screenshot.png)
### This design covers:

### This is model of Hospital management API

### Relationships:

Patient ↔ Appointment (One-to-Many)

Doctor ↔ Appointment (One-to-Many)

Patient ↔ HealthRecord (One-to-Many)

Patient ↔ Billing (One-to-Many)

Independent entities: Medi# Hospital Management System API

A Spring Boot RESTful API for managing hospital operations, including patients, doctors, appointments, billing, health records, medical supplies, and staff.

## Features

- Patient, Doctor, Staff management
- Appointment scheduling
- Health record tracking
- Billing operations
- Medical supplies inventory

## Entity Relationships

- **Patient ↔ Appointment**: One-to-Many
- **Doctor ↔ Appointment**: One-to-Many
- **Patient ↔ HealthRecord**: One-to-Many
- **Patient ↔ Billing**: One-to-Many
- **MedicalSupply** and **Staff**: Independent entities

## Project Structure

- `controller/` — REST controllers for each entity
- `models/` — JPA entity classes
- `Repositories/` — Spring Data JPA repositories
- `Services/` — Business logic and service classes

## Technologies

- Java
- Spring Boot
- Gradle
- Spring Data JPA

## Getting Started

1. **Clone the repository**5. **API Endpoints**
   - Patient: `/patients`
   - Doctor: `/doctors`
   - Appointment: `/appointments`
   - Billing: `/billings`
   - Health Records: `/healthrecords`
   - Medical Supplies: `/medicalsupplies`
   - Staff: `/staff`

## License

This project is licensed under the MIT License.calSupply, Staff.