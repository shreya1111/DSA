-- Last updated: 10/08/2026, 23:54:51
# Write your MySQL query statement below
SELECT name
FROM Customer
WHERE referee_id <> 2 OR referee_id IS NULL;