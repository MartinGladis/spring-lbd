create table sprints (
    id integer not null auto_increment,
    name varchar(128) not null,
    start_date date not null,
    end_date date not null,
    target varchar(256),
    status varchar(128) not null,
    primary key(id)
);

create table user_stories (
    id integer not null auto_increment,
    name varchar(128) not null,
    description varchar(256) not null,
    story_points_count integer,
    status varchar(128),
    primary key(id)
);

create table sprints_user_stories (
    sprint_id integer not null,
    user_story_id integer not null,
);