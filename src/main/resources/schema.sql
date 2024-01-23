create table employees(
                      ID varchar(20),
                      NAME varchar(100) not null,
                      TEAM varchar(100),
                      ROLE varchar(100),
                      PRIMARY KEY ( ID )
);
INSERT INTO employees values ('PE01','John Doe', 'Finance',null);