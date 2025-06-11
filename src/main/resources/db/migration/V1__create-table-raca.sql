CREATE TABLE IF NOT EXISTS racas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    vida INT,
    escudo INT,
    poder_fisico INT,
    poder_habilidade INT
);