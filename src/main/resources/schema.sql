create table employees(
                      ID varchar(20),
                      NAME varchar(100) not null,
                      TEAM varchar(100),
                      ROLE varchar(100),
                      PRIMARY KEY ( ID )
);
INSERT INTO employees values ('PE01','John Doe', 'Finance',null);
INSERT INTO employees values ('PE02','Smith Doe', 'Finance','developer');
INSERT INTO employees values ('PE03','Alex', 'infra','developer');
INSERT INTO employees values ('PE04','Sandra', 'infra','developer');
INSERT INTO employees values ('PE05','Patrik', 'customer','developer');
INSERT INTO employees values ('PE06','Berry', 'customer-support','hr');