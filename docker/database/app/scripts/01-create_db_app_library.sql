
CREATE SEQUENCE public.author_id_seq;

CREATE TABLE public.author (
                id INTEGER NOT NULL DEFAULT nextval('public.author_id_seq'),
                first_name VARCHAR(50) NOT NULL,
                last_name VARCHAR(50) NOT NULL,
                CONSTRAINT author_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.author_id_seq OWNED BY public.author.id;

CREATE SEQUENCE public.type_work_id_seq;

CREATE TABLE public.type_work (
                id INTEGER NOT NULL DEFAULT nextval('public.type_work_id_seq'),
                type_work VARCHAR(100) NOT NULL,
                CONSTRAINT type_work_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.type_work_id_seq OWNED BY public.type_work.id;

CREATE SEQUENCE public.work_id_seq;

CREATE TABLE public.work (
                id INTEGER NOT NULL DEFAULT nextval('public.work_id_seq'),
                type_work_id INTEGER NOT NULL,
                title VARCHAR(100) NOT NULL,
                summary TEXT NOT NULL,
                image_url VARCHAR(100),
                created_at TIMESTAMP(0) DEFAULT current_timestamp NOT NULL,
                updated_at TIMESTAMP(0),
                CONSTRAINT work_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.work_id_seq OWNED BY public.work.id;

CREATE TABLE public.work_authors (
                work_id INTEGER NOT NULL,
                author_id INTEGER NOT NULL,
                CONSTRAINT work_authors_pk PRIMARY KEY (work_id, author_id)
);


CREATE SEQUENCE public.editor_id_seq;

CREATE TABLE public.editor (
                id INTEGER NOT NULL DEFAULT nextval('public.editor_id_seq'),
                name VARCHAR(50) NOT NULL,
                CONSTRAINT editor_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.editor_id_seq OWNED BY public.editor.id;

CREATE SEQUENCE public.book_id_seq;

CREATE TABLE public.book (
                id INTEGER NOT NULL DEFAULT nextval('public.book_id_seq'),
                work_id INTEGER NOT NULL,
                editor_id INTEGER NOT NULL,
                isbn VARCHAR(20) NOT NULL,
                purchase_date DATE NOT NULL,
                price NUMERIC(4,2) NOT NULL,
                year INTEGER NOT NULL,
                CONSTRAINT book_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.book_id_seq OWNED BY public.book.id;

CREATE SEQUENCE public.user_account_id_seq;

CREATE TABLE public.user_account (
                id INTEGER NOT NULL DEFAULT nextval('public.user_account_id_seq'),
                title VARCHAR(5),
                first_name VARCHAR(50),
                last_name VARCHAR(50),
                birth_date DATE,
                address VARCHAR(100),
                postal_code INTEGER,
                city VARCHAR(50),
                phone_number VARCHAR(20),
                email VARCHAR(100) NOT NULL,
                password VARCHAR(100) NOT NULL,
                image_url VARCHAR(100),
                reminder BOOLEAN DEFAULT true NOT NULL,
                role VARCHAR(5) NOT NULL,
                created_at TIMESTAMP(0) DEFAULT current_timestamp NOT NULL,
                updated_at TIMESTAMP(0),
                CONSTRAINT user_account_pk PRIMARY KEY (id)
);
COMMENT ON COLUMN public.user_account.role IS '"user" or "admin"';


ALTER SEQUENCE public.user_account_id_seq OWNED BY public.user_account.id;

CREATE UNIQUE INDEX user_account_email_uindex
 ON public.user_account
 ( email ASC );

CREATE SEQUENCE public.reservation_id_seq;

CREATE TABLE public.reservation (
                id INTEGER NOT NULL DEFAULT nextval('public.reservation_id_seq'),
                user_id INTEGER NOT NULL,
                work_id INTEGER NOT NULL,
                reservation_date TIMESTAMP(0) DEFAULT current_timestamp NOT NULL,
                notification_date DATE,
                CONSTRAINT reservation_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.reservation_id_seq OWNED BY public.reservation.id;

CREATE SEQUENCE public.borrowing_archive_id_seq;

CREATE TABLE public.borrowing_archive (
                id INTEGER NOT NULL DEFAULT nextval('public.borrowing_archive_id_seq'),
                book_id INTEGER NOT NULL,
                user_id INTEGER NOT NULL,
                borrowing_date TIMESTAMP(0) NOT NULL,
                return_date DATE NOT NULL,
                CONSTRAINT borrowing_archive_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.borrowing_archive_id_seq OWNED BY public.borrowing_archive.id;

CREATE SEQUENCE public.borrowing_id_seq;

CREATE TABLE public.borrowing (
                id INTEGER NOT NULL DEFAULT nextval('public.borrowing_id_seq'),
                book_id INTEGER NOT NULL,
                user_id INTEGER NOT NULL,
                borrowing_date TIMESTAMP(0) DEFAULT current_timestamp NOT NULL,
                return_date DATE NOT NULL,
                is_loaned BOOLEAN NOT NULL,
                is_extended BOOLEAN NOT NULL,
                CONSTRAINT borrowing_pk PRIMARY KEY (id)
);


ALTER SEQUENCE public.borrowing_id_seq OWNED BY public.borrowing.id;

CREATE UNIQUE INDEX borrowing_book_id_uindex
 ON public.borrowing
 ( book_id );

ALTER TABLE public.work_authors ADD CONSTRAINT author_work_authors_fk
FOREIGN KEY (author_id)
REFERENCES public.author (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.work ADD CONSTRAINT type_work_work_fk
FOREIGN KEY (type_work_id)
REFERENCES public.type_work (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.book ADD CONSTRAINT work_book_fk
FOREIGN KEY (work_id)
REFERENCES public.work (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.work_authors ADD CONSTRAINT work_work_authors_fk
FOREIGN KEY (work_id)
REFERENCES public.work (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.reservation ADD CONSTRAINT work_reservation_fk
FOREIGN KEY (work_id)
REFERENCES public.work (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.book ADD CONSTRAINT editor_book_fk
FOREIGN KEY (editor_id)
REFERENCES public.editor (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.borrowing ADD CONSTRAINT book_borrowing_fk
FOREIGN KEY (book_id)
REFERENCES public.book (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.borrowing_archive ADD CONSTRAINT book_borrowing_archive_fk
FOREIGN KEY (book_id)
REFERENCES public.book (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.borrowing ADD CONSTRAINT user_account_borrowing_fk
FOREIGN KEY (user_id)
REFERENCES public.user_account (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.borrowing_archive ADD CONSTRAINT user_account_borrowing_archive_fk
FOREIGN KEY (user_id)
REFERENCES public.user_account (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.reservation ADD CONSTRAINT user_account_reservation_fk
FOREIGN KEY (user_id)
REFERENCES public.user_account (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
