-- Last updated: 10/08/2026, 23:53:31
# Write your MySQL query statement below
select tweet_id from Tweets 
where length(content)>15;