# Test-Mybatis
springboot mybatis sample

```sql
CREATE DATABASE  IF NOT EXISTS `user` 
USE `user`;
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `NAME` varchar(45) NOT NULL,
  `AGE` int NOT NULL,
  PRIMARY KEY (`ID`,`NAME`,`AGE`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
LOCK TABLES `test` WRITE;
INSERT INTO `test` VALUES (1,'Alley',18),(2,'Lily',20);
UNLOCK TABLES;
```
