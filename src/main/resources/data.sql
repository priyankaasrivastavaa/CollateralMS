--DROP TABLE IF EXISTS collateral;

--CREATE TABLE collateral (
--  id INT AUTO_INCREMENT  PRIMARY KEY,
--  collateral_type VARCHAR(250) NOT NULL,
--  valuation_status VARCHAR(250) DEFAULT NULL
--);

insert into collateral(id, collateral_type, val_id, created_date, last_updated_date)
values (1, 'residential', 11, now(), now()),
(2, 'rural', 22, now(), now());