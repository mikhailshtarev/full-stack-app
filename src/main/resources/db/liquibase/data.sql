insert into users(id, cohort_start_date, username, password)
values ('123e4567-e89b-12d3-a456-426614174000', 2022 - 12 - 12, 'admin', 'admin');

insert into authorities(id,authority,userto)
values ('223e4567-e89b-12d3-a456-426614174000','USER_ADMIN','123e4567-e89b-12d3-a456-426614174000') ;