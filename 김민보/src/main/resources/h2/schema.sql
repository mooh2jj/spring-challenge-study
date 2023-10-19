DROP TABLE IF EXISTS coupon;
CREATE TABLE coupon
(
    id          bigint auto_increment primary key,
    name        VARCHAR(255) not null,
    code        VARCHAR(255) not null,
    type        VARCHAR(255) not null,
    status      VARCHAR(255) not null,
    start_date  DATE         null,
    end_date    DATE         null,
    created_at  TIMESTAMP    null,
    modified_at TIMESTAMP    null
);