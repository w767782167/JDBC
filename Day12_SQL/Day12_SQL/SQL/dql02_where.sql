#需求: 查询货品零售价为119的所有货品信息.
SELECT * FROM product  WHERE  salePrice = 119;

#需求: 查询货品名为罗技G9X的所有货品信息.
SELECT * FROM product WHERE productName = '罗技G9X';
SELECT * FROM product WHERE productName = '罗技g9x';

#----------区分大小写  BINARY
SELECT * FROM product WHERE BINARY productName = '罗技g9x';


#需求: 查询货品名不为罗技G9X的所有货品信息.  
SELECT * FROM product WHERE productName != '罗技G9X';
SELECT * FROM product WHERE productName <> '罗技G9X';

#需求: 查询分类编号不等于2的货品信息
SELECT * FROM product WHERE dir_id != 2;

#需求: 查询货品名称,零售价小于等于200的货品
SELECT productName FROM product WHERE salePrice <= 200;

#需求: 查询id，货品名称，批发价大于350的货品
SELECT id,productName,salePrice*cutoff FROM product WHERE salePrice*cutoff > 350;

SELECT id,productName,salePrice*cutoff pf FROM product WHERE salePrice*cutoff > 350;


#需求: 选择id，货品名称，零售价在300-400之间的货品
SELECT id,productName,salePrice FROM product WHERE salePrice>=300 AND salePrice<=400;

#需求: 选择id，货品名称，分类编号为2或4的所有货品
SELECT id,productName,dir_id FROM product WHERE dir_id = 2 OR dir_id = 4;

#需求: 选择id，货品名称，分类编号不为2的所有商品
SELECT * FROM product WHERE dir_id != 2;

SELECT * FROM product WHERE NOT dir_id = 2;


#需求: 选择id，货品名称，分类编号的货品零售价大于等于250或者成本大于等于200
SELECT id,productName,dir_id,salePrice,costPrice FROM product 
WHERE salePrice >= 250 OR costPrice >=200;


