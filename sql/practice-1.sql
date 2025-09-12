drop database sample123;
create database sample123;
use sample123;
set sql_safe_updates = 0;
create table course(
	course_code int primary key,
    name varchar(50),
    fee int,
    trainer varchar(100),
    sessions int,
    start_date date
);

insert into course (course_code, name, fee, trainer, sessions, start_date) values
	(102, "Java", 1000, 'Trainer 1', 50, "2025-08-01"),
    (103, "PYthon", 2000, 'Trainer 2', 60, "2025-08-02"),
    (104, "AI", 1500, 'Trainer 3', 45, "2025-08-03"),
    (105, "MERN", 2500, 'Trainer 1', 16, "2025-08-10"),
    (106, "React", 1000, 'Trainer 2', 25, "2025-08-12"),
    (107, "English", 1500, 'Trainer 3', 30, "2025-08-08"),
    (108, "PHP", 3000, 'Trainer 1', 50, "2025-08-01"),
    (109, "GO", 4500, 'Trainer 1', 50, "2025-08-09"),
    (110, "Maths", 1250, 'Trainer 2', 40, "2025-08-14")
    ;
    select FEE,name from course;
    select * from course where fee >= 1500;
    select name, fee from course where fee >= 1500 order by fee;
    select * from course where fee >= 1500 and sessions <=20;
    select * from course where fee >= 1500 or sessions <= 20;
    select name as course_name, fee as fees, sessions as total_session, trainer from course where fee >= 1500 or sessions <=20;
    /* group by */
    select * from course;
    select trainer,sum(sessions) from course group by trainer;
select * from course;
 /* want to find one specific course*/
select * from course where course_code = 105;

/* select with date condition */
select * from course where start_date >='2025-08-03';

/* filter on the varchar column */
select * from course where trainer =  'trainer 1';

/*i want to get the course starting with letter "M" */
select * from course where name like 'M%';
/*i wnat to get the course starting with the end letter N*/
select * from course where name like '%n';

 /* agrreegate function*/
select min(fee) from course;
select max(fee) from course;
 select sum(sessions) from course;
 select avg(sessions) from course;
 select count(*) from course; /*gives row*/
 
 