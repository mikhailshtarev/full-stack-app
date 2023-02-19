insert into users(id, cohort_start_date, username, password)
values ('123e4567-e89b-12d3-a456-426614174000', '2022-12-12', 'admin',
        '$2a$10$PvqKnYUkI.tuUb/gd.pu.e5D0IC0rdY28iTIEwyCISmS1owQuHKki');

insert into authorities(id, authority, user_id)
values ('223e4567-e89b-12d3-a456-426614174000', 'USER_ADMIN', '123e4567-e89b-12d3-a456-426614174000');

insert into assigment(id, status, github_url, branch, code_review_video_url, user_id)
VALUES ('323e4567-e89b-12d3-a456-426614174001', 'status', 'url', 'branch', 'code_review_video_url',
        '123e4567-e89b-12d3-a456-426614174000')