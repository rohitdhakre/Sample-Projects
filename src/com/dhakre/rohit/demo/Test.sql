CREATE TABLE books (
  id int(11) Auto_INCREMENT,
  title VARCHAR(100) NOT NULL DEFAULT pankaj,
  author VARCHAR(100) NOT NULL,
  published_date timestamp NOT NULL,
  isbn int,
  PRIMARY KEY (id),
  UNIQUE (isbn)
);