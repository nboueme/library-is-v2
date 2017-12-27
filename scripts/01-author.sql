INSERT INTO public.author (id, first_name, last_name) VALUES (1, 'Paulo', 'Coelho');
INSERT INTO public.author (id, first_name, last_name) VALUES (2, 'J. R. R.', 'Tolkien');
INSERT INTO public.author (id, first_name, last_name) VALUES (3, 'Philip K.', 'Dick');
INSERT INTO public.author (id, first_name, last_name) VALUES (4, 'Stephen', 'King');
INSERT INTO public.author (id, first_name, last_name) VALUES (5, 'Henri', 'Troyat');
INSERT INTO public.author (id, first_name, last_name) VALUES (6, 'Henri', 'Gougaud');

ALTER SEQUENCE author_id_seq RESTART WITH 7;