DROP DATABASE IF EXISTS assignment20_db;

CREATE DATABASE assignment20_db;

USE assignment20_db;
CREATE TABLE students (
    roll_no INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    course VARCHAR(100) NOT NULL,
    marks DOUBLE NOT NULL
);

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(100) NOT NULL,
    salary DOUBLE NOT NULL
);

SHOW TABLES;