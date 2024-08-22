﻿-- Bảng Game type --
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

-- Bảng Game --
INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES 
('Build bridges, grow towers, terraform terrain, and fuel flying machines in the stunning followup to the multi-award winning World of Goo.',
        'worldofgoo2.jpeg',
        'World of Goo 2',
        313000,
        '2024-08-02',
        1,
        '1.0',
        2); 
INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES 
('Overlay custom crosshairs on every game you play. Choose from thousands of unique crosshairs created by the Crosshair X community or design your own using the designer.',
        'crosshair.png',
        'Crosshair X',
        84000,
        '2020-08-17',
        1,
        '1.0',
        3); 
        
  INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('Horizon Forbidden West™ Complete Edition takes you into a vast open world with dramatic battles and exciting exploration in a post-apocalyptic future. Featuring stunning graphics and expanded content, this is the complete edition of the acclaimed game.',
        'horizon.jpg',
        'Horizon Forbidden West™ Complete Edition',
        499000,
        '2024-08-10',
        1,
        '1.0',
        12);
INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('In "Suicide Squad: Kill the Justice League", players take on the role of the infamous Suicide Squad members tasked with defeating the corrupted Justice League. This action-packed game features a blend of chaotic combat and strategic gameplay.',
        'suicidesquad.jpeg',
        'Suicide Squad: Kill the Justice League',
        699000,
        '2024-08-15',
        1,    
        '1.0',
        4);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"F1® Manager 2024" offers players the chance to step into the shoes of a team principal, managing every aspect of a Formula 1 team, from car development to race strategy. This latest edition features enhanced graphics, more detailed management options, and up-to-date team and driver information.',
        'f1manager.jpeg',
        'F1® Manager 2024',
        799000,       -- Adjust the price as needed
        '2024-08-20', -- Adjust the release date as needed
        1,            -- Status set to 1 (bit type, represents active or released)
        '1.0',        -- Adjust the version as needed
        1);
        INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('In "Hades," you play as Zagreus, the son of Hades, trying to escape the Underworld. This critically acclaimed rogue-like dungeon crawler features fast-paced combat, rich narrative, and stunning art.',
        'hades.jpeg',
        'Hades',
        399000,        -- Adjust the price as needed
        '2024-08-01',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        12); 
        INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"Banishers: Ghost of New Eden" is an action-adventure game where players hunt down malevolent spirits and explore a richly detailed, haunted world. It combines immersive storytelling with thrilling combat mechanics.',
        'banishers.jpeg',
        'Banishers: Ghost of New Eden',
        549000,        -- Adjust the price as needed
        '2024-09-15',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        7);
        INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"Intonight" is an immersive adventure game where players navigate a dystopian world filled with intrigue and danger. The game features an engaging storyline and intricate gameplay mechanics.',
        'intonight.jpeg',
        'Intonight',
        459000,        -- Adjust the price as needed
        '2024-08-25',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        5);
        INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"Pacific Drive" offers a thrilling survival experience in a post-apocalyptic coastal setting. Players must navigate through treacherous environments and manage limited resources.',
        'pacific.jpeg',
        'Pacific Drive',
        399000,        -- Adjust the price as needed
        '2024-09-01',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        7);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"SKULL AND BONES" is a high-seas adventure game that allows players to command their own pirate ship, engage in naval combat, and explore a vast open world full of danger and treasure.',
        'skull.jpeg',
        'SKULL AND BONES',
        699000,        -- Adjust the price as needed
        '2024-09-10',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        4);  
      INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"Manor Lords" is a grand strategy game that combines city-building and real-time tactical combat. Players manage their own medieval manor and lead their forces in epic battles.',
        'manor.jpeg',
        'Manor Lords',
        549000,        -- Adjust the price as needed
        '2024-09-20',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        15);

        INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"Taxi Life: A City Driving Simulator" offers a realistic driving experience where players take on the role of a taxi driver navigating a bustling city. The game features detailed urban environments and dynamic driving challenges.',
        'taxilife.jpeg',
        'Taxi Life: A City Driving Simulator',
        349000,        -- Adjust the price as needed
        '2024-08-30',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        1);

        INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"Tomb Raider I-III Remastered Starring Lara Croft" brings the classic Tomb Raider games into high definition with updated graphics and improved gameplay. Players can relive the iconic adventures of Lara Croft in a modernized format.',
        'tombraider.jpeg',
        'Tomb Raider I-III Remastered Starring Lara Croft',
        499000,        -- Adjust the price as needed
        '2024-09-05',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        12);

        INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"For Honor" is a melee combat game where players choose from various historical warriors to battle in intense, strategic fights. The game features a blend of swordplay, tactical combat, and multiplayer modes.',
        'forhonor.jpeg',
        'For Honor',
        399000,        -- Adjust the price as needed
        '2024-09-15',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        4);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"Darkblade Ascent" is an action RPG where players ascend through dark and dangerous dungeons, battling fierce enemies and collecting powerful loot. The game features engaging combat and intricate dungeon design.',
        'darkblade.jpeg',
        'Darkblade Ascent',
        459000,        -- Adjust the price as needed
        '2024-09-25',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        12); 
        INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"Fallout 4" is an open-world RPG set in a post-apocalyptic wasteland where players explore, build settlements, and engage in deep narrative choices. The game features a vast open world with rich storytelling and immersive gameplay.',
        'fallout4.jpeg',
        'Fallout 4',
        499000,        -- Adjust the price as needed
        '2024-08-30',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        12); 
        
        INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('Thank Goodness Youre Here is a charming and humorous adventure game where players help quirky characters in a whimsical world through various puzzles and tasks. The game combines engaging storylines with creative problem-solving.',
        'thankgoodness.jpeg',
        'Thank Goodness Youre Here',
        399000,        -- Adjust the price as needed
        '2024-09-01',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        5);            -- Assuming the ID for 'Adventure Game' is 5

        INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"Dying Light" is an open-world survival horror game where players navigate a city overrun by zombies, utilizing parkour skills and combat to survive. The game features dynamic day-night cycles and intense gameplay.',
        'dyinglight.jpeg',
        'Dying Light',
        449000,        -- Adjust the price as needed
        '2024-09-05',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        7); 

      INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"Prince of Persia: The Lost Crown" is an action-adventure game set in a richly detailed Persian world. Players embark on a quest to uncover lost secrets and restore balance through a combination of platforming and combat.',
        'princeofpersia.jpeg',
        'Prince of Persia: The Lost Crown',
        499000,        -- Adjust the price as needed
        '2024-08-25',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        12); 
          INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
  VALUES ('"F1® 24" is a racing simulation game that captures the excitement and intensity of Formula 1 racing. Players can experience realistic driving physics, detailed car models, and immersive tracks from the F1 circuit.',
          'f1.jpeg',
          'F1® 24',
          599000,        -- Adjust the price as needed
          '2024-09-01',  -- Adjust the release date as needed
          1,             -- Status set to 1 (bit type, represents active or released)
          '1.0',         -- Adjust the version as needed
          1); 

          INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"A Way Out" is a cooperative action-adventure game where players work together to escape from prison and unravel a gripping story. The game emphasizes teamwork and features split-screen gameplay.',
        'a-way-out.jpg',
        'A Way Out',
        499000,        -- Adjust the price as needed
        '2024-08-20',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        5);
        
        INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"Need for Speed™ Heat Deluxe Edition" is an action-packed racing game that lets players explore a vibrant city while participating in high-stakes races and illegal street racing events. The Deluxe Edition includes exclusive content and bonus items.',
        'need-for-speed-deluxe.jpg',
        'Need for Speed™ Heat Deluxe Edition',
        699000,        -- Adjust the price as needed
        '2024-09-10',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        1);

        INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"Kenshi" is an open-world RPG that offers a unique blend of sandbox gameplay and strategic elements. Players build their own factions, explore a vast world, and engage in complex survival mechanics.',
        'kenshi.jpeg',
        'Kenshi',
        399000,        -- Adjust the price as needed
        '2024-08-15',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        12);

        INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"HomeWorld 3" is a real-time strategy game set in space where players command fleets of ships and engage in large-scale space battles. The game features intricate tactical gameplay and a compelling story.',
        'homeworld-3.jpeg',
        'HomeWorld 3',
        549000,        -- Adjust the price as needed
        '2024-09-25',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        15); 

        INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"Need for Speed™ Most Wanted" is a high-octane racing game featuring an open-world environment where players compete in thrilling street races and evade the police. The game emphasizes customization and illicit racing.',
        'need-for-speed.jpeg',
        'Need for Speed™ Most Wanted',
        499000,        -- Adjust the price as needed
        '2024-08-25',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        1);            -- Assuming the ID for 'Simulation Game' is 1, if this game fits the category

  INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"Expeditions - A MudRunner Game" is a simulation game that challenges players to navigate through rugged terrains and overcome difficult driving conditions using various off-road vehicles. The game features realistic physics and dynamic environments.',
        'expeditions.jpeg',
        'Expeditions - A MudRunner Game',
        399000,        -- Adjust the price as needed
        '2024-09-10',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        1); 

        INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"Fabledom" is a city-building simulation game where players construct and manage a fantasy kingdom. The game combines elements of strategy and management with a charming and whimsical setting.',
        'fabledom.jpeg',
        'Fabledom',
        349000,        -- Adjust the price as needed
        '2024-08-20',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        1);

        INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES ('"Battlefield™ 1 Revolution" is a first-person shooter set during World War I, offering a comprehensive experience with a mix of large-scale battles, immersive environments, and historical accuracy. The Revolution Edition includes all major expansions and bonus content.',
        'battlefield-1.jpeg',
        'Battlefield™ 1 Revolution',
        699000,        -- Adjust the price as needed
        '2024-09-15',  -- Adjust the release date as needed
        1,             -- Status set to 1 (bit type, represents active or released)
        '1.0',         -- Adjust the version as needed
        3);
        
        INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Dragon Age: Inquisition – Game of the Year Edition is an action RPG where players explore a vast world and engage in epic battles. The Game of the Year Edition includes all DLCs and expansions.',
    'dragon-age.jpg',
    'Dragon Age: Inquisition – Game of the Year Edition',
    799000,        -- Adjust the price as needed
    '2024-09-10',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    12             -- Assuming the game type ID for 'Action RPG (Role-Playing Game)' is 12
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Plants vs. Zombies™ GW2: Deluxe Edition is a third-person shooter game that pits plants against zombies in a humorous battle. The Deluxe Edition includes additional content and bonuses.',
    'plantvszombie.jpg',
    'Plants vs. Zombies™ GW2: Deluxe Edition',
    299000,        -- Adjust the price as needed
    '2024-08-25',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    3              -- Assuming the game type ID for 'Shooter Game' is 3
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'JudgeSim is a simulation game where players take on the role of a judge, making decisions and managing court cases. The game features realistic scenarios and a deep decision-making system.',
    'judgesim.png',
    'JudgeSim',
    199000,        -- Adjust the price as needed
    '2024-07-15',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    9              -- Assuming the game type ID for 'Interactive Novel Game' is 9
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Sker Ritual is a horror game where players must survive against supernatural threats in a chilling environment. The game emphasizes atmosphere and tension.',
    'sker-ritual.png',
    'Sker Ritual',
    349000,        -- Adjust the price as needed
    '2024-10-05',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    8              -- Assuming the game type ID for 'Horror Game' is 8
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Flintlock: The Siege of Dawn is an action-adventure game set in a fantastical world. Players engage in epic battles and explore diverse landscapes while uncovering a gripping storyline.',
    'flintlock.png',
    'Flintlock: The Siege of Dawn',
    599000,        -- Adjust the price as needed
    '2024-11-15',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    2              -- Assuming the game type ID for 'Adventure Game' is 2
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Plants vs. Zombies™ Game of the Year Edition is a tower defense game where players use plants to fend off waves of zombies. This edition includes additional content and features.',
    'plants-vs-zombies-of-the-year.jpg',
    'Plants vs. Zombies™ Game of the Year Edition',
    199000,        -- Adjust the price as needed
    '2024-08-30',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    5              -- Assuming the game type ID for 'Survival Game' is 5
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Need for Speed™ Payback - Deluxe Edition is a racing game where players engage in high-speed chases and epic heist missions. The Deluxe Edition includes additional cars and customization options.',
    'need-for-speed-payback.jpg',
    'Need for Speed™ Payback - Deluxe Edition',
    399000,        -- Adjust the price as needed
    '2024-09-05',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    15             -- Assuming the game type ID for 'MOBA (Multiplayer Online Battle Arena)' is 15 (you may need to adjust this if there is a different ID for racing games)
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Alice: Madness Returns™ is an action-adventure game that takes players through a dark and twisted version of Wonderland. The game combines platforming, combat, and a unique visual style.',
    'alice-madness-returns.jpg',
    'Alice: Madness Returns™',
    299000,        -- Adjust the price as needed
    '2024-10-20',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    2              -- Assuming the game type ID for 'Adventure Game' is 2
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Winter Survival is a survival game where players must endure harsh winter conditions, manage resources, and fend off wildlife to stay alive. The game emphasizes realistic survival mechanics and environmental challenges.',
    'winter-survival.jpg',
    'Winter Survival',
    249000,        -- Adjust the price as needed
    '2024-12-01',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    5              -- Assuming the game type ID for 'Survival Game' is 5
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Need for Speed™ Deluxe Edition is a racing game featuring high-speed chases, thrilling races, and extensive car customization options. The Deluxe Edition includes exclusive cars and additional content.',
    'need-for-speed-2016.jpg',
    'Need for Speed™ Deluxe Edition',
    449000,        -- Adjust the price as needed
    '2024-09-10',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    15             -- Assuming the game type ID for 'MOBA (Multiplayer Online Battle Arena)' is 15 (you may need to adjust this if there is a different ID for racing games)
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Titanfall® 2: Ultimate Edition is a first-person shooter that combines fast-paced multiplayer action with a compelling single-player campaign. The Ultimate Edition includes all DLCs and exclusive content.',
    'titanfall-2.jpg',
    'Titanfall® 2: Ultimate Edition',
    499000,        -- Adjust the price as needed
    '2024-11-20',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    3              -- Assuming the game type ID for 'Shooter Game' is 3
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Dungeons of Hinterberg is an action RPG set in a fantastical world filled with dangerous dungeons, powerful enemies, and hidden treasures. Players embark on quests, battle foes, and uncover secrets.',
    'dungeons-of-hinterberg.jpg',
    'Dungeons of Hinterberg',
    399000,        -- Adjust the price as needed
    '2024-10-25',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    12             -- Assuming the game type ID for 'Action RPG (Role-Playing Game)' is 12
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Need for Speed™ Rivals: Complete Edition is a racing game that features intense street racing, police chases, and a variety of cars and customization options. The Complete Edition includes all DLCs and additional content.',
    'need-for-speed-rivals.jpg',
    'Need for Speed™ Rivals: Complete Edition',
    349000,        -- Adjust the price as needed
    '2024-09-15',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    15             -- Assuming the game type ID for 'MOBA (Multiplayer Online Battle Arena)' is 15 (you may need to adjust this if there is a different ID for racing games)
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Command & Conquer™ Remastered Collection is a real-time strategy game that brings the classic Command & Conquer games into the modern era with enhanced graphics, improved gameplay, and additional content.',
    'command&conquer.jpg',
    'Command & Conquer™ Remastered Collection',
    299000,        -- Adjust the price as needed
    '2024-10-01',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    11             -- Assuming the game type ID for 'Real-Time 3D Survival Game' is 11
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Nightingale is a survival game set in a mystical world filled with dangerous creatures and challenging environments. Players must gather resources, craft tools, and build shelters to survive.',
    'NWXKeyArt.jpeg',
    'Nightingale',
    399000,        -- Adjust the price as needed
    '2024-11-05',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    5              -- Assuming the game type ID for 'Survival Game' is 5
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Tales of Kenzera™: ZAU is an action RPG that takes players on an epic journey through the fantasy world of Kenzera. The game features a rich storyline, engaging combat, and extensive character customization.',
    'EGS_TalesofKenzeraZAUStandardEdition.jpeg',
    'Tales of Kenzera™: ZAU',
    459000,        -- Adjust the price as needed
    '2024-12-10',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    12             -- Assuming the game type ID for 'Action RPG (Role-Playing Game)' is 12
);


INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Teenage Mutant Ninja Turtles: Shredders Revenge is a beat em up action game where players control their favorite turtles to fight against Shredder and his minions. The game features cooperative gameplay and nostalgic visuals.',
    'teenage-mutant-ninja.png',
    'Teenage Mutant Ninja Turtles: Shredder Revenge',
    299000,        -- Adjust the price as needed
    '2024-10-15',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    4              -- Assuming the game type ID for 'Fighting Game' is 4
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Odsparks: An Automation Adventure is a simulation and automation game where players build and manage complex systems. The game focuses on creativity and problem-solving with a whimsical art style.',
    'oddsparks.jpg',
    'Odsparks: An Automation Adventure',
    349000,        -- Adjust the price as needed
    '2024-11-01',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    10             -- Assuming the game type ID for 'Interactive Film Game' is 10 (you may need to adjust this if there is a different ID for simulation games)
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Alaskan Road Truckers is a simulation game where players take on the role of a truck driver navigating the challenging roads of Alaska. The game emphasizes realistic driving mechanics and environmental hazards.',
    'alaskan-road-truckers.png',
    'Alaskan Road Truckers',
    249000,        -- Adjust the price as needed
    '2024-10-25',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    9              -- Assuming the game type ID for 'Interactive Novel Game' is 9 (you may need to adjust this if there is a different ID for simulation games)
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'CONSCRIPT is a survival horror game set during World War I, where players must navigate through the trenches, manage resources, and survive against both human and supernatural threats.',
    'conscript.jpg',
    'CONSCRIPT',
    299000,        -- Adjust the price as needed
    '2024-12-05',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    8              -- Assuming the game type ID for 'Horror Game' is 8
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Brothers: A Tale of Two Sons Remake is an adventure game that follows the emotional journey of two brothers who must work together to overcome obstacles and solve puzzles in a fantastical world. The remake features enhanced graphics and updated gameplay mechanics.',
    'brothers-a-tale-of-two-sons-remake.jpg',
    'Brothers: A Tale of Two Sons Remake',
    399000,        -- Adjust the price as needed
    '2024-10-10',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    2              -- Assuming the game type ID for 'Adventure Game' is 2
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Ghost Recon Future Soldier is a tactical shooter game where players lead an elite team of soldiers equipped with advanced technology and weaponry to complete missions across the globe. The game emphasizes strategic planning and teamwork.',
    'EGST_StorePortrait_1200x1600_1200x1600-13af7782c4cd438ad11afb21fa5421d2.jpeg',
    'Ghost Recon Future Soldier',
    499000,        -- Adjust the price as needed
    '2024-11-15',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    3              -- Assuming the game type ID for 'Shooter Game' is 3
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Battlefield 4™ Premium Edition is a first-person shooter that delivers an immersive multiplayer experience with large-scale battles and destructible environments. The Premium Edition includes all expansions and additional content.',
    'battlefield-4-13z58.jpg',
    'Battlefield 4™ Premium Edition',
    599000,        -- Adjust the price as needed
    '2024-09-30',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    3              -- Assuming the game type ID for 'Shooter Game' is 3
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Ships At Sea is a simulation game that allows players to command and manage various types of ships, navigating the oceans and completing missions. The game focuses on realistic ship handling and maritime challenges.',
    'ships-at-sea-g5iyo.jpg',
    'Ships At Sea',
    349000,        -- Adjust the price as needed
    '2024-12-20',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    9              -- Assuming the game type ID for 'Interactive Novel Game' is 9 (you may need to adjust this if there is a different ID for simulation games)
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Survival: Fountain of Youth is a survival game where players must explore a mysterious island, gather resources, and craft tools to survive. The game features dynamic weather, wildlife, and challenging survival mechanics.',
    'survival-fountain-of-youth-1lnsj.jpg',
    'Survival: Fountain of Youth',
    299000,        -- Adjust the price as needed
    '2024-11-10',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    5              -- Assuming the game type ID for 'Survival Game' is 5
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'RPG MAKER UNITE is a game development tool that allows users to create their own role-playing games with ease. The software includes various assets, a user-friendly interface, and powerful scripting capabilities.',
    'rpg-maker-unite-1ef21.png',
    'RPG MAKER UNITE',
    399000,        -- Adjust the price as needed
    '2024-08-25',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    12             -- Assuming the game type ID for 'Action RPG (Role-Playing Game)' is 12 (you may need to adjust this if there is a different ID for game development tools)
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Far Horizon is an adventure game that takes players on a journey across vast landscapes, solving puzzles and uncovering the secrets of a lost civilization. The game features beautiful visuals and an engaging storyline.',
    'far-horizon-vz0aj.png',
    'Far Horizon',
    349000,        -- Adjust the price as needed
    '2024-12-01',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    2              -- Assuming the game type ID for 'Adventure Game' is 2
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Unravel Two is a puzzle platformer game that follows two Yarnys, small creatures made of yarn, on their journey through beautiful environments. The game emphasizes cooperative gameplay and creative problem-solving.',
    'unravel-two-rgbt0.jpg',
    'Unravel Two',
    299000,        -- Adjust the price as needed
    '2024-09-20',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    6              -- Assuming the game type ID for 'Rhythm Game' is 6 (you may need to adjust this if there is a different ID for puzzle platformer games)
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Dragon Age II: Ultimate Edition is an action RPG that follows the story of Hawke, a survivor of the Blight who rises to become the Champion of Kirkwall. The Ultimate Edition includes all DLCs and additional content.',
    'dragon-age-ii-ultimate-edition-mp359.jpg',
    'Dragon Age II: Ultimate Edition',
    599000,        -- Adjust the price as needed
    '2024-11-15',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    12             -- Assuming the game type ID for 'Action RPG (Role-Playing Game)' is 12
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Still Wakes the Deep is a horror game set on an oil rig in the middle of the ocean. Players must navigate the rig, solve puzzles, and survive against unknown threats. The game emphasizes atmosphere and psychological horror.',
    'still-wakes-the-deep-6j4ek.jpg',
    'Still Wakes the Deep',
    349000,        -- Adjust the price as needed
    '2024-10-31',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    8              -- Assuming the game type ID for 'Horror Game' is 8
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Men of War II is a real-time strategy game that focuses on the battles of World War II. Players command various units and must strategize to achieve victory in detailed and historically accurate scenarios.',
    'men-of-war-ii-3si9o.jpg',
    'Men of War II',
    499000,        -- Adjust the price as needed
    '2024-09-20',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    11             -- Assuming the game type ID for 'Real-Time 3D Survival Game' is 11
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Sim City 3000™ Unlimited is a city-building simulation game where players design and manage their own city. The game includes various scenarios, building options, and challenges to keep players engaged.',
    'simcity-3000-unlimited-1bcci.jpg',
    'Sim City 3000™ Unlimited',
    399000,        -- Adjust the price as needed
    '2024-12-05',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    9              -- Assuming the game type ID for 'Interactive Novel Game' is 9 (you may need to adjust this if there is a different ID for city-building simulation games)
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Dragon Age™: Origins - Ultimate Edition is a critically acclaimed RPG where players shape the fate of the world through their decisions and combat skills. The Ultimate Edition includes all downloadable content and enhancements.',
    'dragon-age-origins--ultimate-edition-16rzt.jpg',
    'Dragon Age™: Origins - Ultimate Edition',
    599000,        -- Adjust the price as needed
    '2024-11-25',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    12             -- Assuming the game type ID for 'Action RPG (Role-Playing Game)' is 12
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Thymesia is an action RPG with fast-paced combat and a dark, atmospheric setting. Players explore a plague-ridden world, battling formidable enemies and uncovering hidden secrets as they seek to understand the source of the plague.',
    'thymesia-19q39.jpg',
    'Thymesia',
    399000,        -- Adjust the price as needed
    '2024-09-30',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    12             -- Assuming the game type ID for 'Action RPG (Role-Playing Game)' is 12
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Plants vs. Zombies™: BFN Deluxe Edition is a tower defense game where players defend their garden against waves of zombies. The Deluxe Edition includes exclusive plants, zombies, and additional content.',
    'plants-vs-zombies-bfn-deluxe-edition-9ho9f.jpg',
    'Plants vs. Zombies™: BFN Deluxe Edition',
    349000,        -- Adjust the price as needed
    '2024-10-05',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    7              -- Assuming the game type ID for 'Survival Shooter Game' is 7 (you may need to adjust this if there is a different ID for tower defense games)
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Maisa: Galactic Bounty Hunter is an action-adventure game set in a futuristic galaxy. Players assume the role of a skilled bounty hunter tasked with capturing dangerous criminals across various planets.',
    'maisa-galactic-bounty-hunter-1nekq.jpg',
    'Maisa: Galactic Bounty Hunter',
    399000,        -- Adjust the price as needed
    '2024-12-15',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    5              -- Assuming the game type ID for 'Survival Game' is 5 (you may need to adjust this if there is a different ID for action-adventure games)
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Light is a visually stunning puzzle platformer that challenges players with innovative mechanics and captivating level design. The game features a unique art style and a compelling narrative as players navigate through various light-based puzzles.',
    'light-1clrd.png',
    'Light',
    299000,        -- Adjust the price as needed
    '2024-10-05',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    6              -- Assuming the game type ID for 'Rhythm Game' is 6 (you may need to adjust this if there is a different ID for puzzle platformer games)
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Beyond Good & Evil 20th Anniversary Edition is a remastered version of the classic action-adventure game that follows the story of Jade, a photojournalist fighting against an oppressive regime. The Anniversary Edition includes updated graphics, enhanced gameplay, and additional content.',
    'EGST_StorePortrait_1200x1600_1200x1600-8612672ad45ddbf5fa6f6044d08441cf.jpg',
    'Beyond Good & Evil 20th Anniversary Edition',
    399000,        -- Adjust the price as needed
    '2024-10-20',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    2              -- Assuming the game type ID for 'Adventure Game' is 2
);

INSERT INTO games (description_game, image, name, price, release_date, status, version, game_type)
VALUES (
    'Unleaving is an atmospheric exploration game where players navigate a mysterious and beautiful world, uncovering its secrets and solving puzzles. The game focuses on immersive storytelling and unique visual design.',
    'unleaving-e3bgl.png',
    'Unleaving',
    299000,        -- Adjust the price as needed
    '2024-11-10',  -- Adjust the release date as needed
    1,             -- Status set to 1 (bit type, represents active or released)
    '1.0',         -- Adjust the version as needed
    2              -- Assuming the game type ID for 'Adventure Game' is 2
);




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



