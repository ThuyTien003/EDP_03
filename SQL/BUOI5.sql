-- Bài 1: Lấy danh sách tất cả người dùng
SELECT * FROM users;


-- Bài 2: Lấy danh sách tất cả sản phẩm còn hàng (stock > 0)
SELECT * FROM products 
WHERE stock > 0;


-- Bài 3: Tính tổng số đơn hàng của từng người dùng
SELECT user_id, COUNT(*) AS totalorders
FROM orders
GROUP BY user_id;


-- Bài 4: Tính tổng doanh thu của hệ thống
SELECT SUM(total_amount) AS total
FROM orders;


-- Bài 5: Tìm sản phẩm có giá cao nhất
SELECT * FROM products
ORDER BY price DESC
LIMIT 1;


-- Bài 6: Liệt kê các đơn hàng và tên người mua tương ứng
SELECT o.order_id, u.name, o.order_date, o.total_amount
FROM orders o
JOIN users u ON o.user_id = u.user_id;



-- Bài 7: Tính tổng số lượng mỗi sản phẩm đã bán
SELECT p.name, SUM(oi.quantity) AS total_sold
FROM order_items oi
JOIN products p ON oi.product_id = p.product_id
GROUP BY oi.product_id;


-- Bài 8: Lấy top 2 người dùng có tổng chi tiêu cao nhất
SELECT u.name, SUM(o.total_amount) AS total_spent
FROM users u
JOIN orders o ON u.user_id = o.user_id
GROUP BY u.user_id
ORDER BY total_spent DESC
LIMIT 2;

-- Bài 9: Liệt kê các đơn hàng có chứa sản phẩm thuộc loại "Clothing"
SELECT DISTINCT o.order_id, o.user_id, o.order_date
FROM orders o
JOIN order_items oi ON o.order_id = oi.order_id
JOIN products p ON oi.product_id = p.product_id
WHERE p.category = 'Clothing';


-- Bài 10: Tìm người dùng chưa từng đặt hàng
SELECT * FROM users
WHERE user_id NOT IN (SELECT DISTINCT user_id FROM orders);