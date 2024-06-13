-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: eardreams_db
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `brani`
--

DROP TABLE IF EXISTS `brani`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `brani` (
  `id` int NOT NULL AUTO_INCREMENT,
  `titolo` varchar(100) DEFAULT NULL,
  `artista` varchar(50) DEFAULT NULL,
  `album` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `brani`
--

LOCK TABLES `brani` WRITE;
/*!40000 ALTER TABLE `brani` DISABLE KEYS */;
INSERT INTO `brani` VALUES (1,'Shape of You','Ed Sheeran','÷'),(2,'Bohemian Rhapsody','Queen','A Night at the Opera'),(3,'Havana','Camila Cabello','Camila'),(4,'Someone Like You','Adele','21'),(5,'Uptown Funk','Mark Ronson ft. Bruno Mars','Uptown Special'),(6,'Billie Jean','Michael Jackson','Thriller'),(7,'Hello','Adele','25'),(8,'Perfect','Ed Sheeran','÷'),(9,'Livin\' on a Prayer','Bon Jovi','Slippery When Wet'),(10,'Bad Romance','Lady Gaga','The Fame Monster'),(11,'Can\'t Stop the Feeling!','Justin Timberlake','Trolls (Original Motion Picture Soundtrack)'),(12,'Believer','Imagine Dragons','Evolve'),(13,'Somebody That I Used to Know','Gotye ft. Kimbra','Making Mirrors'),(14,'Sweet Child o\' Mine','Guns N Roses','Appetite for Destruction'),(15,'Rolling in the Deep','Adele','21'),(16,'Radioactive','Imagine Dragons','Night Visions'),(17,'Shake It Off','Taylor Swift','1989'),(18,'Stay with Me','Sam Smith','In the Lonely Hour'),(19,'All of Me','John Legend','Love in the Future'),(20,'Stressed Out','Twenty One Pilots','Blurryface'),(21,'Take Me to Church','Hozier','Hozier'),(22,'Love Story','Taylor Swift','Fearless'),(23,'Royals','Lorde','Pure Heroine'),(24,'See You Again','Wiz Khalifa ft. Charlie Puth','Furious 7 (Original Motion Picture Soundtrack)'),(25,'Counting Stars','OneRepublic','Native'),(26,'Love Yourself','Justin Bieber','Purpose'),(27,'Let Her Go','Passenger','All the Little Lights'),(28,'Roar','Katy Perry','Prism'),(29,'Counting Stars','OneRepublic','Native'),(30,'Photograph','Ed Sheeran','x'),(31,'Glory Days','Bruce Springsteen','Born in the USA'),(32,'Happy','Pharrell Williams','G I R L'),(33,'Take On Me','a-ha','Hunting High and Low'),(34,'Can\'t Help Falling in Love','Elvis Presley','Blue Hawaii'),(35,'No Scrubs','TLC','FanMail'),(36,'Danny\'s Song','Kenny Loggins','Sittin In'),(37,'Kiss Me','Sixpence None The Richer','Sixpence None the Richer'),(38,'Everything I Do','Bryan Adams','Waking Up the Neighbours'),(39,'Dancing Queen','ABBA','Arrival'),(40,'Don\'t Stop Believin\'','Journey','Escape'),(41,'I Want to Hold Your Hand','The Beatles','Meet The Beatles!'),(42,'Bohemian Rhapsody','Queen','A Night at the Opera'),(43,'Don\'t Stop Believin\'','Journey','Escape'),(44,'I Will Always Love You','Whitney Houston','The Bodyguard Original Soundtrack Album'),(45,'Like a Virgin','Madonna','Like a Virgin'),(46,'Call Me Maybe','Carly Rae Jepsen','Kiss'),(47,'Wonderwall','Oasis','(Whats the Story) Morning Glory?'),(48,'Before He Cheats','Carrie Underwood','Some Hearts'),(49,'Dreams','Fleetwood Mac','Rumours'),(50,'I Gotta Feeling','The Black Eyed Peas','The E.N.D.');
/*!40000 ALTER TABLE `brani` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-13 14:50:00
