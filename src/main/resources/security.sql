DROP DATABASE `security`;
CREATE DATABASE `security`;
USE `security`;
CREATE TABLE `role`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(20) NOT NULL,
`nameZh` VARCHAR(20) NOT NULL 
);
INSERT INTO `role`(`name`,`nameZh`) VALUES ('ROLE_dba','数据库管理员'),('ROLE_admin','系统管理员'),('ROLE_user','用户');


CREATE TABLE `user`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`username` VARCHAR(32) NOT NULL,
`password` VARCHAR(255) NOT NULL,
`enabled` TINYINT(1),
`locked` TINYINT(1)
) ;
INSERT INTO `user`(`username`,`password`,`enabled`,`locked`) VALUES ('root','$2a$10$h1p4/3XCF89g0ZS46TctLO7ej92wTfavL7wRe.ijQVrBeJQVIbnC6',1,0),
('admin','$2a$10$W85CM8erE7BbLUIhN3Qra.16Be2i96whxJBwbOtJK44DBxC/1.sba',1,0),('sang','$2a$10$y7w5veSm5NHu909BjYCNpOjsUYcVYDosZL.hdG07dKYR06ohvNEzK',1,NULL);

CREATE TABLE `user_role`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`uid` INT NOT NULL,
`rid` INT NOT NULL
);
INSERT INTO `user_role`(uid,rid) VALUES (1,1),(1,2),(2,2),(3,3);