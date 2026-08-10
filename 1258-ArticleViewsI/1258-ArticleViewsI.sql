-- Last updated: 10/08/2026, 23:54:24
# Write your MySQL query statement below
select distinct author_id as id 
from Views 
where author_id=viewer_id
order by id;