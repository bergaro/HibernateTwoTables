CREATE TABLE Customers (
                           id MEDIUMINT NOT NULL AUTO_INCREMENT,
                           name VARCHAR(20) NOT NULL,
                           surname VARCHAR(20) NOT NULL,
                           age INT CHECK ( age >= 1 ) DEFAULT 1,
                           phone_number VARCHAR(15),
                           PRIMARY KEY (id)
);

CREATE TABLE Orders (
                        id MEDIUMINT NOT NULL AUTO_INCREMENT,
                        date VARCHAR(20) NOT NULL,
                        customer_id MEDIUMINT NOT NULL,
                        product_name VARCHAR(100),
                        amount INT CHECK (amount > 0) DEFAULT 1,
                        PRIMARY KEY (id),
                        FOREIGN KEY (customer_id) REFERENCES Customers(id)
);