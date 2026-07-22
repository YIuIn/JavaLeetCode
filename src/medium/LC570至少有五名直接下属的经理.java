package medium;

public class LC570至少有五名直接下属的经理 {
    /*select name from Employee
    where id in(select managerId from Employee
            group by managerId
            having count(*)>=5)*/
}
