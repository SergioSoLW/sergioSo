-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: cass
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `aid` int NOT NULL AUTO_INCREMENT,
  `aname` varchar(45) DEFAULT NULL,
  `adate` date NOT NULL,
  `apwd` varchar(45) NOT NULL,
  `aaccount` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='		';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'TYDHG','2020-12-17','123123','TYDHG'),(2,'HJDHG','2020-12-17','123','abc');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message`
--

DROP TABLE IF EXISTS `message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `message` (
  `mid` int NOT NULL AUTO_INCREMENT,
  `uname` varchar(45) DEFAULT NULL,
  `pname` varchar(45) DEFAULT NULL,
  `mdate` date NOT NULL,
  `mconten` char(255) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message`
--

LOCK TABLES `message` WRITE;
/*!40000 ALTER TABLE `message` DISABLE KEYS */;
/*!40000 ALTER TABLE `message` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `news` (
  `nid` int NOT NULL AUTO_INCREMENT,
  `nimg1` varchar(250) DEFAULT NULL,
  `nimg2` varchar(250) DEFAULT NULL,
  `ntitle` varchar(250) DEFAULT NULL,
  `ncontent` text,
  `ndate` date DEFAULT NULL,
  `naddress` varchar(45) DEFAULT NULL,
  `ndesc` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (34,'5ff114f7-d31c-44ed-9e4c-841fdb8e773c.jpg',NULL,'qqq====+','123131231231231231231\r\nedqdsdsd\r\nweqweqeeq\r\neqdqdqw','2012-12-10','HJDHG','11111'),(35,'c369f6e4-7b91-486e-93ef-9fb85a0aa6d8.jpg',NULL,'还是测试','dqweqe41e424rfafs','1212-05-12','HJDHG','13123dsdasdas'),(36,'c49413e4-f318-47ce-8350-67731a5868a1.jpg',NULL,'还是测试a~','dqweqe41e424rfafsewe','1212-05-12','HJDHG','13123dsdasdaswe'),(37,'6a7042e6-962a-4cda-bd8a-6dc40fce224a.jpg',NULL,'测试添加查询','啊啊喂喂喂喂喂热热热','2020-10-20','HJDHG','阿巴巴巴'),(38,'af2974d5-1bec-47eb-bd9b-19ec3d681e2b.jpg',NULL,'测试','QAQ======================================================+','2021-05-12','HJDHG','qwq===============================================+'),(39,'8ceaa278-4bb4-4003-a8b7-0e9525a7cd64.jpg',NULL,'qqq','123131231231231231231\r\nedqdsdsd\r\nweqweqeeq\r\neqdqdqw','2012-12-10','HJDHG','11111'),(40,'5ff114f7-d31c-44ed-9e4c-841fdb8e773c.jpg',NULL,'dddd','123131231231231231231\r\nedqdsdsd\r\nweqweqeeq\r\neqdqdqw','2012-12-10','HJDHG','11111'),(41,'f3f4cc53-8ec3-4779-b03b-a689c41dbb75.jpg',NULL,'测试中','测试结果：\r\n<p>我我我我我我</p> ','2021-06-12','HJDHG','通道测试 12'),(42,'a283b719-0499-4c16-a983-3ef85b10932b.jpg',NULL,'还是测试1111','eqeqe','2012-12-01','HJDHG','qweqwe');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `pid` int NOT NULL AUTO_INCREMENT,
  `pname` varchar(45) NOT NULL,
  `pimg` char(255) NOT NULL,
  `phot` int DEFAULT NULL,
  `pprice` decimal(12,0) NOT NULL,
  `psize` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `uid` int NOT NULL AUTO_INCREMENT,
  `uname` varchar(45) DEFAULT NULL,
  `upwd` varchar(45) NOT NULL,
  `uimg` varchar(45) DEFAULT NULL,
  `uemail` varchar(45) NOT NULL,
  `udate` date NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='						';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,NULL,'5d388a7918c74b0862f797d05d70c324',NULL,'123123','2020-12-17'),(2,NULL,'4297f44b13955235245b2497399d7a93',NULL,'2311437128@qq.com','2020-12-17'),(3,NULL,'25d55ad283aa400af464c76d713c07ad',NULL,'2464775244@qq.com','2020-12-17'),(4,NULL,'e10adc3949ba59abbe56e057f20f883e',NULL,'2384556848@qq.com','2020-12-24'),(5,NULL,'e10adc3949ba59abbe56e057f20f883e',NULL,'12345@gmail.com','2020-12-24'),(6,NULL,'4297f44b13955235245b2497399d7a93',NULL,'123123@qq.com','2020-12-24'),(7,NULL,'123',NULL,'2656@qq.com','2021-12-08'),(8,NULL,'123',NULL,'244775244@qq.com','2021-06-17'),(9,NULL,'1234',NULL,'2656@qq.com','2021-06-17'),(10,NULL,'123',NULL,'2656@qq.com','2021-06-17'),(11,NULL,'123',NULL,'1231@qq.com','2021-06-18'),(12,NULL,'123',NULL,'2404@qq.com','2021-06-18');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-18 10:41:35
