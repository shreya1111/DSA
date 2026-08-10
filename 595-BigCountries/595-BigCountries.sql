-- Last updated: 10/08/2026, 23:54:42
# Write your MySQL query statement below
SELECT name, population, area
FROM World
WHERE area >= 3000000 
   OR population >= 25000000;