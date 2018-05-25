BEGIN TRANSACTION;


--- ================================================================================
--- author
--- ================================================================================
	INSERT INTO public.author (id, first_name, last_name) VALUES (1, 'Paulo', 'Coelho');
	INSERT INTO public.author (id, first_name, last_name) VALUES (2, 'J. R. R.', 'Tolkien');
	INSERT INTO public.author (id, first_name, last_name) VALUES (3, 'Philip K.', 'Dick');
	INSERT INTO public.author (id, first_name, last_name) VALUES (4, 'Stephen', 'King');
	INSERT INTO public.author (id, first_name, last_name) VALUES (5, 'Henri', 'Troyat');
	INSERT INTO public.author (id, first_name, last_name) VALUES (6, 'Henri', 'Gougaud');

	ALTER SEQUENCE author_id_seq RESTART WITH 7;



--- ================================================================================
--- type_work
--- ================================================================================
	INSERT INTO public.type_work (id, type_work) VALUES (1, 'Science-fiction');
	INSERT INTO public.type_work (id, type_work) VALUES (2, 'Anticipation');
	INSERT INTO public.type_work (id, type_work) VALUES (3, 'Cyberpunk');
	INSERT INTO public.type_work (id, type_work) VALUES (4, 'Steampunk');
	INSERT INTO public.type_work (id, type_work) VALUES (5, 'Space Opera');
	INSERT INTO public.type_work (id, type_work) VALUES (6, 'Science-fiction humouristique');
	INSERT INTO public.type_work (id, type_work) VALUES (7, 'Fantasy');
	INSERT INTO public.type_work (id, type_work) VALUES (8, 'Fantastique');
	INSERT INTO public.type_work (id, type_work) VALUES (9, 'Horreur');
	INSERT INTO public.type_work (id, type_work) VALUES (10, 'Aventure');
	INSERT INTO public.type_work (id, type_work) VALUES (11, 'Biographie');
	INSERT INTO public.type_work (id, type_work) VALUES (12, 'Conte');
	INSERT INTO public.type_work (id, type_work) VALUES (13, 'Épopée');
	INSERT INTO public.type_work (id, type_work) VALUES (14, 'Nouvelle');
	INSERT INTO public.type_work (id, type_work) VALUES (15, 'Témoignage');
	INSERT INTO public.type_work (id, type_work) VALUES (16, 'Théâtre');
	INSERT INTO public.type_work (id, type_work) VALUES (17, 'Roman');
	INSERT INTO public.type_work (id, type_work) VALUES (18, 'Littérature française');

	ALTER SEQUENCE type_work_id_seq RESTART WITH 19;



--- ================================================================================
--- work
--- ================================================================================
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (1, 17, 'Le Pèlerin de Compostelle', '« A cette époque, ma quête spirituelle était liée à l’idée qu’il existait des secrets, des chemins mystérieux… Je croyais que ce qui est difficile et compliqué mène toujours à la compréhension du mystère et de la vie… »
	Lorsque, en 1986, Paulo Coelho entreprend le pèlerinage de Saint-Jacques-de-Compostelle, il ne sait pas encore que de ce voyage il reviendra transformé.
	A son image, le héros de ce récit a péché par orgueil. Au terme d’un parcours jalonné d’épreuves, il comprendra enfin que l’extraordinaire se trouve sur le chemin des gens ordinaires, que la vérité est pour tous les hommes.
	Creuset de ses livres ultérieurs, en particulier L’Alchimiste, qui lui a valu des lecteurs dans le monde entier, ce voyage inspiré, poétique, nous fait partager la recherche humaine et spirituelle de Paulo Coelho.', '2017-12-27 15:42:33', null, '/images/book/book-1.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (2, 17, 'L''Alchimiste', 'Santiago, un jeune berger andalou, part à la recherche d''un trésor enfoui au pied des Pyramides.
	Lorsqu''il rencontre l''Alchimiste dans le désert, celui-ci lui apprend à écouter son cœur, à lire les signes du destin et, par-dessus tout, à aller au bout de son rêve.
	Merveilleux conte philosophique destiné à l''enfant qui sommeille en chaque être, ce livre a déjà marqué une génération de lecteurs.', '2017-12-27 15:44:27', null, '/images/book/book-2.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (3, 17, 'Sur le bord de la rivière Piedra, je me suis assise et j''ai pleuré', 'Une histoire d''amour renferme tous les secrets du monde. Pilar et son compagnon se sont connus dans l''enfance, éloignés au cours de leur adolescence, et voici qu''ils se retrouvent onze ans plus tard. Elle, une femme à qui la vie a appris à être forte et à ne pas se laisser déborder par ses sentiments. Lui, un homme qui possède le don de guérir les autres et cherche dans la religion une solution à ses conflits intérieurs. Tous deux sont unis par le désir de changer et de poursuivre leurs rêves. Pour y parvenir, il leur faudra surmonter bien des obstacles : la peur de se donner, le sentiment de la faute, les préjugés. Pilar et son compagnon décident alors de se rendre dans un petit village des Pyrénées, pour découvrir leur propre vérité. S''il relate avec poésie, et des dialogues très modernes, une rencontre amoureuse. Paulo Coelho nous plonge aussi dans les mystères de la divinité. Car, rappelle-t-il, "l''expérience spirituelle est avant tout une expérience pratique d''amour". Un livre émouvant, limpide, qui délivre des messages de vie.', '2017-12-27 15:48:59', null, '/images/book/book-3.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (4, 17, 'La Cinquième Montagne', 'Au IXe siècle avant notre ère, Dieu ordonne au prophète Élie de quitter Israël. Son chemin le mène alors à Sarepta, une petite cité phénicienne. Là, dans la ville assiégée par les Assyriens, Élie perdra tout, notamment la femme aimée, et sera pris dans un tourbillon d''événements dramatiques qui le conduiront à affronter Dieu.

	« Pourquoi Celui qui a créé le monde préfère-t-Il se servir de la tragédie pour écrire le livre du destin? demanda Élie.- Tu ne sais pas ce que tu dis, rétorqua l''ange. Il n''y a pas de tragédie, il y a seulement l''inévitable. Tout a sa raison d''être c''est à toi de savoir distinguer ce qui est passager de ce qui est définitif.- Qu''est-ce qui est passager? L''inévitable.- Et qu''est-ce qui est définitif? Les leçons de l''inévitable. »

	Se fondant sur un fragment de la Bible (1 Rois, 17 et 2 Rois, 2), Paulo Coelho développe les thèmes qui, depuis L''Alchimiste, font la force de son oeuvre : le sens que chacun doit donner à sa vie, la persévérance avec laquelle il faut suivre sa Légende Personnelle, la nécessité d''espérer, et de comprendre que la tragédie faisant irruption dans une existence n''est pas une punition, mais un défi pour l''homme qui doit la dépasser...', '2017-12-27 15:55:42', null, '/images/book/book-4.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (5, 17, 'Manuel du guerrier de la lumière', 'Les guerriers de la lumière se reconnaissent au premier regard. Ils sont au monde, ils font partie du monde. Souvent ils trouvent que leur vie n''a pas de sens. C''est pour cela qu''ils sont des guerriers de la lumière. Parce qu''ils s''interrogent. Parce qu''ils continuent de chercher un sens. Et ils finiront, par le trouver.', '2017-12-27 15:56:38', null, '/images/book/book-5.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (6, 17, 'Veronika décide de mourir', 'Une après-midi d''hiver, à sa fenêtre, une jeune femme observe la ville. Pour la première fois, son regard est serein. Veronika vient d''avaler quatre boîtes de somnifères. Elle ne veut plus subir l''insupportable monotonie des jours et l''angoisse des nuits. À l''hôpital psychiatrique où elle se réveille, elle apprend que sa mort n''est retardée que d''une semaine. Durant ce sursis, elle fait la connaissance de Zedka, la rêveuse philosophe, de la douce Maria et de son syndrome de panique, et surtout d''Eduard, le schizophrène mélomane, qui écoute la jeune femme des nuits entières lorsqu''elle joue au piano. Peu à peu s''élève en Veronika le désir nouveau de se livrer, "à un homme, à la ville, à la vie". Paulo Coelho poursuit son pèlerinage auprès des lecteurs, leur apprenant à suivre leur légende personnelle, comme le préconisent les quatre ouvrages qui ont établi sa réputation de "sage des temps modernes" : L''Alchimiste, Sur le bord de la rivière Piedra, Le Pèlerin de Compostelle et le Manuel du guerrier de la lumière. --Laure Anciel ', '2017-12-27 16:00:41', null, '/images/book/book-6.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (7, 7, 'Le Seigneur des Anneaux, Tome 1 : La Communauté de l''Anneau', 'Le Tiers Age touche à sa fin, et la Terre du Milieu à son crépuscule. La Compagnie de l''Anneau va donc tâcher de déjouer les projets infernaux de Sauron, force du mal d''autant plus difficile à combattre qu''elle est désincarnée. Qui, des cinq héros, mènera à bien la mission ? Gandalf, grand sage qui seul mesure la portée de la quête ? Aragorn, qui dissimule ses origines princières sous les traits d''un rôdeur taciturne ? Frodon et Sam, qui sont chargés de la phase finale de la mission ou Gollum, créature abjecte qui fut un temps dépositaire de l''anneau ? Mais quel est donc le pouvoir de cet anneau tant convoité ? Quelle est donc la signification de l''énigme qui figure en première page, en manière d''épigraphe ?

	Tant de questions qui ne sont qu''une infime partie du mystère féerique qui, depuis 1954, ravit l''imagination, autorisée pour un temps à s''attarder dans un séjour magique aux forêts profondes et ancestrales, aux paysages argentés peuplés d''êtres aériens, de jeunes guerrières intrépides, de destriers sauvages ayant la fierté de leurs maîtres, de viles créatures dont la laideur physique reflète la méchanceté... Tous, nous avons rêvé de ce repos de l''âme, de même que nous avons craint, enfants, la menace sourde et inexplicable. Tolkien, lui, a su nommer cet univers, et en faire une épopée passionnante, quête initiatique où l''errance humaine est regardée avec une tolérance rassurante.

	Mais quels sont ces petits êtres rigolos et surprenants, ces "hobbits" ? D''où viennent ces accents folkloriques, ce langage essentiel, cette mélancolie onirique qui teinte l''esprit d''un brouillard étrange une fois le volume refermé ?

	Tant de questions auxquelles, heureusement, Tolkien ne répond jamais tout à fait malgré les cartes, généalogies, lexiques et autres appendices passionnants que son imagination prolifique a fournis sur La Terre du Milieu. --Sana Tang-Léopold Wauters --Ce texte fait référence à l''édition Poche.', '2017-12-27 16:29:12', null, '/images/book/book-7.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (8, 7, 'Le Seigneur des Anneaux, Tome 2 : Les Deux tours', 'Frodon le Hobbit et ses Compagnons se sont engagés, au Grand Conseil d''Elrond, à détruire l''Anneau de Puissance dont Sauron de Mordor cherche à s''emparer pour asservir tous les peuples de la terre habitée : Elfes et Nains, Hommes et Hobbits.', '2017-12-27 16:29:12', null, '/images/book/book-8.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (9, 7, 'Le Seigneur des Anneaux, Tome 3 : Le Retour du Roi', 'Avec "Le Retour du Roi" s''achèvent dans un fracas d''apocalypse les derniers combats de la guerre de l''Anneau.
	Tandis que le continent se couvre de ténèbres, annonçant pour le peuple des Hobbits l''aube d''une ère nouvelle, Frodon poursuit son entreprise.
	Alors qu''il n''a pu franchir la Porte Noire, il se demande comment atteindre le Mont du Destin. Peut-être est-il trop tard : le Seigneur des Ténèbres mobilise ses troupes.
	Les Rohirrim n''ont plus le temps d''en finir avec le traître assiégé dans l''imprenable tour d''Orthanc ; ils doivent se rassembler pour faire face à l''ennemi.
	Tentant une fois de plus sa chance, Frodon passe par le Haut Col, où il sera livré à l''abominable Arachné. Survivra-t-il à son dangereux périple à travers le Pays Noir ?', '2017-12-27 16:29:12', null, '/images/book/book-9.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (10, 7, 'Le Hobbit', 'Bilbo, comme tous les hobbits, est un petit être paisible et sans histoire. Son quotidien est bouleversé un beau jour, lorsque Grandalf le magicien et treize nains barbus l''entraînent dans un voyage périlleux.
	C''est le début d''une grande aventure, d''une fantastique quête au trésor semée d''embûches et d''épreuves, qui mènera Bilbo jusqu''à la Montagne Solitaire gardée par le dragon Smaug ...

	Prélude au Seigneur des anneaux, Bilbo le Hobbit a été vendu à des millions d''exemplaires depuis sa publication en 1937, s''imposant comme l''un des livres les plus aimés et les plus influents du XXᵉ siècle.
	C ‘est l’histoire d’un hobbit qui se nommant Bilbo Saquet. Bilbo menait une vie paisible sans imprévue dans son trou à Hobbitbourg. Un jour, un magicien nommé Gandalf le Gris se présenta chez lui en disant qu’il cherchait quelqu’un pour prendre part à une aventure, Bilbo refusa. Quelques jours plus tard, 13 nains et Gandalf se présentèrent chez lui. Ils lui parlèrent d’Érébor, la cité naine. Le Hobbit a dû affronter plusieurs ennemis, dont le gobelins de Gobbelinville , les Orques de Dol guldure, les Elfes de la forêt noire ainsi que Smaug , le dragon tueur de nains. Vont-ils récupérer Érébor et tuer le dragon ou mourir brulés, écrasés ou décapités par leurs nombreux ennemis.', '2017-12-27 16:29:12', null, '/images/book/book-10.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (11, 1, 'Les androïdes rêvent-ils de moutons électriques ?', 'Le mouton n''était pas mal, avec sa laine et ses bêlements plus vrais que nature - les voisins n''y ont vu que du feu. Mais il arrive en fin de carrière : ses circuits fatigués ne maintiendront plus longtemps l''illusion de la vie. Il va falloir le remplacer. Pas par un autre simulacre, non, par un véritable animal. Deckard en rêve, seulement ce n''est pas avec ses maigres primes que lui rapporte la chasse aux androïdes qu''il parviendra à mettre assez de côté. Holden, c''est lui qui récupère toujours les boulots les plus lucratifs - normal, c''est le meilleur. Mais ce coup-ci,ça n''a pas suffi. Face aux Nexus-6 de dernière génération, même Holden s''est fait avoir. alors, quand on propose à Deckard de reprendre la mission, il serre les dents et signe. De toute façon, qu''a-t-il à perdre ?', '2017-12-27 17:05:13', null, '/images/book/book-11.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (12, 1, 'Le dieu venu du Centaure', 'Que la Terre, en ce lointain futur, soit chaque jour un peu plus torride - bientôt il faudra fuir la planète! -, c''est là une réalité indubitable. Le doute, en revanche, règne sur l''identité des êtres. Qui est qui?
	Tous drogués, devenus "cognitifs" et télépathes, les Terriens ne vivent plus que dans le fantasme et l''illusion. Et Leo Bulero qui détient le secret de la "poudre" fait la loi.
	Jusqu''au jour où il lui faut affronter Palmer Eldritch, un aventurier interplanétaire revenu du Centaure avec une nouvelle drogue cent fois plus puissante et dangereuse.
	Mais qui est ce terrifiant Palmer Eldritch aux yeux artificiels, aux bras mécaniques? Un magicien fou? Un dieu? A moins qu''il ne soit l''Illusion même…', '2017-12-27 17:05:13', null, '/images/book/book-12.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (13, 1, 'Loterie solaire', 'Sur cette Terre de l''avenir, le jeu décide du sort des hommes. Tel qui oeuvrait servilement dans une colonie industrielle peut devenir du jour au lendemain maître du monde, Meneur de Jeu, si les hasards des combinaisons atomiques du minimax en décident ainsi.
	C''est ce qui arrive à Leon Cartwright, simple réparateur électronicien. Mais dans ce monde du XXIIIe siècle, l''assassinat légal du Meneur de Jeu est autorisé. Dès son arrivée au pouvoir, Cartwright se sent menacé de toutes parts, malgré le corps de policiers télépathes qui est chargé de sa protection.
	Encore ne sait-il pas que l''assassin qui le traque n''est pas humain et que rien ne peut l''arrêter.', '2017-12-27 17:05:13', null, '/images/book/book-13.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (14, 1, 'Coulez mes larmes, dit le policier', 'Ceci est l''histoire d''un homme dont tout le monde semble avoir oublié l''existence et l''identité. La veille encore, il était Jason Taverner, producteur de télévision respecté, chanteur à ses heures et idole d''au moins trente millions de téléspectateurs.
	Mais lorsqu''il s''éveille dans une chambre sordide un matin, il semble être le seul être humain au monde à savoir qui était — qui avait été — Jason Taverner. Ses amis, ses collaborateurs, et même Heather, sa maîtresse et complice de toujours, affirment ne jamais l''avoir rencontré.
	Une situation embarrassante dans un monde où les campus sont assiégés depuis vingt ans et où le défaut de papiers d''identité suffit à vous envoyer au bagne. Mais c''est un Six. Ses gènes sont spéciaux. Il a des nerfs d''acier. Et si le monde entier a basculé dans la folie ou dans l''absurde, il va le remettre à l''endroit. Sous l''œil blasé du policier sentimental.', '2017-12-27 17:05:13', null, '/images/book/book-14.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (15, 8, 'Shining', 'Quand on propose à Jack Torrance, ancien professeur et ancien alcoolique, un poste de gardien pour l''hiver à l''hôtel Overlook dans les montagnes du Colorado, il croit tenir là une chance de se racheter aux yeux de sa famille.

	Il s''y installe avec Wendy, sa femme, et leur fils Danny, en espérant profiter de cette occasion pour écrire la pièce de théâtre qui le révélera au monde.Mais les démons de l''hôtel trouvent en Jack une proie presque trop facile pour poursuivre leur œuvre de mal, et il faudra le courage et le sixième sens étrange de son fils pour sauver in extremis ce qui pourra l''être.

	Car Danny possède ce don de lumière de même que l''ancien cuisinier de l''hôtel, Dick Hallorann, et la conjugaison des deux fera reculer les forces du mal. Pendant un certain temps...

	Porté à l''écran par Kubrick avec Jack Nicholson dans le rôle principal, "Shining" est avant tout l''histoire de la lente déchéance d''un homme rongé par la haine. --Lisa B. ', '2017-12-27 17:13:53', null, '/images/book/book-15.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (16, 8, 'Carrie', '"Dépêche A.P. 27 mai 1979. 23h46. Un sinistre d''une ampleur tragique frappe la ville de Chamberlain, Maine. Des centaines de morts...

	" Une mère puritaine, obsédée par le diable et le péché ; des camarades de classe dont elle est le souffre-douleur : Carrie est profondément malheureuse, laide, toujours perdante.

	Mais à seize ans resurgit en elle le souvenir d''un « don » étrange qui avait marqué fugitivement son enfance : de par sa seule volonté elle pouvait faire se déplacer des objets à distance. Et ce pouvoir réapparaît aujourd''hui, plus impérieux, plus impatient...

	Une surprise bouleverse soudain la vie de Carrie : lorsqu''elle est invitée au bal de l''école par Tommy Ross, le boy-friend d''une de ses ennemies, n''est-ce pas un piège plus cruel encore que les autres ? ', '2017-12-27 17:13:53', null, '/images/book/book-16.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (17, 9, 'Simetierre', 'La famille Creed (Louis, médecin, sa femme Rachel, leur fille Ellie, le bébé Gage et leur chat, Church) viennent emménager dans la petite ville de Ludlow, dans une grande maison ancienne. Louis fait la connaissance du vieux Jud Crandall, son voisin d''en face, qui lui montre le quartier et particulièrement un petit cimetière aux animaux avec sa pancarte mal orthographiée créé par les enfants de la ville. Un jour, le chat se fait écraser. Creed décide de l''enterrer avant que les enfants ne découvrent le désastre, et demande de l''aide à Jud. Pendant qu''ils enterrent le chat, le vieil homme lui raconte à demi-mots une légende qui court sur ce cimetière. Puis le chat revient. Vivant. Mais pas tout à fait le même. Et c''est alors qu''un nouveau drame surgit. Simetierre est sans aucun doute le livre le plus terrifiant que King ait jamais écrit, et c''est, dans ce sens, son livre le plus réussi. Parfaitement insupportable, c''est un roman en forme de cauchemar absolu. --Lisa B--', '2017-12-27 17:13:53', null, '/images/book/book-17.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (18, 9, 'Cujo', '"La chaleur tuera cet été! Ça va être terrible"; avait prédit Evvie Chalmers, la doyenne de Castle Rock. Elle ne se trompait pas: l''été 1980 fut effectivement le plus chaud que Castle Rock eût jamais connu. Ce fut aussi un été sanglant.
	En fait, tout commença le matin du 16 juin, lorsque Cujo, un saint-bernard aussi impressionnant que débonnaire, se fit mordre par une chauve-souris. Mais au fond, cela avait peut-être commencé dès le mois de mai, lorsque Tad Trenton avait cru voir un monstre, dans le placard de sa chambre...
	Bien sûr, ses parents l''avaient rassuré, il avait fait un cauchemar, les monstres n''existent pas, voyons!
	Ils se trompaient: même dans les petites villes paisibles, les monstres guettent, tapis dans l''ombre…', '2017-12-27 17:13:53', null, '/images/book/book-18.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (19, 18, 'Viou', 'Nous sommes en 1946. Enfant secrète et passionnée, la petite Sylvie, surmonnée Viou, lutte pour retrouver le souvenir de son père, mort deux plus tôt, lors des combats de la Libération. Mais le choc a laissé un blanc dans sa tête. Sa mère, ayant du prendre un travail à Paris, l''a confié provisoirement à ses grands-parents paternels qui habitent Le Puy. Entre sa grand-mère, femme pieuse et autère que rien ne distrait de la mèmoire de son fils disparu, et son grand-père malicieux, mais lointain, la fillette, âgée de huit ans, s''efforce d''affirmer à la fois son caractère et son goût dévorant de la vie.
	Avec un art d''une discrétion incomparable, Henri Troyat évoque, par petite touches, les pensées et les sentiments de cette enfant singulière qui transforme en lumière tout le gris de l''existence. La sensibilité, l''ironie, la tendresse de l''auteur sont telles dans la peinture de ce monde puéril que le lecteur, peu à peu, rajeunit, devient lui-même Viou et se retrouve plongé, comme par magie, dans les exaltations et les angoisses de l''âge tendre.', '2017-12-27 17:21:50', null, '/images/book/book-19.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (20, 18, 'La neige en deuil', 'Poignante et terrible confrontation de deux hommes, de deux idéaux, la neige en deuil place une tragédie de l''honneur dans le cadre splendide et inhumain des Alpes. Un grand avion venant des Indes s''est écrasé sur un pic neigeux. Les passions humaines les plus diverses éclatent devant le danger d''une expédition de secours.

	Ce roman a valu à son auteur le Grand prix du Prince Rainier de Monaco.', '2017-12-27 17:21:50', null, '/images/book/book-20.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (21, 18, 'Aliocha', 'Fils d''immigrés russes blancs, Aliocha souffre de se sentir différent des autres élèves de son école. C''est tout ce que représentent ses parents qu''il stigmatise : leur gêne financière, leur attachement viscéral à une lointaine Russie. Le pays, la culture ou la langue, Aliocha les a radiés de sa mémoire et rejette l''héritage aux couleurs fanées dont ses parents l''abreuvent.

	Sa patrie c''est la France, sa langue sera désormais le français qu''il admire par-dessus tout et avec elle son cortège d''écrivains qu''il vénère. À l''école, il fait la connaissance de Thierry, élève brillant et envoûtant mais tenu à l''écart des autres du fait de son infirmité

	. Entre eux naît une amitié indéfectible, fondée sur une admiration réciproque et faite d''échanges intellectuels passionnés. Modèle et miroir l''un de l''autre, Aliocha et Thierry découvrent ensemble au cours de ces quelques mois les chemins ensoleillés de leurs jeunes années.

	Ainsi, Aliocha, fort de cette nouvelle amitié, comprendra peu à peu le trésor que recèle sa double identité.

	Dans la formidable production d''Henri Troyat, Aliocha apparaît comme un hommage plein de nostalgie et de pudeur au jeune garçon qu''il fut. Il est sans conteste le plus attachant de ses romans. --Lenaïc Gravis et Jocelyn Blériot', '2017-12-27 17:21:50', null, '/images/book/book-21.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (22, 18, 'La Lumière des justes', 'Au milieu du XXème siècle, Henri Troyat, romancier français né à Moscou, lauréat du Prix Goncourt en 1938 pour L''Araigne, redécouvre sa Russie natale. Il vient d''écrire une biographie de Pouchkine et un grand roman qui retrace la révolution russe. Il a pris conscience que ce cataclysme est l''aboutissement d''une histoire longue, complexe et tumultueuse. Pour la comprendre et incarner la richesse et les contradictions du somptueux XIXème siècle russe, il choisit deux héros, deux aristocrates venant de deux mondes opposés : Nicolas Ozareff, le barine russe, et Sophie de Champlitte, fille du XVIIIème siècle français et de sa passion de la liberté. Ils se rencontrent à Paris en 1814, après la chute de Napoléon. La vie les entraîne à Saint-Pétersbourg et jusqu''en Sibérie... La Lumière des Justes demeure aujourd''hui un des sommets du roman historique et une des plus belles réussites d''Henri Troyat.', '2017-12-27 17:21:50', null, '/images/book/book-22.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (23, 18, 'Les Sept Plumes de l''aigle', 'Luis A. n''est pas un personnage de roman mais un homme
	bien vivant, même s''il tient à rester anonyme. Ce livre raconte son histoire, de sa lointaine enfance argentine aux événements qui l''ont conduit aux portes de la France, où il demeure aujourd''hui.

	II a quitté très tôt la maison de son père, à Côrdoba, au pied de la Sierra Grande. Sa mère venait de mourir, loin de lui, une nuit d''orage. C''était une Indienne Quechua, et le seul être aimé de sa jeune existence. II a refusé l''insupportable.

	II a préféré imaginer qu''elle avait fui la ville, qu''elle était allée rejoindre son peuple, dans la montagne. II est donc parti à sa recherche. C''est ainsi qu''il s''est retrouvé sur le chemin de l''impossible, le seul qui vaille aux yeux des fous de vie.

	II a connu, bien sûr, l''omniprésente misère des enfants perdus. Puis un jour, le hasard-qui-n''existe-pas a voulu qu''il rencontre El Chura, le gardien des ruines de Tiahuanaco, l''homme au plumage de renard. El Chura était un sorcier.

	Un chaman. II l''a instruit, puis il l''a poussé vers d''autres lieux, à la poursuite des pierres vivantes et des sept plumes de l''aigle où sont les sept secrets de la vie. Son errance fut longue, étrange, tourmentée.

	D''autres maîtres l''ont recueilli et l''ont guidé, don Benito, le vieux Chipés, le père Sébastian, des femmes aussi. Itinéraire où chaque rencontre, où chaque événement, même le plus trivial, fut un pas de plus vers I''« épice », vers « ce qui fait que la vie ne passe pas pour rien ».
	J''ai écrit ce qu''il m''a confié de son aventureuse existence et de ses apprentissages. A la fin, il m''a dit : « Maintenant, que le vent emporte nos paroles, comme il emporte tout, pollen, poussière, feuilles mortes. Si elles ne sont que poussière, qu''elles retournent à la poussière. Si elles sont vivantes, qu''elles nourrissent la vie. » Et il est parti d''un grand rire.
	La route continue.', '2017-12-27 17:29:21', null, '/images/book/book-23.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (24, 18, 'Bélibaste', 'La riche famille de Guillaume Bélibaste soutient les derniers " Parfaits", propagateurs clandestins de l''hérésie cathare. En ce début du XIVe siècle, il n''en reste plus guère...

	Un jour d''automne, Guillaume est obligé de tuer un berger qui menaçait de le dénoncer à l''Inquisition. Désormais proscrit, il n''a d''autre choix que de rejoindre, à contrecœur, les errants mystiques.

	Mais comment mener cette vie ascétique lorsqu''on n''a pas la foi?', '2017-12-27 17:29:21', null, '/images/book/book-24.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (25, 18, 'Le Voyage d''Anna', 'Novembre 1620 : Prague la protestante est mise à sac par les troupes catholiques.

	Anna, une servante, recueille l''enfant de son maître, massacré sous ses yeux. Elle ne sait pas encore que sa vie vient de prendre un cours radicalement nouveau.

	Fuyant Prague avec le petit miraculé, elle rencontrera, dans la tourmente de la guerre, la rage et la beauté de vivre, le secret des forêts, la folie et l''amour des gens inoubliables.

	Un roman riche en péripéties et en rebondissements, dans lequel Henri Gougaud nous prouve une fois de plus son immense talent de conteur.', '2017-12-27 17:29:21', null, '/images/book/book-25.jpg');
	INSERT INTO public.work (id, type_work_id, title, summary, created_at, updated_at, image_url) VALUES (26, 18, 'L''enfant de la neige', 'XIIIᵉ siècle. Jaufré, un enfant abandonné devenu troubadour, revient chez lui, à Pamiers, en Languedoc. Il y retrouve sa nourrice Thomette, son demi-frère Alexis, le père abbé Aymar qui l''a élevé, le luthier qui l''a initié à la musique et tout un petit peuple haut en couleur.
	Dans cette ville où rôde l''Inquisition, Jaufré va découvrir l''amour et un mystérieux manuscrit hérétique dans les combles de l''église. Vont alors peu à peu se dévoiler les énigmes qui hantent les ruines du château fort, les caves du monastère et l''esprit des gens.
	Henri Gougaud nous offre un exceptionnel roman initiatique, qui nous plonge au cœur du Moyen Âge, cette période de ténèbres et d''espérance, pas si éloignée de notre monde actuel.', '2017-12-27 17:29:21', null, '/images/book/book-26.jpg');

	ALTER SEQUENCE work_id_seq RESTART WITH 27;



--- ================================================================================
--- work_authors
--- ================================================================================
	INSERT INTO public.work_authors (work_id, author_id) VALUES (1, 1);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (2, 1);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (3, 1);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (4, 1);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (5, 1);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (6, 1);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (7, 2);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (8, 2);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (9, 2);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (10, 2);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (11, 3);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (12, 3);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (13, 3);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (14, 3);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (15, 4);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (16, 4);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (17, 4);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (18, 4);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (19, 5);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (20, 5);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (21, 5);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (22, 5);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (23, 6);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (24, 6);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (25, 6);
	INSERT INTO public.work_authors (work_id, author_id) VALUES (26, 6);



--- ================================================================================
--- editor
--- ================================================================================
	INSERT INTO public.editor (id, name) VALUES (1, 'J''ai Lu');
	INSERT INTO public.editor (id, name) VALUES (2, 'Mœbius');
	INSERT INTO public.editor (id, name) VALUES (3, 'Flammarion');
	INSERT INTO public.editor (id, name) VALUES (4, 'Le Livre de Poche');
	INSERT INTO public.editor (id, name) VALUES (5, 'Pocket');
	INSERT INTO public.editor (id, name) VALUES (6, 'Gallimard');
	INSERT INTO public.editor (id, name) VALUES (7, 'Omnibus');
	INSERT INTO public.editor (id, name) VALUES (8, 'Editions 84');
	INSERT INTO public.editor (id, name) VALUES (9, 'Albin Michel');
	INSERT INTO public.editor (id, name) VALUES (10, 'Points');
	INSERT INTO public.editor (id, name) VALUES (11, 'Seuil');

	ALTER SEQUENCE editor_id_seq RESTART WITH 12;



--- ================================================================================
--- book
--- ================================================================================
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (1, 1, 1, '2290148172', '2017-06-14', 6.50, 2017);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (2, 2, 1, '978-2-910188-13-9', '2017-06-14', 6.50, 1988);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (3, 2, 2, '978-2-910188-70-2', '2017-06-14', 6.50, 1995);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (4, 3, 4, '2253153958', '2017-06-14', 6.50, 2002);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (5, 4, 4, '2253147109', '2017-06-14', 6.50, 1999);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (6, 5, 1, '978-2-84337-074-8', '2017-06-14', 6.50, 1997);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (7, 6, 4, '2253152277', '2017-06-14', 6.50, 2002);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (8, 7, 5, '2266154117', '2017-06-14', 12.50, 2005);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (9, 8, 6, '2070612899', '2017-06-14', 12.50, 2007);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (10, 9, 6, '2070612902', '2017-06-14', 12.50, 2007);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (11, 10, 4, '2253049417', '2017-06-14', 12.50, 2001);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (12, 11, 1, '2290157287', '2017-07-18', 7.50, 2017);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (13, 12, 1, '2290315419', '2011-11-01', 7.50, 2001);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (14, 13, 1, '2290157171', '2017-07-03', 7.50, 2017);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (15, 14, 1, '2277224510', '2011-02-26', 7.50, 2001);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (16, 15, 4, '2253151629', '2007-10-24', 8.45, 2007);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (17, 16, 1, '2277118354', '1999-01-04', 8.45, 2005);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (18, 17, 4, '2253151432', '2003-09-03', 8.45, 2004);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (19, 18, 4, '2253151564', '2006-02-22', 8.45, 2007);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (20, 19, 8, '2290113182', '1999-09-16', 5.68, 2004);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (21, 20, 1, '2277110108', '1992-11-19', 5.68, 2004);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (22, 21, 8, '2290034096', '1999-09-16', 5.68, 2004);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (23, 22, 7, '2258052602', '2000-05-19', 5.68, 2004);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (24, 23, 11, '2020301059', '2002-09-21', 7.89, 2004);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (25, 24, 10, '2757804782', '2007-05-03', 7.89, 2009);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (26, 25, 10, '2020864827', '2006-04-20', 7.89, 2008);
	INSERT INTO public.book (id, work_id, editor_id, isbn, purchase_date, price, year) VALUES (27, 26, 9, '2226231560', '2011-11-02', 7.89, 2012);

	ALTER SEQUENCE book_id_seq RESTART WITH 28;



--- ================================================================================
--- user_account
--- ================================================================================
	INSERT INTO public.user_account (id, title, first_name, last_name, birth_date, address, postal_code, city, phone_number, email, password, image_url, role, created_at, updated_at) VALUES (1, 'M', 'Gandalf', null, null, null, null, null, null, 'lotr_gandalf@gmail.com', '$2a$10$qbU443eBFmR2A5zXq8Mw9.BEOMnduuoBizfhDKWux/8gQW8PJVomO', '/images/user/user-1.jpg', 'admin', '2017-12-27 17:57:53', null);
	INSERT INTO public.user_account (id, title, first_name, last_name, birth_date, address, postal_code, city, phone_number, email, password, image_url, role, created_at, updated_at) VALUES (2, 'M', 'Aragorn', null, null, null, null, null, null, 'lotr_aragorn@gmail.com', '$2a$10$rr0wbU8OV9ppLpNxEUHwxOIIPMMg.O8O2GsCfxB8JL5kdKcNUAwCW', '/images/user/user-0.png', 'user', '2017-12-27 17:57:53', null);
	INSERT INTO public.user_account (id, title, first_name, last_name, birth_date, address, postal_code, city, phone_number, email, password, image_url, role, created_at, updated_at) VALUES (3, 'M', 'Legolas', null, null, null, null, null, null, 'lotr_legolas@gmail.com', '$2a$10$J9w8fgGg6vKeDXThTkOVhO0h.rCQWSH4eJz591kwcVqVJiouXh.8O', '/images/user/user-0.png', 'user', '2017-12-27 17:57:53', null);
	INSERT INTO public.user_account (id, title, first_name, last_name, birth_date, address, postal_code, city, phone_number, email, password, image_url, role, created_at, updated_at) VALUES (4, 'M', 'Frodon', 'Sacquet', null, null, null, null, null, 'lotr_frodon@gmail.com', '$2a$10$wyTdXYKLnpdFnjH3zGFoee7/bRAbiJeK524errYRcBWt3o0diMruu', '/images/user/user-0.png', 'admin', '2017-12-27 17:57:53', null);
	INSERT INTO public.user_account (id, title, first_name, last_name, birth_date, address, postal_code, city, phone_number, email, password, image_url, role, created_at, updated_at) VALUES (5, 'M', 'Sauron', null, null, null, null, null, null, 'lotr_sauron@gmail.com', '$2a$10$YGMoDhqUVYMRu0f83IQ/huv6yMgv2tXe1FSLgtkWnML5DVYRvrzum', '/images/user/user-0.png', 'user', '2017-12-27 17:57:53', null);
	INSERT INTO public.user_account (id, title, first_name, last_name, birth_date, address, postal_code, city, phone_number, email, password, image_url, role, created_at, updated_at) VALUES (6, 'M', 'Bilbon', 'Sacquet', null, null, null, null, null, 'lotr_bilbon@gmail.com', '$2a$10$Nmg24tdUrkBaIbcs8lmR7ugVtxCKBiSO63dyOKX9NI/cUsvqVLzzy', '/images/user/user-0.png', 'user', '2017-12-27 17:57:53', null);
	INSERT INTO public.user_account (id, title, first_name, last_name, birth_date, address, postal_code, city, phone_number, email, password, image_url, role, created_at, updated_at) VALUES (7, 'M', 'Gollum', null, null, null, null, null, null, 'lotr_gollum@gmail.com', '$2a$10$hosodPaiF22Q10dqKm4B3uJquZLH/Z/iC1c8aE/76MlFW30ppSJQ.', '/images/user/user-7.jpg', 'user', '2017-12-27 17:57:53', null);
	INSERT INTO public.user_account (id, title, first_name, last_name, birth_date, address, postal_code, city, phone_number, email, password, image_url, role, created_at, updated_at) VALUES (8, 'Mlle', 'Arwen', null, null, null, null, null, null, 'lotr_arwen@gmail.com', '$2a$10$pYMN6sMP2lDey59HFVOvluhUFOuItnQoYxco/GQW33Tt3TfNsIIEy', '/images/user/user-0.png', 'user', '2017-12-27 17:57:53', null);
	INSERT INTO public.user_account (id, title, first_name, last_name, birth_date, address, postal_code, city, phone_number, email, password, image_url, role, created_at, updated_at) VALUES (9, 'M', 'Gimli', null, null, null, null, null, null, 'lotr_gimli@gmail.com', '$2a$10$S..12cUQOTmChECb9RJeZefwvLBkiQO.fbjtpP4vqgJ8WCVSm0QDG', '/images/user/user-0.png', 'user', '2017-12-27 17:57:53', null);
	INSERT INTO public.user_account (id, title, first_name, last_name, birth_date, address, postal_code, city, phone_number, email, password, image_url, role, created_at, updated_at) VALUES (10, 'Mlle', 'Galadriel', null, null, null, null, null, null, 'lotr_galadriel@gmail.com', '$2a$10$N9jLNcB8ExLoBRAlvmCIEOatza/qpW80ffyODFShLk.OkiYFIBavG', '/images/user/user-0.png', 'user', '2017-12-27 17:57:53', null);
	INSERT INTO public.user_account (id, title, first_name, last_name, birth_date, address, postal_code, city, phone_number, email, password, image_url, role, created_at, updated_at) VALUES (11, 'M', 'Boromir', null, null, null, null, null, null, 'lotr_boromir@gmail.com', '$2a$10$lSezxNt7TdfJCLKlghjdfuZDGtu5LmGs8JJ4Zas98DDVWInBiOXOa', '/images/user/user-0.png', 'user', '2017-12-27 17:57:53', null);
	INSERT INTO public.user_account (id, title, first_name, last_name, birth_date, address, postal_code, city, phone_number, email, password, image_url, role, created_at, updated_at) VALUES (12, 'M', 'Saroumane', null, null, null, null, null, null, 'lotr_saroumane@gmail.com', '$2a$10$378ScIVAnl2IChSJOjapPuC7cJFjuKBAIw9fzMNUMzfCcQfvrCD0u', '/images/user/user-0.png', 'user', '2017-12-27 17:57:53', null);
	INSERT INTO public.user_account (id, title, first_name, last_name, birth_date, address, postal_code, city, phone_number, email, password, image_url, role, created_at, updated_at) VALUES (13, 'M', 'Samsagace', 'Gamegie', null, null, null, null, null, 'lotr_sam@gmail.com', '$2a$10$mwLW1n5z6xbwwBzmti6CnugExX4rhoaUJCC/dvkqpxNv1LvCyeMka', '/images/user/user-0.png', 'user', '2017-12-27 17:57:53', null);
	INSERT INTO public.user_account (id, title, first_name, last_name, birth_date, address, postal_code, city, phone_number, email, password, image_url, role, created_at, updated_at) VALUES (14, 'M', 'Elrond', 'Peredhel', '0532-01-01', null, null, 'Imladris', null, 'lotr_elrond@gmail.com', '$2a$10$/kjZPqp/X5I9E6mskkdn6eE5SC5g1/ntvN9dNgyWR4RHg32ADQ5TO', '/images/user/user-0.png', 'user', '2017-12-27 17:57:53', null);
	INSERT INTO public.user_account (id, title, first_name, last_name, birth_date, address, postal_code, city, phone_number, email, password, image_url, role, created_at, updated_at) VALUES (15, 'M', 'Peregrin', 'Touque', null, null, null, null, null, 'lotr_peregrin@gmail.com', '$2a$10$qw0FsoyHNLhXW.dW9GbyLuVbfUfFCEcJmEZieWYwQ9ZUr7gJmCLSe', '/images/user/user-0.png', 'user', '2017-12-27 17:57:53', null);
	INSERT INTO public.user_account (id, title, first_name, last_name, birth_date, address, postal_code, city, phone_number, email, password, image_url, role, created_at, updated_at) VALUES (16, 'M', 'Meriadoc', 'Brandebouc', null, null, null, null, null, 'lotr_meriadoc@gmail.com', '$2a$10$Zn6XP0k7X1QwpTLiciAOD.q51d4iPhIT7CA0QDhmrTj2nCKW/C3yu', '/images/user/user-0.png', 'user', '2017-12-27 17:57:53', null);

	ALTER SEQUENCE user_account_id_seq RESTART WITH 17;



--- ================================================================================
--- reservation
--- ================================================================================
	INSERT INTO public.reservation (id, user_id, work_id, reservation_date) VALUES (1, 6, 1, '2018-05-22 18:11:43');
	INSERT INTO public.reservation (id, user_id, work_id, reservation_date) VALUES (2, 12, 1, '2018-05-21 18:11:43');
	INSERT INTO public.reservation (id, user_id, work_id, reservation_date) VALUES (3, 9, 5, '2018-05-22 18:11:43');
	INSERT INTO public.reservation (id, user_id, work_id, reservation_date) VALUES (4, 6, 5, '2018-05-21 18:11:43');
	INSERT INTO public.reservation (id, user_id, work_id, reservation_date) VALUES (5, 11, 3, '2018-05-22 18:11:43');
	INSERT INTO public.reservation (id, user_id, work_id, reservation_date) VALUES (6, 9, 3, '2018-05-21 18:11:43');
	INSERT INTO public.reservation (id, user_id, work_id, reservation_date) VALUES (7, 12, 6, '2018-05-22 18:11:43');
	INSERT INTO public.reservation (id, user_id, work_id, reservation_date) VALUES (8, 11, 6, '2018-05-21 18:11:43');

	ALTER SEQUENCE reservation_id_seq RESTART WITH 9;



--- ================================================================================
--- borrowing_archive
--- ================================================================================
	INSERT INTO public.borrowing_archive (id, book_id, user_id, borrowing_date, return_date) VALUES (1, 12, 14, '2017-12-27 18:11:43', '2018-01-31');
	INSERT INTO public.borrowing_archive (id, book_id, user_id, borrowing_date, return_date) VALUES (2, 14, 14, '2017-12-27 18:01:31', '2018-01-24');
	INSERT INTO public.borrowing_archive (id, book_id, user_id, borrowing_date, return_date) VALUES (3, 16, 2, '2017-11-27 18:21:01', '2017-12-25');
	INSERT INTO public.borrowing_archive (id, book_id, user_id, borrowing_date, return_date) VALUES (4, 21, 9, '2017-10-18 18:21:01', '2017-12-13');

	ALTER SEQUENCE borrowing_archive_id_seq RESTART WITH 5;



--- ================================================================================
--- borrowing
--- ================================================================================
	INSERT INTO public.borrowing (id, book_id, user_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (1, 7, 14, '2018-04-19 18:02:44', '2018-06-14', true, true);
	INSERT INTO public.borrowing (id, book_id, user_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (2, 24, 14, '2018-04-19 18:11:43', '2018-05-17', true, false);
	INSERT INTO public.borrowing (id, book_id, user_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (3, 6, 14, '2018-04-19 18:11:43', '2018-06-14', true, true);
	INSERT INTO public.borrowing (id, book_id, user_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (4, 26, 5, '2018-04-19 18:17:04', '2018-06-14', true, true);
	INSERT INTO public.borrowing (id, book_id, user_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (6, 19, 2, '2018-04-19 18:21:01', '2018-05-17', true, false);
	INSERT INTO public.borrowing (id, book_id, user_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (5, 9, 13, '2018-04-19 18:17:04', '2018-05-17', true, false);
	INSERT INTO public.borrowing (id, book_id, user_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (8, 23, 7, '2018-04-19 18:21:01', '2018-05-17', true, false);
	INSERT INTO public.borrowing (id, book_id, user_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (7, 4, 3, '2018-04-19 18:21:01', '2018-05-17', true, false);
	INSERT INTO public.borrowing (id, book_id, user_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (9, 8, 7, '2018-04-19 18:21:01', '2018-05-17', true, false);
	INSERT INTO public.borrowing (id, book_id, user_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (10, 17, 8, '2018-04-19 18:21:01', '2018-06-14', true, true);
	INSERT INTO public.borrowing (id, book_id, user_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (11, 15, 10, '2018-04-19 18:21:01', '2018-06-14', true, true);
	INSERT INTO public.borrowing (id, book_id, user_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (12, 12, 14, '2018-05-17 22:55:33.301000', '2018-06-14', true, false);
	INSERT INTO public.borrowing (id, book_id, user_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (13, 1, 14, '2018-05-17 16:45:01', '2018-06-14', true, false);

	ALTER SEQUENCE borrowing_id_seq RESTART WITH 14;




COMMIT;