# Write your MySQL query statement below
select s.name
from salesperson s
left join orders o
on s.sales_id=o.sales_id
left join company c
on o.com_id=c.com_id
and c.name='RED'
group by s.sales_id,s.name
having count(c.com_id)=0;