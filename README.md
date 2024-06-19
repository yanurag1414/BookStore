# BookStore
A full-stack web application designed to manage a collection of books seamlessly. This application leverages the power of Spring Boot for the backend and React for the frontend to deliver a robust and interactive user experience.

# Bookstore Project

## Table of Contents
- [Overview]
- [Features]
- [Technologies]
- [Setup Instructions]
- [Backend Setup (Spring Boot)]
- [Frontend Setup (React)]
- [API Endpoints]
- [Usage]
- [Contributing]
- [License]

## Overview
This is a full-stack Bookstore application that allows users to search for books, view details, and manage their own collection. The backend is built with Spring Boot, while the frontend is built with React, HTML, and CSS.

## Features
- Search for books using Google Books API
- View book details
- Add books to the local collection
- View all books in the collection

## Technologies
### Backend
- Java
- Spring Boot
- JPA/Hibernate
- H2 Database (for development)

### Frontend
- React
- HTML
- CSS
- Javascript

## Setup Instructions

### Prerequisites
- Java 11 or higher
- Node.js and npm
- Maven

### Backend Setup (Spring Boot)

1. **Clone the repository**:

    git clone https://github.com/yourusername/bookstore-backend.git
    cd bookstore-backend


2. **Set up the Google Books API key**:

    - Obtain an API key from the Google Cloud Console.
    - Add the API key to `application.properties` file:

      properties
      google.books.api.key=YOUR_GOOGLE_BOOKS_API_KEY
      

3. **Build and run the Spring Boot application**:
   
    mvn clean install
    mvn spring-boot:run


4. **Access H2 Database Console (for development)**:
    - URL: `http://localhost:8080/h2-console`
    - JDBC URL: `jdbc:h2:mem:testdb`
    - Username: `sa`
    - Password: `password`


### Frontend Setup (React)
1. **Clone the repository**:
  
    git clone https://github.com/yourusername/bookstore-frontend.git
    cd bookstore-frontend
  

2. **Install dependencies**:
   
    npm install
   

3. **Start the React application**:
  
    npm start
   

4. **Access the application**:
    - URL: `http://localhost:3000`

## API Endpoints
### Base URL: `http://localhost:8080`
- **GET /books**: Retrieve all books in the collection
- **GET /books/{id}**: Retrieve details of a specific book by ID
- **POST /books**: Add a new book to the collection
- **PUT /books/{id}**: Update details of a specific book by ID
- **DELETE /books/{id}**: Delete a book from the collection by ID

- ** Will add more

## Usage
1. **Search for Books**:
    - Use the search feature in the React frontend to find books using the Google Books API.

2. **View Book Details**:
    - Click on a book to view more details.

3. **Manage Collection**:
    - Add books to your collection using the form provided in the frontend.
    - View all books in your collection by navigating to the 'All Books' section.

## Contributing
1. **Fork the repository**.
2. **Create a new branch** (`git checkout -b feature/your-feature-name`).
3. **Commit your changes** (`git commit -am 'Add some feature'`).
4. **Push to the branch** (`git push origin feature/your-feature-name`).
5. **Create a new Pull Request**.


