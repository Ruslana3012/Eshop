INSERT INTO users (id, archive, email, name, password, role, bucket_id)
VALUES (1, false, 'buchynska.ruslana@gmail.com', 'Ruslana', '1', 'ADMIN', null);

ALTER SEQUENCE user_seq RESTART WITH 2;