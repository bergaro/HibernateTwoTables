SELECT O.* FROM orders AS O
INNER JOIN customers AS C ON C.id = O.customer_id
WHERE LOWER(C.name) = LOWER(:name);