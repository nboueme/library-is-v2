ALTER TABLE public.user_account
ADD COLUMN reminder BOOLEAN DEFAULT true NOT NULL;


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

ALTER TABLE public.reservation ADD CONSTRAINT work_reservation_fk
FOREIGN KEY (work_id)
REFERENCES public.work (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.reservation ADD CONSTRAINT user_account_reservation_fk
FOREIGN KEY (user_id)
REFERENCES public.user_account (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
