create sequence message_seq start with 1 increment by 1;

create table message
(
    id            integer not null,
    content       varchar(1023),
    creation_date timestamp,
    location      varchar(255),
    primary key (id)
);
