/*
Navicat MySQL Data Transfer

Source Server         : ROOT
Source Server Version : 80022
Source Host           : localhost:3306
Source Database       : javaeegroup

Target Server Type    : MYSQL
Target Server Version : 80022
File Encoding         : 65001

Date: 2022-07-03 17:17:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for leader
-- ----------------------------
DROP TABLE IF EXISTS `leader`;
CREATE TABLE `leader` (
  `leadername` varchar(255) NOT NULL,
  PRIMARY KEY (`leadername`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of leader
-- ----------------------------
INSERT INTO `leader` VALUES ('程锐');
