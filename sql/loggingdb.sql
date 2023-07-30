DROP TABLE IF EXISTS log;

CREATE TABLE log (
    id SERIAL,
    idMisuratore INT NOT NULL,
    istanteModifica INT NOT NULL,
    valore int NOT NULL,
    tipo VARCHAR(20) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO log(idMisuratore, istanteModifica, valore, tipo) VALUES
(1, 100, 10, 'lampione'),
(1, 200, 80, 'lampione'),
(1, 300, 60, 'lampione'),
(1, 400, 0, 'lampione'),
(1, 500, 30, 'lampione'),
(1, 600, 50, 'lampione'),
(1, 700, 70, 'lampione'),
(1, 800, 80, 'lampione'),
(1, 900, 40, 'lampione'),
(1, 1000, 50, 'lampione'),
(1, 1100, 60, 'lampione'),
(1, 1200, 20, 'lampione'),
(1, 1300, 30, 'lampione'),
(1, 1400, 40, 'lampione'),
(1, 1500, 90, 'lampione'),
(3, 100, 1, 'sensore'),
(3, 200, 1, 'sensore'),
(3, 300, 0, 'sensore'),
(3, 400, 1, 'sensore'),
(3, 500, 0, 'sensore'),
(3, 600, 1, 'sensore'),
(3, 700, 0, 'sensore'),
(3, 800, 1, 'sensore'),
(3, 900, 1, 'sensore'),
(3, 1000, 1, 'sensore'),
(3, 1100, 1, 'sensore'),
(3, 1200, 1, 'sensore'),
(3, 1300, 0, 'sensore'),
(3, 1400, 1, 'sensore'),
(3, 1500, 1, 'sensore');