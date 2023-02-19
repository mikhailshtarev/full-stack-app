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
    user_id           uuid,
    primary key (id),
    foreign key (user_id) references users (id)
);

create table authorities
(
    id        uuid,
    authority varchar,
    user_id      uuid,
    primary key (id),
    foreign key (user_id) references users (id)
);
