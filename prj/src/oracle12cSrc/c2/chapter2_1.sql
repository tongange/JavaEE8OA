--1.对单表执行select语句
--检索customers表中的所有列
--方法1:直接写sql语句
SELECT
  CUSTOMER_ID,
  FIRST_NAME,
  LAST_NAME,
  DOB,
  PHONE
FROM QORCL_CUSTOMERS;
--方法2:使用dbeaver生成sql语句
SELECT
  CUSTOMER_ID,
  FIRST_NAME,
  LAST_NAME,
  DOB,
  PHONE
FROM TONGANGE.QORCL_CUSTOMERS;
/*
    通过查询结果可以发现:
    a.oracle将列名全部转换成了大写的形式
    b.字符和日期列是左对齐的
    c.默认情况下日期会以DD-MON-YY的形式显示
    DD:日, MON:月份的前三个字母(大写), YY:年份的最后两位
*/
--2.选择表中所有列

