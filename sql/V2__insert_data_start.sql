-- inserção de usuario admin e outros para testes em desenvolvimento

-- Senha: 'admin1234' 
INSERT INTO usuario (nome, email, senha, tipo) VALUES(
    'Admin Hub',
    'admin@noticiashub.com',
    '$2a$12$eN3/NAbdfMjMwnlU5SSdEODGwkT8RftfaTax/zb/Lq2cvubEis.SS',
    'ROLE_ADM'
);

-- Senha: 'analista1234'
INSERT INTO usuario (nome, email, senha, tipo) VALUES(
    'Fulano',
    'fulano@gmail.com',
    '$2a$12$/LB7RQwqUvGPiwpxzNXzaulBcROv0swm36BtnSH/opuhM2iEY1P2G',
    'ROLE_ANALISTA'
);


