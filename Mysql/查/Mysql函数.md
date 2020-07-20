## Mysql函数

- 通用使用方式

  - ```mysql
    select 函数名[实参列表] from [TABLE]
    ```

- 分类

  - 分组函数

    - SUM ,AVG,MAX,MIN,COUNT

      ```mysql
      SELECT SUM [字段名] FROM [表名];			  #查询某一项总和
      SELECT COUNT [*] FROM [表名];				#查询表的记录数
      SELECT MAX [字段名] FROM [表名];			  #查询表的最大值
      
      SELECT sum(student) from student ;
      ```

      

  - SUM,AVG一般用于处理数值
  - MAX,MIN,COUNT可以处理任何类型

- 分组查询

  - GROUP BY	根据字段进行分组,对字段中的值，进行分类

    ```mysql
    SELECT *FROM [表名] GROUP BY [字段名];
    SELECT * FROM STUDENT GROUP BY SCORE ;	//通过成绩对学生进行分组
    ```

    