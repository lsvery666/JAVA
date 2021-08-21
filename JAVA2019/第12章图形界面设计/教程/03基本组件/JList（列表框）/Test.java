/*
	javax.swing.JList
	列表框。JList 以列表的形式展示多个选项，允许用户选择一个或多个选项。
	其中的选项内容由一个 ListModel 实例来维护。
	JList 不实现直接滚动，需要滚动显示，可以结合 JScrollPane 实现滚动效果。

	构造方法：
		/**
		 * 一个 JList 实例维护这一个 ListModel 实例。
		 * ListModel 实例可以直接创建，也可以通过把 数组 或 集合 传递到 JList 中间接创建。
		 
		JList()

		JList(ListModel dataModel)

		JList(Object[] listData)

		JList(Vector<?> listData)

	JList选项数据相关方法：
		// 以数组形式设置选项数据，内部将自动封装成 ListModel
		void setListData(Object[] listData)

		// 以集合形式设置选项数据，内部将自动封装成 ListModel
		void setListData(Vector<?> listData)

		// 直接设置选项数据的 ListModel
		void setModel(ListModel<?> model)

		// 获取维护选项数据的 ListModel。
		// 再通过 listModel.getElementAt(int index) 和 listModel.getSize() 
		// 可分别 获取指定索引的选项数据 和 选项数量。
		ListModel<?> getModel()
