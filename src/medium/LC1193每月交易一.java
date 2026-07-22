package medium;

public class LC1193每月交易一 {
   /* select name from Employee
    where id in(select managerId from Employee
            group by managerId
            having count(*)>=5)*/
}
