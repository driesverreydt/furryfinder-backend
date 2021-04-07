create sequence pet_seq start with 1 increment by 1;

create table pet
(
    id           integer not null,
    name         varchar(255),
    kind         varchar(255),
    image        varchar(255),
    profile_text varchar(1023),
    popularity   varchar(255),
    primary key (id)
);

insert into pet (id, name, kind, image, profile_text, popularity)
values (nextval('pet_seq'), 'Princess',
        'CHICKEN',
        'images/chicken1.jpg',
        'Meet Princess Fluffybutt! She is one of the fluffiest chickens you will ever meet. Most often you''ll find Princess cuddled up in the warmest spot she can find, and
        if that happens to be in your lap,
        well then that''s fine for her too! Princess also enjoys nomming treats out of your hand, clucking softly under her breath, and following her three sisters around the yard. Get to know Princess today!',
        0);
insert into pet (id, name, kind, image, profile_text, popularity)
values (nextval('pet_seq'), 'MrFuzz',
        'CAT',
        'images/cat1.jpg',
        'MrFuzz loves belly rubs, and likes playing with pieces of string',
        0);
insert into pet (id, name, kind, image, profile_text, popularity)
values (nextval('pet_seq'), 'Burt',
        'DOG',
        'images/dog1.jpg',
        'Burt looks cute, but is in reality a though guy. Secretly wants to work for the FBI',
        0);
insert into pet (id, name, kind, image, profile_text, popularity)
values (nextval('pet_seq'), 'MissPoes',
        'CAT',
        'images/cat2.jpg',
        'MissPoes is a classy lady who appreciates gentle pets',
        0);
insert into pet (id, name, kind, image, profile_text, popularity)
values (nextval('pet_seq'), 'Lady',
        'DOG',
        'images/dog2.jpg',
        'Lady isn''t always very lady-like. She loves rolling in the mud and barking at naughty squirrels',
        0);
insert into pet (id, name, kind, image, profile_text, popularity)
values (nextval('pet_seq'), 'Grumpy',
        'CAT',
        'images/cat3.jpg',
        'Grumpy basically hates everything, especially dogs. He does looove lasagne though',
        0);
insert into pet (id, name, kind, image, profile_text, popularity)
values (nextval('pet_seq'), 'Bobby',
        'DOG',
        'images/dog3.jpg',
        'Bobby loves to fetch balls and chase rabbits. Great with kids.',
        0);
