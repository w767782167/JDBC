#需求:查询所有的货品信息+对应的货品分类信息
SELECT productName,dirName FROM product,productdir 
WHERE product.dir_id = productdir.id;

SELECT productName,dirName FROM product p,productdir pd
WHERE p.dir_id = pd.id;

#需求:查询所有商品的名称和分类名称:

#1.隐式内连接
SELECT productName,dirName FROM product p,productdir pd
WHERE p.dir_id = pd.id;

#2.显示内连接
SELECT productName,dirName FROM 
product p INNER JOIN productdir pd ON p.dir_id = pd.id;

SELECT productName,dirName FROM 
product p JOIN productdir pd ON p.dir_id = pd.id;

#需求: 查询零售价大于200的无线鼠标
#1.隐式内连接
SELECT * FROM product p,productdir pd
WHERE p.salePrice > 200 AND pd.dirName = '无线鼠标' AND p.dir_id = pd.id;

#2.显示内连接
SELECT * FROM product p JOIN productdir pd 
ON p.salePrice > 200 AND pd.dirName = '无线鼠标' AND p.dir_id = pd.id;


#需求: 查询每个货品对应的分类以及对应的库存
#1.隐式内连接
SELECT p.id,p.productName,pd.dirName,ps.storeNum 
FROM product p,productdir pd,productstock ps
WHERE  p.dir_id = pd.id AND p.id = ps.product_id;

#2.显示内连接
SELECT  p.id,p.productName,pd.dirName,ps.storeNum 
FROM product p JOIN productdir pd JOIN productstock ps
ON p.dir_id = pd.id AND p.id = ps.product_id;

SELECT  p.id,p.productName,pd.dirName,ps.storeNum 
FROM product p JOIN productdir pd  ON p.dir_id = pd.id 
JOIN productstock ps ON p.id = ps.product_id;



#需求: 如果库存货品都销售完成,按照利润(profit)从高到低查询货品名称,零售价,货品分类（三张表）

#1.隐式内连接
SELECT  p.id,p.productName,p.salePrice,pd.dirName,(p.salePrice-p.costPrice)*ps.storeNum profit
FROM  product p,productdir pd,productstock ps
WHERE p.dir_id = pd.id AND p.id = ps.product_id
ORDER BY profit DESC;


#2.显示内连接
SELECT  p.id,p.productName,p.salePrice,pd.dirName,(p.salePrice-p.costPrice)*ps.storeNum profit
FROM product p JOIN productdir pd JOIN productstock ps
ON p.dir_id = pd.id AND p.id = ps.product_id
ORDER BY profit DESC;


#需求:查询出所有商品编号对于商品的所有信息
SELECT * FROM product p LEFT JOIN productdir pd 
ON p.dir_id = pd.id;

SELECT * FROM productdir pd LEFT JOIN product p 
ON p.dir_id = pd.id;




SELECT * FROM product p RIGHT JOIN productdir pd 
ON p.dir_id = pd.id;





