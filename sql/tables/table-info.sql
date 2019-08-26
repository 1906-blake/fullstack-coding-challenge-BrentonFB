CREATE TABLE grocery_list (
	list_id SERIAL PRIMARY KEY NOT NULL,
	name TEXT NOT NULL
);

CREATE TABLE grocery_items (
	list_id INTEGER REFERENCES grocery_list(list_id),
	item_name TEXT NOT NULL,
    amount INTEGER NOT NULL,
	item_type TEXT NOT NULL
);