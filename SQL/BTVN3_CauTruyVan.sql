-- select * from employee where EmployeeID <10 and EmployeeID >4

-- SELECT * FROM Employee ORDER BY EmployeeID DESC LIMIT 5;

-- SELECT * FROM Employee LIMIT 5;

-- SELECT p.ProjectName, e.EmployeeName
-- FROM Task t
-- JOIN Project p ON t.ProjectID = p.ProjectID
-- JOIN Employee e ON t.EmployeeID = e.EmployeeID;

-- select A.taskId, A.taskName, B.projectName, C.employeeName 
-- From Task as A left join Project as B
-- on A.projectId = B.projectId 
-- left join employee as C on C.employeeId = A.employeeId

-- BÀI TẬP 
--  Cấp độ dễ (Basic) – 1 đến 10
-- 1 Liệt kê tất cả các nhân viên trong công ty.
SELECT * FROM Employee;

-- 2 Hiển thị tên và email của các nhân viên thuộc phòng ban "Engineering".
SELECT e.employeeName, e.email
FROM Employee e
JOIN Department d ON e.departmentId = d.departmentId
WHERE d.departmentName = 'Engineering';

-- 3 Lấy danh sách các dự án đã bắt đầu trong năm 2022.
SELECT * FROM Project
WHERE YEAR(startDate) = 2022;

-- 4 Tìm các nhân viên được thuê sau ngày 01/01/2021.
SELECT * FROM Employee
WHERE hireDate > '2021-01-01';

-- 5 Hiển thị tất cả phòng ban có trong công ty.
SELECT * FROM Department;

-- 6 Lấy tên nhân viên và mức lương của họ.
SELECT employeeName, salary 
FROM Employee;

-- 7 Đếm số lượng nhân viên trong mỗi phòng ban.
SELECT d.departmentName, COUNT(e.employeeId) AS employeeCount
FROM Department d
LEFT JOIN Employee e ON d.departmentId = e.departmentId
GROUP BY d.departmentName;

-- 8 Tìm tất cả các dự án có ngày kết thúc sau '2023-01-01'.
SELECT * FROM Project
WHERE endDate > '2023-01-01';

-- 9 Lấy danh sách nhân viên có lương lớn hơn 70,000.
SELECT * FROM Employee
WHERE salary > 70000;

-- 10 Liệt kê các nhân viên chưa có người quản lý (manager).
SELECT * FROM Employee
WHERE managerId IS NULL;

-- Cấp độ trung bình (Intermediate) – 11 đến 20
-- 11 Tính tổng lương của nhân viên trong từng phòng ban.
SELECT d.departmentName, SUM(e.salary) AS totalSalary
FROM Employee e
JOIN Department d ON e.departmentId = d.departmentId
GROUP BY d.departmentName;

-- 12 Liệt kê các dự án mà nhân viên có ID = 2 đang tham gia.
SELECT p.projectName
FROM EmployeeProject ep
JOIN Project p ON ep.projectId = p.projectId
WHERE ep.employeeId = 2;

-- 13 Hiển thị tên nhân viên và tên phòng ban của họ.
SELECT e.employeeName, d.departmentName
FROM Employee e
JOIN Department d ON e.departmentId = d.departmentId;

-- 14 Tìm nhân viên có mức lương cao nhất trong mỗi phòng ban.
SELECT e.employeeName, e.salary, d.departmentName
FROM Employee e
JOIN Department d ON e.departmentId = d.departmentId
WHERE (e.salary, e.departmentId) IN (
    SELECT MAX(salary), departmentId
    FROM Employee
    GROUP BY departmentId
);

-- 15 Liệt kê các nhân viên tham gia vào hơn 1 dự án.
SELECT e.employeeId, e.employeeName, COUNT(ep.projectId) AS projectCount
FROM EmployeeProject ep
JOIN Employee e ON ep.employeeId = e.employeeId
GROUP BY e.employeeId, e.employeeName
HAVING COUNT(ep.projectId) > 1;

-- 16 Lấy tên dự án và số lượng nhân viên tham gia mỗi dự án.
SELECT p.projectName, COUNT(ep.employeeId) AS employeeCount
FROM Project p
LEFT JOIN EmployeeProject ep ON p.projectId = ep.projectId
GROUP BY p.projectId, p.projectName;

-- 17 Liệt kê các nhân viên thuộc phòng "HR" và có lương trên 60,000.
SELECT e.employeeName, e.salary
FROM Employee e
JOIN Department d ON e.departmentId = d.departmentId
WHERE d.departmentName = 'HR' AND e.salary > 60000;

-- 18 Hiển thị các dự án mà không có nhân viên nào tham gia.
SELECT p.projectName
FROM Project p
LEFT JOIN EmployeeProject ep ON p.projectId = ep.projectId
WHERE ep.employeeId IS NULL;

-- 19 Liệt kê tất cả nhân viên cùng với người quản lý của họ.
SELECT e.employeeName AS employee, m.employeeName AS manager
FROM Employee e
LEFT JOIN Employee m ON e.managerId = m.employeeId;

-- 20 Tìm các nhân viên làm việc trong phòng "Sales" nhưng không tham gia bất kỳ dự án nào.
SELECT e.employeeId, e.employeeName
FROM Employee e
JOIN Department d ON e.departmentId = d.departmentId
LEFT JOIN EmployeeProject ep ON e.employeeId = ep.employeeId
WHERE d.departmentName = 'Sales' AND ep.projectId IS NULL;

--  Cấp độ nâng cao (Advanced) – 21 đến 25
-- 21 Liệt kê tên nhân viên và tên dự án họ tham gia, cùng ngày được phân công.
SELECT e.employeeName, e.salary
FROM Employee e
WHERE e.salary = (SELECT MAX(salary) FROM Employee)
AND e.employeeId NOT IN (SELECT managerId FROM Employee WHERE managerId IS NOT NULL);

-- 22 Tìm các dự án có ít nhất 3 nhân viên đang tham gia.
SELECT p.projectName
FROM Project p
JOIN EmployeeProject ep ON p.projectId = ep.projectId
GROUP BY p.projectId, p.projectName
HAVING COUNT(ep.employeeId) >= 3;

-- 23 Tìm nhân viên làm việc trong cả hai dự án "Website Redesign" và "Mobile App".
SELECT e.employeeName
FROM Employee e
JOIN EmployeeProject ep ON e.employeeId = ep.employeeId
JOIN Project p ON ep.projectId = p.projectId
WHERE p.projectName IN ('Website Redesign', 'Mobile App')
GROUP BY e.employeeId, e.employeeName
HAVING COUNT(DISTINCT p.projectName) = 2;

-- 24 Liệt kê tất cả nhân viên có cùng người quản lý với "Bob".
SELECT e.employeeName
FROM Employee e
WHERE e.managerId = (
    SELECT managerId
    FROM Employee
    WHERE employeeName = 'Bob'
)
AND e.employeeName != 'Bob';

-- 25 Hiển thị tên phòng ban và mức lương trung bình của nhân viên trong phòng ban đó, chỉ với các phòng ban có hơn 1 nhân viên.
SELECT d.departmentName, AVG(e.salary) AS avgSalary
FROM Department d
JOIN Employee e ON d.departmentId = e.departmentId
GROUP BY d.departmentId, d.departmentName
HAVING COUNT(e.employeeId) > 1;

-- Cấp độ chuyên sâu (Expert) – 26 đến 30
-- 26 Tìm nhân viên có mức lương cao nhất toàn công ty nhưng không phải là quản lý của bất kỳ ai.
SELECT e.employeeName, e.salary
FROM Employee e
WHERE e.salary = (SELECT MAX(salary) FROM Employee)
AND e.employeeId NOT IN (
    SELECT DISTINCT managerId
    FROM Employee
    WHERE managerId IS NOT NULL
);

-- 27 Hiển thị tên của tất cả các dự án có ít nhất một nhân viên thuộc phòng "Engineering" tham gia.
SELECT DISTINCT p.projectName
FROM Project p
JOIN EmployeeProject ep ON p.projectId = ep.projectId
JOIN Employee e ON ep.employeeId = e.employeeId
JOIN Department d ON e.departmentId = d.departmentId
WHERE d.departmentName = 'Engineering';

-- 28 Viết truy vấn hiển thị “cây quản lý” theo từng cấp (employee - manager - grand-manager nếu có).
SELECT 
  e.employeeName AS Employee,
  m.employeeName AS Manager,
  gm.employeeName AS GrandManager
FROM Employee e
LEFT JOIN Employee m ON e.managerId = m.employeeId
LEFT JOIN Employee gm ON m.managerId = gm.employeeId;

-- 29 Tìm các nhân viên đã tham gia dự án nào đó trước khi chính thức được thuê (assignedDate < hireDate).
SELECT e.employeeName, p.projectName, ep.assignedDate, e.hireDate
FROM Employee e
JOIN EmployeeProject ep ON e.employeeId = ep.employeeId
JOIN Project p ON ep.projectId = p.projectId
WHERE ep.assignedDate < e.hireDate;


-- 30 Liệt kê các dự án đang hoạt động (vẫn chưa kết thúc) và chưa đủ 3 nhân viên tham gia.
SELECT p.projectName
FROM Project p
LEFT JOIN EmployeeProject ep ON p.projectId = ep.projectId
WHERE p.endDate > CURDATE()
GROUP BY p.projectId, p.projectName
HAVING COUNT(DISTINCT ep.employeeId) < 3;