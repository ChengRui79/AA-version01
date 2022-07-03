/*
Navicat MySQL Data Transfer

Source Server         : ROOT
Source Server Version : 80022
Source Host           : localhost:3306
Source Database       : javaeegroup

Target Server Type    : MYSQL
Target Server Version : 80022
File Encoding         : 65001

Date: 2022-07-03 17:17:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tuan
-- ----------------------------
DROP TABLE IF EXISTS `tuan`;
CREATE TABLE `tuan` (
  `groupid` int NOT NULL,
  `leader` varchar(255) DEFAULT NULL,
  `groupname` varchar(255) DEFAULT NULL,
  `grouplocation` varchar(255) DEFAULT NULL,
  `events` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tuan
-- ----------------------------
INSERT INTO `tuan` VALUES ('1001', '程锐', '美好旅行社', '周庄古镇', '周庄沈厅，特色美食，漫游古镇');
INSERT INTO `tuan` VALUES ('1002', '徐瀚', '好路线旅行社', '拙政园', '兰雪堂，别有洞天，盆景园');
INSERT INTO `tuan` VALUES ('1003', '徐炎', '心航旅行社', '环秀山庄', '补秋山房，闻泉亭，苏州刺绣研究所');
INSERT INTO `tuan` VALUES ('1004', '许连杰', '好望角旅行社', '西山雕绣楼', '“活水“码头，仁本堂');
INSERT INTO `tuan` VALUES ('1005', '叶子铭', '随心乐程旅行社', '苏州博物馆', '”邂逅江南“服饰走秀，”元代的江南“特展打卡');
INSERT INTO `tuan` VALUES ('1006', '潘泉福', '云侨旅行社', '白塘公园', '山地自然生态林区，岛屿生态自然区');
