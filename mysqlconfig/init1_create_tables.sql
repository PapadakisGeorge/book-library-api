CREATE DATABASE IF NOT EXISTS `books` CHARACTER SET utf8 COLLATE utf8_general_ci;

GRANT ALL ON books.* TO 'user'@'%' IDENTIFIED BY 'password';

USE `odds_oc`;

CREATE TABLE IF NOT EXISTS `book` (
    `id`                        int(10) unsigned           NOT NULL AUTO_INCREMENT,
    `title`                     varchar(250)               NOT NULL,
    `author`                    varchar(250)               NOT NULL,
    `summary`                   varchar(250)               NOT NULL,
    `originalPublicationDate`   int(11)                    NOT NULL,
    PRIMARY KEY (`id`),
    KEY `type` (`type`)
);