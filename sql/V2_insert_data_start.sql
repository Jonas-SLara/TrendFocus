--insere os 2 tipos iniciais de perfis
INSERT INTO perfil (id, tipo) VALUES (1, 'ADM'), (2, 'ANALISTA');

--insere o usuario admin
INSERT INTO usuario (nome, email, senha)
VALUES ('Administrador', 'admin@trendfocus.com', 'admin1234');

INSERT INTO usuario_perfil (id_usuario, id_perfil) VALUES (1, 1);
