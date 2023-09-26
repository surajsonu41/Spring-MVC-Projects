create database USA_Stores;

create table storetable (store_Id int, store_Name varchar(40), store_Area varchar(40), store_zipcode int, store_distance float);
ALTER TABLE storetable MODIFY store_Id INT PRIMARY KEY AUTO_INCREMENT;