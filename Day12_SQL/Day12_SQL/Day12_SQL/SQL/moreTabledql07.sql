#需求: 查询每个商品分类的名称和父分类名称.
#SELECT * FROM productdir;

SELECT child.id,child.dirName,parent.dirName parentName
FROM productdir child JOIN productdir parent
ON child.parent_id = parent.id;



#需求: 查询出所有的顶级分类
SELECT * FROM productdir WHERE parent_id IS NULL;
