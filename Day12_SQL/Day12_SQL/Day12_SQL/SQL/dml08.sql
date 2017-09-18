#1.插入完整数据记录/空值
INSERT INTO productdir VALUES(101,'机械键盘',5);
#2.插入数据记录一部分
INSERT productdir (id,dirName,parent_id) VALUES(NULL,'老人键盘',5);
INSERT productdir(dirName) VALUES('键盘');
INSERT productdir(dirName) VALUES(NULL);
#3.插入查询出来的结果
INSERT productdir(dirName,parent_id) 
SELECT dirName,parent_id FROM productdir;

#删除数据
DELETE FROM productdir WHERE id = 105;

DELETE FROM productdir WHERE id > 100;

#需求:将零售价大于300的商品的零售价上调0.2倍
UPDATE product SET salePrice = salePrice*1.2 WHERE salePrice > 300;

UPDATE product SET salePrice = salePrice/1.2 WHERE salePrice > 300;
#需求:将零售价大于300的有线鼠标的零售价上调0.1倍
UPDATE product p,productdir pd SET salePrice = salePrice*1.1
WHERE p.dir_id = pd.id AND pd.dirName = '有线鼠标' AND p.salePrice > 300;

#分组  (主要是统计的功能)  GROUP BY  HAVING

SELECT dir_id,COUNT(id) FROM product GROUP BY dir_id;

SELECT dir_id,COUNT(id) AS '统计数量' FROM product 
GROUP BY dir_id  HAVING dir_id > 2;



