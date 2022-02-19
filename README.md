# Test-Mybatis
springboot mybatis sample <br>

### Test
```url
http://localhost:8080/user
[
  {
    id: 1,
    name: "Alley",
    age: 18,
  },
  {
    id: 2,
    name: "Lily",
    age: 20,
  },
]

http://localhost:8080/user?id=1
{
  id: 1,
  name: "Alley",
  age: 18,
}
```

### Spring
```java
maven-archetype-quickstart
```


### MySQL
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
