//CREATE DATABASE universidad;
//USE universidad;
//
//CREATE TABLE estudiantes_cursos (
//        id INT AUTO_INCREMENT PRIMARY KEY,
//        nombre_estudiante VARCHAR(100),
//id_curso INT,
//nombre_curso VARCHAR(100),
//profesor VARCHAR(100)
//);
//
//
//INSERT INTO estudiantes_cursos (nombre_estudiante, id_curso, nombre_curso, profesor) VALUES
//('Juan Pérez', 1, 'Matemáticas', 'Dr. López'),
//        ('María García', 2, 'Historia', 'Prof. Fernández'),
//        ('Juan Pérez', 2, 'Historia', 'Prof. Fernández'),
//        ('Ana Gómez', 1, 'Matemáticas', 'Dr. López');
//
//CREATE TABLE estudiantes (
//        id INT AUTO_INCREMENT PRIMARY KEY,
//        nombre_estudiante VARCHAR(100)
//);
//
//CREATE TABLE cursos (
//        id INT AUTO_INCREMENT PRIMARY KEY,
//        nombre_curso VARCHAR(100),
//profesor VARCHAR(100)
//);
//
//CREATE TABLE estudiantes_cursos (
//        id_estudiante INT,
//        id_curso INT,
//        PRIMARY KEY (id_estudiante, id_curso),
//FOREIGN KEY (id_estudiante) REFERENCES estudiantes(id),
//FOREIGN KEY (id_curso) REFERENCES cursos(id)
//        );
//
//INSERT INTO estudiantes (nombre_estudiante) VALUES
//('Juan Pérez'),
//        ('María García'),
//        ('Ana Gómez');
//
//INSERT INTO cursos (nombre_curso, profesor) VALUES
//('Matemáticas', 'Dr. López'),
//        ('Historia', 'Prof. Fernández');
//
//INSERT INTO estudiantes_cursos (id_estudiante, id_curso) VALUES
//(1, 1),
//(2, 2),
//(1, 2),
//(3, 1);
//
//SELECT * FROM estudiantes;
//ELECT * FROM cursos;
// SELECT * FROM estudiantes_cursos;
