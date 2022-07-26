insert into sprint (name, start_date, end_date, target, status)
values ('Sprint 1', '2022-07-22', '2022-08-22', 'Lohrem Ipsum', 'In progress');


insert into user_story (name, description, story_points, status)
values ('User Story 1', 'Lohrem Ipsum', 4, 'In progress');

insert into user_story (name, description, story_points, status)
values ('User Story 2', 'Lohrem Ipsum', 6, 'Done');

insert into user_story (name, description, story_points, status)
values ('User Story 3', 'Lohrem Ipsum', 4, 'Review');

insert into user_story (name, description, story_points, status)
values ('User Story 4', 'Lohrem Ipsum', 5, 'To do');


insert into sprint_user_story (sprint_id, user_story_id)
values (1, 1);

insert into sprint_user_story (sprint_id, user_story_id)
values (1, 2);

insert into sprint_user_story (sprint_id, user_story_id)
values (1, 3);

insert into sprint_user_story (sprint_id, user_story_id)
values (1, 4);