package hard;

public class LC185部门工资前三高的所有员工 {
/*    select d.name Department,e.name Employee,e.salary Salary
    from Employee e join Department d on e.departmentId=d.id
    where 3>(select count(distinct e2.salary)from Employee e2
    where e2.salary>e.salary and e2.departmentId=e.departmentId);*/
}
