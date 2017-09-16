#需求: 选择id，货品名称，零售价在300-400之间的货品
SELECT id,productName,salePrice FROM product WHERE salePrice BETWEEN 300 AND 400;


#需求: 选择id，货品名称，零售价不在300-400之间的货品
SELECT id,productName,salePrice FROM product WHERE salePrice NOT BETWEEN 300 AND 400;

#需求:选择id，货品名称，分类编号为2或4的所有货品
SELECT id,productName,dir_id FROM product WHERE  dir_id = 2 OR dir_id = 4;

SELECT id,productName,dir_id FROM product WHERE  dir_id IN (2,4);

#需求:选择id，货品名称，分类编号不为2或4的所有货品
SELECT id,productName,dir_id FROM product WHERE  NOT dir_id IN (2,4);

#需求:查询商品名为NULL的所有商品信息
SELECT * FROM product WHERE productName IS NULL;


#需求: 查询货品名称带有 'M' 的所有信息
SELECT * FROM product WHERE productName LIKE '%M%';

#需求: 查询匹配货品名称 '罗技M9?' 的所有信息
SELECT * FROM product WHERE productName LIKE '罗技M9_';

#需求: 查询匹配货品名称 '罗技M9??' 的所有信息
SELECT * FROM product WHERE productName LIKE '罗技M9__';

