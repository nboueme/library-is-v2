INSERT INTO public.borrowing (id, user_id, book_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (1, 14, '2290157171', '2017-12-27 18:01:31', '2018-01-24', true, false);
INSERT INTO public.borrowing (id, user_id, book_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (2, 14, '2253152277', '2017-12-27 18:02:44', '2018-02-21', true, true);
INSERT INTO public.borrowing (id, user_id, book_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (3, 14, '2020301059', '2017-12-27 18:11:43', '2018-01-24', true, false);
INSERT INTO public.borrowing (id, user_id, book_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (4, 14, '2290157287', '2017-12-27 18:11:43', '2018-01-24', true, false);
INSERT INTO public.borrowing (id, user_id, book_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (5, 14, '978-2-84337-074-8', '2017-12-27 18:11:43', '2018-02-21', true, true);
INSERT INTO public.borrowing (id, user_id, book_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (6, 5, '2020864827', '2017-12-27 18:17:04', '2018-02-21', true, true);
INSERT INTO public.borrowing (id, user_id, book_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (7, 13, '2070612899', '2017-12-27 18:17:04', '2018-01-24', true, false);
INSERT INTO public.borrowing (id, user_id, book_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (8, 2, '2253151564', '2017-12-27 18:21:01', '2018-01-24', true, false);
INSERT INTO public.borrowing (id, user_id, book_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (9, 2, '2253151629', '2017-11-27 18:21:01', '2017-12-25', false, false);
INSERT INTO public.borrowing (id, user_id, book_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (10, 3, '2253153958', '2017-12-27 18:21:01', '2018-01-24', true, false);
INSERT INTO public.borrowing (id, user_id, book_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (11, 7, '2258052602', '2017-12-27 18:21:01', '2018-01-24', true, false);
INSERT INTO public.borrowing (id, user_id, book_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (12, 7, '2266154117', '2017-12-27 18:21:01', '2018-01-24', true, false);
INSERT INTO public.borrowing (id, user_id, book_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (13, 9, '2277110108', '2017-10-18 18:21:01', '2017-12-06', false, true);
INSERT INTO public.borrowing (id, user_id, book_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (14, 8, '2277118354', '2017-12-27 18:21:01', '2018-02-21', true, true);
INSERT INTO public.borrowing (id, user_id, book_id, borrowing_date, return_date, is_loaned, is_extended) VALUES (15, 10, '2277224510', '2017-12-27 18:21:01', '2018-02-21', true, true);

ALTER SEQUENCE borrowing_id_seq RESTART WITH 16;