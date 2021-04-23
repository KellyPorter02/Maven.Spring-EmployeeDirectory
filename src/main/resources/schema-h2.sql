DROP TABLE employees;

CREATE TABLE employees
(
    empId       INT          NOT NULL PRIMARY KEY AUTO_INCREMENT,
    firstName   VARCHAR2(25) NOT NULL DEFAULT '',
    lastName    VARCHAR2(25) NOT NULL DEFAULT '',
    title       VARCHAR2(25) NOT NULL DEFAULT '',
    phoneNumber VARCHAR2(20) NOT NULL DEFAULT '',
    email       VARCHAR2(40) NOT NULL DEFAULT '',
    hireDate    DATE         NOT NULL,
    managerId   INT          NOT NULL,
    deptId  INT          NOT NULL
);


DROP TABLE departments;

CREATE TABLE departments
(
  deptId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  deptName VARCHAR2(25) NOT NULL DEFAULT '',
  managerId INT NOT NULL,
);




DROP SEQUENCE hibernate_sequence;

CREATE SEQUENCE hibernate_sequence;