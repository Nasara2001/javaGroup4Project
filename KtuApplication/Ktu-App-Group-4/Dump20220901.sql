CREATE DATABASE  IF NOT EXISTS `ktuapp` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ktuapp`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: ktuapp
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `portal`
--

DROP TABLE IF EXISTS `portal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `portal` (
  `enquire_id` int NOT NULL AUTO_INCREMENT,
  `Step1` varchar(200) DEFAULT NULL,
  `step2` varchar(200) DEFAULT NULL,
  `step3` varchar(200) DEFAULT NULL,
  `step4` varchar(200) DEFAULT NULL,
  `step5` varchar(200) DEFAULT NULL,
  `step6` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`enquire_id`),
  UNIQUE KEY `question_id_UNIQUE` (`enquire_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `portal`
--

LOCK TABLES `portal` WRITE;
/*!40000 ALTER TABLE `portal` DISABLE KEYS */;
INSERT INTO `portal` VALUES (1,'1. Lunch/openthe KTU Connect app','2. Login with your institutional email and password','3. Navigate to the top left conner and click on the 3 horizontal lines','4. Select Course registration from the\n menu','5. Click the Checkboxes for courses you want to register and click on the add button to add them','6. Click on the confirm button to complete the course registration'),(2,'1. Lunch/openthe KTU Connect app','2. Login with your institutional email and password','3. Navigate to the top left conner and click on the 3 horizontal lines','4. Select Published results from the \nmenu','5. Scroll throgh to see current and previous results',NULL),(4,'1. Lunch/openthe KTU Connect app','2. Login with your institutional email and password','3. Navigate to the top left conner and click on the 3 horizontal lines','4. Select Course registration from the menu','5. Click the Checkboxes for courses you want to register and click on the add button to add them.','7. Click on the confirm button to complete the course registration'),(5,'1. Lunch/openthe KTU Connect app','2. Login with your institutional email and password','3. Navigate to the top left conner and click on the 3 horizontal lines','4. Select Published results from the menu','5. Click the Checkboxes for courses you want to register and click on the add button to add them.','6. Click on the confirm button to complete the course registration'),(6,'1. Lunch/openthe KTU Connect app','2. Login with your institutional email and password','3. Navigate to the top left conner and click on the 3 horizontal lines','4. Select Published results from the menu','5.  Scroll throgh to see current and previous results',NULL);
/*!40000 ALTER TABLE `portal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `questions` (
  `question_id` int NOT NULL AUTO_INCREMENT,
  `question` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`question_id`),
  UNIQUE KEY `question_id_UNIQUE` (`question_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES (1,'question'),(2,'question'),(3,'question'),(4,'question'),(5,'question'),(6,'question'),(7,'question'),(8,'question'),(9,'TextArea[id=questionTA, styleClass=text-input text-area]'),(10,''),(11,''),(12,'INSERT INTO questions(question)VALUES(?)'),(13,'hvh'),(14,'I WANT TO REGITER RISIT'),(15,'i want to leave the school and i want my fees'),(16,'hello i did\'t get what i want'),(17,NULL),(18,'he'),(19,'he'),(20,'hgjb'),(21,NULL),(22,'h'),(23,NULL),(24,'j'),(25,NULL),(26,'hollo'),(27,NULL),(28,NULL),(29,NULL),(30,NULL),(31,'fgg\njgjhj\njj'),(32,'hey');
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vle`
--

DROP TABLE IF EXISTS `vle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vle` (
  `Step_id` int NOT NULL AUTO_INCREMENT,
  `step1` varchar(100) NOT NULL,
  `step2` varchar(100) NOT NULL,
  `step3` varchar(100) NOT NULL,
  `step4` varchar(100) NOT NULL,
  `step5` varchar(200) NOT NULL,
  `step6` varchar(100) NOT NULL,
  `step7` varchar(100) NOT NULL,
  `step8` varchar(100) NOT NULL,
  `step9` varchar(100) NOT NULL,
  PRIMARY KEY (`Step_id`),
  UNIQUE KEY `Step_id_UNIQUE` (`Step_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vle`
--

LOCK TABLES `vle` WRITE;
/*!40000 ALTER TABLE `vle` DISABLE KEYS */;
INSERT INTO `vle` VALUES (2,'1. Tap on the link vle.ktu.edu.gh','2. Tap the upper right corner','3. Tap on Login','4. Enter username and password','5. Again, Tap on Login','','','',''),(4,'1. Click of Forgotten your username or password','2. Enter your institutional email address','3. Click on search','4. Read the instructions and click on continue','5. Login to the institutional email account. You will see a new email sent a sa password reset request ','6. check your span if you dont it in your inbox','7. Read the instructions and click on the link','8. Set your new password for your VLE account','9. Tap on save chnages and it will redirect you to your login page');
/*!40000 ALTER TABLE `vle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wifi`
--

DROP TABLE IF EXISTS `wifi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `wifi` (
  `wifi_step_id` int NOT NULL AUTO_INCREMENT,
  `step1` varchar(200) NOT NULL,
  `step2` varchar(200) NOT NULL,
  `step3` varchar(200) NOT NULL,
  `step4` varchar(200) NOT NULL,
  PRIMARY KEY (`wifi_step_id`),
  UNIQUE KEY `wifi_step_id_UNIQUE` (`wifi_step_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wifi`
--

LOCK TABLES `wifi` WRITE;
/*!40000 ALTER TABLE `wifi` DISABLE KEYS */;
INSERT INTO `wifi` VALUES (1,'1. Go to Settings on your Android device and select WIFI or WIFI Connection.','2. Click on the the WIFI within your range to configure your device for use.','3. Now enter the password of the WIFI selected in the space provided','4. The WIFI connection will then be established');
/*!40000 ALTER TABLE `wifi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wifi_passwords`
--

DROP TABLE IF EXISTS `wifi_passwords`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `wifi_passwords` (
  `passwords_id` int NOT NULL AUTO_INCREMENT,
  `ktu_staff` varchar(45) NOT NULL,
  `ktu_enterprise` varchar(45) NOT NULL,
  PRIMARY KEY (`passwords_id`),
  UNIQUE KEY `passeords_id_UNIQUE` (`passwords_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wifi_passwords`
--

LOCK TABLES `wifi_passwords` WRITE;
/*!40000 ALTER TABLE `wifi_passwords` DISABLE KEYS */;
INSERT INTO `wifi_passwords` VALUES (1,'Staff3 password is Ktust@ff','KTU ENTERPRISE is Ktust@ff');
/*!40000 ALTER TABLE `wifi_passwords` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'ktuapp'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-01 23:03:00
