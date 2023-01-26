create table user_tb(
    id int auto_increment primary key,
    username varchar not null unique,
    password varchar not null, 
    email varchar not null,
    created_at Timestamp
);

create table board_tb(
    id int auto_increment primary key,
    title varchar,
    userId int,
    created_at Timestamp
);
