社区防疫物资配送 LingaDawu 邻家达物

#### 介绍

以下为个人笔记：

B端：
	1.照片路径需改为相对路径


业务逻辑：
		1.正在启售的物品或套餐不能删除，必须停售后才能删！
		2.订单状态： 正在备货->已派送->完成
			其中所有角色都能查看订单信息，而物资配送员只能点派送，超管只能点完成订单，物资管理员啥也不是！
		3.物资配送员只能对订单管理，物资管理员能对分类、物资、套餐三方面管理，不能对订单管理。

C端：
	登录界面： 
		1.短信发送服务或者选择普通密码验证
		解决：暂时写死 让用户随便进

	订单页：  
		     查看订单 显示的是全部用户的订单	