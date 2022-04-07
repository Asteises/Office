CREATE TABLE Profession
(
    id bigint primary key not null,
    name varchar not null,
    salary int not null
);

CREATE TABLE Human
(
    id bigint primary key not null,
    name varchar not null,
    surname varchar not null,
    age int not null,
    profession_id bigint not null,
    foreign key (profession_id) references profession (id)
);