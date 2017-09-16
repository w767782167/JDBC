#需求：选择所有信息并且按零售价升序/降序排序
SELECT * FROM product ORDER BY salePrice;
SELECT * FROM product ORDER BY salePrice ASC;

SELECT * FROM product ORDER BY salePrice DESC;

#需求：选择id，货品名称，分类编号,零售价先按分类编号排序,编号相同的再按零售价降序排序

SELECT id,productName,dir_id,salePrice FROM product ORDER BY dir_id ASC,salePrice DESC;

#需求:查询M系列并按照批发价排序(加上别名)
SELECT id,productName,salePrice*cutoff pf FROM product
 WHERE productName LIKE '%M%' ORDER BY pf DESC;
#需求:查询分类为2并按照批发价升序/降序排序(加上别名)
SELECT id,productName,salePrice*cutoff pf FROM product
WHERE dir_id = 2 ORDER BY pf;


