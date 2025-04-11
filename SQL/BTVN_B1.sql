CREATE DATABASE IF NOT EXISTS BTVN_B1;
USE BTVN_B1;

CREATE TABLE Student (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    birth_date DATE NOT NULL,
    gender ENUM('Male', 'Female') NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    gpa DECIMAL(3,2) CHECK (gpa >= 0.0 AND gpa <= 4.0)
);

CREATE TABLE Professor (
    professor_id INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    hire_date DATE NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE Course (
    course_id INT AUTO_INCREMENT PRIMARY KEY,
    course_name VARCHAR(100) NOT NULL,
    credits INT CHECK (credits >= 1 AND credits <= 5),
    professor_id INT,
    FOREIGN KEY (professor_id) REFERENCES Professor(professor_id)
);

CREATE TABLE Enrollment (
    student_id INT,
    course_id INT,
    enroll_date DATE NOT NULL,
    grade INT CHECK (grade >= 1 AND grade <= 20),
    PRIMARY KEY (student_id, course_id),
    FOREIGN KEY (student_id) REFERENCES Student(student_id),
    FOREIGN KEY (course_id) REFERENCES Course(course_id)
);