/*
 Navicat Premium Data Transfer

 Source Server         : demo
 Source Server Type    : MySQL
 Source Server Version : 50709
 Source Host           : localhost:3306
 Source Schema         : monopoly

 Target Server Type    : MySQL
 Target Server Version : 50709
 File Encoding         : 65001

 Date: 05/01/2021 21:32:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for land
-- ----------------------------
DROP TABLE IF EXISTS `land`;
CREATE TABLE `land`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '领地名字',
  `level` int(255) NULL DEFAULT NULL COMMENT '领地等级',
  `owner` int(255) NULL DEFAULT NULL COMMENT '领地所属者',
  `pay` int(255) NULL DEFAULT NULL COMMENT '购买（攻打）领地所需的兵力',
  `position` int(255) NULL DEFAULT NULL COMMENT '领地的坐标',
  `x` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `y` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of land
-- ----------------------------
INSERT INTO `land` VALUES (NULL, 1, 1, 1000, 1, '1220', '530');
INSERT INTO `land` VALUES (NULL, 1, 1, 1000, 2, '1430', '530');
INSERT INTO `land` VALUES (NULL, 1, 2, 1000, 3, '1430', '670');
INSERT INTO `land` VALUES (NULL, 1, 1, 1000, 4, '1220', '670');
INSERT INTO `land` VALUES (NULL, 0, 0, 1000, 5, '1010', '670');
INSERT INTO `land` VALUES (NULL, 0, 0, 0, 6, '1010', '810');
INSERT INTO `land` VALUES (NULL, 1, 1, 1000, 7, '800', '810');
INSERT INTO `land` VALUES (NULL, 1, 2, 1000, 8, '800', '670');
INSERT INTO `land` VALUES (NULL, 1, 1, 1000, 9, '1010', '530');
INSERT INTO `land` VALUES (NULL, 0, 0, 0, 10, '800', '530');
INSERT INTO `land` VALUES (NULL, 1, 1, 1000, 11, '1010', '390');
INSERT INTO `land` VALUES (NULL, 1, 2, 1000, 12, '800', '390');
INSERT INTO `land` VALUES (NULL, 1, 1, 1000, 13, '600', '390');
INSERT INTO `land` VALUES (NULL, 0, 0, 0, 14, '590', '530');
INSERT INTO `land` VALUES (NULL, 1, 2, 1000, 15, '600', '670');
INSERT INTO `land` VALUES (NULL, 0, 0, 1000, 16, '390', '670');
INSERT INTO `land` VALUES (NULL, 1, 2, 1000, 17, '390', '530');
INSERT INTO `land` VALUES (NULL, 0, 0, 0, 18, '180', '670');
INSERT INTO `land` VALUES (NULL, 1, 1, 1000, 19, '180', '530');
INSERT INTO `land` VALUES (NULL, 0, 0, 0, 20, '180', '390');
INSERT INTO `land` VALUES (NULL, 0, 0, 1000, 21, '390', '390');
INSERT INTO `land` VALUES (NULL, 0, 0, 0, 22, '380', '260');
INSERT INTO `land` VALUES (NULL, 1, 1, 1000, 23, '590', '260');
INSERT INTO `land` VALUES (NULL, 1, 1, 1000, 24, '790', '260');
INSERT INTO `land` VALUES (NULL, 0, 0, 0, 25, '1000', '260');
INSERT INTO `land` VALUES (NULL, 1, 2, 1000, 26, '1210', '260');
INSERT INTO `land` VALUES (NULL, 0, 0, 1000, 27, '1420', '110');
INSERT INTO `land` VALUES (NULL, 0, 0, 0, 28, '1420', '260');
INSERT INTO `land` VALUES (NULL, 0, 0, 0, 29, '1210', '530');

-- ----------------------------
-- Table structure for land1
-- ----------------------------
DROP TABLE IF EXISTS `land1`;
CREATE TABLE `land1`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '领地名字',
  `level` int(255) NULL DEFAULT NULL COMMENT '领地等级',
  `owner` int(255) NULL DEFAULT NULL COMMENT '领地所属者',
  `pay` int(255) NULL DEFAULT NULL COMMENT '购买（攻打）领地所需的兵力',
  `position` int(255) NOT NULL AUTO_INCREMENT COMMENT '领地的坐标',
  `x` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `y` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`position`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of land1
-- ----------------------------
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 1, '1220', '530');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 2, '1430', '530');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 3, '1430', '670');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 4, '1220', '670');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 5, '1010', '670');
INSERT INTO `land1` VALUES (NULL, 0, 0, 0, 6, '1010', '810');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 7, '800', '810');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 8, '800', '670');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 9, '1010', '530');
INSERT INTO `land1` VALUES (NULL, 0, 0, 0, 10, '800', '530');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 11, '1010', '390');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 12, '800', '390');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 13, '600', '390');
INSERT INTO `land1` VALUES (NULL, 0, 0, 0, 14, '590', '530');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 15, '600', '670');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 16, '390', '670');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 17, '390', '530');
INSERT INTO `land1` VALUES (NULL, 0, 0, 0, 18, '180', '670');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 19, '180', '530');
INSERT INTO `land1` VALUES (NULL, 0, 0, 0, 20, '180', '390');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 21, '390', '390');
INSERT INTO `land1` VALUES (NULL, 0, 0, 0, 22, '380', '260');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 23, '590', '260');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 24, '790', '260');
INSERT INTO `land1` VALUES (NULL, 0, 0, 0, 25, '1000', '260');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 26, '1210', '260');
INSERT INTO `land1` VALUES (NULL, 0, 0, 1000, 27, '1420', '110');
INSERT INTO `land1` VALUES (NULL, 0, 0, 0, 28, '1420', '260');
INSERT INTO `land1` VALUES (NULL, 0, 0, 0, 29, '1210', '530');

-- ----------------------------
-- Table structure for land2
-- ----------------------------
DROP TABLE IF EXISTS `land2`;
CREATE TABLE `land2`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '领地名字',
  `level` int(255) NULL DEFAULT NULL COMMENT '领地等级',
  `owner` int(255) NULL DEFAULT NULL COMMENT '领地所属者',
  `pay` int(255) NULL DEFAULT NULL COMMENT '购买（攻打）领地所需的兵力',
  `position` int(255) NOT NULL AUTO_INCREMENT COMMENT '领地的坐标',
  `x` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `y` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`position`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of land2
-- ----------------------------
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 1, '1220', '610');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 2, '1060', '720');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 3, '900', '610');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 4, '750', '500');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 5, '750', '720');
INSERT INTO `land2` VALUES (NULL, 0, 0, 0, 6, '610', '610');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 7, '440', '720');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 8, '280', '610');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 9, '440', '500');
INSERT INTO `land2` VALUES (NULL, 0, 0, 0, 10, '120', '500');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 11, '280', '400');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 12, '280', '280');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 13, '440', '180');
INSERT INTO `land2` VALUES (NULL, 0, 0, 0, 14, '610', '280');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 15, '610', '400');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 16, '750', '400');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 17, '1060', '400');
INSERT INTO `land2` VALUES (NULL, 0, 0, 0, 18, '900', '280');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 19, '750', '180');
INSERT INTO `land2` VALUES (NULL, 0, 0, 0, 20, '900', '70');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 21, '1060', '180');
INSERT INTO `land2` VALUES (NULL, 0, 0, 0, 22, '1220', '70');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 23, '1370', '180');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 24, '1220', '280');
INSERT INTO `land2` VALUES (NULL, 0, 0, 0, 25, '1530', '280');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 26, '1690', '400');
INSERT INTO `land2` VALUES (NULL, 0, 0, 1000, 27, '1530', '500');
INSERT INTO `land2` VALUES (NULL, 0, 0, 0, 28, '1690', '610');
INSERT INTO `land2` VALUES (NULL, 0, 0, 0, 29, '1220', '610');

-- ----------------------------
-- Table structure for land3
-- ----------------------------
DROP TABLE IF EXISTS `land3`;
CREATE TABLE `land3`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '领地名字',
  `level` int(255) NULL DEFAULT NULL COMMENT '领地等级',
  `owner` int(255) NULL DEFAULT NULL COMMENT '领地所属者',
  `pay` int(255) NULL DEFAULT NULL COMMENT '购买（攻打）领地所需的兵力',
  `position` int(255) NOT NULL AUTO_INCREMENT COMMENT '领地的坐标',
  `x` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `y` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`position`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of land3
-- ----------------------------
INSERT INTO `land3` VALUES (NULL, 0, NULL, 1000, 1, '1380', '520');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 1000, 2, '1230', '630');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 1000, 3, '1070', '740');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 1000, 4, '910', '630');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 1000, 5, '760', '740');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 0, 6, '450', '740');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 1000, 7, '290', '630');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 1000, 8, '600', '630');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 1000, 9, '450', '520');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 0, 10, '290', '420');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 1000, 11, '130', '310');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 1000, 12, '290', '190');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 1000, 13, '450', '90');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 0, 14, '600', '190');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 1000, 15, '450', '310');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 1000, 16, '600', '420');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 1000, 17, '760', '520');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 0, 18, '910', '420');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 1000, 19, '760', '310');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 0, 20, '760', '190');
INSERT INTO `land3` VALUES (NULL, 0, NULL, 1000, 21, '910', '310');
INSERT INTO `land3` VALUES (NULL, NULL, NULL, 0, 22, '1070', '190');
INSERT INTO `land3` VALUES (NULL, NULL, NULL, 1000, 23, '1070', '420');
INSERT INTO `land3` VALUES (NULL, NULL, NULL, 1000, 24, '1230', '310');
INSERT INTO `land3` VALUES (NULL, NULL, NULL, 0, 25, '1380', '190');
INSERT INTO `land3` VALUES (NULL, NULL, NULL, 1000, 26, '1540', '310');
INSERT INTO `land3` VALUES (NULL, NULL, NULL, 1000, 27, '1380', '420');
INSERT INTO `land3` VALUES (NULL, NULL, NULL, 0, 28, '1540', '520');
INSERT INTO `land3` VALUES (NULL, NULL, NULL, 0, 29, '1380', '520');

-- ----------------------------
-- Table structure for land4
-- ----------------------------
DROP TABLE IF EXISTS `land4`;
CREATE TABLE `land4`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '领地名字',
  `level` int(255) NULL DEFAULT NULL COMMENT '领地等级',
  `owner` int(255) NULL DEFAULT NULL COMMENT '领地所属者',
  `pay` int(255) NULL DEFAULT NULL COMMENT '购买（攻打）领地所需的兵力',
  `position` int(255) NOT NULL AUTO_INCREMENT COMMENT '领地的坐标',
  `x` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `y` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`position`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of land4
-- ----------------------------
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 1, '270', '630');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 2, '110', '520');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 3, '430', '520');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 4, '580', '420');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 5, '430', '310');
INSERT INTO `land4` VALUES (NULL, 0, 0, 0, 6, '740', '310');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 7, '580', '200');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 8, '740', '90');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 9, '890', '200');
INSERT INTO `land4` VALUES (NULL, 0, 0, 0, 10, '1210', '200');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 11, '1050', '310');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 12, '890', '420');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 13, '1210', '420');
INSERT INTO `land4` VALUES (NULL, 0, 0, 0, 14, '1360', '310');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 15, '1520', '200');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 16, '1520', '420');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 17, '1360', '520');
INSERT INTO `land4` VALUES (NULL, 0, 0, 0, 18, '1680', '520');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 19, '1520', '630');
INSERT INTO `land4` VALUES (NULL, 0, 0, 0, 20, '1520', '740');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 21, '1200', '740');
INSERT INTO `land4` VALUES (NULL, 0, 0, 0, 22, '1030', '740');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 23, '1050', '630');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 24, '890', '520');
INSERT INTO `land4` VALUES (NULL, 0, 0, 0, 25, '740', '530');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 26, '590', '630');
INSERT INTO `land4` VALUES (NULL, 0, 0, 1000, 27, '740', '740');
INSERT INTO `land4` VALUES (NULL, 0, 0, 0, 28, '430', '740');
INSERT INTO `land4` VALUES (NULL, 0, 0, 0, 29, '270', '630');

-- ----------------------------
-- Table structure for landsave1
-- ----------------------------
DROP TABLE IF EXISTS `landsave1`;
CREATE TABLE `landsave1`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '领地名字',
  `level` int(255) NULL DEFAULT NULL COMMENT '领地等级',
  `owner` int(255) NULL DEFAULT NULL COMMENT '领地所属者',
  `pay` int(255) NULL DEFAULT NULL COMMENT '购买（攻打）领地所需的兵力',
  `position` int(255) NULL DEFAULT NULL COMMENT '领地的坐标',
  `x` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `y` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of landsave1
-- ----------------------------
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 1, '1220', '610');
INSERT INTO `landsave1` VALUES (NULL, 1, 2, 1000, 2, '1060', '720');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 3, '900', '610');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 4, '750', '500');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 5, '750', '720');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 0, 6, '610', '610');
INSERT INTO `landsave1` VALUES (NULL, 1, 1, 1000, 7, '440', '720');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 8, '280', '610');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 9, '440', '500');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 0, 10, '120', '500');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 11, '280', '400');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 12, '280', '280');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 13, '440', '180');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 0, 14, '610', '280');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 15, '610', '400');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 16, '750', '400');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 17, '1060', '400');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 0, 18, '900', '280');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 19, '750', '180');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 0, 20, '900', '70');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 21, '1060', '180');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 0, 22, '1220', '70');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 23, '1370', '180');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 24, '1220', '280');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 0, 25, '1530', '280');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 26, '1690', '400');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 27, '1530', '500');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 0, 28, '1690', '610');
INSERT INTO `landsave1` VALUES (NULL, 0, 0, 1000, 29, '1220', '610');

-- ----------------------------
-- Table structure for landsave2
-- ----------------------------
DROP TABLE IF EXISTS `landsave2`;
CREATE TABLE `landsave2`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '领地名字',
  `level` int(255) NULL DEFAULT NULL COMMENT '领地等级',
  `owner` int(255) NULL DEFAULT NULL COMMENT '领地所属者',
  `pay` int(255) NULL DEFAULT NULL COMMENT '购买（攻打）领地所需的兵力',
  `position` int(255) NULL DEFAULT NULL COMMENT '领地的坐标',
  `x` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `y` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of landsave2
-- ----------------------------
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 1000, 1, '1380', '520');
INSERT INTO `landsave2` VALUES (NULL, 1, 2, 1000, 2, '1230', '630');
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 1000, 3, '1070', '740');
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 1000, 4, '910', '630');
INSERT INTO `landsave2` VALUES (NULL, 1, 1, 1000, 5, '760', '740');
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 0, 6, '450', '740');
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 1000, 7, '290', '630');
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 1000, 8, '600', '630');
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 1000, 9, '450', '520');
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 0, 10, '290', '420');
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 1000, 11, '130', '310');
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 1000, 12, '290', '190');
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 1000, 13, '450', '90');
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 0, 14, '600', '190');
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 1000, 15, '450', '310');
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 1000, 16, '600', '420');
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 1000, 17, '760', '520');
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 0, 18, '910', '420');
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 1000, 19, '760', '310');
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 0, 20, '760', '190');
INSERT INTO `landsave2` VALUES (NULL, 0, NULL, 1000, 21, '910', '310');
INSERT INTO `landsave2` VALUES (NULL, NULL, NULL, 0, 22, '1070', '190');
INSERT INTO `landsave2` VALUES (NULL, NULL, NULL, 1000, 23, '1070', '420');
INSERT INTO `landsave2` VALUES (NULL, NULL, NULL, 1000, 24, '1230', '310');
INSERT INTO `landsave2` VALUES (NULL, NULL, NULL, 0, 25, '1380', '190');
INSERT INTO `landsave2` VALUES (NULL, NULL, NULL, 1000, 26, '1540', '310');
INSERT INTO `landsave2` VALUES (NULL, NULL, NULL, 1000, 27, '1380', '420');
INSERT INTO `landsave2` VALUES (NULL, NULL, NULL, 1000, 28, '1540', '520');
INSERT INTO `landsave2` VALUES (NULL, NULL, NULL, 1000, 29, '1380', '520');

-- ----------------------------
-- Table structure for landsave3
-- ----------------------------
DROP TABLE IF EXISTS `landsave3`;
CREATE TABLE `landsave3`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '领地名字',
  `level` int(255) NULL DEFAULT NULL COMMENT '领地等级',
  `owner` int(255) NULL DEFAULT NULL COMMENT '领地所属者',
  `pay` int(255) NULL DEFAULT NULL COMMENT '购买（攻打）领地所需的兵力',
  `position` int(255) NULL DEFAULT NULL COMMENT '领地的坐标',
  `x` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `y` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of landsave3
-- ----------------------------
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 1, '1220', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 2, '1430', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 3, '1430', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 4, '1220', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 5, '1010', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 6, '1010', '810');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 7, '800', '810');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 8, '800', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 9, '1010', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 10, '800', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 11, '1010', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 12, '800', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 13, '600', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 14, '590', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 15, '600', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 16, '390', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 17, '390', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 18, '180', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 19, '180', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 20, '180', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 21, '390', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 22, '380', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 23, '590', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 24, '790', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 25, '1000', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 26, '1210', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 27, '1420', '110');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 28, '1420', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 29, '1210', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 1, '1220', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 2, '1430', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 3, '1430', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 4, '1220', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 5, '1010', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 6, '1010', '810');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 7, '800', '810');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 8, '800', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 9, '1010', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 10, '800', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 11, '1010', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 12, '800', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 13, '600', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 14, '590', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 15, '600', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 16, '390', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 17, '390', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 18, '180', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 19, '180', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 20, '180', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 21, '390', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 22, '380', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 23, '590', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 24, '790', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 25, '1000', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 26, '1210', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 27, '1420', '110');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 28, '1420', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 29, '1210', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 1, '1220', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 2, '1430', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 3, '1430', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 4, '1220', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 5, '1010', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 6, '1010', '810');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 7, '800', '810');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 8, '800', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 9, '1010', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 10, '800', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 11, '1010', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 12, '800', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 13, '600', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 14, '590', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 15, '600', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 16, '390', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 17, '390', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 18, '180', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 19, '180', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 20, '180', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 21, '390', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 22, '380', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 23, '590', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 24, '790', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 25, '1000', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 26, '1210', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 27, '1420', '110');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 28, '1420', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 29, '1210', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 1, '1220', '530');
INSERT INTO `landsave3` VALUES (NULL, 1, 1, 1000, 2, '1430', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 3, '1430', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 4, '1220', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 5, '1010', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 6, '1010', '810');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 7, '800', '810');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 8, '800', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 9, '1010', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 10, '800', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 11, '1010', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 12, '800', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 13, '600', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 14, '590', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 15, '600', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 16, '390', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 17, '390', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 18, '180', '670');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 19, '180', '530');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 20, '180', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 21, '390', '390');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 22, '380', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 23, '590', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 24, '790', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 0, 25, '1000', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 26, '1210', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 27, '1420', '110');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 28, '1420', '260');
INSERT INTO `landsave3` VALUES (NULL, 0, 0, 1000, 29, '1210', '530');

-- ----------------------------
-- Table structure for player
-- ----------------------------
DROP TABLE IF EXISTS `player`;
CREATE TABLE `player`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '玩家的账号',
  `money` int(255) NULL DEFAULT NULL COMMENT '金钱（兵力）',
  `type` int(255) NULL DEFAULT NULL COMMENT '判断是人机还是玩家',
  `position` int(255) NULL DEFAULT NULL COMMENT '人物当时的坐标顺序',
  `war_effect` int(255) NULL DEFAULT NULL COMMENT '战争令牌回合数',
  `orders` int(255) NULL DEFAULT NULL COMMENT '玩家的出牌顺序',
  `stop` int(255) NULL DEFAULT NULL COMMENT '暂停在原地的回合数',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '玩家的名字',
  `password` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `username` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `role` int(255) NULL DEFAULT NULL,
  `YorNout` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of player
-- ----------------------------
INSERT INTO `player` VALUES (1, 0, 1, 17, NULL, 1, 0, 'chaoyun', '123456', 'wjz', NULL, 0);
INSERT INTO `player` VALUES (2, 2300, 2, 21, NULL, 2, 0, 'lvbu', '123456', 'zzj', NULL, 1);
INSERT INTO `player` VALUES (3, 10000, 0, 1, NULL, 0, 0, NULL, '123456', 'zzm', NULL, 1);
INSERT INTO `player` VALUES (4, 10000, 0, 1, NULL, 0, 0, NULL, '123456', 'kwj', NULL, 1);

-- ----------------------------
-- Table structure for playersave1
-- ----------------------------
DROP TABLE IF EXISTS `playersave1`;
CREATE TABLE `playersave1`  (
  `id` int(11) NOT NULL COMMENT '玩家的账号',
  `money` int(255) NULL DEFAULT NULL COMMENT '金钱（兵力）',
  `type` int(255) NULL DEFAULT NULL COMMENT '判断是人机还是玩家',
  `position` int(255) NULL DEFAULT NULL COMMENT '人物当时的坐标顺序',
  `war_effect` int(255) NULL DEFAULT NULL COMMENT '战争令牌回合数',
  `orders` int(255) NULL DEFAULT NULL COMMENT '玩家的出牌顺序',
  `stop` int(255) NULL DEFAULT NULL COMMENT '暂停在原地的回合数',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '玩家的名字',
  `password` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `username` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `role` int(255) NULL DEFAULT NULL,
  `YorNout` int(255) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of playersave1
-- ----------------------------
INSERT INTO `playersave1` VALUES (1, 9000, 1, 7, NULL, 1, 0, 'chaoyun', '123456', 'wjz', NULL, 1);
INSERT INTO `playersave1` VALUES (2, 9000, 1, 2, NULL, 2, 0, 'lvbu', '123456', 'zzj', NULL, 1);
INSERT INTO `playersave1` VALUES (3, 9000, 2, 2, NULL, 4, 0, NULL, '123456', 'zzm', NULL, 1);
INSERT INTO `playersave1` VALUES (4, 9000, 2, 7, NULL, 5, 0, NULL, '123456', 'kwj', NULL, 1);

-- ----------------------------
-- Table structure for playersave2
-- ----------------------------
DROP TABLE IF EXISTS `playersave2`;
CREATE TABLE `playersave2`  (
  `id` int(11) NOT NULL COMMENT '玩家的账号',
  `money` int(255) NULL DEFAULT NULL COMMENT '金钱（兵力）',
  `type` int(255) NULL DEFAULT NULL COMMENT '判断是人机还是玩家',
  `position` int(255) NULL DEFAULT NULL COMMENT '人物当时的坐标顺序',
  `war_effect` int(255) NULL DEFAULT NULL COMMENT '战争令牌回合数',
  `orders` int(255) NULL DEFAULT NULL COMMENT '玩家的出牌顺序',
  `stop` int(255) NULL DEFAULT NULL COMMENT '暂停在原地的回合数',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '玩家的名字',
  `password` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `username` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `role` int(255) NULL DEFAULT NULL,
  `YorNout` int(255) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of playersave2
-- ----------------------------
INSERT INTO `playersave2` VALUES (1, 9000, 1, 5, NULL, 1, 0, 'chaoyun', '123456', 'wjz', NULL, 1);
INSERT INTO `playersave2` VALUES (2, 9000, 1, 2, NULL, 2, 0, 'lvbu', '123456', 'zzj', NULL, 1);
INSERT INTO `playersave2` VALUES (3, 10500, 2, 6, NULL, 3, 0, NULL, '123456', 'zzm', NULL, 1);
INSERT INTO `playersave2` VALUES (4, 10000, 2, 1, NULL, 4, 0, NULL, '123456', 'kwj', NULL, 1);

-- ----------------------------
-- Table structure for playersave3
-- ----------------------------
DROP TABLE IF EXISTS `playersave3`;
CREATE TABLE `playersave3`  (
  `id` int(11) NOT NULL COMMENT '玩家的账号',
  `money` int(255) NULL DEFAULT NULL COMMENT '金钱（兵力）',
  `type` int(255) NULL DEFAULT NULL COMMENT '判断是人机还是玩家',
  `position` int(255) NULL DEFAULT NULL COMMENT '人物当时的坐标顺序',
  `war_effect` int(255) NULL DEFAULT NULL COMMENT '战争令牌回合数',
  `orders` int(255) NULL DEFAULT NULL COMMENT '玩家的出牌顺序',
  `stop` int(255) NULL DEFAULT NULL COMMENT '暂停在原地的回合数',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '玩家的名字',
  `password` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `username` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `role` int(255) NULL DEFAULT NULL,
  `YorNout` int(255) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of playersave3
-- ----------------------------
INSERT INTO `playersave3` VALUES (1, 9000, 1, 2, NULL, 1, 0, 'chaoyun', '123456', 'wjz', NULL, 1);
INSERT INTO `playersave3` VALUES (2, 10000, 1, 1, NULL, 2, 0, 'lvbu', '123456', 'zzj', NULL, 1);
INSERT INTO `playersave3` VALUES (3, 10000, 1, 1, NULL, 3, 0, NULL, '123456', 'zzm', NULL, 1);
INSERT INTO `playersave3` VALUES (4, 10000, 0, 1, NULL, 0, 0, NULL, '123456', 'kwj', NULL, 1);

-- ----------------------------
-- Table structure for round
-- ----------------------------
DROP TABLE IF EXISTS `round`;
CREATE TABLE `round`  (
  `orders` int(255) NULL DEFAULT NULL,
  `playernumber` int(11) NULL DEFAULT NULL,
  `position` int(255) NULL DEFAULT NULL,
  `dice` int(255) NULL DEFAULT NULL,
  `over` int(255) NULL DEFAULT NULL,
  `start` int(255) NULL DEFAULT NULL,
  `map` int(255) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of round
-- ----------------------------
INSERT INTO `round` VALUES (2, 2, 1, 0, 1, 0, 1);

-- ----------------------------
-- Table structure for roundsave1
-- ----------------------------
DROP TABLE IF EXISTS `roundsave1`;
CREATE TABLE `roundsave1`  (
  `orders` int(255) NULL DEFAULT NULL,
  `playernumber` int(11) NULL DEFAULT NULL,
  `position` int(255) NULL DEFAULT NULL,
  `dice` int(255) NULL DEFAULT NULL,
  `over` int(255) NULL DEFAULT NULL,
  `start` int(255) NULL DEFAULT NULL,
  `map` int(255) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of roundsave1
-- ----------------------------
INSERT INTO `roundsave1` VALUES (1, 5, 1, 0, 1, 0, 2);

-- ----------------------------
-- Table structure for roundsave2
-- ----------------------------
DROP TABLE IF EXISTS `roundsave2`;
CREATE TABLE `roundsave2`  (
  `orders` int(255) NULL DEFAULT NULL,
  `playernumber` int(11) NULL DEFAULT NULL,
  `position` int(255) NULL DEFAULT NULL,
  `dice` int(255) NULL DEFAULT NULL,
  `over` int(255) NULL DEFAULT NULL,
  `start` int(255) NULL DEFAULT NULL,
  `map` int(255) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of roundsave2
-- ----------------------------
INSERT INTO `roundsave2` VALUES (4, 4, 1, 0, 1, 0, 3);

-- ----------------------------
-- Table structure for roundsave3
-- ----------------------------
DROP TABLE IF EXISTS `roundsave3`;
CREATE TABLE `roundsave3`  (
  `orders` int(255) NULL DEFAULT NULL,
  `playernumber` int(11) NULL DEFAULT NULL,
  `position` int(255) NULL DEFAULT NULL,
  `dice` int(255) NULL DEFAULT NULL,
  `over` int(255) NULL DEFAULT NULL,
  `start` int(255) NULL DEFAULT NULL,
  `map` int(255) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of roundsave3
-- ----------------------------
INSERT INTO `roundsave3` VALUES (2, 3, 1, 0, 1, 0, 1);

-- ----------------------------
-- Table structure for time
-- ----------------------------
DROP TABLE IF EXISTS `time`;
CREATE TABLE `time`  (
  `id` int(11) NOT NULL,
  `liveTime` int(11) NOT NULL,
  `userId` int(11) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of time
-- ----------------------------
INSERT INTO `time` VALUES (1, 2, 0);
INSERT INTO `time` VALUES (2, 8, 0);
INSERT INTO `time` VALUES (3, 6, 0);
INSERT INTO `time` VALUES (4, 3, 0);
INSERT INTO `time` VALUES (5, 0, 4);
INSERT INTO `time` VALUES (6, 0, 4);
INSERT INTO `time` VALUES (7, 0, 1);
INSERT INTO `time` VALUES (8, 0, 0);
INSERT INTO `time` VALUES (9, 0, 0);
INSERT INTO `time` VALUES (10, 0, 0);

SET FOREIGN_KEY_CHECKS = 1;
