DROP TABLE IF EXISTS user;  
CREATE TABLE user (  
  id int(11) NOT NULL AUTO_INCREMENT,  
  user_name varchar(20) NOT NULL,  
  sex varchar(1),  
  age int(3),
  balance decimal(19,2),
  PRIMARY KEY (id)
);