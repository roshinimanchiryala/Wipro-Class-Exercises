create database sample123;
use sample123;

create table student(
       name varchar(100),
       age int,
       student_number int
       );
   show tables;
   create table product(
   name varchar(50),
   price decimal(5,2)
   );
   show tables;
   desc student;
   insert into student (name,age,student_number) values("Ramesh",20,203);
   insert into student (name,age,student_number) values("Raju",21,204);
   select * from student;
   insert into student (name,age,student_number) values ("rani",23,205),
   ("poja",22,205),
   ("poorna",22,205),
   ("bala",21,207),
   ("rama",23,208);
   select * from student;
   create table employee (
   emp_number int primary key,
   name varchar(100)
   );
   desc employee;
   insert into employee (emp_number, name) values (101, "Raj");
   insert into employee (emp_number, name) values (101, "Ravi");
   create table course(
   course_code int primary key,
   name varchar(50),
   fee int,
   trainer varchar(100),
   sessions int,
   start_date date
   );
   insert into course (course_code, name, fee, sessions) values (101,"Java",10000,50);
   insert into course (course_code, name, fee, sessions) values (102,"Java",10000,50);
   select * from course;
   create table animal(
   id int primary key,
   name varchar(100),
   color varchar(20) not null /*mandate */
   );
   desc animal;
   insert into animal(id ,name, color) values(1,"Tiger","Gold black stripes");
   select * from animal;
   create table citizen(
   pan_number varchar(100) primary key,
   name varchar(100) not null, /*mandate*/
   age int,
   aadhar_number varchar(100) /*unique - but can accept null */
   );
   insert into citizen(pan_number,name, age, aadhar_number) values ("AA123","raj",22,"ASD123");
   insert into citizen(pan_number, name,age) values ("TYU37","yusf",22);
   desc citizen;
   
   