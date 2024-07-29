INSERT INTO tb_user (name, email, password) VALUES ('Alex Alex2',  'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob Bob2',  'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Maria2',  'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_VIGILANTE');
INSERT INTO tb_role (authority) VALUES ('ROLE_RO');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Primeiro feedback de tarefa: favor revisar', TIMESTAMP WITH TIME ZONE '2020-12-10T13:00:00Z', true, '/offers/1/resource/1/sections/1', 1);
INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Segundo feedback: favor revisar', TIMESTAMP WITH TIME ZONE '2020-12-12T13:00:00Z', true, '/offers/1/resource/1/sections/1', 1);
INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Terceiro feedback: favor revisar', TIMESTAMP WITH TIME ZONE '2020-12-14T13:00:00Z', true, '/offers/1/resource/1/sections/1', 1);

INSERT INTO tb_reclamante (instant_Reclamado, name,contacto) VALUES (TIMESTAMP WITH TIME ZONE '2020-12-15T17:00:00Z', 'Dolores Aveiro Costa', '988887878');


INSERT INTO tb_item_perdido (quem_Encontrou, local_Encontrado, descricao, instante_Encontrado, reclamante_id) VALUES ('Catarina Oliveira FL', 'Caixa 15', 'Carteira com documentos.....',TIMESTAMP WITH TIME ZONE '2020-12-14T17:00:00Z', null);
INSERT INTO tb_item_perdido (quem_Encontrou, local_Encontrado, descricao, instante_Encontrado, reclamante_id) VALUES ('Paulo Almeida Manutenção', 'Corredor PF', 'Caixa com ferramentas.....',TIMESTAMP WITH TIME ZONE '2020-12-15T18:00:00Z', null);
INSERT INTO tb_item_perdido (quem_Encontrou, local_Encontrado, descricao, instante_Encontrado, reclamante_id) VALUES ('Delcio Cruz', 'SBE', 'Saco Zara com roupa.....',TIMESTAMP WITH TIME ZONE '2020-12-19T20:00:00Z', null);

