/*
*/

#需求:查询所有货品信息
SELECT *  FROM product;
#需求:查询所有货品的id,productName,salePrice
SELECT id,productName,salePrice FROM product;
#需求:查询商品的分类编号。
SELECT dir_id FROM product;
#消除结果中重复的数据
SELECT DISTINCT dir_id FROM product;

#需求:查询所有货品的id，名称和批发价(批发价=卖价*折扣)
SELECT id,productName,salePrice*cutoff FROM product;

#需求:查询所有货品的id，名称，和各进50个的成本价(成本=costPirce)
SELECT id,productName,costPrice*50 FROM product;

#需求:查询所有货品的id，名称，各进50个，并且每个运费1元的成本
SELECT id,productName,(costPrice+1)*50 FROM product;

SELECT id,productName,(costPrice+1)*50 AS pf FROM product;
#推荐使用
SELECT id,productName,(costPrice+1)*50 pf FROM product;
SELECT id,productName,(costPrice+1)*50 AS 'p f' FROM product;




