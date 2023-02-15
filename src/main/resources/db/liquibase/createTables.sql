create table users
(
    id                uuid,
    cohort_start_date date,
    username          varchar UNIQUE,
    password          varchar,
    primary key (id)
);

create table assigment
(
    id                    uuid,
    status                varchar,
    github_url            varchar,
    branch                varchar,
    code_review_video_url varchar,
    assigned_to           uuid,
    primary key (id),
    foreign key (assigned_to) references users (id)
);

create table authorities
(
    id        uuid,
    authority varchar,
    userTo      uuid,
    primary key (id),
    foreign key (userTo) references users (id)
);
