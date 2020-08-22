INSERT INTO users (username, password, enabled)
values ( 'jwon', 'pass', true );

INSERT INTO users (username, password, enabled)
values ( 'admin', 'pass', true );

INSERT INTO authorities (username, authority)
values ( 'jwon', 'ROLE_USER' );

INSERT INTO authorities (username, authority)
values ( 'admin', 'ROLE_ADMIN' );

