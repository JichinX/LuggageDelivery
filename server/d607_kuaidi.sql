/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : d607_kuaidi

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2017-04-12 12:09:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_dept`
-- ----------------------------
DROP TABLE IF EXISTS `t_dept`;
CREATE TABLE `t_dept` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `scale` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_dept
-- ----------------------------
INSERT INTO `t_dept` VALUES ('1487050238365', '重庆', '站点1 重庆', '33\r\n', '33');
INSERT INTO `t_dept` VALUES ('1487050249893', '成都', '站点2', '4324\r\n', '4234');
INSERT INTO `t_dept` VALUES ('1487050258181', '武汉', '站点3', '4324\r\n', '4234');
INSERT INTO `t_dept` VALUES ('1487050266590', '紫阳', '站点4', '4324\r\n', '4234');
INSERT INTO `t_dept` VALUES ('1487050273119', '北京', '站点5', '4324\r\n', '4234');
INSERT INTO `t_dept` VALUES ('1487050282104', '上海', '站点6 上海', '4324\r\n', '4234');

-- ----------------------------
-- Table structure for `t_feedback`
-- ----------------------------
DROP TABLE IF EXISTS `t_feedback`;
CREATE TABLE `t_feedback` (
  `id` bigint(20) NOT NULL,
  `addDate` varchar(255) NOT NULL,
  `content` longtext NOT NULL,
  `userPhone` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_feedback
-- ----------------------------
INSERT INTO `t_feedback` VALUES ('1487051014543', '2017-04-10 13:43:34', '佛挡杀佛士大夫 ', '22222222');

-- ----------------------------
-- Table structure for `t_flow_log`
-- ----------------------------
DROP TABLE IF EXISTS `t_flow_log`;
CREATE TABLE `t_flow_log` (
  `id` bigint(20) NOT NULL,
  `addDate` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `dept_id` bigint(20) DEFAULT NULL,
  `user_order_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2FA9001EBC98FE8A` (`dept_id`),
  KEY `FK2FA9001E931E92F3` (`user_order_id`),
  CONSTRAINT `FK2FA9001E931E92F3` FOREIGN KEY (`user_order_id`) REFERENCES `t_user_order` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK2FA9001EBC98FE8A` FOREIGN KEY (`dept_id`) REFERENCES `t_dept` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_flow_log
-- ----------------------------
INSERT INTO `t_flow_log` VALUES ('1487051053428', '2017-04-10 13:44:13', '订单确认,等待装车配送', '1487050238365', '1487050996200');
INSERT INTO `t_flow_log` VALUES ('1487051528864', '2017-04-10 13:52:08', '已装车', '1487050238365', '1487050996200');
INSERT INTO `t_flow_log` VALUES ('1487051562675', '2017-04-10 13:52:42', '运输抵达配送点 站点6', '1487050282104', '1487050996200');
INSERT INTO `t_flow_log` VALUES ('1487051611722', '2017-04-10 13:53:31', '确认签收', null, '1487050996200');
INSERT INTO `t_flow_log` VALUES ('1487223315608', '2017-04-11 13:35:15', '问题快件', '1487050238365', '1487054336467');
INSERT INTO `t_flow_log` VALUES ('1487223839231', '2017-04-11 13:43:59', '订单确认,等待装车配送', '1487050238365', '1487223744616');
INSERT INTO `t_flow_log` VALUES ('1487223859441', '2017-04-11 13:44:19', '已装车', '1487050238365', '1487223744616');
INSERT INTO `t_flow_log` VALUES ('1487223912272', '2017-04-11 13:45:12', '运输抵达配送点 站点6 上海', '1487050282104', '1487223744616');
INSERT INTO `t_flow_log` VALUES ('1487224235206', '2017-04-11 13:50:35', '订单确认,等待装车配送', '1487050238365', '1487224216680');
INSERT INTO `t_flow_log` VALUES ('1487224255341', '2017-04-11 13:50:55', '已装车', '1487050238365', '1487224216680');
INSERT INTO `t_flow_log` VALUES ('1487224286286', '2017-04-11 13:51:26', '运输抵达配送点 站点6 上海', '1487050282104', '1487224216680');
INSERT INTO `t_flow_log` VALUES ('1487225755767', '2017-04-11 13:50:35', '订单确认,等待装车配送', '1487050238365', '1487224216680');
INSERT INTO `t_flow_log` VALUES ('1487225755768', '2017-04-11 13:50:55', '已装车', '1487050238365', '1487224216680');
INSERT INTO `t_flow_log` VALUES ('1487225755769', '2017-04-11 13:51:26', '运输抵达配送点 站点6 上海', '1487050282104', '1487224216680');
INSERT INTO `t_flow_log` VALUES ('1487225755770', '2017-04-11 14:15:55', '退件-待装车', '1487050282104', '1487225755701');
INSERT INTO `t_flow_log` VALUES ('1487225994213', '2017-04-11 14:19:54', '问题快件', '1487050238365', '1487225974744');
INSERT INTO `t_flow_log` VALUES ('1487226018872', '2017-04-11 14:20:18', '订单确认,等待装车配送', '1487050238365', '1487225958994');
INSERT INTO `t_flow_log` VALUES ('1487226035582', '2017-04-11 14:20:35', '已装车', '1487050238365', '1487225958994');
INSERT INTO `t_flow_log` VALUES ('1487226075587', '2017-04-11 14:21:15', '运输抵达配送点 站点6 上海', '1487050282104', '1487225958994');
INSERT INTO `t_flow_log` VALUES ('1487226368268', '2017-04-11 14:26:08', '订单确认,等待装车配送', '1487050238365', '1487226351770');
INSERT INTO `t_flow_log` VALUES ('1487226379153', '2017-04-11 14:26:19', '已装车', '1487050238365', '1487226351770');
INSERT INTO `t_flow_log` VALUES ('1487226408323', '2017-04-11 14:26:48', '运输抵达配送点 站点6 上海', '1487050282104', '1487226351770');
INSERT INTO `t_flow_log` VALUES ('1487226430396', '2017-04-11 14:26:08', '订单确认,等待装车配送', '1487050238365', '1487226351770');
INSERT INTO `t_flow_log` VALUES ('1487226430397', '2017-04-11 14:26:19', '已装车', '1487050238365', '1487226351770');
INSERT INTO `t_flow_log` VALUES ('1487226430398', '2017-04-11 14:26:48', '运输抵达配送点 站点6 上海', '1487050282104', '1487226351770');
INSERT INTO `t_flow_log` VALUES ('1487226430399', '2017-04-11 14:27:10', '退件-待装车', '1487050282104', '1487226430307');
INSERT INTO `t_flow_log` VALUES ('1487226479389', '2017-04-11 14:27:59', '订单确认,等待装车配送', '1487050282104', '1487226430307');

-- ----------------------------
-- Table structure for `t_line`
-- ----------------------------
DROP TABLE IF EXISTS `t_line`;
CREATE TABLE `t_line` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `end_dept_id` bigint(20) DEFAULT NULL,
  `start_dept_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKCB5F90DFE9AD2326` (`end_dept_id`),
  KEY `FKCB5F90DF4CE1E7AD` (`start_dept_id`),
  CONSTRAINT `FKCB5F90DF4CE1E7AD` FOREIGN KEY (`start_dept_id`) REFERENCES `t_dept` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FKCB5F90DFE9AD2326` FOREIGN KEY (`end_dept_id`) REFERENCES `t_dept` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_line
-- ----------------------------
INSERT INTO `t_line` VALUES ('1487050470573', '线路1', '1487050273119', '1487050238365');
INSERT INTO `t_line` VALUES ('1487050879077', '简单的线路', '1487050282104', '1487050238365');

-- ----------------------------
-- Table structure for `t_line_station`
-- ----------------------------
DROP TABLE IF EXISTS `t_line_station`;
CREATE TABLE `t_line_station` (
  `id` bigint(20) NOT NULL,
  `stationIndex` int(11) NOT NULL,
  `dept_id` bigint(20) DEFAULT NULL,
  `line_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKBDE7E9D4BC98FE8A` (`dept_id`),
  KEY `FKBDE7E9D46A7EEC2A` (`line_id`),
  CONSTRAINT `FKBDE7E9D46A7EEC2A` FOREIGN KEY (`line_id`) REFERENCES `t_line` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FKBDE7E9D4BC98FE8A` FOREIGN KEY (`dept_id`) REFERENCES `t_dept` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_line_station
-- ----------------------------
INSERT INTO `t_line_station` VALUES ('1487050470574', '1', '1487050249893', '1487050470573');
INSERT INTO `t_line_station` VALUES ('1487050470575', '2', '1487050258181', '1487050470573');
INSERT INTO `t_line_station` VALUES ('1487050851320', '3', '1487050282104', '1487050470573');

-- ----------------------------
-- Table structure for `t_simple_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_simple_user`;
CREATE TABLE `t_simple_user` (
  `id` bigint(20) NOT NULL,
  `userType` varchar(255) DEFAULT NULL,
  `dept_id` bigint(20) DEFAULT NULL,
  `userID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK99BA02EDBC98FE8A` (`dept_id`),
  KEY `FK99BA02ED78313856` (`userID`),
  CONSTRAINT `FK99BA02ED78313856` FOREIGN KEY (`userID`) REFERENCES `t_user` (`userId`) ON DELETE CASCADE,
  CONSTRAINT `FK99BA02EDBC98FE8A` FOREIGN KEY (`dept_id`) REFERENCES `t_dept` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_simple_user
-- ----------------------------
INSERT INTO `t_simple_user` VALUES ('1487050305908', '公司员工', '1487050238365', '1487050305908');
INSERT INTO `t_simple_user` VALUES ('1487050324575', '公司员工', '1487050249893', '1487050324575');
INSERT INTO `t_simple_user` VALUES ('1487050338299', '公司员工', '1487050258181', '1487050338299');
INSERT INTO `t_simple_user` VALUES ('1487050361705', '配送点管理员', '1487050238365', '1487050361705');
INSERT INTO `t_simple_user` VALUES ('1487050385443', '配送点员工', '1487050238365', '1487050385443');
INSERT INTO `t_simple_user` VALUES ('1487050408811', '车辆管理员', '1487050238365', '1487050408811');
INSERT INTO `t_simple_user` VALUES ('1487050422941', '司机', '1487050238365', '1487050422941');
INSERT INTO `t_simple_user` VALUES ('1487050450999', '用户', null, '1487050450999');
INSERT INTO `t_simple_user` VALUES ('1487050818257', '用户', null, '1487050818257');
INSERT INTO `t_simple_user` VALUES ('1487050935760', '配送点管理员', '1487050273119', '1487050935760');
INSERT INTO `t_simple_user` VALUES ('1487051200934', '配送点管理员', '1487050282104', '1487051200934');

-- ----------------------------
-- Table structure for `t_sysuser`
-- ----------------------------
DROP TABLE IF EXISTS `t_sysuser`;
CREATE TABLE `t_sysuser` (
  `id` bigint(20) NOT NULL,
  `userID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK54046F4D78313856` (`userID`),
  CONSTRAINT `FK54046F4D78313856` FOREIGN KEY (`userID`) REFERENCES `t_user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sysuser
-- ----------------------------
INSERT INTO `t_sysuser` VALUES ('1', '1');

-- ----------------------------
-- Table structure for `t_transport`
-- ----------------------------
DROP TABLE IF EXISTS `t_transport`;
CREATE TABLE `t_transport` (
  `id` bigint(20) NOT NULL,
  `addDate` varchar(255) DEFAULT NULL,
  `transIndex` int(11) NOT NULL,
  `transStatus` varchar(255) DEFAULT NULL,
  `driver_id` bigint(20) DEFAULT NULL,
  `line_id` bigint(20) DEFAULT NULL,
  `truck_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5DA4F11ECD0106A` (`truck_id`),
  KEY `FK5DA4F11E6A7EEC2A` (`line_id`),
  KEY `FK5DA4F11E6CA56BD4` (`driver_id`),
  CONSTRAINT `FK5DA4F11E6A7EEC2A` FOREIGN KEY (`line_id`) REFERENCES `t_line` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK5DA4F11E6CA56BD4` FOREIGN KEY (`driver_id`) REFERENCES `t_simple_user` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK5DA4F11ECD0106A` FOREIGN KEY (`truck_id`) REFERENCES `t_truck` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_transport
-- ----------------------------
INSERT INTO `t_transport` VALUES ('1487051528813', '2017-04-10 13:52:08', '1', '完成', '1487050422941', '1487050879077', '1487051303821');
INSERT INTO `t_transport` VALUES ('1487223859374', '2017-04-11 13:44:19', '1', '完成', '1487050422941', '1487050879077', '1487051303821');
INSERT INTO `t_transport` VALUES ('1487224255290', '2017-04-11 13:50:55', '1', '完成', '1487050422941', '1487050879077', '1487051303821');
INSERT INTO `t_transport` VALUES ('1487226035542', '2017-04-11 14:20:35', '1', '完成', '1487050422941', '1487050879077', '1487051303821');
INSERT INTO `t_transport` VALUES ('1487226379121', '2017-04-11 14:26:19', '1', '完成', '1487050422941', '1487050879077', '1487051303821');

-- ----------------------------
-- Table structure for `t_transport_order`
-- ----------------------------
DROP TABLE IF EXISTS `t_transport_order`;
CREATE TABLE `t_transport_order` (
  `id` bigint(20) NOT NULL,
  `trans_id` bigint(20) DEFAULT NULL,
  `user_order_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2BD50CED931E92F3` (`user_order_id`),
  KEY `FK2BD50CEDBE4A7C4B` (`trans_id`),
  CONSTRAINT `FK2BD50CED931E92F3` FOREIGN KEY (`user_order_id`) REFERENCES `t_user_order` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK2BD50CEDBE4A7C4B` FOREIGN KEY (`trans_id`) REFERENCES `t_transport` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_transport_order
-- ----------------------------
INSERT INTO `t_transport_order` VALUES ('1487051528865', '1487051528813', '1487050996200');
INSERT INTO `t_transport_order` VALUES ('1487223859442', '1487223859374', '1487223744616');
INSERT INTO `t_transport_order` VALUES ('1487224255342', '1487224255290', '1487224216680');
INSERT INTO `t_transport_order` VALUES ('1487226035583', '1487226035542', '1487225958994');
INSERT INTO `t_transport_order` VALUES ('1487226379154', '1487226379121', '1487226351770');

-- ----------------------------
-- Table structure for `t_truck`
-- ----------------------------
DROP TABLE IF EXISTS `t_truck`;
CREATE TABLE `t_truck` (
  `id` bigint(20) NOT NULL,
  `licensePlate` varchar(255) NOT NULL,
  `useStatus` varchar(255) DEFAULT NULL,
  `vinner` varchar(255) DEFAULT NULL,
  `vlength` varchar(255) DEFAULT NULL,
  `vload` varchar(255) DEFAULT NULL,
  `vtype` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `licensePlate` (`licensePlate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_truck
-- ----------------------------
INSERT INTO `t_truck` VALUES ('1487051303821', '432432', '空闲', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `userId` bigint(20) NOT NULL,
  `uname` varchar(20) NOT NULL,
  `userAddress` varchar(100) DEFAULT NULL,
  `userBirth` varchar(10) DEFAULT NULL,
  `userEmail` varchar(50) DEFAULT NULL,
  `userGender` int(11) NOT NULL,
  `userName` varchar(20) NOT NULL,
  `userPassword` varchar(150) NOT NULL,
  `userPhone` varchar(255) NOT NULL,
  PRIMARY KEY (`userId`),
  UNIQUE KEY `userPhone` (`userPhone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'admin', null, null, null, '1', '管理员', 'E10ADC3949BA59ABBE56E057F20F883E', '1212121');
INSERT INTO `t_user` VALUES ('1487050305908', 'y1', '', '', '', '0', '员工1', 'E10ADC3949BA59ABBE56E057F20F883E', '3412412414');
INSERT INTO `t_user` VALUES ('1487050324575', 'y2', '', '', '', '0', '员工2', 'E10ADC3949BA59ABBE56E057F20F883E', '444444444');
INSERT INTO `t_user` VALUES ('1487050338299', 'y3', '', '', '', '0', '员工3', 'E10ADC3949BA59ABBE56E057F20F883E', '2321321321');
INSERT INTO `t_user` VALUES ('1487050361705', 'admin1', '', '', '', '0', '站点1管理员', 'E10ADC3949BA59ABBE56E057F20F883E', '3124214124321');
INSERT INTO `t_user` VALUES ('1487050385443', 'p1', '', '', '', '0', '342423', 'E10ADC3949BA59ABBE56E057F20F883E', '32132132131');
INSERT INTO `t_user` VALUES ('1487050408811', 'c1', '', '', '', '0', '123456', 'E10ADC3949BA59ABBE56E057F20F883E', '321312321312');
INSERT INTO `t_user` VALUES ('1487050422941', 's1', '', '', '', '0', '321312', 'E10ADC3949BA59ABBE56E057F20F883E', '321321312321');
INSERT INTO `t_user` VALUES ('1487050450999', 'user1', '', '', '', '0', '用户1', 'E10ADC3949BA59ABBE56E057F20F883E', '1111111');
INSERT INTO `t_user` VALUES ('1487050818257', 'user2', '', null, '', '1', '32131', 'E10ADC3949BA59ABBE56E057F20F883E', '2222222');
INSERT INTO `t_user` VALUES ('1487050935760', 'admin5', '', '', '', '0', '站点5管理员', 'E10ADC3949BA59ABBE56E057F20F883E', '4343434343');
INSERT INTO `t_user` VALUES ('1487051200934', 'admin6', '', '', '', '0', '站点6管理员', 'E10ADC3949BA59ABBE56E057F20F883E', '465789756');

-- ----------------------------
-- Table structure for `t_user_order`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_order`;
CREATE TABLE `t_user_order` (
  `id` bigint(20) NOT NULL,
  `addDate` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `fromUserAddress` varchar(255) DEFAULT NULL,
  `fromUserName` varchar(255) DEFAULT NULL,
  `fromUserPhone` varchar(255) DEFAULT NULL,
  `goodsName` varchar(255) NOT NULL,
  `goodsWeight` double NOT NULL,
  `money` double NOT NULL,
  `orderStatus` varchar(255) NOT NULL,
  `userName` varchar(255) NOT NULL,
  `userPhone` varchar(255) DEFAULT NULL,
  `end_dept_id` bigint(20) DEFAULT NULL,
  `start_dept_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK3076D685E9AD2326` (`end_dept_id`),
  KEY `FK3076D6854CE1E7AD` (`start_dept_id`),
  CONSTRAINT `FK3076D6854CE1E7AD` FOREIGN KEY (`start_dept_id`) REFERENCES `t_dept` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK3076D685E9AD2326` FOREIGN KEY (`end_dept_id`) REFERENCES `t_dept` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_order
-- ----------------------------
INSERT INTO `t_user_order` VALUES ('1487050606006', '2017-04-10 13:36:46', '321321312', '321312312312', '用户1', '22222222', '寄件111111111111111', '111', '555', '新订单', '321', '321321312', null, '1487050238365');
INSERT INTO `t_user_order` VALUES ('1487050996200', '2017-04-10 13:43:16', '321312312', '321321', '用户1', '22222222', '312321', '3213', '16065', '已签收', '31231', '32132131232111', '1487050282104', '1487050238365');
INSERT INTO `t_user_order` VALUES ('1487054336467', '2017-04-10 14:38:56', '432432', '432432432', '用户1', '22222222', '4234', '2423', '12115', '问题快件', '42343', '242343242', '1487050249893', '1487050238365');
INSERT INTO `t_user_order` VALUES ('1487223744616', '2017-04-11 13:42:24', '3232131', '423423423423423', '32131', '32132131232111', '4234234234', '321312', '1606560', '待配送', '32131', '1111111', '1487050249893', '1487050282104');
INSERT INTO `t_user_order` VALUES ('1487224216680', '2017-04-11 13:50:16', '321321', '3213213', '用户1', '1111111', '321321', '3213', '16065', '拒签-退件', '123123', '2222222', '1487050282104', '1487050238365');
INSERT INTO `t_user_order` VALUES ('1487225755701', '2017-04-11 14:15:55', '3213213', '321321', '123123', '2222222', '[退件] 321321', '0', '16065', '新订单', '用户1', '1111111', '1487050238365', '1487050282104');
INSERT INTO `t_user_order` VALUES ('1487225958994', '2017-04-11 14:19:18', '32131231', '3213123123', '32131', '2222222', '测试问题件', '1312312', '6561560', '已运达', '312312', '11111111', '1487050282104', '1487050238365');
INSERT INTO `t_user_order` VALUES ('1487225974744', '2017-04-11 14:19:34', '314123', '31231', '32131', '2222222', '测试退件', '31231', '156155', '问题快件', '23123', '1111111', '1487050249893', '1487050238365');
INSERT INTO `t_user_order` VALUES ('1487226351770', '2017-04-11 14:25:51', '3213123', '32131', '32131', '2222222', '退件测试11111111111', '312312', '1561560', '拒签-退件', '32131', '1111111', '1487050282104', '1487050238365');
INSERT INTO `t_user_order` VALUES ('1487226430307', '2017-04-11 14:27:10', '32131', '3213123', '32131', '1111111', '[退件] 退件测试11111111111', '0', '1561560', '待配送', '32131', '2222222', '1487050238365', '1487050282104');
