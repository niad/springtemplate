CREATE TABLE `tb_posting` (
  `id`         INT          NOT NULL AUTO_INCREMENT,
  `title`      VARCHAR(400) NOT NULL,
  `contents`   TEXT         NOT NULL,
  `created_at` DATETIME              DEFAULT NULL,
  `creator`    INT                   DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `tb_user` (
  `id`       INT          NOT NULL AUTO_INCREMENT,
  `login_id` VARCHAR(20)  NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `name`     VARCHAR(20)  NOT NULL,
  `role`     VARCHAR(20)  NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_login_id` (`login_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;