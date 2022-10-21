INSERT INTO tb_client(name, last_Name, email, gender, cpf, birth_Date, number_House, complement) VALUES ('Joao','Silva','joao@gmail.com','m','00009577789', TIMESTAMP WITHOUT TIME ZONE '2020-07-14T10:00:00Z', 45,'casa');
INSERT INTO tb_client(name, last_Name, email, gender, cpf, birth_Date, number_House, complement) VALUES ('Felipe','Sousa','felipe@gmail.com','m','1119577789', TIMESTAMP WITHOUT TIME ZONE '1994-11-09T10:00:00Z', 130,'apartamento 44 bloco B');
INSERT INTO tb_client(name, last_Name, email, gender, cpf, birth_Date, number_House, complement) VALUES ('Rafael','Brown','rafael@gmail.com','m','0900575895', TIMESTAMP WITHOUT TIME ZONE '1997-12-20T10:00:00Z', 80,'casa ao lado do mercado Baratão ')
INSERT INTO tb_client(name, last_Name, email, gender, cpf, birth_Date, number_House, complement) VALUES ('Lilian','Green','lilian@gmail.com','f','91544574489', TIMESTAMP WITHOUT TIME ZONE '1989-05-14T10:00:00Z', 175,'casa em frente a escola E.E Maria bonita')
INSERT INTO tb_client(name, last_Name, email, gender, cpf, birth_Date, number_House, complement) VALUES ('Amarildo','Yealow','amarildo@gmail.com','m','12345678990', TIMESTAMP WITHOUT TIME ZONE '1996-04-06T10:00:00Z', 11,'apartamento 11 bloco A')
INSERT INTO tb_client(name, last_Name, email, gender, cpf, birth_Date, number_House, complement) VALUES ('Luis','Blue','luis@gmail.com','m','32578912305', TIMESTAMP WITHOUT TIME ZONE '1998-09-17T10:00:00Z', 45,'casa');
INSERT INTO tb_client(name, last_Name, email, gender, cpf, birth_Date, number_House, complement) VALUES ('Pedro','Red','pedro@gmail.com','m','48575081222', TIMESTAMP WITHOUT TIME ZONE '2001-08-15T10:00:00Z', 45,'casa');
INSERT INTO tb_client(name, last_Name, email, gender, cpf, birth_Date, number_House, complement) VALUES ('Gonzales','Gray','gonzales@gmail.com','m','45678422144', TIMESTAMP WITHOUT TIME ZONE '2002-04-14T10:00:00Z', 45,'casa');
INSERT INTO tb_client(name, last_Name, email, gender, cpf, birth_Date, number_House, complement) VALUES ('Junior','Purple','junior@gmail.com','m','05964584777', TIMESTAMP WITHOUT TIME ZONE '2003-07-11T10:00:00Z', 45,'casa');
INSERT INTO tb_client(name, last_Name, email, gender, cpf, birth_Date, number_House, complement) VALUES ('Henrique','Ocean','henrique@gmail.com','m','05804145554', TIMESTAMP WITHOUT TIME ZONE '2004-10-14T10:00:00Z', 45,'casa');

INSERT INTO tb_address(street, district, city, state, cep) VALUES ('R Cubatão', 'Vila Mariana', 'São Paulo','SP', '04013040');
INSERT INTO tb_address(street, district, city, state, cep) VALUES ('R Eusébio de Paula Marcondes','Jardim D Abril', 'São Paulo', 'SP', '05398020');
INSERT INTO tb_address(street, district, city, state, cep) VALUES ('Rua Benedita Dornellas Claro','Jardim Andaraí','São Paulo', 'SP','02168020');
INSERT INTO tb_address(street, district, city, state, cep) VALUES ('R Benedito Egídio Barbosa', 'Brasilândia', 'São Paulo', 'SP', '02846200');
INSERT INTO tb_address(street, district, city, state, cep) VALUES ('R Cássio de Almeida', 'Vila Guilherme','São Paulo','SP','02067060');
INSERT INTO tb_address(street, district, city, state, cep) VALUES ('R Pegmatito','Parque Central','São Paulo','SP','08420480'); 
INSERT INTO tb_address(street, district, city, state, cep) VALUES ('R Antônio Caldas','Jardim Catanduva', 'São Paulo','SP','05767300');
INSERT INTO tb_address(street, district, city, state, cep) VALUES ('R Feitiço da Vila', 'Chácara Santa Maria', 'São Paulo','SP','05879000');
INSERT INTO tb_address(street, district, city, state, cep) VALUES ('R Coronel Carlos Ambrogi', 'Jardim São José','São Paulo','SP','02969130');
INSERT INTO tb_address(street, district, city, state, cep) VALUES ('R Campevas','Perdizes','São Paulo','SP','05016010');
INSERT INTO tb_address(street, district, city, state, cep) VALUES ('R Stefan Zweig','Parque Jabaquara','São Paulo','SP','04355060');


INSERT INTO tb_client_address(client_id, address_id) VALUES (1,2);
INSERT INTO tb_client_address(client_id, address_id) VALUES (1,3);
INSERT INTO tb_client_address(client_id, address_id) VALUES (2,4);
INSERT INTO tb_client_address(client_id, address_id) VALUES (2,5);
INSERT INTO tb_client_address(client_id, address_id) VALUES (3,1);
INSERT INTO tb_client_address(client_id, address_id) VALUES (4,9);
INSERT INTO tb_client_address(client_id, address_id) VALUES (8,8);
INSERT INTO tb_client_address(client_id, address_id) VALUES (7,10);
INSERT INTO tb_client_address(client_id, address_id) VALUES (5,11);
INSERT INTO tb_client_address(client_id, address_id) VALUES (9,7);
INSERT INTO tb_client_address(client_id, address_id) VALUES (10,6);

INSERT INTO tb_phone(type,number) VALUES (1,'11 25989844'); 
INSERT INTO tb_phone(type,number) VALUES (2,'11 25543232');
INSERT INTO tb_phone(type,number) VALUES (3,'11 988777451');
INSERT INTO tb_phone(type,number) VALUES (3,'11 954550777');
INSERT INTO tb_phone(type,number) VALUES (3,'11 954704444');
INSERT INTO tb_phone(type,number) VALUES (2,'11 43335868');
INSERT INTO tb_phone(type,number) VALUES (2,'11 44543232');
INSERT INTO tb_phone(type,number) VALUES (1,'11 24744774');
INSERT INTO tb_phone(type,number) VALUES (1,'11 22548474');
INSERT INTO tb_phone(type,number) VALUES (1,'11 25554144');

INSERT INTO tb_client_phone(client_id, phone_id) VALUES (1,10);
INSERT INTO tb_client_phone(client_id, phone_id) VALUES (2,9);
INSERT INTO tb_client_phone(client_id, phone_id) VALUES (3,8);
INSERT INTO tb_client_phone(client_id, phone_id) VALUES (4,7);
INSERT INTO tb_client_phone(client_id, phone_id) VALUES (5,6);
INSERT INTO tb_client_phone(client_id, phone_id) VALUES (6,5);
INSERT INTO tb_client_phone(client_id, phone_id) VALUES (7,4);
INSERT INTO tb_client_phone(client_id, phone_id) VALUES (8,3);
INSERT INTO tb_client_phone(client_id, phone_id) VALUES (9,2);
INSERT INTO tb_client_phone(client_id, phone_id) VALUES (10,1);