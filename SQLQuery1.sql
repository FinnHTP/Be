-- Bảng Game type --
INSERT INTO gametypes VALUES ('Action Game');
INSERT INTO gametypes VALUES ('Adventure Game');
INSERT INTO gametypes VALUES ('Shooter Game');
INSERT INTO gametypes VALUES ('Fighting Game');
INSERT INTO gametypes VALUES ('Survival Game');
INSERT INTO gametypes VALUES ('Rhythm Game');
INSERT INTO gametypes VALUES ('Survival Shooter Game');
INSERT INTO gametypes VALUES ('Horror Game');
INSERT INTO gametypes VALUES ('Interactive Novel Game');
INSERT INTO gametypes VALUES ('Interactive Film Game');
INSERT INTO gametypes VALUES ('Real-Time 3D Survival Game');
INSERT INTO gametypes VALUES ('Action RPG (Role-Playing Game)');
INSERT INTO gametypes VALUES ('MMORPG (Massively Multiplayer Online Role-Playing Game)');
INSERT INTO gametypes VALUES ('Grid-Based RPG (Role-Playing Game)');
INSERT INTO gametypes VALUES ('MOBA (Multiplayer Online Battle Arena)');


-- Bảng Rank type --
insert into ranktypes (name, price) values ('Bronze', 10000), ('Silver', 50000), ('Gold', 100000);


-- Bang Role
insert into role (name) values ('ADMIN') , ('STAFF') , ('USER')

-- Bang Account




-- Grand Theft Auto V - Minimum
INSERT INTO gameSystemRequirements (card, memory, os, processor, storage, game_id)
VALUES
(
  'NVIDIA 9800 GT 1GB / AMD HD 4870 1GB (DX 10, 10.1, 11)',
  '4 GB RAM',
  'Windows 8.1 64 Bit, Windows 8 64 Bit, Windows 7 64 Bit Service Pack 1, Windows Vista 64 Bit Service Pack 2* (*NVIDIA video card recommended if running Vista OS)',
  'Intel Core 2 Quad CPU Q6600 @ 2.40GHz (4 CPUs) / AMD Phenom 9850 Quad-Core Processor (4 CPUs) @ 2.5GHz',
  '65 GB available space',
  1
);

-- Grand Theft Auto V - Recommended
INSERT INTO gameSystemRequirements (card, memory, os, processor, storage, game_id)
VALUES
(
  'NVIDIA GTX 660 2GB / AMD HD7870 2GB',
  '8 GB RAM',
  'Windows 8.1 64 Bit, Windows 8 64 Bit, Windows 7 64 Bit Service Pack 1',
  'Intel Core i5 3470 @ 3.2GHz (4 CPUs) / AMD X8 FX-8350 @ 4GHz (8 CPUs)',
  '65 GB available space',
  1
);



