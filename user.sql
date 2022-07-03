/*
Navicat MySQL Data Transfer

Source Server         : ROOT
Source Server Version : 80022
Source Host           : localhost:3306
Source Database       : javaeegroup

Target Server Type    : MYSQL
Target Server Version : 80022
File Encoding         : 65001

Date: 2022-07-03 17:17:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('傅思琴', '123456');
INSERT INTO `user` VALUES ('叶子铭', '20200107137');
INSERT INTO `user` VALUES ('吴乐', '123456');
INSERT INTO `user` VALUES ('宋思琪', '123456');
INSERT INTO `user` VALUES ('宋昊宁', '123456');
INSERT INTO `user` VALUES ('张思琪', '123456');
INSERT INTO `user` VALUES ('张星紫', '123456');
INSERT INTO `user` VALUES ('徐温瑞', '123456');
INSERT INTO `user` VALUES ('徐瀚', '20200107132');
INSERT INTO `user` VALUES ('徐炎', '20200107133');
INSERT INTO `user` VALUES ('朱俊贤', '123456');
INSERT INTO `user` VALUES ('杜奕萱', '123456');
INSERT INTO `user` VALUES ('潘泉福', '20200107135');
INSERT INTO `user` VALUES ('王叔文', '123456');
INSERT INTO `user` VALUES ('程锐', '20200107134');
INSERT INTO `user` VALUES ('许世轩', '123456');
INSERT INTO `user` VALUES ('许连杰', '20200107131');
INSERT INTO `user` VALUES ('陈怡然', '123456');
