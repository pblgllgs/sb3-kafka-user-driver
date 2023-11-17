create table location (
    id bigint not null,
    lat varchar(255),
    log varchar(255),
    primary key (id)
);
create table location_seq (
    next_val bigint
);

insert into location_seq values ( 1 );
