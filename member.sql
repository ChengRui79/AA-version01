/*
Navicat MySQL Data Transfer

Source Server         : ROOT
Source Server Version : 80022
Source Host           : localhost:3306
Source Database       : javaeegroup

Target Server Type    : MYSQL
Target Server Version : 80022
File Encoding         : 65001

Date: 2022-07-03 17:17:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `memid` int NOT NULL,
  `memname` varchar(255) DEFAULT NULL,
  `grpname` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES ('1001', '程锐', '美好旅行社');
INSERT INTO `member` VALUES ('1002', '徐瀚', '好路线旅行社');
INSERT INTO `member` VALUES ('1003', '徐炎', '心航旅行社');
INSERT INTO `member` VALUES ('1004', '许连杰', '好望角旅行社');
INSERT INTO `member` VALUES ('1005', '潘泉福', '随心乐程旅行社');
INSERT INTO `member` VALUES ('1006', '叶子铭', '云侨旅行社');
INSERT INTO `member` VALUES ('1007', '傅思琴', '美好旅行社');
INSERT INTO `member` VALUES ('1008', '徐温瑞', '美好旅行社');
INSERT INTO `member` VALUES ('1009', '杜奕萱', '美好旅行社');
INSERT INTO `member` VALUES ('1010', '张星紫', '好路线旅行社');
INSERT INTO `member` VALUES ('1011', '宋昊宁', '好路线旅行社');
INSERT INTO `member` VALUES ('1012', '吴乐', '好路线旅行社');
INSERT INTO `member` VALUES ('1013', '许世轩', '心航旅行社');
INSERT INTO `member` VALUES ('1014', '张思琪', '心航旅行社');
INSERT INTO `member` VALUES ('1015', '王叔文', '心航旅行社');
INSERT INTO `member` VALUES ('1016', '宋思琪', '好望角旅行社');
INSERT INTO `member` VALUES ('1017', '朱俊贤', '好望角旅行社');
INSERT INTO `member` VALUES ('1018', '陈怡然', '好望角旅行社');
