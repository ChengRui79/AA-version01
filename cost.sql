/*
Navicat MySQL Data Transfer

Source Server         : ROOT
Source Server Version : 80022
Source Host           : localhost:3306
Source Database       : javaeegroup

Target Server Type    : MYSQL
Target Server Version : 80022
File Encoding         : 65001

Date: 2022-07-03 17:17:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cost
-- ----------------------------
DROP TABLE IF EXISTS `cost`;
CREATE TABLE `cost` (
  `uname` varchar(255) DEFAULT NULL,
  `grpname` varchar(255) DEFAULT NULL,
  `amount` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cost
-- ----------------------------
INSERT INTO `cost` VALUES ('程锐', '美好旅行社', '1000');
INSERT INTO `cost` VALUES ('徐瀚', '好路线旅行社', '500');
INSERT INTO `cost` VALUES ('徐炎', '心航旅行社', '300');
INSERT INTO `cost` VALUES ('许连杰', '好望角旅行社', '500');
INSERT INTO `cost` VALUES ('叶子铭', '随心乐程旅行社', '300');
INSERT INTO `cost` VALUES ('潘泉福', '云侨旅行社', '350');
