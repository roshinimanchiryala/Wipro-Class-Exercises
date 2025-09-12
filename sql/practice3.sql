create database session;
use session;

CREATE TABLE course(
    course_code INT PRIMARY KEY,
    name VARCHAR(50),
    fee INT,
    trainer VARCHAR(100),
    sessions INT,
    start_date DATE
);

INSERT INTO course (course_code, name, fee, trainer, sessions, start_date) VALUES
(101, 'Java', 1000, 'Trainer 1', 50, '2025-08-01'),
(102, 'Python', 2000, 'Trainer 2', 60, '2025-08-02'),
(103, 'AI', 1500, 'Trainer 3', 45, '2025-08-03'),
(104, 'MERN', 2500, 'Trainer 1', 16, '2025-08-10'),
(105, 'React', 1000, 'Trainer 2', 25, '2025-08-12');

CREATE TABLE student(
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    course_code INT,
    enrollment_date DATE,
    fee_paid INT,
    FOREIGN KEY (course_code) REFERENCES course(course_code)
);


INSERT INTO student (student_id, name, course_code, enrollment_date, fee_paid) VALUES
(1, 'Alex', 101, '2025-08-05', 1000),
(2, 'Ali', 102, '2025-08-06', 2000),
(3, 'Roshini', 103, '2025-08-07', 1500),
(4, 'John', 104, '2025-08-12', 2500),
(5, 'Maya', 101, '2025-08-08', 1000),
(6, 'Sara', 105, '2025-08-14', 1000),
(7, 'Tom', 106, '2025-08-15', 1200);  

SELECT s.name AS student_name, c.name AS course_name, c.trainer, s.fee_paid
FROM student s
INNER JOIN course c
ON s.course_code = c.course_code;

SELECT s.name AS student_name, c.name AS course_name, c.trainer
FROM student s
LEFT JOIN course c
ON s.course_code = c.course_code;


SELECT s.name AS student_name, c.name AS course_name, c.trainer
FROM student s
RIGHT JOIN course c
ON s.course_code = c.course_code;


SELECT s.name AS student_name, c.name AS course_name
FROM student s
LEFT JOIN course c ON s.course_code = c.course_code
UNION
SELECT s.name AS student_name, c.name AS course_name
FROM student s
RIGHT JOIN course c ON s.course_code = c.course_code;


SELECT SUM(fee_paid) AS total_fees_paid FROM student;

SELECT trainer, SUM(sessions) AS total_sessions
FROM course
GROUP BY trainer;




