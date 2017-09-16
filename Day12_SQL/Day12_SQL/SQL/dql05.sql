#需求:查询所有商品平均零售价
SELECT AVG(salePrice) FROM product;

#需求:查询商品总记录数
SELECT COUNT(*) FROM product;

SELECT COUNT(id) FROM product;

#需求:查询分类为2的商品总数
SELECT COUNT(id) FROM product WHERE dir_id = 2;

#需求:查询商品的最小零售价，最高零售价，以及所有商品零售价总和
SELECT MIN(salePrice),MAX(salePrice),SUM(salePrice) FROM product;
