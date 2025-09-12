use sample123;
set sql_safe_updates = 0;
select * from course;

/*update command */

update course set fee = 10000 where course_code = 104;
select * from course;

/* updating 2 valuesin table*/
update course set trainer = "trainer 3", where name like '%GO';
delete from course where course_code=107;
select * from course;
delete from cousre--> only deletes the rows not table
drop from course..> deletes table and rows
