-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: data_schema
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `patronymic` varchar(45) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `student_book_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Alexandra','Atamanchuk','Anatolievna','2003-05-17',28048601),
(2,'Gleb','Bekish','Evgenievich','2003-08-09',28048702),
(3,'Alexandr','Burlaka','Sergeevich','2002-12-24',28048803),
(4,'Vladlena','Vatamanyuk','Vladimirovna','2002-11-14',28048904),
(5,'Sofiia','Geyko','Ivanivna','2002-02-14',28051105),
(6,'Maxim','Honcharov','Sergeevich','2003-03-23',28049006),
(7,'Stanislav','Didukh','Konstantinovich','2002-12-08',28049107),
(8,'Vilaliy','Kamenskiy','Sergeevich','2003-07-29',28049208),
(9,'Vyacheslav','Kasterov','Alexandrovich','2003-03-02',28049309),
(10,'Anna','Kondrat','Dmitrievna','2002-11-07',28049410),
(11,'Dmitriy','Kuznetsov','Konstantinovich','2003-08-29',28049511),
(12,'Nikita','Mishenko','Sergeevich','2001-11-10',28049712),
(13,'Viktoriia','Mudruk','Dmitrievna','2002-10-22',28049813),
(14,'Alina','Namestnikova','Alexandrovna','2002-05-11',28049914),
(15,'Dmitriy','Panchenko','Anatolievich','2002-11-15',28050015),
(16,'Ivan','Piven','Sergeevich','2002-12-17',28050116),
(17,'Denis','Polishuk','Dmitrievich','1996-11-15',28050217),
(18,'Egor','Potebenko','Dmitrievich','2003-05-19',28050318),
(19,'Alexandr','Sergienko','Sergeevich','2002-11-19',28050519),
(20,'Alexandra','Tatarina','Andrievna','2001-08-03',28050620);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-22 14:09:07
