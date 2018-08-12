create table user
(
   id integer not null,
   uid varchar(6) not null,
   firstname varchar(255) not null,
   lastname varchar(255) not null,
   gcmid varchar(1024) null,
   status boolean default false,
   version integer(1024) not null,
   primary key(id)
);

create sequence user_seq;