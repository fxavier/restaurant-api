CREATE TABLE restaurant(
restaurant_id SERIAL,
name VARCHAR(50) NOT NULL,
address VARCHAR(500) NOT NULL,
phone VARCHAR(50) NOT NULL,
latitude NUMERIC(10, 2),
longetude NUMERIC(10, 2),
image_url TEXT,
payment_url TEXT,
PRIMARY KEY(restaurant_id)
);

CREATE TABLE food_category(
category_id BIGSERIAL,
name VARCHAR(50) NOT NULL,
image_url TEXT,
PRIMARY KEY(category_id)
);

CREATE TABLE food_size(
size_id SERIAL,
description VARCHAR(50),
PRIMARY KEY(size_id)
);

CREATE TABLE food(
food_id BIGSERIAL,
name VARCHAR(50) NOT NULL,
description VARCHAR(500),
imageUrl TEXT,
price NUMERIC(10, 2) NOT NULL,
size_id INTEGER,
descount NUMERIC(10, 2) DEFAULT 0,
final_price NUMERIC(10, 2) NOT NULL,
category_id BIGINT NOT NULL,
PRIMARY KEY(food_id),
CONSTRAINT fk_size_food
  FOREIGN KEY(size_id) REFERENCES food_size(size_id),
CONSTRAINT fk_food_category
  FOREIGN KEY(category_id) REFERENCES food_category(category_id)
);