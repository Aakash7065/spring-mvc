# spring-mvc
psql setup

create user jpademo;

alter user jpademo with encrypted password 123;

create database userdemo;

grant all privileges on database userdemo to jpademo;

