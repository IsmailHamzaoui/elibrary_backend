CREATE SCHEMA IF NOT EXISTS library;

DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS exam;
DROP TABLE IF EXISTS exercise;
DROP TABLE IF EXISTS thesis;

CREATE TABLE book(
    book_id varchar(255) PRIMARY KEY,
    title text,
    author text,
    publisher text,
    book_date TIMESTAMP,
    rfid_tag double,
    status boolean
);

CREATE TABLE student(
    student_id varchar(255) PRIMARY KEY,
    username text,
    phone_number number ,
    email text,
    password text,
    rfid_tag double
);

CREATE TABLE exam(
    exam_id varchar(255) PRIMARY KEY,
    exam_subject text,
    exam_date text,
    exam_type text
);
CREATE TABLE exercise(
    exercise_id varchar(255) PRIMARY KEY,
    exercise_subject text,
    exercise_date text,
);

CREATE TABLE thesis(
    thesis_id varchar(255) PRIMARY KEY,
    thesis_title text,
    thesis_date TIMESTAMP ,
    thesis_student text ,
);

INSERT INTO book (book_id, title, author, publisher, book_date, status) VALUES ( 'book1', 'IOT', 'Ismail Hamzaoui', 'ENETCOM', '2012-09-17 18:47:52.069', false );
INSERT INTO book (book_id, title, author, publisher, book_date, status) VALUES ( 'book2', 'Compatibilite electromagnetique', 'Joshua Bloch', 'ENETCOM', '2019-09-17 18:47:52.069', true );
INSERT INTO book (book_id, title, author, publisher, book_date, status) VALUES ( 'book3', 'Technologie de circuits integres analogiques', 'Erik Riec', 'ENETCOM', '2012-09-17 18:47:52.069', false );
INSERT INTO book (book_id, title, author, publisher, book_date, status) VALUES ( 'book4', 'Architecture des circuits programmables', 'Maximilian', 'ENETCOM', '2016-09-17 18:47:52.069', true );
INSERT INTO book (book_id, title, author, publisher, book_date, status) VALUES ( 'book5', 'Electronique de commutation', 'Ismail Hamzaoui', 'ENETCOM', '2017-09-17 18:47:52.069', false );

INSERT INTO student (student_id, username, phone_number, email, password, rfid_tag) VALUES ('student1', 'Hamzaoui Ismail', 23851171, 'thehamzaoui1996@gmail.com', 'hdiodag', 0);

INSERT INTO exam (exam_id, exam_subject, exam_date, exam_type) VALUES ('exam1', 'Electronique de commutation', '2020/2019', 'DS');
INSERT INTO exam (exam_id, exam_subject, exam_date, exam_type) VALUES ('exam2', 'Compatibilite electromagnetique', '2020/2019', 'EX');

INSERT INTO exercise (exercise_id, exercise_subject, exercise_date) VALUES ('exercise1', 'Electronique de commutation', '2020/2019');
INSERT INTO exercise (exercise_id, exercise_subject, exercise_date) VALUES ('exercise2', 'Compatibilite electromagnetique', '2020/2019');

INSERT INTO thesis (thesis_id, thesis_title, thesis_date, thesis_student) VALUES ('thesis1', 'library management', '2017-09-17 18:47:52.069', 'Ismail Hamzaoui');
INSERT INTO thesis (thesis_id, thesis_title, thesis_date, thesis_student) VALUES ('thesis2', 'Smart Parking', '2018-09-17 18:47:52.069', 'Ismail Hamzaoui');