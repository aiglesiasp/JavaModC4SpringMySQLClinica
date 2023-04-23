DROP TABLE IF EXISTS reserva;
DROP TABLE IF EXISTS equipos;
DROP TABLE IF EXISTS investigadores;
DROP TABLE IF EXISTS facultad;


CREATE TABLE IF NOT EXISTS roles (
    id INT AUTO_INCREMENT,
    nombre VARCHAR(100) DEFAULT NULL,
    PRIMARY KEY(id)
    );
    
CREATE TABLE IF NOT EXISTS usuarios (
    id INT AUTO_INCREMENT,
    name VARCHAR(100) DEFAULT NULL,
    email VARCHAR(255) DEFAULT NULL,
    role INT,
    PRIMARY KEY(id),
    CONSTRAINT role_fk FOREIGN KEY (role) REFERENCES roles (id)
    ON DELETE CASCADE ON UPDATE CASCADE
	);
    
CREATE TABLE IF NOT EXISTS citas (
    id INT AUTO_INCREMENT,
    fecha DATETIME DEFAULT NULL,
    usuario INT,
    PRIMARY KEY(id),
    CONSTRAINT usuario_fk FOREIGN KEY (usuario) REFERENCES usuarios (id)
    ON DELETE CASCADE ON UPDATE CASCADE
    );

/* INSERT INTO roles */
INSERT INTO roles(nombre) VALUES ('USUARIO');
INSERT INTO roles(nombre) VALUES ('ADMINISTRADOR');

/* INSERT INTO usuarios */
INSERT INTO usuarios (name, email, role) VALUES ('Aitor', 'aaa@aaa', 2);
INSERT INTO usuarios (name, email, role) VALUES ('Blai', 'bbb@bbb', 1);
INSERT INTO usuarios (name, email, role) VALUES ('Carlos', 'ccc@ccc', 1);
INSERT INTO usuarios (name, email, role) VALUES ('Daniel', 'ddd@ddd', 1);
INSERT INTO usuarios (name, email, role) VALUES ('Edgar', 'eee@eee', 1);
INSERT INTO usuarios (name, email, role) VALUES ('Fran', 'fff@fff', 1);


/* INSERT INTO citas */
INSERT INTO citas (fecha, usuario) VALUES ('2019-03-27 14:15:37.000000', 2);
INSERT INTO citas (fecha, usuario) VALUES ('2020-03-28 14:15:37.000000', 3);
INSERT INTO citas (fecha, usuario) VALUES ('2021-03-29 14:15:37.000000', 4);
INSERT INTO citas (fecha, usuario) VALUES ('2022-03-30 14:15:37.000000', 5);
INSERT INTO citas (fecha, usuario) VALUES ('2023-03-31 14:15:37.000000', 6);