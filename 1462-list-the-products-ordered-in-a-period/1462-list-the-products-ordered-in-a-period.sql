# Write your MySQL query statement below
select p.product_name, sum(o.unit) as unit
from products p join orders o using (product_id)
where year(o.order_date)='2020' and month(o.order_date)='02'
group by p.product_id
having sum(o.unit)>=100;